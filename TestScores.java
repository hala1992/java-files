import java.io.Serializable;

public class TestScores implements Serializable {
    int [] testScores;
    public TestScores(int[] s) throws InvalidTestScore {
        this.testScores = new int[s.length];
        for (int x = 0; x < s.length; ++x) {
            if(s[x] > 100 || s[x] < 0)
            {
                throw new InvalidTestScore();
            }
            this.testScores[x] = s[x];
        }
    }

    public int average()
    {
        int ave = 0;
        for (int x = 0; x < testScores.length; ++x) {
            ave += testScores[x];
        }
        return ave / testScores.length;
    }

    public int[] getTestScores() {
        return testScores;
    }
}
