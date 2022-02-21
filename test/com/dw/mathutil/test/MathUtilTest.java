/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dw.mathutil.test;

import com.dw.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

//neu muon xai cac ham static, co 2 cach 
//cach 1: goi ten class.ten ham static() truyen thong 100 nam nay
//        nho import package....ten class chua static

//cach2:ko them goi ten clas cham, goi ten ham minh en, giong C
//      nho import static pakage 
/**
 *
 * @author thanh
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
    //Test case #1: getF() with valid argument
    //n=0, expected=1; actual: ?????
    @Test
    public void testFatorialGivenValidArgumentReturnWell(){
        long expected=1; //hy vong ham tra ve 1 neu tinh 0!
        long actual=MathUtil.getFatorial(0);
        
        assertEquals(expected, actual);
        //~~~~trong main() kieu cu, ta in ra ket qua expected va actual
        //mat tu nhin de coi 2 thang giong nhau hay ko 
        // ben JUnit, tung 2 mau sac : XANH 2 thang khop nhau
        //                             DO 2thang khac nhau
    }
    
    //NGOAI LE Thi lam sao de TEST
    //Nho la: Ngoai le ko phai la 1 VALUE
    //Ngoai le la 1 ting huong, thu gi do bat thuong, o kha nang xay ra/xuat
    //Ko la Value de so sanh kieu assertEquals()
    //Ngoai le ko dung ham aseerEquals()
    //chi do luong =cach coi may co xu huong hay ko????
    
    @Test(expected=IllegalArgumentException.class)
    //Testcase#3:getF() with invalid argument
    //n=-5, exxppected=ngoai le phai xuat hien
    public void testFatorialGivenValidArgumentThrowsException(){
        
        MathUtil.getFatorial(-5);
    }
}
