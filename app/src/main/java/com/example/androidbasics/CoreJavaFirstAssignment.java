package com.example.androidbasics;

public class CoreJavaFirstAssignment {

    //Write a Java program/s to perform the following Explicit conversions and print the output with appropriate messages.
    //int to double
    //double to float
    //long to int
    //long to short
    //char to String
    //char to int
    //char to double
    //float to int
    //float to char

    public static void main(String[] args) {

        double first = convertToDouble(99);
        System.out.println("On converting double to int the value is : " + first);
        float sec = doubleToFloat(3.14);
        System.out.println("On converting double to float the value is : " + sec);
        int third = longToInt(123456789L);
        System.out.println("On converting long to int the value is : " + third);
        short fourth = longToShort(123456789L);
        System.out.println("On converting long to short the value is : " + fourth);
        String fifth = charToString('B');
        System.out.println("On converting char to string the value is : " + fifth);
        printDayOfWeek(2);
        printDayUsingSwitch(4);
        calcFactor();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //int to double
    public static double convertToDouble(int integerTypeVal) {
        double doubleTypeVal = (double) integerTypeVal;
        return  doubleTypeVal;
    }
    //double to float
    public static float doubleToFloat(double doubleVal) {
        float floatTypeVal = (float) doubleVal;
        return  floatTypeVal;
    }
    //long to int
    public static int longToInt(long longValue) {
        int intTypeVal = (int) longValue;
        return intTypeVal;
    }

    //long to short
    public static short longToShort(long longValue) {
        short shortVal = (short) longValue;
        return shortVal;
    }
    //char to String
    public static String charToString(char charVal) {
        //cannot typeCast here so we will simply do
        String charAsString = String.valueOf(charVal);
        return charAsString;
    }

//    char to int
    public static int charToInt(char charVal) {
        int intVal = (int) charVal;
        return intVal;
    }
    //char to double
    public static double charToDouble(char charVal){
        double doubVal = (double) charVal;
        return doubVal;
    }
    //float to int
    public static int floatToInt(float floatVal) {
        int intVal = (int) floatVal;
        return intVal;
    }
    //float to char
    public static char floatToChar(float floatVal) {
        char charVal = (char) floatVal;
        return charVal;
    }
    //Write a Java program to print the day of the week using
    //If else if ladder
    //Switch case statements
    public static void printDayOfWeek(int dayNumber) {
        if (dayNumber == 1) {
            System.out.println("Day of the week: Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Day of the week: Monday");
        } else if (dayNumber == 3) {
            System.out.println("Day of the week: Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Day of the week: Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Day of the week: Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Day of the week: Friday");
        } else if (dayNumber == 7) {
            System.out.println("Day of the week: Saturday");
        } else {
            System.out.println("Invalid day number");
        }
    }

    public static void printDayUsingSwitch(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Day of the week: Sunday");
                break;
            case 2:
                System.out.println("Day of the week: Monday");
                break;
            case 3:
                System.out.println("Day of the week: Tuesday");
                break;
            case 4:
                System.out.println("Day of the week: Wednesday");
                break;
            case 5:
                System.out.println("Day of the week: Thursday");
                break;
            case 6:
                System.out.println("Day of the week: Friday");
                break;
            case 7:
                System.out.println("Day of the week: Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }




//    Write a java program to calculate the factors of 24, 39, 142 using
//for loop
//while loop
//do while loop

    public static void calcFactor() {
        // for loop
        for (int a = 1; a <= 24; a++) {
            if (24 % a == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println("\n");

        // while loop
        int b = 1;
        while (b <= 39) {
            if (39 % b == 0) {
                System.out.print(b + " ");
            }
            b++;
        }
        System.out.println("\n");

        // do while loop
        int c = 1;
        do {
            if (142 % c == 0) {
                System.out.print(c + " ");
            }
            c++;
        } while (c <= 142);
    }





    //Write a java program to print all the prime numbers between 1 - 100.

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

