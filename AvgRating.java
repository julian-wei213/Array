import java.util.Scanner;
class AvgRating{
    public static void main(){
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
        
        int row = ratings.length;
        double sum = 0;
        
        Scanner sc = new Scanner(System.in);
        int movie = sc.nextInt();
        
        for(int i = 0; i<row;i++){
            sum = sum + ratings[i][movie];
        }
        
        sum = sum/ratings.length; 
        System.out.println("The average rating for movie " +movie+ " is " +sum);
        
    }
    
}
