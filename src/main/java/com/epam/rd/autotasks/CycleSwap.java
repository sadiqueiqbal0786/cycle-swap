package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length==0){
            return;
        }
        else{
       int x = array[array.length-1], i;
        for (i = array.length-1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = x;}

    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length==0 || shift==0){
            return;
        }
        else{
        for(int j=0;j<shift;j++) {
            int x = array[array.length - 1], i;
            for (i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = x;
        }}
        //System.out.print(shift);
    }
}
