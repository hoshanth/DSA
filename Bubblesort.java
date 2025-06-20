/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		 int arr[]={-3,-56,5,2,1};
        bubble_sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
        
    static void bubble_sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            boolean swap=false;  //if already swapped break the loop
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        
    }
}
