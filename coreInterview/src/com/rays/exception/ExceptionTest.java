package com.rays.exception;

/*output -->String index out of range: 6
String abhi choti he
This is Finally
20
*/

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {

        int k = 5;
        String name = "Vikay"; // Dinanath Chohan";
        try {
            System.out.println(name.charAt(6));
            System.out.println(name.length());

            int i = 15 / k;
           // System.out.println(i);
            
            
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("-->" + e.getMessage());
            System.out.println("String abhi choti he");
            return 10;
        } catch (RuntimeException e) {
            System.out.println("Cought by Parent" + e.getMessage());
            return 15;
        } finally {
            System.out.println("This is Finally");
            return 20;
        }
        // return 100;
    }

}