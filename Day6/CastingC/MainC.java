package Day6.CastingC;
public class MainC {
    public static void main(String[] args) {
        //Upcasting: Parent reference pointing to ChildC object
        ParentC pop = new ChildC();
        pop.methodA();                //accessing methods from parent class
        pop.methodB();
        pop.sameMethod();


        System.out.println("================");

        //downcasting
        ChildC chil = (ChildC) pop;
        chil.methodX();
        chil.methodY();
        chil.methodA();
        chil.methodB();
        System.out.println("================");

        //conditional
        ParentC p1 = new ChildC();
        ParentC p2 = new ChildC();
        if(p1 instanceof ChildC)
        {
            ChildC c1 = (ChildC) p1;
            c1.methodA();
            c1.methodX();
        }

        //casting for primitive types;
        int a = 1;

        float f = (float) a;  //casting int to float
        int i = (int) f;       //casting float to int
        double d = (double) a;  //casting int to double


        System.out.println(f);
        System.out.println(i);
        System.out.println(d);


    }}
