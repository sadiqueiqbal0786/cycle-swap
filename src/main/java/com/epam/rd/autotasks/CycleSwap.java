package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int x = array[array.length-1], i;
        for (i = array.length-1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = x;

    }

    static void cycleSwap(int[] array, int shift) {
        for(int j=0;j<shift;j++) {
            int x = array[array.length - 1], i;
            for (i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = x;
        }
        //System.out.print(shift);
    }
}
