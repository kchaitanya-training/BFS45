package Day5;
// write a program to print value incrementally using while loop and for loop
public class LoopSample {
    public static void main(String[] args) {
        //forloop
        int num = 0;

        for(int i = 0; i < 9; i++)
        {
            num++;
            System.out.println(num);
        }
        System.out.println("*************************");
        //while Loop
        int w = 15;
        while(w != 0)
        {
            w--;
            System.out.println(w);
        }

    }
}
