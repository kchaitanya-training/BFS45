//Define argument method and pass input and return value in the same class.
public class Assessment5 {

    String nameOfThreeStates(String firstState, String secondState, String thirdState){
        return "Name of Three States: " + firstState + secondState + thirdState;
    }

    String totalStatesinUsa(int total) {
        return "Number of States in USA: " + total;
    }

    public static void main(String[] args) {
        Assessment5 result = new Assessment5();

        System.out.println(result.nameOfThreeStates("Illinois ", "Colorado ", "Texas"));
        System.out.println(result.totalStatesinUsa(50));
    }
}
