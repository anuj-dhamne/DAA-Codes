// Assignment 4 : Fractional Knapsack

class fractional{
    static double knapSack(double v[],double w[],int n,int m){
        double r[]=new double[n];
        for(int i=0;i<n;i++){
            r[i]=v[i]/w[i];
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(r[j]<r[j+1]){
                    double temp1 = v[j];
                    v[j]=v[j+1];
                    v[j+1]=temp1;
                    
                    double temp2 = w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp2;
                    
                    double temp3 = r[j];
                    r[j]=r[j+1];
                    r[j+1]=temp3;
                }
            }
        }
        
        double profit=0;
        int rem=m;
        int i=0;
        while(i<n && rem>0){
            if(w[i]<=rem){
                profit+=v[i];
                rem-=w[i];
            }else{
                profit+=(rem*r[i]);
            }
            i++;
        }
        return profit;
    }
    public static void main(String args[]){
        double value[]={60,100,120};
        double weight[]={10,20,30};
        int W=50;
        // System.out.print("Anuj");
        double res=knapSack(value,weight,3,W);
        System.out.print("Profit : "+res);
    } 
}