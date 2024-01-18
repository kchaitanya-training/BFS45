public class House {

    String play = "Kids allowed to play";

    void bedRoom(){
        String desc = "In Bedroom";
        System.out.println(desc);
    }

    void kitchen(){
        String desc = "In Kitchen";
        System.out.println(desc);
    }

    void livingRoom(){
        String desc = "In Living room ";
        System.out.println(desc + play);
    }

    public static void main(String[] args){
        House myHome = new House();
        myHome.kitchen();
        myHome.bedRoom();
        myHome.livingRoom();
    }


}
