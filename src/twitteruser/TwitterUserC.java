/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitteruser;

/**
 *
 * @author Rey
 */
public class TwitterUserC {
    private String userName;
    private String password;
    private String name;
    private String emailAddress;
    private DateOfBirth dateOfBirth;
//    private int PhoneNumber;
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public String getuserName(){
        return userName;
    }
    
    public void setuserName(String username){
        this.userName = username;
    }
    
    
    public String getname(){
        return name;
    }
    
    public void setname(String name){
        this.name = name;
                }
    
    public String getemailAddess(){
        return emailAddress;
    }
    
    public void setemailAddress(String emailaddress){
        this.emailAddress = emailaddress;
    }
    
    public DateOfBirth getdateOfBirth(){
        return dateOfBirth;
    }
    
    public void setdateOfBirth(DateOfBirth dateofbirth){
        this.dateOfBirth = dateofbirth;
    }
}
