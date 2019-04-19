package HomeWork.hw1;

/*
    Task 1.2
 */

public class FigureDrawing {

    public void drawRhombus(int size) {
        if (size < 1) {
            System.out.println("You entered wrong size ...");
        } else {
            for (int i = 0; i < 2 * size - 1; i++) {
                StringBuilder sb = new StringBuilder();
                if (i < size) {
                    for (int j = size - i - 1; j >= 0; j--) {
                        sb.append(" ");
                    }
                    for (int k = 0; k < i + 1; k++) {
                        sb.append("* ");
                    }
                } else {
                    for (int j = 0; j <= i - size + 1; j++) {
                        sb.append(" ");
                    }
                    for (int k = 0; k < 2 * size - i - 1; k++) {
                        sb.append("* ");
                    }
                }
                System.out.println(sb);
            }
        }
    }
}
