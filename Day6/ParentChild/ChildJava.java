package Day6.ParentChild;

public class ChildJava extends ParentJava{
    public void childmethod()
    {
        System.out.println("method of child");
    }

    public void methodX()
    {
        System.out.println("overriding parent method.");
    }
    public static void main(String[] args) {
        //parent to child only
        ParentJava pj = new ChildJava();
        pj.methodX();                     // calls the overriden method in ChildJava
        pj.methodY();                     //calling the method from ParentJava


        System.out.println("===========================");
        //cannot directly access childmethod() from ParentJava reference
        // we can't instanciate childjava object or create a ChildJava reference using isntance of
        if(pj instanceof ChildJava)
        {
            ChildJava cj = (ChildJava) pj;
            cj.childmethod();
        }







    }}
