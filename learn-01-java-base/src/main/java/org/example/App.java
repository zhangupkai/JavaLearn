package org.example;

/**
 * int 和 char 类型互转
 *
 */
public class App 
{
    public static void main1( String[] args )
    {
        int valueInt = 65;
        char valueChar = (char) valueInt;
        System.out.println(valueChar);
    }

    public static void main2(String[] args) {
        int radix = 10;
        int valueInt = 12;
        char valueChar = Character.forDigit(valueInt, radix);
        System.out.println(valueChar);
        System.out.println('\0');
    }

    public static void main3(String[] args) {
        int radix = 16;
        int valueInt = 12;
        char valueChar = Character.forDigit(valueInt, radix);
        System.out.println(valueChar);
    }

    public static void main4(String[] args) {
        int valueInt = 1;
        char valueChar = Integer.toString(valueInt).charAt(0);
        System.out.println(valueChar);
    }

    public static void main(String[] args) {
        int a = 'a';
        System.out.println(a);
    }
}
