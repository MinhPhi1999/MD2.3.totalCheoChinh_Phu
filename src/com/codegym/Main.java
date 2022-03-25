package com.codegym;



public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {1,2,3},
                {3,2,3}
        };
        System.out.println("tổng đg chéo chính là: "+ totalCheo(array));
        System.out.println("chéo phụ "+ sumArrrrr2(array));
    }
    static int totalCheo(int[][] arr){
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    static int sumArrrrr2(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j==array.length-1) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
