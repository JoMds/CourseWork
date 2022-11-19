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
            String file ="C:\\Users\\giann\\Documents\\NetBeansProjects\\CourseWork\\src\\main\\java\\file\\tree_V2.csv";
            // var for csv line            
            String line ="";
           //split indicator 
//            String split="\\s+";
            String split =",";
//            String man ="man";
           //ArrayList with persons             
            ArrayList<Person> persons = new ArrayList<Person>();
            
        try{
             BufferedReader br = new BufferedReader(new FileReader(file));
             while((line = br.readLine())!=null){
//                 System.out.println(line); 
                 
                 String words [] = line.split(split);
                     
                     if(line.contains("spouse") || line.contains("man")){
                         for (int i=0; i<words.length +1; i++) {
                             if (words.length!=2){
                             System.out.println("Peron:"+"\t"+words[0]+"0"+words[1]+"\t" +"1"+"\t"+words[2]+"\t"+"2");
//                             System.out.print(words[i]);
                             }
                          
                         }
                     }
                     
                    if(line.contains("mother")||line.contains("father") ){
                         for (int i=0; i<words.length; i++) {
                          System.out.println("Mother-Father:"+"\t"+words[0]+"0"+words[1]+"\t" +"1"+"\t"+words[2]+"\t"+"2");
//                            System.out.print(words[i]);
                         }
                     }
                     
//                     if(line.contains("man")){
//                         for (int i=0; i<words.length; i++) {
//                          System.out.println("\t" + words[0]+"0"+"\t"+words[1]+"1");
//                         }
//                     }
                 
//                 for(int i =0 ; i<words.length; i ++){
//                     if(words.length!=2){
//                         if( words[i].contains("spouse")){
//                             System.out.println(words[i]+"spouse");
//                         }
//                         if(words[i].contains("mother") || words[i].contains("father"))
//                              System.out.println(words[i]+"fater/mother");
//                         System.out.println(words[0]+"[0]"+words[1]+"[1]"+words[2]+"[2]");
//                     }
//                     if(words[i].contains("man")){
//                         System.out.println(words[i]+"test");
//                     }
//                       System.out.println(words[0]+"[0]"+words[1]+"[1]");
//                 }
             }
        }catch(IOException e){
            System.out.print("Problem with file" + e);
        }
    }
}
