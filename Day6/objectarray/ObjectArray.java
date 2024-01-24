package objectarray;

public class ObjectArray {

    public static void main(String[] args) {

        Object[] objArr = new Object[5];

        objArr[0] = new ObjectOne();
        objArr[1] = new ObjectTwo();
        objArr[2] = 10;
        objArr[3] = "Hello";
        objArr[4] = false;

        for(Object obj: objArr){

            if(obj instanceof ObjectOne){
                ObjectOne o1 = (ObjectOne) obj;
                o1.printMsg();
            }

            System.out.println(obj);
        }

    }
}
