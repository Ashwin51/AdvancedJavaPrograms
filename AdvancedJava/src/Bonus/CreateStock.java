/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bonus;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ash
 */
public class CreateStock {

    private static final Scanner SCANNER = new Scanner(System.in);
    private int amnt;
    private Item item;
    private PrintWriter writer;
    public static Item[] items;

    public CreateStock() {
        System.out.print("How many items must be stocked=> ");
        amnt = SCANNER.nextInt();
        items = new Item[amnt];
        System.out.println("Every item will have a randomized quality.");
        try {
            writer = new PrintWriter("src/TxtFiles/CurrentStock.txt", "UTF-8");
            for (int i = 0; i < amnt; i++) {
                item = new Item(i);
                items[i] = item;
                writer.print("Item ID: " + (i + 1));
                writer.println(" Item Quality: " + item.qualityCheck(item.quality));
            }
            writer.close();
        } catch (Exception e) {
            System.out.print("Failed to create file");
        }

    }
}
