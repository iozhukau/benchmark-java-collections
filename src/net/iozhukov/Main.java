package net.iozhukov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = initLickedList();
        List<Integer> array = initArrayList();
        Integer integer = 42;
        long startLL = System.nanoTime();
        list.add(50000, integer);
        long finishLL = System.nanoTime();

        long startAL = System.nanoTime();
        array.add(50000, integer);
        long finishAL = System.nanoTime();

        long resultLL = finishLL - startLL;
        long resultAL = finishAL - startAL;
        System.out.println(resultAL + " : AL");
        System.out.println(resultLL + " : LL");
    }

    private static List<Integer> initArrayList() {
        List<Integer> list = new ArrayList<>();
        feel(list);
        return list;
    }

    private static List<Integer> initLickedList() {
        List<Integer> list = new LinkedList<>();
        feel(list);
        return list;
    }

    private static void feel(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(13);
        }
    }
}
