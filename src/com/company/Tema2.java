package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.*;



public class Tema2 {

    public static ArrayList<String> commonElements(String[] arr,String[] arr1) {
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


    public static int[] generateRandomNumberArray(int elemno, int maxval) {
        int[] arr = new int[elemno];
        Random rand = new Random();
        for (int i=0; i< arr.length; i++){
            arr[i] = rand.nextInt(maxval);
        }
        return arr;
    }

    public static ArrayList <Integer> elementsGreaterThan( int n, int[] arr) {
        ArrayList<Integer> list= new ArrayList<Integer>();

        for (int str:arr) {
            if(str>=n){
                list.add(str);
            }
        }
        return list;
    }


    public static Integer[] readArrayGrades(int max) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("type the grades (-1 to finish)");
        for (int i=0; i< max; i++){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num!=-1){
                list.add(num);
            }else break;
        }
        Integer [] arr = list.toArray(new Integer[0]);
        return arr;
    }

    public static String avgGrades(Integer [] arr) {
        double sum = 0;
        double navg;
        String pattern = "#.00";
        DecimalFormat decimalFormat= new DecimalFormat(pattern);

        for (Integer el:arr) {
            sum=sum+el;

        }
        navg=sum/ arr.length;
        String avg = decimalFormat.format(navg);
        return avg;
    }

    public static ArrayList <Integer> variableParamsListReverseFunction( int ...a) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : a) {
            list.add(i);

        }
        Collections.reverse(list);
        return list;
    }

    public static LinkedList <String> swapAdjacentNodesLinkedList(LinkedList <String> list) {

       for(int i=0; i<list.size()/2 ; i++)
           Collections.swap(list,2*i,2*i+1);

       return list;
    }

    public static LinkedList <Integer> mergeSpliceLinkedList(LinkedList <Integer> list1, LinkedList <Integer> list2) {
        int i = list1.size();
        int j = list2.size();

        LinkedList<Integer> list3=new LinkedList<Integer>();
        int o = 0;
        int u = 0;
         while (list3.size()<i+j) {
             if (o < i) {
                 list3.add(list1.get(o));
                 o++;
             }
             if (u < j) {
                 list3.add(list2.get(u));
                 u++;
             }
         }

        return list3;
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

        System.out.println("nume comune: " + commonElements(nume,nume1));*/




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
        /*String[] nume={"ion","maria","gheorghe","gheo"};
        ArrayList<String> listanume= new ArrayList<String>();
        Collections.addAll(listanume, nume);
        System.out.println("is the list empty? Answer:" +listanume.isEmpty());
        System.out.println(listanume);
        listanume.clear();
        System.out.println("is the list empty? Answer:" +listanume.isEmpty());
        System.out.println(listanume);*/

//------------ex7-----------------
        /*int ELEMNO=10;
        int MAXVAL=100;
        int OVERVAL=10;

        int[] arr = generateRandomNumberArray(ELEMNO,MAXVAL);
        ArrayList<Integer> elemgraterthan= elementsGreaterThan(OVERVAL,arr);
        System.out.println(elemgraterthan);*/


//------------ex8-----------------
        /*Integer MAXNOGRADES=20;
        System.out.println(AvgGrades(readArrayGrades(MAXNOGRADES)));*/

//------------ex9-----------------
       //System.out.println(variableParamsListReverseFunction(2,4,6,7));

//------------ex10-----------------
       /* LinkedList<String> list=new LinkedList<String>();
        list.add("ion");
        list.add("maria");
        list.add("gheorghe");
        list.add("gheo");
        //list.add("vasile");

        System.out.println("initial list: " +list);
        swapAdjacentNodesLinkedList(list);
        System.out.println("swapped list: " +list);*/

//------------ex11-----------------
/*        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        //list1.add(4);
        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);


        System.out.println("first list: " +list1);
        System.out.println("second list: " +list2);

        System.out.println("merged list: " +mergeSpliceLinkedList(list1,list2));*/

//------------ex12-----------------
        /*Map<String, String> employees = new HashMap<String, String>();
        employees.put("a1234", "Adrian ");
        employees.put("b4321", "Vlad ");
        employees.put("c3241", "Mihai ");
        employees.put("d1432", "Calin ");
        employees.put("e2431", "Iulian ");

        System.out.println("The employee with key e2431 is "+ employees.get("e2431"));
        System.out.println("The employee with key d1432 is "+ employees.get("d1432"));*/



    }
}
