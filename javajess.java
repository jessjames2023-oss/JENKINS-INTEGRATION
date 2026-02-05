// Generating random number in a specific range 
import java.io.*;
import java.util.*;

class Geeks {
    
    public static void main (String[] args) {
        Random r = new Random();
        int max=100,min=50;
        System.out.println("Generated numbers are within "+ min +" to "+ max);
        System.out.println(r.nextInt(max - min + 1) + min);
        System.out.println(r.nextInt(max - min + 1) + min);
        System.out.println(r.nextInt(max - min + 1) + min);
    }
}
