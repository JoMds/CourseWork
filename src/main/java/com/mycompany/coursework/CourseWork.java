/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coursework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class CourseWork {

    public static void main(String[] args) {
           //change to your specific file path 
            String file ="C:\\Users\\giann\\Documents\\NetBeansProjects\\CourseWork\\src\\main\\java\\file\\tree.csv";
            // var for csv line            
            String line ="";
           //split indicator 
            String split="\\s+";
           //ArrayList with persons             
            ArrayList<Person> persons = new ArrayList<Person>();
            
        try{
             BufferedReader br = new BufferedReader(new FileReader(file));
             while((line = br.readLine())!=null){
//                 System.out.println(line); 
                 
                 String words [] = line.split(split);
                 
                 for(int i =0 ; i<words.length; i++){
                 words[i] = words[i].replaceAll("[^\\w]", "");
//                 System.out.println(words.length);
                 try{
                 System.out.println("The name is: "+words[0]+" , the surname is;  "
                  +words[1]+", the role is: "+words[2]+","
                + " has an affair with:"+words[3]+" children of: "+words[4]);
                 
                 }catch(ArrayIndexOutOfBoundsException e){
                   
                 System.out.println(e);
                 }
                }
             }
        }catch(IOException e){
            System.out.print("Problem with file" + e);
        }
    }
}
