package Day5;
// write a program to define a string arr and print the string using while and for loop
public class LoopString {
    public static void main(String[] args) {
        String [] str = new String[7];
        str[0] = "Sunday";
        str[1] = "Monday";
        str[2] = "Tuesday";
        str[3] = "Wednesday";
        str[4] = "Thursday";
        str[5] = "Friday";
        str[6] = "Saturday";

        //for-loop in string array
        for(int i = 0; i<str.length; i++)
        {
            System.out.println(str[i]);
        }
        System.out.println("*********************");
        //enhance while-loop in string array
        int index = 0;
        while(index < str.length)
        {
            System.out.println(str[index]);
            index ++;
        }


    }

}
