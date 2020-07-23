/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitteruser;

import java.time.LocalDate;

/**
 *
 * @author Rey
 */

public class DateOfBirth {
    
    private  int  dobYear;
//    private String Month;
    private int dobMonth;
    private int dobDay;
    
// public class 
    public int getdobYear(){
    return dobYear;
    }
    
    public boolean setdobYear(int year){
        this.dobYear = year;
        
        if(dobYear>=1970 && dobYear< LocalDate.now().getYear()){
//          this.dobYear = year;  
            return true;
        }
        else{
            System.out.println("Please " + dobYear + " is not a Year!");
            return false;
        }
            
            
    }
    
    public int getdobMonth(){
        return dobMonth;
    }
    
    public boolean setdobMonth(int month){
        this.dobMonth = month;
        
        if(dobMonth>=1 && dobMonth<=12){
//           this.dobMonth = month; 
            return true;
        }
        else{
        System.out.println("Please " + dobMonth + " is not a Day!");
        return false;
        }
    }
    
    public int getdobDay(){
        return dobDay;
    }
    
    public boolean setdobDay(int day){
        this.dobDay = day;
        
        if(dobDay>=1 && dobDay<=31){
//             this.dobDay = day;
            return true;
        }
        else{
        System.out.println("Please " + dobDay + " is not a Day!");}
        return false;
    }
    
    public int ageCalc(){
        int cYear = LocalDate.now().getYear();
        int Age = cYear-dobYear;
        return Age;
    } 
    
    
    
}
