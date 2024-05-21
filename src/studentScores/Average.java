package studentScores;

public class Average {
    public static void main(String[] args) {
        int scoreA = 8;
        int scoreB = 6;
        int scoreC = 9;
        int scoreD = 4;
        float average = (float) (scoreA + scoreB + scoreC + scoreD) / 4;
        float percentile = average*10;
        System.out.println(average);
        System.out.println(percentile);
    }
}
