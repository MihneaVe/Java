package com.unibuc.pao.ex1;

public class ArraysMain{

    static int[] staticIntegers;

    @SuppressWarnings("unused")
    public static void main(String[] args){

        // int[] integers;
        System.out.println("Static Integers " + staticIntegers); // null

        int[] integers1 = new int[10];
        int integers2[] = new int[10];

        System.out.println("Integers1 " + integers1[0]); // address in memory
        System.out.println("Integers2 " + integers2[0]); // works but not recommended
        System.out.println("Integers1.lenght " + integers1.length);

        int [] integers3 = new int[] {1, 2, 3, 4, 5};
        System.out.println("Integers3 " + integers3[0]);
        System.out.println("Integers3.lenght " + integers3.length);
        System.out.println("Integers3[4] "+ integers3[4]); 
        // System.out.println("Integers3[5] "+ integers3[5]); // ArrayIndexOutOfBoundsException

        long[][] integers4 = { { 1, 2, 3 }, { 4, 5 } };
        // System.out.println("Integers4 " + integers4[1][2]); Eroare
        System.out.println("Integers4[0][2] " + integers4[0][2]);

        long[] longs = new long[1];
        longs[0] = 1;
        System.out.println("Longs " + longs); // works but not useful

        long[][] longsMultidimensional = new long[2][];
        longsMultidimensional[0] = new long[3];
        longsMultidimensional[1] = new long[2];
        System.out.println("longsMultidimensional " + longsMultidimensional);  // works but not useful


        int[][] myArray = new int[3][];
        myArray[0] = new int[]{1, 2, 3};
        myArray[1] = new int[3];

        Object[] objects = new Object[10];
        Object[] objects2[] = new Object[10][];
        Object objects3[][] = new Object[10][];
        Object[] objects4[] = new Object[10][];
        Object[][] objects5 = new Object[][]{
            new Object[]{}, new Object[]{},
            new Object[]{}, new Object[]{} 
            // 2x2 array
        };

        Object[][] object6, objects7[], objects8[][];
        objects7 = new Object[][][]{
            {
                {new Object(), new Object()},
                {new Object(), new Object()},
                {new Object()}
            },
            { 
                {new Object(), new Object()}
            }
        };


        for (int i=0; i<objects7.length; i++){
            for (int j=0; j<objects7[i].length; j++){
                for (int k=0; k<objects7[i][j].length; k++){
                    System.out.println("objects7[" +i+"]["+j+"]["+k+"]"+ objects7[i][j][k]);
                }
            }
        }

        for (Object[][] objectFIrstLevel: objects7){
            for (Object[] objectSecondLevel: objectFIrstLevel){
                for (Object objectThirdLevel: objectSecondLevel){
                    System.out.println("objectThirdLevel = " + objectThirdLevel);
                }
            }
        }

        String[][] strings = new String[][]{
            {"String 11", "String 12"},
            {"String 21", "String 22", "String 23"}
        };

        for(String[] stringFirstLevel: strings){
            for(String stringSecondLevel: stringFirstLevel){
                System.out.println("stringSecondLevel = " + stringSecondLevel);
            }
        }

        int[] myInts = {1,2,3};
        int[] myOtherInts = {1,2,3};
        System.out.println("myInts == myOtherInts ? " + (myInts == myOtherInts)); // false
        System.out.println("myInts.equals(myOtherInts) ? " + myInts.equals(myOtherInts)); // false
        System.out.println("myInts = myOtherInts ? " + (myInts = myOtherInts)); // memory address of myOtherInts

    }
    

}
