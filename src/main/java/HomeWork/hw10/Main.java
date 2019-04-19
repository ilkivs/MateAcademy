package HomeWork.hw10;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(1, 2);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("===== Task 2 =====\n+");

        System.out.println("===== Task 3 =====");
        AsciiCharSequence charSequence = new AsciiCharSequence("Hello, it`s me");
        System.out.println(charSequence);
        System.out.println("length = " + charSequence.length());
        System.out.println("char.at(4) = " + charSequence.charAt(4));
        System.out.println("char.subSequence(2, 5) = " + charSequence.subSequence(2, 5));
        System.out.println("toString() = " + charSequence.toString());
    }
}
