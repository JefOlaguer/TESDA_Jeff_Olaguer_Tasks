package chapter4;
import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b){
        return addExact(a,b);
}
    public static int subtract(int a, int b){
        return subtractExact(a,b);
}
    public static int multiply(int a, int b){
        return multiplyExact(a,b);
}
    public static float divide(float a, float b){
        return a/b;
}

    public static void main(String[] args) {
        System.out.println(add(3,3));
        System.out.println(subtract(3,3));
        System.out.println(multiply(3,3));
        System.out.println(divide(3,3));
    }
}