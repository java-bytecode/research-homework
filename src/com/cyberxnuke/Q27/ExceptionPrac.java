package com.cyberxnuke.Q27;

public class ExceptionPrac {
    private int[] arr;
    {
        arr = new int[]{1, 2, 3, 5, 6, 78, 9, 10};
    }
    public int getArrayElement(int index){
        try{
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
            return -1;
        } finally {
            //System.out.println("Array Method");
            return 10;
        }
    }

    public int getArrayElement(double index2){
        try{
            return arr[(int) index2];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
            return -1;
        }
    }
}
