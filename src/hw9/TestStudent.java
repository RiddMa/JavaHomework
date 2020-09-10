package hw9;

public class TestStudent {
    public static void main(String[] args) {
        Student normA = new Student(2018211149,"MJJ",100,80,90);
        Student normB = new Student(2018211150,"ABC",85,90,95);
        Student bzA = new StudentBZ(2018211149,"MJJbz",100,80,90);
        Student xwA = new StudentXW(2018211149,"MJJxw",100,80,90);
        System.out.println(normA.getScoreTotal());
        System.out.println(normA.testScore());
        System.out.println(normB.testScore());
        System.out.println(bzA.testScore());
        System.out.println(xwA.testScore());

        Student[] students = new Student[5];
        students[0] = normA;
        students[1] = normB;
        students[2] = new Student(2018211151,"BCD",44,55,66);
        students[3] = bzA;
        students[4] = xwA;

        for(int i = 0;i<5;i++){
            System.out.println(students[i].testScore());
        }
        //执行了每个对象自身子类的testScore方法
    }
}
