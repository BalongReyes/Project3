
package MethodsSystem;

public class MethodString{

// ==== String Manipulation ==================================================================================

    public static String removeBlankLines(String s){
        return s.replaceAll("(?m)^[ \t]*\r?\n", "");
    }
    
// ==== Check Like ===========================================================================================

    public static boolean checkLike(Object value, String like){
        if(value == null) return false;
        return checkLike(value.toString(), like);
    }
    
// -----------------------------------------------------------------------------------------------------------

    public static boolean checkLike(Integer value, String like){
        if(value == null) return false;
        return checkLike(String.valueOf(value), like);
    }
    
// -----------------------------------------------------------------------------------------------------------

    public static boolean checkLike(String value, String like){
        if(value == null || like == null) return false;
        return value.toLowerCase().contains(like.toLowerCase());
    }

}
