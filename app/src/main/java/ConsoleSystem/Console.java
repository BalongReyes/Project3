
package ConsoleSystem;

import MethodsSystem.MethodString;

public class Console{
    
    public static Console tab(){
        System.out.print("\t");
        return new Console();
    }
    
    public static Console gap(){
        System.out.println();
        return new Console();
    }
    
    public static Console line(){
        Console.out("-----------------------------------------------------", ConsoleColors.WHITE);
        return new Console();
    }
    
    public static Console line(ConsoleColors color){
        Console.out("-----------------------------------------------------", color);
        return new Console();
    }
    
// System console output -------------------------------------------------------------------------------------
    
    public static <E> Console out(E[] arrayOutput){
        for(E report : arrayOutput) out((String)report, true);
        return new Console();
    }
    
    public static Console out(int output){
        return out(String.valueOf(output));
    }
    
    public static Console out(String output){
        System.out.println(output);
        return new Console();
    }
    
    public static Console out(int output, boolean line){
        return out(String.valueOf(output), line);
    }
    
    public static Console out(String output, boolean line){
        if(line){
            System.out.println(output);
        }else{
            System.out.print(output);
        }
        return new Console();
    }
    
// System console output with color --------------------------------------------------------------------------
    
    public static <E> Console out(E[] arrayOutput, ConsoleColors color){
        for(E report : arrayOutput) out((String)report, color, true);
        return new Console();
    }
    
    public static Console out(int output, ConsoleColors color){
        return out(String.valueOf(output), color);
    }
    
    public static Console out(String output, ConsoleColors color){
        System.out.println(color.getString() + output + ConsoleColors.getResetString());
        return new Console();
    }
    
    public static Console out(int output, ConsoleColors color, boolean line){
        return out(String.valueOf(output), color, line);
    }
    
    public static Console out(String output, ConsoleColors color, boolean line){
        if(line){
            System.out.println(color.getString() + output + ConsoleColors.getResetString());
        }else{
            System.out.print(color.getString() + output + ConsoleColors.getResetString());
        }
        return new Console();
    }
    
// Error -----------------------------------------------------------------------------------------------------
    
    public static void errorOut(String errorMessage, Exception e){
        Console.line();
        Console.out("Class: ", ConsoleColors.RED, false).out(Thread.currentThread().getStackTrace()[2].getClassName());
        Console.out("Method: ", ConsoleColors.RED, false).out(Thread.currentThread().getStackTrace()[2].getMethodName());
        Console.out("Message: ", ConsoleColors.RED, false).out(errorMessage);
        Console.out("Error: ", ConsoleColors.RED, false).out(MethodString.removeBlankLines(e.getMessage()));
    }
    
}
