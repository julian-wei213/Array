import java.util.Scanner;
class WorstMovie{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
                            
        System.out.println("The worst movie is movie " + worstMovie(ratings));
    }
    
    public static int worstMovie(int[][] ratings){
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int a = 0; a<ratings.length;a++){
            for(int b =0; b<ratings[0].length;b++){
                if(b == 0){
                    sum0 += ratings[a][b];
                }else if(b == 1){
                    sum1 += ratings[a][b];
                }else if(b == 2){
                    sum2 += ratings[a][b];
                }else{
                    sum3 += ratings[a][b];
                }
            }
        }
        
        
      if(sum0 < sum1 && sum0 < sum2 && sum0 < sum3){
            return 0;
        }else if(sum1<sum0 && sum1<sum2 && sum1 <sum3){
            return 1;
        }else if(sum2<sum0 && sum2<sum2 && sum2 <sum3){
            return 2;
        }else{
            return 3;
        }
    }
}
