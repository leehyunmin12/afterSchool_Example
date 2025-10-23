package array;

import java.util.*;

public class ScoreAverage {
    public static void main(String[] args) {
        double[][] score = {{89,94},{95,88},{97,92}};
        double sum=0;

        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[1].length;j++){
                sum+=score[i][j];
            }
        }
        System.out.print("3년 전체 평균점수 평균은 : "+sum/6);

    }
}
