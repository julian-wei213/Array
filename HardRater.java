class HardRater{
    public static void main(){
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
                            
        hardestRater2018(ratings);
        
        System.out.println("The hardest rater was " +hardestRater2018(ratings));
        
    }
    
    public static int hardestRater2018(int[][] ratings){
        double sum0 = 0;
        double sum1 = 0;
        double sum2 = 0;
        
        for(int a = 0; a<ratings.length;a++){
            for(int b = 0; b<ratings[0].length;b++){
                if(a == 0){
                    sum0 += ratings[a][b];
                }else if(a == 1){
                    sum1 += ratings[a][b];
                }else{
                    sum2 += ratings[a][b];
                }
            }
        }
        
        if(sum0 < sum1 && sum0 < sum2){
            return 0;
        }else if(sum1<sum0 && sum1<sum2){
            return 1;
        }else{
            return 2;
        }
        
    }
}
