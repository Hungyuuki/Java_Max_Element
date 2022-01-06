package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Nhập phần tử thứ "+i+": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list");
        for (i = 0; i < array.length; i++){
            System.out.println("Người thứ "+i+" là "+array[i]);
        }
        int max = array[0];
        int index = 1;
        for (i = 0; i < array.length; i++){
            if (array[i] >= max){
                max = array[i];
                index = 1 + i;
            }
        }
        System.out.println("Người ở vị trí "+index+" là người có tài sản lớn nhất với "+max+" tỷ đô");
    }
}
