import javax.naming.LinkLoopException;
import java.util.*;
import  java.util.*;

public class Main {
   static int a=0,b=1,temp=0;
    public static  void fibo(int num){
        if(num>0){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp);
            fibo(num-1);
        }
    }
    public static void main(String[] args)  {
        int num=10;
        System.out.print(a+" "+b);
        fibo(num-2);


    }

}