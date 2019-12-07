/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ash
 */
public class Item {
    
    private enum Quality{
        Excellent, Good, Normal, Bad, Horrible;
    }
    private static final List<Quality> VALUES = Arrays.asList(Quality.values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    int ID;
    Quality quality;
    Item(int ID){
        this.ID = ID;
        this.quality = randomizeQuality();
    }
    private static Quality randomizeQuality(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    String qualityCheck(Quality quality){
        String qualityString;
        switch (quality){
            case Excellent:
                qualityString = "Excellent";
                break;
            case Good:
                qualityString = "Good";
                break;
            case Normal:
                qualityString = "Normal";
                break;
            case Bad:
                qualityString = "Bad";
                break;
            case Horrible:
                qualityString = "Horrible";
                break;
            default:
                qualityString = "Not Found";
                break; 
        } 
        return(qualityString);
    }
}
