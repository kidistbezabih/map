/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author Kidist
 */
public class map {

    public static void main(String args[]) {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("kidist", 149);
        mp.put("mika", 12);
        mp.put("beti", 14);
        mp.put("robel", 15);
        mp.put("derye", 16);
        int sum = 0;

        for (Integer value : mp.values()) {
            sum += value;
        }

        int min = 1000000000;
        for (Integer value : mp.values()) {

            if (value < min) {
                min = value;
            }
        }
        int max = 0;
        for (Integer value : mp.values()) {

            if (value > max) {
                max = value;
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);

        for (Map.Entry<String, Integer> m : mp.entrySet()) {
            if (m.getValue() == min) {
                System.out.println(m.getKey());
            }
        }
        
        for (Map.Entry<String, Integer> m : mp.entrySet()) {
            if (m.getValue() == max) {
                System.out.println(m.getKey());
            }
        }
    }

}
