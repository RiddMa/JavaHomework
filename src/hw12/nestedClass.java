package hw12;

class outerClass {
    protected int x = 10;
    class innerClass{
        protected int y;
        public innerClass(){
            y=5;
        }
    }
}

class anotherOuterClass extends outerClass{
    class anotherInnerClass extends outerClass.innerClass{
        public int getY() {
            return super.y;
        }
    }
    public int getX(){
        return super.x;
    }
}

public class nestedClass{
    public static void main(String[] args) {
        anotherOuterClass outer = new anotherOuterClass();
        anotherOuterClass.anotherInnerClass inner = outer.new anotherInnerClass();
        System.out.println(outer.getX()+inner.getY());
    }
}