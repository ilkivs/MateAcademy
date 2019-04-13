package HomeWork.hw9;

/*
    Task 3.
    https://stepik.org/lesson/14513/step/8?unit=4147
 */

public class AsciiCharSequence implements CharSequence {

    private byte[] arr;

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    public AsciiCharSequence(String str) {
        this.arr = str.getBytes();
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] newArr = new byte[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            newArr[j] = arr[i];
        }
        return new AsciiCharSequence(newArr);
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}
