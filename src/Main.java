public class Main {

    public static void main(String[] args) {

        int addTest = add(5, 10);
        System.out.println(addTest);

        int addTestTwo = add(1, 2, 3, 4);
        System.out.println(addTestTwo);

        String greetMe = morningGreeting("Mr. Ewing");
        System.out.println(greetMe);

        String afternoonMe = afternoonGreeting("Brooke Ye");
        System.out.println(afternoonMe);

        String tripleD = triple("La La Land is my Long Lost Love ");
        System.out.println(tripleD);

        double halfMe = half(11.5);
        System.out.println(halfMe);

        int roundedNum = roundPositiveValueToNearestInteger(11.5);
        System.out.println(roundedNum);

        int roundedNegNum = roundNegativeValueToNearestInteger(-11.5);
        System.out.println(roundedNegNum);

        }

    // 1. add

    public static int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }


    // 2. add
    public static int add(int firstNum, int secondNum, int thirdNum, int fourthNum){
        return add(add(firstNum, secondNum), add(thirdNum, fourthNum));
    }

    // 3. morningGreeting

    public static String morningGreeting(String greeting){
        return "早上好, " + greeting + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting(String greeting) {
        return "下午好, " + greeting + "!";
    }

    // 5. triple
    public static String triple(String text){
        return text + text + text;

        }

    // 6. half
    public static double half(double number){
        return number/2;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger(double number){
        double newNumber = number + 0.5;
        return (int) newNumber;
        }



    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        double newNumber = number - 0.5;
        return (int) newNumber;
    }

}
