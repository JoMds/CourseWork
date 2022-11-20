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
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 *
 * @author giann
 */
public class CourseWork {
    
//    Arraylist

    public static void main(String[] args) {
           //change to your specific file path 
            String file ="C:\\Users\\giann\\Documents\\NetBeansProjects\\CourseWork\\src\\main\\java\\file\\tree_V2.csv";
            String line = "";
            String split =",";
            ArrayList<String[]> data = new ArrayList<String[]>();
            ArrayList<Person> persons = new ArrayList<Person>();
            
        try{
             BufferedReader br = new BufferedReader(new FileReader(file));
             
             while((line = br.readLine())!=null){
                 String words[] = line.split(split);
                 data.add(words);
             }
             
             String[] uniqueNames = getUniqueNames(data);
             
             for(String uname: uniqueNames){
                 ArrayList<String[]> rows = (ArrayList<String[]>)data.stream().filter(x -> x[0].equals(uname)).collect(Collectors.toList());
                 
                 Person p = new Person();
                
                 for(String[] r : rows){
                     switch(r.length){
                     
                         case 2:
                             p.setName(r[0]);
                             p.setGender(r[1]);
                             break;
                         case 3:
                             if(r[1].equals("spouse")){
                                  p.setSpouseName(r[2]);
                                  p.setRelathion(r[1]);
                             }
                             else if(r[1].equals("mother")||r[1].equals("father")){
                                 p.addChild(r[2]);
                             }
                            break;
                     }
                 }
                 persons.add(p);
             }
        }catch(IOException e){
            System.out.print("Problem with file" + e);
        }
        var pp = persons;
        var x="";
    }
    
    public  static String[] getUniqueNames(ArrayList<String[]> data){
        
        ArrayList<String> names = new ArrayList<String>();
 
        data.stream().forEach(x -> {
            names.add(x[0]);
        });
        
        HashSet<String> hashSet = new HashSet<String>(names);
        
        var uniqueNames = hashSet.toArray(String[]::new);
        
        return uniqueNames;
    }
}

