// Assignment 2 : Quick Sort

class Answer{
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static int quickSortHelper(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }
    
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int parti=quickSortHelper(arr,low,high);
            quickSort(arr,low,parti-1);
            quickSort(arr,parti+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        System.out.print("Origianl Array : ");
        print(arr);
        quickSort(arr,0,arr.length-1);
        System.out.print("Sorted Array : ");
        print(arr);
        
    }
}