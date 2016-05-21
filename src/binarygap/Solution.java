/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarygap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fedja
 */
public class Solution {

    public int solution(int N){
        String NBinary = Integer.toBinaryString(N);
        System.out.println(NBinary);
        
        NBinary = NBinary.trim();
        String [] zeros = NBinary.split("1");
        int n = zeros.length;
        //System.out.println(n);

        if (zeros.length == 0) return 0;
        
        int[] gaps = new int[zeros.length];
        for (int i = 0; i < zeros.length; i++){
            gaps[i] = zeros[i].length();
        }
        Arrays.sort(gaps);        
        return gaps[gaps.length-1];
    }
}
