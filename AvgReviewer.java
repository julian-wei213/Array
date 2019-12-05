import java.util.Scanner;
class AvgReviewer {
    public static void main(){
       int[][] ratings = { {4,6,2,5},
                           {7,9,4,8},
                           {6,9,3,7} }; 
                           
       Scanner sc = new Scanner(System.in);
       double sum = 0;
       int reviewer = sc.nextInt();
       int col = ratings[0].length;
       
       for(int i =0; i<col;i++){
           sum = sum + ratings[reviewer][i];
        }
       
       sum = sum/ratings[0].length;
       
       System.out.println("Reviewer number " + reviewer+ " gave an average of "+sum);
    }
}
