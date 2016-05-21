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
        String[] zeros = NBinary.split("1");
        System.out.println(zeros); 
        //Collections.sort(zeros);
        System.out.println(zeros); 
        //Collections.reverse(zeros);
        System.out.println(zeros); 
        //String theLongestSequence = zeros.get(0);
        System.out.println(); 
        return 0;
    }   
}
