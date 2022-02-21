/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.mathutil.main;

import com.dw.mathutil.core.MathUtil;

/**
 *
 * @author thanh
 */
public class Main {

    public static void main(String[] args) {
        // ta kiem thu bang cach goi ham, doi data dua vao, chay
        // nhin ket qua cua ham tra ve (ACTUAL) so sanh voi cai ta 
        //hy vong no se tra ve(EXPECTED)
        //Cuoi cung so sanh EXPECTED vs ACTUAL
        //de dam bao ham dung, ta phai chia cac truong hop/nghi ra
        //cac tinh huong ham se duoc xai, tuc la nghi ra cac bo data 
        //dua cho ham , ham chay, ouput, ket luan 
        //Moi bo DATA dua vao, moi data cu the de test ham cho 1 muc
        //Dich nao do, ta goi la TEST CASE- TINH HUONG TEST
        //n=5, goi ham getF() -> test case
        //n=-5, goi ham getF() -> test case

        //Test case#1: check getF() with valid argument
        //n=0, expprcted =1; actual;
        long expected = 1;
        long actual = MathUtil.getFatorial(0);
        //compare
        System.out.println("0! -> expected: " + expected + "; actual: " + actual);

        //Test case#2: check getF() with valid argument
        //n=6, expprcted =1; actual;
        long expected2 = 720;
        long actual2 = MathUtil.getFatorial(6);
        //compare
        System.out.println("6! -> expected: " + expected2 + "; actual: " + actual2);
        
        //Test case#3: check getF() with valid argument
        //n=-5, expprcted = ????? fail; actual;
        //long expected3 = Exceprion;
        System.out.println("Check if an exception is thrown by using invalid argument");
        MathUtil.getFatorial(-5);   
        //Ap chay nhu thiet ke
    }
}
