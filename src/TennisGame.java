public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FOURTY = 3;

    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";

        int tempScore = 0;
        if (player1_score == player2_score) {
            switch (player1_score) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (player1_score >= 4 || player2_score >= 4) {
            int minusResult = player1_score - player2_score;
            boolean play1BigerPlay2 = minusResult == 1;
            if (play1BigerPlay2) score = "Advantage player1";
            else {
                boolean play2BigerPlay1 = minusResult == -1;
                if (play2BigerPlay1) score = "Advantage player2";
                else {
                    boolean isPlay1Win = minusResult >= 2;
                    if (isPlay1Win) score = "Win for player1";
                    else score = "Win for player2";
                }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1_score;
                else {
                    score += "-";
                    tempScore = player2_score;
                }
                switch(tempScore) {
                    case LOVE:
                        score += "Love";
                        break;
                    case FIFTEEN:
                        score += "Fifteen";
                        break;
                    case THIRTY:
                        score += "Thirty";
                        break;
                    case FOURTY:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
