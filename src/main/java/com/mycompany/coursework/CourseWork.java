/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coursework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author giann
 */
public class CourseWork {

    public static void main(String[] args) {
           //change to your specific file path 
            String file ="C:\\Users\\giann\\Documents\\NetBeansProjects\\CourseWork\\src\\main\\java\\file\\tree.csv";
            String line ="";
        
        try{
             BufferedReader br = new BufferedReader(new FileReader(file));
             while((line = br.readLine())!=null){
                 System.out.println (line);
             }
        }catch(IOException e){
//            asdasd
            System.out.print("Problem with file" + e);
        }

    }
}
