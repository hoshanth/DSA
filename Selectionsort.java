/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        int arr[]={-3,-56,5,2,1};
        selection_sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
        
    static void selection_sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int min =i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    min =j;
                    
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        
    }
}