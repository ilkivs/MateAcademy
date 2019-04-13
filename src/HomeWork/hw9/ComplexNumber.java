package HomeWork.hw9;

/*
    Task 1.
    https://stepik.org/lesson/12769/step/9?unit=3117
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) o;
        return re == complexNumber.re && im == complexNumber.im;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + getRe());
        result = (int) (prime * result + getIm());
        return result;
    }
}
