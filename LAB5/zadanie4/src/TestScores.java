public class TestScores {
    int[] testScores;

    public TestScores(int[] testScores) {
        this.testScores = testScores;
    }

    ;

    public double getAverageScore() {
        double averageScore = 0;
        for (int testScore : testScores) {
            if (testScore < 0 || testScore > 100) throw new IllegalArgumentException();
            averageScore += testScore;
        }
        return averageScore / testScores.length;
    }

    public static void main(String[] args) {
        TestScores testScores1 = new TestScores(new int[]{1, 2, 3, 4, 5});
        TestScores testScores2 = new TestScores(new int[]{1, 2, 3, 4, 101});
        TestScores testScores3 = new TestScores(new int[]{1, 2, 3, 4, -1});
        System.out.println(testScores1.getAverageScore());
        try {
            testScores2.getAverageScore();
        } catch (IllegalArgumentException e) {
            System.out.println("catch!");
        }
        try {
            testScores3.getAverageScore();
        } catch (IllegalArgumentException e) {
            System.out.println("catch!");
        }
    }
}