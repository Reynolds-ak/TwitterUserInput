 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitteruser;


import java.util.Scanner;
import java.io.IOException;
//import ReadUP.java;
/**
 *
 * @author Rey
 */
public class TwitterUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String userName;
        String password;
        String name;
        String emailAddress;
        
        
        int q;
        String r;
        int s;

        TwitterUserC tUser = new TwitterUserC();
        DateOfBirth DOB = new DateOfBirth();

        Scanner take = new Scanner(System.in);
        
        boolean checkYear;
        boolean checkMonth;
        boolean checkDay;
        
          
        System.out.println("\n");
        System.out.println("Please enter your Username ");
        userName = take.next();
        
        System.out.println("\n");
        System.out.println("Please enter your Password ");
        password = take.next();
        System.out.println("\n");
        
        String fileName = "C:/Users/hp/Documents/SeriousJ/twitterUser/src/twitteruser/password.txt";
        ReadUP fileUP = new ReadUP(fileName);
        String[] arrLines = fileUP.OpenUPFile();
        
        int NOM = fileUP.readLines();
        String UP = userName+ ":" +password;
        
        int i;
        for (i=0;i<NOM;i++){
            if(UP.equals(arrLines[0])||UP.equals(arrLines[1])||UP.equals(arrLines[2])||UP.equals(arrLines[3])||UP.equals(arrLines[4])){
                        do{
        System.out.println("Please enter your Date of birth(yyyy-mm-dd)");
        String dob = take.next();
        String arr[] = dob.split("-");
        
        checkYear = DOB.setdobYear(Integer.parseInt(arr[0]));
        checkMonth = DOB.setdobMonth(Integer.parseInt(arr[1]));
        checkDay = DOB.setdobDay(Integer.parseInt(arr[2]));
        }
        while(checkDay == false || checkMonth == false || checkYear == false); 
//            System.exit(1);
//        }
        System.out.println("\n");
        System.out.println("Please enter your Name ");
        name = take.next();

        System.out.println("\n");
        System.out.println("Please enter your EmaiAddress ");
        emailAddress = take.next();

//        System.out.println("Please enter your Year of birth ");
//        q = take.nextInt();
//        
//        System.out.println("Please enter your Month of birth ");
//        r = take.next();
//        
//        System.out.println("Please enter your Day of birth ");
//        s = take.nextInt();
        tUser.setpassword(password);
        tUser.setuserName(userName);
        tUser.setname(name);
        tUser.setemailAddress(emailAddress);

//        tUser.setDOB(q);
//        DOB.setYear(Integer.parseInt(arr[0]));
       
//        DOB.setMonth(arr[1]);
//        DOB.setMonth(Integer.parseInt(arr[1]));
        
//        DOB.setDay(Integer.parseInt(arr[2]));
       

        tUser.setdateOfBirth(DOB);

        int Age = DOB.ageCalc();
        
        System.out.println("Username: " + tUser.getuserName());
        System.out.println("Password: " + tUser.getpassword());
        System.out.println("\n");
        System.out.println("Name: " + tUser.getname());
        System.out.println("Email Address: " + tUser.getemailAddess());

        System.out.println("Date of birth: " + DOB.getdobYear() + "," + DOB.getdobMonth() + "," + DOB.getdobDay());
//        tUser.getDateOfBirth()
        System.out.println("Age: " + Age + " years old");

            }
            else{
                System.out.println("Login Denied,Please start app and try ");
//                System.exit(1);
                        }
        }
//        String joinUP = userName:password;
        
        
//        if (joinUP == )
        
        
//        do{
//        System.out.println("Please enter your Date of birth(yyyy-mm-dd)");
//        String dob = take.next();
//        String arr[] = dob.split("-");
//        
//        checkYear = DOB.setdobYear(Integer.parseInt(arr[0]));
//        checkMonth = DOB.setdobMonth(Integer.parseInt(arr[1]));
//        checkDay = DOB.setdobDay(Integer.parseInt(arr[2]));
//        }
//        while(checkDay == false || checkMonth == false || checkYear == false); 
////            System.exit(1);
////        }
//        System.out.println("\n");
//        System.out.println("Please enter your Name ");
//        name = take.next();
//
//        System.out.println("\n");
//        System.out.println("Please enter your EmaiAddress ");
//        emailAddress = take.next();
//
////        System.out.println("Please enter your Year of birth ");
////        q = take.nextInt();
////        
////        System.out.println("Please enter your Month of birth ");
////        r = take.next();
////        
////        System.out.println("Please enter your Day of birth ");
////        s = take.nextInt();
//        tUser.setpassword(password);
//        tUser.setuserName(userName);
//        tUser.setname(name);
//        tUser.setemailAddress(emailAddress);
//
////        tUser.setDOB(q);
////        DOB.setYear(Integer.parseInt(arr[0]));
//       
////        DOB.setMonth(arr[1]);
////        DOB.setMonth(Integer.parseInt(arr[1]));
//        
////        DOB.setDay(Integer.parseInt(arr[2]));
//       
//
//        tUser.setdateOfBirth(DOB);
//
//        int Age = DOB.ageCalc();
//        
//        System.out.println("Username: " + tUser.getuserName());
//        System.out.println("Password: " + tUser.getpassword());
//        System.out.println("\n");
//        System.out.println("Name: " + tUser.getname());
//        System.out.println("Email Address: " + tUser.getemailAddess());
//
//        System.out.println("Date of birth: " + DOB.getdobYear() + "," + DOB.getdobMonth() + "," + DOB.getdobDay());
////        tUser.getDateOfBirth()
//        System.out.println("Age: " + Age + " years old");

//       TwitterUserC tU = new TwitterUserC();
//       DateOfBirthC DOB = new DateOfBirthC();
//       int AgeC = tU.ageCalc();
//       
//       System.out.println("You age is " + AgeC);
    }
}
