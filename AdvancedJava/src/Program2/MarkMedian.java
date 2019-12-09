/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;
import java.util.Scanner;

/**
 *
 * @author Ash
 */
public class MarkMedian {
    
    private final Scanner SCANNER = new Scanner(System.in);
    private int amnt, mark;
    private int[] marks;
    private double median;
    
    static void bubbleSort(int[] arr, int n){
        if (n==1)return;
        for (int i=0; i<n-1;i++){
            if (arr[i] > arr[i+1]) 
            {  
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
        }
        bubbleSort(arr, n-1);
    }
    
    public MarkMedian(){
        System.out.print("Enter the amount of marks there are: ");
        amnt = SCANNER.nextInt();
        marks = new int[amnt];
        for(int i=0;i<amnt;i++){
            System.out.print("Enter the mark: ");
            mark = SCANNER.nextInt();
            marks[i] = mark;
        }
        bubbleSort(marks, amnt);
        if(!(amnt%2==0)){
            System.out.print("Odd");
            median = marks[amnt/2];
        }else{
            System.out.println(marks[(int)(amnt/2+0.5)]);
            System.out.println(marks[(int)(amnt/2-0.5)]);
            System.out.println("Even");
            median = marks[(int)(amnt/2+0.5)]+marks[(int)(amnt/2-0.5)];
            median = median/2;
        }
        System.out.println(median);
    }
}
