package day51_inheritance.super_word;

public class LyftXL extends Lyft {
    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles) * 1.1;
    }

}
