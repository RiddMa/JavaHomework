package hw9;

public class StudentBZ extends Student{
    int responsibility = 1;

    public StudentBZ(long SerialNumber, String name, int scoreEnglish, int scoreMath, int scoreCS) {
        super(SerialNumber, name, scoreEnglish, scoreMath, scoreCS);
    }

    @Override
    public float testScore() {
        return (super.testScore()+5);
    }
}
