package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName ArrayAndString
 * @Description
 * @Author Zhang Kai
 * @Date 2023/4/13 21:52
 **/
public class ArrayAndString {

    public static void main1(String[] args) {
        Integer[] anArray = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> aList = Arrays.asList(anArray);
        System.out.println(aList.getClass());
        List<Integer> arrList = new ArrayList<>(aList);
        System.out.println(arrList.getClass());

        int[] array = new int[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(list.getClass());
    }

    public static void main2(String[] args) {
        int[] anArray = new int[] {5, 2, 1, 4, 8};
        Arrays.sort(anArray);
        System.out.println(Arrays.stream(anArray).boxed().collect(Collectors.toList()));
    }

    public static void main3(String[] args) {
        String[] yetAnotherArray = new String[] {"A", "E", "Z", "B", "C"};
        Arrays.sort(yetAnotherArray, 1, 3,
                Comparator.comparing(String::toString).reversed());
        System.out.println(Arrays.toString(Arrays.stream(yetAnotherArray).toArray()));
    }

    public static void main4(String[] args) {
        int[] anArray = new int[] {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(anArray, 4);
        System.out.println(index);
    }

    public static void main5(String[] args) {
        String [] strArray = {"张三","李四","一枚有趣的程序员"};
        Arrays.asList(strArray).forEach(System.out::println);
        Stream.of(strArray).forEach(System.out::println);
        Arrays.stream(strArray).forEach(System.out::println);
        System.out.println(Arrays.toString(strArray));
    }

    public static void main6(String[] args) {
        String s1 = new String("二哥三妹");
        String s2 = s1.intern();
        System.out.println(s1 == s2);
    }

    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "六六六";
        }
    }

}
