package hw9;

import java.util.Objects;

public class Student {
    protected long SerialNumber;
    protected String name;
    protected int scoreEnglish;
    protected int scoreMath;
    protected int scoreCS;
    protected int scoreTotal;

    public Student(long SerialNumber, String name, int scoreEnglish,
                   int scoreMath, int scoreCS) {
        setSerialNumber(SerialNumber);
        setName(name);
        setScoreEnglish(scoreEnglish);
        setScoreMath(scoreMath);
        setScoreCS(scoreCS);
        setScoreTotal();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScoreCS(int scoreCS) {
        this.scoreCS = scoreCS;
        setScoreTotal();
    }

    public int getScoreCS() {
        return scoreCS;
    }

    public void setScoreEnglish(int scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
        setScoreTotal();
    }

    public int getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
        setScoreTotal();
    }

    public int getScoreMath() {
        return scoreMath;
    }

    public void setScoreTotal() {
        this.scoreTotal = this.scoreCS + this.scoreEnglish + this.scoreEnglish;
    }

    public int getScoreTotal() {
        return scoreTotal;
    }

    public void setSerialNumber(long serialNumber) {
        SerialNumber = serialNumber;
    }

    public long getSerialNumber() {
        return SerialNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SerialNumber=" + SerialNumber +
                ", name='" + name + '\'' +
                ", scoreEnglish=" + scoreEnglish +
                ", scoreMath=" + scoreMath +
                ", scoreCS=" + scoreCS +
                ", scoreTotal=" + scoreTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return SerialNumber == student.SerialNumber &&
                scoreEnglish == student.scoreEnglish &&
                scoreMath == student.scoreMath &&
                scoreCS == student.scoreCS &&
                scoreTotal == student.scoreTotal &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SerialNumber, name, scoreEnglish, scoreMath, scoreCS, scoreTotal);
    }

    public int compare(Student st) {
        int res = this.scoreTotal - st.scoreTotal;
        return Integer.compare(res, 0);
    }

    public float testScore() {
        return ((float) scoreTotal / 3);
    }
}
