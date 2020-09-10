package hw9;

public class StudentXW extends Student{
    int responsibility = 0;
    public StudentXW(long SerialNumber, String name, int scoreEnglish, int scoreMath, int scoreCS) {
        super(SerialNumber, name, scoreEnglish, scoreMath, scoreCS);
    }

    @Override
    public float testScore() {
        return (super.testScore()+3);
    }
}
