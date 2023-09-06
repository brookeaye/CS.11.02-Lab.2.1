public class Main {

    public static void main(String[] args) {

        int result = add(2,3);
        System.out.println(result);

        }

    // 1. add

    public static int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }


    // 2. add
    public static int addTwo(int firstNum, int secondNum, int thirdNum, int fourthNum){
        int total = add(firstNum, secondNum);
        total+=add(thirdNum, fourthNum);
        return total;
    }

    // 3. morningGreeting

    public static String morningGreeting(String greeting){
        return System.out.println(早上好 + greeting);
    }

    // 4. afternoonGreeting

    public static void afternoonGreeting(String greeting){
        String afternoon = "下午好" + greeting;
        System.out.println(afternoon);
        return;

    // 5. triple
    //public static void triple(String text){
        String longText = "" + text + text + text;
        System.out.println(longText);
        return;

        }

    // 6. half
        public static double half(int number){
        return number/=2;
        }

    // 7. roundPositiveValueToNearestInteger

        public static int roundPositiveValueToNearestInteger(double number){
        return (int) number - number%10;
        }

        }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number){
        return (int) number + number%10;

}
