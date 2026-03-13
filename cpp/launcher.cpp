#include <windows.h>
#include <string>

// WINAPI WinMain creates a GUI process (hides the black command prompt)
int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, LPSTR lpCmdLine, int nCmdShow) {
    
    // We use "javaw" so it runs silently in the background.
    // Ensure this .exe is placed in the same folder as app.jar
    std::wstring command = L"javaw.exe -jar app.jar";

    STARTUPINFO si;
    PROCESS_INFORMATION pi;

    ZeroMemory(&si, sizeof(si));
    si.cb = sizeof(si);
    ZeroMemory(&pi, sizeof(pi));
    
    // Attempt to start the Java process
    BOOL bSuccess = CreateProcess(
        NULL,               
        &command[0],        
        NULL,               
        NULL,               
        FALSE,              
        0,                  
        NULL,               
        NULL,               
        &si,                
        &pi                 
    );

    // If it fails (e.g., Java isn't in the system PATH)
    if (!bSuccess) {
        MessageBox(
            NULL, 
            L"Failed to launch the application.\nPlease ensure Java is installed and app.jar is in the same folder.", 
            L"Launcher Error", 
            MB_ICONERROR | MB_OK
        );
        return 1;
    }

    // Close handles to avoid memory leaks
    CloseHandle(pi.hProcess);
    CloseHandle(pi.hThread);

    return 0;
}