/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bonus;

import java.io.PrintWriter;

/**
 *
 * @author Ash
 */
public class SortStock {
    
    final int STOCK_LENGTH = CreateStock.items.length;
    final Item[] STOCK_LIST = CreateStock.items;
    private PrintWriter writer;
    private int[] stockQuality;
    private int[] stockID;
    
    
    static void doubleBubbleSort(int[] arr, int[] sideArr, int n){
        
        if (n==1)return;
        for (int i=0; i<n-1;i++){
            if (arr[i] > arr[i+1]) 
            {  
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
                
                temp = sideArr[i]; 
                sideArr[i] = sideArr[i+1]; 
                sideArr[i+1] = temp; 
            } 
        }
        doubleBubbleSort(arr, sideArr, n-1);
    }
    
    static String revertQuality(int quality){
        String revertedQuality;
        switch(quality){
            case(0):
                revertedQuality = "Excellent";
                break;
            case(1):
                revertedQuality = "Good";
                break;
            case(2):
                revertedQuality = "Normal";
                break;
            case(3):
                revertedQuality = "Bad";
                break;
            case(4):
                revertedQuality = "Horrible";
                break;
            default:
                revertedQuality = "Not Found";
                break;
        }
        return(revertedQuality);
    }
    
    SortStock(){
        stockQuality = new int[STOCK_LENGTH];
        stockID = new int[STOCK_LENGTH];
        for(int i = 0; i < STOCK_LENGTH; i++){
            stockQuality[i] = (STOCK_LIST[i].valueCheck(STOCK_LIST[i].quality));
            stockID[i] = STOCK_LIST[i].ID+1;
        }
        doubleBubbleSort(stockQuality, stockID, STOCK_LENGTH);
        try{
            writer = new PrintWriter("src/TxtFiles/SortedCurrentStock.txt", "UTF-8");
            for (int i = 0; i < STOCK_LENGTH; i++) {
                writer.print("Item ID: " + stockID[i]);
                writer.println(" Item Quality: " + revertQuality(stockQuality[i]));
            }
            writer.close();
            System.out.println("Succesfully sorted stock");
        }catch(Exception e){
            System.out.print("Failed to create file");
        }
    }
}
