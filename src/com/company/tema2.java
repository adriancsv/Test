package com.company;

import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.*;



public class tema2 {

    public static ArrayList<String> CommonElements(String[] arr,String[] arr1) {
        ArrayList<String> list= new ArrayList<String>();
        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }


    public static ArrayList<String> EmptyArrayList( ArrayList<String> arr) {
            arr.clear();

            return arr;
    }

    public static boolean CheckEmptyArrayList( ArrayList<String> arr) {
        if (arr.isEmpty() == true) {
            return true;
        } else return false;
    }

    public static int[] GenerateRandomNumberArray(int elemno, int maxval) {
        int[] arr = new int[elemno];
        Random rand = new Random();
        for (int i=0; i< arr.length; i++){
            arr[i] = rand.nextInt(maxval);
        }
        return arr;
    }

    public static ArrayList <Integer> ElementsGreaterThan( int n, int[] arr) {
        ArrayList<Integer> list= new ArrayList<Integer>();

        for (int str:arr) {
            if(str>=n){
                list.add(str);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        System.out.println("hello tema2");

//------------ex1-----------------
        /*int[] arr = {10,4,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/


//------------ex1-----------------
        /*String[] nume={"ion","maria","gheorghe","gheo"};
        Arrays.sort(nume);
        System.out.println(Arrays.toString(nume));*/


//------------ex2-----------------
       /* String[] nume={"ion","maria","gheorghe","gheo"};
        String[] nume1={"ionel","mary","gheorghe","gheo"};

        System.out.println("nume comune: " + CommonElements(nume,nume1));*/




//------------ex3-----------------
        /*String[] nume={"ion","maria","gheorghe","gheo"};
        ArrayList<String> listanume= new ArrayList<String>(Arrays.asList(nume));
        System.out.println(listanume);*/

//------------ex4-----------------
        /*String[] nume={"ion","maria","gheorghe","gheo"};
        ArrayList<String> listanume= new ArrayList<String>();
        Collections.addAll(listanume, nume);
        for (String str: listanume)
        {
            System.out.println(str);
        }*/

//------------ex5-----------------
        /*String[] nume={"ion","maria","gheorghe","gheo"};
        ArrayList<String> listanume= new ArrayList<String>();
        Collections.addAll(listanume, nume);
        System.out.println(listanume);
        Collections.reverse(listanume);
        System.out.println(listanume);*/

//------------ex6-----------------
       /* String[] nume={"ion","maria","gheorghe","gheo"};
        ArrayList<String> listanume= new ArrayList<String>();
        Collections.addAll(listanume, nume);
        System.out.println("is the list empty? Answer:" +CheckEmptyArrayList(listanume));
        System.out.println(listanume);
        EmptyArrayList(listanume);
        System.out.println("is the list empty? Answer:" +CheckEmptyArrayList(listanume));
        System.out.println(listanume);*/

//------------ex7-----------------
        /*int ELEMNO=10;
        int MAXVAL=100;
        int OVERVAL=10;

        int[] arr = GenerateRandomNumberArray(ELEMNO,MAXVAL);
        ArrayList<Integer> elemgraterthan= ElementsGreaterThan(OVERVAL,arr);
        System.out.println(elemgraterthan);*/


    }
}