// Assignment 1: Binary Search 

class HelloWorld {
    
    static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    static int binarySearch(int arr[],int target){
        bubbleSort(arr);
        System.out.print("Array After Sorting : ");
        print(arr);
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==target){
                return m;
            }else if(target>arr[m]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
    
   static void print(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
       int arr[]={5,4,3,2,1};
       System.out.print("Original Array : ");
       print(arr);
    //   System.out.println();
       int res=binarySearch(arr,4);
       if(res==-1){
           System.out.print("Target not found ");
       }else{
           System.out.print("The target found at index : "+res);
       }
    }
}