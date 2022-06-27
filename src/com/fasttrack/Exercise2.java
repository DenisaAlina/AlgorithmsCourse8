package com.fasttrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    private int[] array;
    private int givenSum;


    public List<String> findingPairs(int[] array, int givenSum) {
        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {

                    if (array[i] + array[j] + array[k] == givenSum) {
                        int[] pair = {array[i], array[j], array[k]};
                        arrayList.add(Arrays.toString(pair));
                    }
                }
            }
        }
        return arrayList;
    }

}
