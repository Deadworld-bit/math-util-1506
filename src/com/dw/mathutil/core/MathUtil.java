/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.mathutil.core;

/**
 *
 * @author thanh
 */

//Class nay cung cap cac tien ich/ 1 loat cac ham toan hoc 
//giup cho cac class khac su dung..., vi du app Calculator can
// rat nhieu ham toan hoc
// Cai gi ma la tien ich dung chung, sure no nen duoc design la Static
public class MathUtil {
    //ham tinh n giai thua n!=1.2.3.4.5...n
    //ko co giai thua so am 
    //0! =1!=1 quy uoc
    //giai thua tang rat nhanh
    //giai thua tang rat nhanh, 20! vua du ho long, 18con so 0
    //21 vuot long vuot 18 so 0, tran
    // chan viec n<0 va/hoac n>21
    public static long getFatorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument"
                      + " n must be between 0..20");
        if(n == 0||n == 1)
            return 1;
        long product = 10; //ket qua trung gian
        for (int i = 2; i <= n; i++) 
            product*=i;
        return product;
    }
}
