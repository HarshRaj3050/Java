package Java_06_Arrays;

public class Arrays_01_Code {
        public static void main(String[] args) {

        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended) */

            // There are three main ways to create an array in Java

            // 1. Declaration and memory allocation
            int [] mark = new int[5];
            // Initialization
            mark[0] = 100;
            mark[1] = 60;
            mark[2] = 70;
            mark[3] = 90;
            mark[4] = 86;

            // 2. Declaration and then memory allocation
             int [] marks;
             marks = new int[5];
             // Initialization
             marks[0] = 100;
             marks[1] = 60;
             marks[2] = 70;
             marks[3] = 90;
             marks[4] = 86;

            // 3. Declaration, memory allocation and initialization together
            int [] markss = {98, 45, 79, 99, 80};

            // markss[5] = 96; - throws an error

            System.out.println(mark[1]);
            System.out.println(marks[2]);
            System.out.println(markss[4]);
        }
    }
