       import javax.swing.*;
       import java.lang.invoke.SwitchPoint;
       import java.util.*;
     public class Main {
         public static void main(String[] args) {

             Scanner ee = new Scanner(System.in);
             System.out.println(ee);
             int operator = ee.nextInt();

             switch (operator) {
                 case 1:
                     System.out.println("Operator Value is:" + String.valueOf(operator));
                     break;
                 case 2:
                     System.out.println("Operator Value is:" + String.valueOf(operator));
                     break;
                 case 3:
                     System.out.println("invalid value");
                     break;
                 case 4:
                     System.out.println("not invalid value");
                     break;
                 case 5:
                     System.out.println("value is 209");
                     break;

                 default:
                     System.out.println("Operator Value is:" + String.valueOf(operator));

                     int a = ee.nextInt();
                     int b = ee.nextInt();

                     if (a == b) {
                         System.out.println("is equal to");
                     } else if (a > b) {
                         System.out.println("a is grater then");
                     } else if (a < b) {
                         System.out.println("b is greater then");
                     } else {
                         System.out.println("invallid value");
                     }

             }
         }
     }