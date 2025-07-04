public class GradeConverter {
    private static final int MAX_SCORE = 100;
    private static final int MIN_SCORE = 0;
    private static final int MIN_A_SCORE = 90;
    private static final int MIN_B_SCORE = 80;
    private static final int MIN_C_SCORE = 70;
    private static final int MIN_D_SCORE = 60;
    private static final int MIN_E_SCORE = 50;

    public String convert(int score) {
        if ((score > MAX_SCORE) || (score < MIN_SCORE)) {
            return "Invalid";
        } else if (score >= MIN_A_SCORE) {
            return "A";
        } else if (score >= MIN_B_SCORE) {
            return "B";
        } else if (score >= MIN_C_SCORE) {
            return "C";
        } else if (score >= MIN_D_SCORE) {
            return "D";
        } else if (score >= MIN_E_SCORE) {
            return "E";
        } else {
            return "F";  // Thay vì Invalid
        }
    }
}
