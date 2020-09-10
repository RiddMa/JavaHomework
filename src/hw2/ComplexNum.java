package hw2;

import org.jetbrains.annotations.NotNull;

public class ComplexNum {
    int real;
    int imag;

    public void setReal(int real) {
        this.real = real;
    }

    public int getReal() {
        return real;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public int getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return "hw2.ComplexNum{" +
                "real=" + real +
                ", imag=" + imag +
                "i}";
    }

    public ComplexNum ComplexAdd(@NotNull ComplexNum b){
        ComplexNum res = new ComplexNum();
        res.setReal(this.getReal()+b.getReal());
        res.setImag(this.getImag()+b.getImag());
        return res;
    }

    public ComplexNum ComplexSub(@NotNull ComplexNum b){
        ComplexNum res = new ComplexNum();
        res.setReal(this.getReal()-b.getReal());
        res.setImag(this.getImag()-b.getImag());
        return res;
    }

    public ComplexNum ComplexMul(@NotNull ComplexNum b){
        ComplexNum res = new ComplexNum();
        res.setReal(this.getReal()*b.getReal()-this.getImag()* b.getImag());
        res.setImag(this.getImag()*b.getReal()-this.getReal()*b.getImag());
        return res;
    }

}

class CompTest{
    public static void main(String[] args) {
        ComplexNum a = new ComplexNum();
        ComplexNum b = new ComplexNum();
        a.setReal(1);
        a.setImag(2);
        b.setReal(3);
        b.setImag(4);
        System.out.println(a.toString());
        System.out.println(a.ComplexAdd(b).toString());
        System.out.println(a.ComplexSub(b).toString());
        System.out.println(b.ComplexMul(a).toString());
        System.out.println(a.ComplexMul(b).toString());
    }
}
