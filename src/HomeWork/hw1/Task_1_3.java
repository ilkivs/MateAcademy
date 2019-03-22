package HomeWork.hw1;

public class Task_1_3 {

    public int pow(int a, int power){
        int result = 1;

        if(power<0){
            System.out.println("You entered wrong power ...");
            return 0;
        } else {
            for (int i = 0; i < power; i++) {
                result *= a;
            }
            return result;
        }
    }
}
