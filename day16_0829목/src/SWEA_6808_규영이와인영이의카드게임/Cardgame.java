package SWEA_6808_규영이와인영이의카드게임;

import java.util.*;

public class Cardgame {

    static int winCount, loseCount;
    static int[] gyuCard, inCard;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            gyuCard = new int[9];
            used = new boolean[9];
            inCard = new int[9];
            boolean[] selected = new boolean[19];

            for (int i = 0; i < 9; i++) {
                gyuCard[i] = sc.nextInt();
                selected[gyuCard[i]] = true;
            }

            int index = 0;
            for (int i = 1; i <= 18; i++) {
                if (!selected[i]) {
                    inCard[index++] = i;
                }
            }

            winCount = 0;
            loseCount = 0;

            permute(new int[9], 0);

            System.out.println("#" + t + " " + winCount + " " + loseCount);
        }

        sc.close();
    }

    public static void permute(int[] selectedInCard, int depth) {
        if (depth == 9) {
            int gyuScore = 0, inScore = 0;
            for (int i = 0; i < 9; i++) {
                if (gyuCard[i] > selectedInCard[i]) {
                    gyuScore += gyuCard[i] + selectedInCard[i];
                } else if (gyuCard[i] < selectedInCard[i]) {
                    inScore += gyuCard[i] + selectedInCard[i];
                }
            }

            if (gyuScore > inScore) {
                winCount++;
            } else if (gyuScore < inScore) {
                loseCount++;
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!used[i]) {
                used[i] = true;
                selectedInCard[depth] = inCard[i];
                permute(selectedInCard, depth + 1);
                used[i] = false;
            }
        }
    }
}
