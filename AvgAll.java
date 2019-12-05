import java.util.Scanner;
class AvgAll {
    public static void main(){
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
        double sum =0;
        
        for(int i = 0; i<ratings.length;i++){
            for(int j = 0; j<ratings[0].length;j++){
                sum = sum + ratings[i][j];
            }
        }
        
        sum = sum/(ratings.length * ratings[0].length);
        
        System.out.println("The average rating for all reviews is " + sum);
    }
}