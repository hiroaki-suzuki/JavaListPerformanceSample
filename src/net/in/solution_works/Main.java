package net.in.solution_works;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hiroaki on 2016/08/23.
 */
public class Main {

    private static final int SIZE = 100000;

    public static void main(String[] args) {
        System.out.println("--- For文 ArrayList -------------------");
        execNormalForWith(new ArrayList<>());

        System.out.println("--- For文 ArrayList キャパシティ指定 -------------------");
        execNormalForWith(new ArrayList<>(SIZE));

        System.out.println("--- For文 LinkedList -------------------");
        execNormalForWith(new LinkedList<>());

        System.out.println("--- イテレーター ArrayList -------------------");
        execIteratorWith(new ArrayList<>());

        System.out.println("--- イテレーター LinkedList -------------------");
        execIteratorWith(new LinkedList<>());
    }

    private static void execNormalForWith(List<Integer> list) {
        // 要素の追加
        Instant start = Instant.now();
        for (int i = 1; i <= SIZE; i++) {
            list.add(i);
        }
        System.out.println("要素の追加 : " + Duration.between(start, Instant.now()).toNanos());

        // 要素の走査
        start = Instant.now();
        for (int i = 0; i < SIZE; i++) {
            list.get(i);
        }
        System.out.println("要素の走査 : " + Duration.between(start, Instant.now()).toNanos());
    }

    private static void execIteratorWith(List<Integer> list) {
        // 要素の追加
        for (int i = 1; i <= SIZE; i++) {
            list.add(i);
        }

        // 要素の走査
        Instant start = Instant.now();
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            iter.next();
        }
        System.out.println("要素の走査 : " + Duration.between(start, Instant.now()).toNanos());
    }
}
