package solution.assignment1;
import java.util.*;

public class Solutions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Write a program that takes two integers as input and prints their sum.
        //sol --> sumTwoInt();

//        2. Take length and breadth as input (both integers) and calculate the area of the
//        rectangle.
        //areaRect();

//        3. Take two numbers as input and perform addition, subtraction, multiplication, and
//        division. Display the results.
         //arithmeticOprators();

//        4. Take input of principle, time and rate and find the simple interest
       // simpleInterset();

//        5. Take a character as input and print its corresponding ASCII value.
        //printCharASCII();

        /*6. Take a floating-point number as input, typecast it into an integer, and print both
        values.
        7. Take an integer between 65 and 90 as input and print its corresponding uppercase
        letter*/
       // typecast();

        //8.9,10,11,12 increment and decrement..
        //inc_Dec();

        /*13. Write a program to find the euclidean distance between two coordinates.Take both
        the coordinates from the user as input.*/
        //findEuclideanDistance();

        /*15. Write a program to find the sum of squares of first n natural numbers where n
        will be provided by the user.*/
        //find();

        //17,18, 19, 20, 21, 22 Output of the following code
        op();
    }
    static void op(){
        /*int a = 20, b=6, c=4;
        System.out.println((a%b)+(c%a));*/ // 6

        /*int a = 5, b=10, c=15;
        boolean res = a<b && b<c || c== 10;
        System.out.println(res);*/ // true


        /*int a = 10;
        int b =5;
        int c = a += b -=2;
        System.out.println(a + " " +b + " "+ c);*/ // 13, 3, 13

//        int x = 5, y=3;
//        System.out.println((x & y));

        /*int a = 6, b=3;
        a += b *= 2;
        System.out.println(a + " " + b);*/ // 12, 6
        int x =0 , y =10;
        boolean res = (x != 0) && (y / x > 2);
        System.out.println(res);
    }
    static void find(){
        int n = sc.nextInt();
        /*int ans = 0;
        for(int i = 1; i <= n; i++){
            ans += (i*i);
        }*/
        int ans = (n *(n+1) * (2*n + 1)) / 6;
        System.out.println("the sum of squares of first "+n+" natural numbers "+ ans);
    }
    static void findEuclideanDistance(){
        System.out.println("Enter first coordinate(x1, y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter second coordinate(x2, y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int c1 = (x2-x1)*(x2-x1);
        int c2 = (y2-y1)*(y2-y1);

        double ans = c1 + c2;
        ans = Math.sqrt(ans);
        System.out.println(ans);
    }
    static void inc_Dec(){
//        int x = 5;
//        System.out.println(x++ + " " + ++x); // 5, 7

//        int a = 5, b = 3, c;
//        c = a++ + ++b;
//        System.out.println(a + " " + b + " "+c); //6, 4, 9

//        int a = 4;
//        int b = 5;
//        a++;
//        b--;
//        System.out.println(++a + " " + b--);//6, 4

        int x = 4, y=2, z;
        z = x++ * --y + ++x; //4 * 1 + 6
        System.out.println(x+ " "+y+" "+z);//6, 1, 10


    }

    static void typecast(){
        //6.
        /*float a = sc.nextFloat();
        int b = (int)a;

        System.out.println("floating value"+ " " + a + " " + "Corresponding integer value " + b);*/
        //7
        int x = sc.nextInt();
        if(x >= 65 && x <= 90)
        System.out.println(x + " corresponding uppercase latter " + (char)x);
        else
            System.out.println("Invalid value");
    }

    static void printCharASCII(){
        String c = sc.next();
        System.out.println((int)c.charAt(0));
    }

    static void sumTwoInt(){

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a+b);
    }

    static void areaRect(){
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*b);
    }

    static void arithmeticOprators(){
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition"+" " +(a+b));
        System.out.println("subtraction" +" " +(a-b));
        System.out.println("Multiplication" + " " +(a*b));
        System.out.println("Divide" + " " + (a/b));
    }

    static void simpleInterset(){
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();

        double si = (p*r*t) / 100;
        System.out.println("Simple Interset" +" " + si);
    }
}
