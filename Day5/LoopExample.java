public class LoopExample {

    public static void main(String[] args) {

        System.out.println("write a program to print value incrementally using while loop and for loop\n");

        int a = 0;

        while(a <= 15){
            System.out.print(a++ + " ");
        }

        System.out.println("\n");

        for(int i = 0; i!=16; ++i ){
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("\nwrite a program to define a string arrays and print the string using while-loop and for loop\n");

        String[] randomArr = new String[7];
        randomArr[0] = "Sunday";
        randomArr[1] = "Monday";
        randomArr[2] = "Tuesday";
        randomArr[3] = "Wednesday";
        randomArr[4] = "Thursday";
        randomArr[5] = "Friday";
        randomArr[6] = "Saturday";

        for(String arr : randomArr){
            System.out.print(arr + " ");
        }

        System.out.println("\n");

        int index = 0;
        int arrLength = randomArr.length;
        while(index < arrLength){
            System.out.print(randomArr[index] + " ");
            index++;
        }

    }
}
