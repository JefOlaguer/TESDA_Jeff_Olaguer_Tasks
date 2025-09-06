package chapter2;

public class Task2 {
    public static void main(String[] args) {
        
        byte zero = 0;
        int e;
        int h = 0xa;
        e = 310*h + 10;
        boolean x = false;
        x = !x;

        String output1 = "H"+ e + " ";
        String output2 = "w" + zero + "r" + ++zero + "d" + " ";
        String output3 = ++zero + "." + (zero-2) + " ";
        System.out.println();
        System.out.print(output1 + output2 + output3 + x);
        System.out.println();


    }
}