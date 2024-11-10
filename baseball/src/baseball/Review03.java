package baseball;

public class Review03 {
    public static void main(String[] args) {
        String[] nameList = { "東京ヤクルトスワローズ", "横浜DeNAベイスターズ", "阪神タイガース", "読売ジャイアンツ", "広島東洋カープ", "中日ドラゴンズ" };
        int[] winList = { 80, 73, 68, 68, 66, 66 };
        int[] loseList = { 59, 68, 71, 72, 74, 75 };
        int[] drawList = { 4, 2, 4, 3, 3, 2 };

        BaseBallTeam[] teams = new BaseBallTeam[6];

        for (int i = 0; i < 6; i++) {
            teams[i] = new BaseBallTeam(nameList[i], winList[i], loseList[i], drawList[i]);
            teams[i].report();
        }
    }
}
