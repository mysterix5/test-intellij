package test;

public class StringExercise {

    static boolean test_string(String s){
        if(s.length()<=20)return false;
        if(!s.contains("fancy"))return false;
        return true;
    }
}
