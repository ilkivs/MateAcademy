package HomeWork.hw1;

/*
    1.2 Нарисовать ромб с звёздочек заданной величины.
    Пример: величина 3, значит максимальное кол-во звёзд в ряду будет 3.
  *
 ***
*****
 ***
  *
 */

public class Task_1_2 {


    public void drawStar(int n){
        if (n < 1) {
            System.out.println("You entered wrong size ...");
        } else {
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = n - i - 1; j >= 0; j--) {
                    sb.append(" ");
                }
                for (int k = 0; k < i + 1; k++) {
                    sb.append("* ");
                }
                System.out.println(sb);
            }
            for (int i = n; i < 2 * n - 1; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j <= i - n + 1; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < 2 * n - i - 1; k++) {
                    sb.append("* ");
                }
                System.out.println(sb);
            }
        }
    }
}
