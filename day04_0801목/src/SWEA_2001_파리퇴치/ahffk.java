package SWEA_2001_파리퇴치;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ahffk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t = 1; t <= T; t++) {
            int great = 0, soso = 0, please = 0;
            int da = 0, so = 0, dab = 100;
            ArrayList<Integer> list = new ArrayList<>();
            int big = 0;
            int N = sc.nextInt();
            int min = sc.nextInt();
            int max = sc.nextInt();
            
            int[] score = new int[N];
            
            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
            }
            Arrays.sort(score);
            for(int i = 0; i < N; i++) {
                if(!list.contains(score[i])) list.add(score[i]);
                if(big < score[i]) big = score[i];
            }
            
            int yum = -1;
            for(int score1 = list.get(0); score1 < big; score1++) {
                for(int score2 = score1+1; score2 <= big; score2++) {
                    // Reset the group counts for each new score1, score2 combination
                    great = 0;
                    soso = 0;
                    please = 0;

                    for(int i = 0; i < N; i++) {
                        if(score2 <= score[i]) {
                            great++;
                        } else if(score1 <= score[i]) {
                            soso++;
                        } else {
                            please++;
                        }
                    }
                    
                    if (great >= min && great <= max &&
                        soso >= min && soso <= max &&
                        please >= min && please <= max) {
                        yum = 1;
                        int maxCount = Math.max(great, Math.max(soso, please));
                        int minCount = Math.min(great, Math.min(soso, please));
                        dab = Math.min(dab, maxCount - minCount);
                    }
                }
            }
            
            if (yum != -1) {
                System.out.println("#" + t + " " + dab);
            } else {
                System.out.println("#" + t + " " + yum);
            }
        }
    }
}