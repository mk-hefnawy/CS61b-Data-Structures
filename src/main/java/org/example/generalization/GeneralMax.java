package org.example.generalization;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class GeneralMax {

    public static Object naiveMax(Object[] items){
        int maxIndex = 0;
        for (int i = 0; i < items.length ; i++) {
            //if (items[i] > items[maxIndex]) maxIndex = i;   //<--- Compilation Error
        }
        return items[maxIndex];
    }

    public static OurComparable OurComparableMax(OurComparable[] items){
        int maxIndex = 0;
        for (int i = 0; i < items.length ; i++) {
            if (items[i].compareTo(items[maxIndex]) > 0) maxIndex = i;
        }
        

        return items[maxIndex];
    }

    public static <T> Comparable ComparableMax(Comparable[] items){
        int maxIndex = 0;
        for (int i = 0; i < items.length ; i++) {
            if (items[i].compareTo(items[maxIndex]) > 0) maxIndex = i;
        }
        return items[maxIndex];
    }

    public static <T> T hoFMax(T[] items, BiFunction<T, T, Integer> compare){
        int maxIndex = 0;
        for (int i = 0; i < items.length ; i++) {
            if (compare.apply(items[i], items[maxIndex]) > 0) maxIndex = i;
        }


        return items[maxIndex];
    }

    public static <T> T comparatorMax(T[] items, Comparator<T> comparator){
        int maxIndex = 0;
        for (int i = 0; i < items.length ; i++) {
            if (comparator.compare(items[i], items[maxIndex]) > 0) maxIndex = i;
        }


        return items[maxIndex];
    }




}
