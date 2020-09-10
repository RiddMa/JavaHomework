package hw6;

public class Class {
    int a=1,b=2,c=3,d=4;
    public int method(){
        return a;
    }

    public int method(int t){
        return b;
    }

    public int method(int t,int p){
        return c;
    }

    public int method(int t,int p,int q){
        return d;
    }

}

class newClass extends Class{
    public int method(int t,int p,int q,int m){
        return super.a-super.b;
    }
}