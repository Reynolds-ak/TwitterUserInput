/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitteruser;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author Rey
 */
public class ReadUP {
    
    private String path;
    
    public ReadUP(String filePath){
        path = filePath;
    }
    
    public String[] OpenUPFile() throws IOException{
        FileReader upFReader = new FileReader(path);
        BufferedReader upTxtReader = new BufferedReader(upFReader);
        
        int numOfLines = readLines();
        String[] txtData = new String[numOfLines];
        
        int i ;
        
        for (i=0;i<numOfLines;i++) {
            txtData[i] = upTxtReader.readLine();
        }
        
        upTxtReader.close();
        return txtData;
    }
    
    int readLines() throws IOException{
        
        FileReader fileToRead = new FileReader(path);
        BufferedReader  bufferRder = new BufferedReader(fileToRead);
        
        String aLine;
        int numOfLines = 0;
        
        while ((aLine = bufferRder.readLine()) != null){
                numOfLines++;
        }
        bufferRder.close();
        return numOfLines;
    }
}