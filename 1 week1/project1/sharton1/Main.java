//********************************************************************************************************
// CLASS: classname (Main.java)
//
// DESCRIPTION
// project 1
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 // Project Number: 1
//
// AUTHOR: sherly hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {

        final int RUNS_UP = 1;
        final int RUNS_DN = 0;

        ArrayList<Integer> list = readFile("p01-in.txt");      
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();

        listRunsUpCount = findRuns(list, RUNS_UP);
        listRunsDnCount = findRuns(list, RUNS_DN);

        ArrayList<Integer> listRunsCount = merge(listRunsUpCount,listRunsDnCount);
        output("p01-runs.txt", listRunsCount);
    } 


    // 1) read file
    private ArrayList<Integer> readFile(String input_filename) {
        // prepare to read input file
        ArrayList<Integer> list = new ArrayList<>();
        Integer current_line = 0;
        Scanner input_file = null;

        try {    
            // Open the file to read
            input_file = new Scanner(new File(input_filename));       
            if (input_file != null){      
                // loop through input file
                while(input_file.hasNext()){
                    // read input file
                    current_line = input_file.nextInt();
                    list.add(current_line);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("=========================================================");
            System.err.println("A FileNotFoundExceptionException was caught!\n");
            System.err.println("Make sure the correct input file exist\n");
            System.out.println(ex);
            System.err.println("Program will stop here.");    
            System.err.println("=========================================================");             
        } finally {        
            if(input_file != null){
                input_file.close();             
            }           
        }  
        return list;    
    }

    // 2) Create array list for findRuns
    private ArrayList<Integer> arrayListCreate(int pSize , int pInitValue){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < pSize; i++ ){
            list.add(pInitValue);
        }
        return list;
    }

    // 3) return arraylist of integers 
    private ArrayList<Integer> findRuns(ArrayList<Integer> pList , int pDir){
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(),0);
        int i = 0;
        // k is count
        int k = 0;
        
        while(i < pList.size() -1) {
            // if run up or same value
            if (pDir == 1 && (pList.get(i) <= pList.get(i+1) || pList.get(i) == pList.get(i+1))){
                k++;
            // if run down or same value
            } else if (pDir == 0 && (pList.get(i) >= pList.get(i+1) || pList.get(i) == pList.get(i+1))){
                k++;
            // increment k from previous comparison
            } else {
                if(k!= 0){
                    listRunsCount.set(k, listRunsCount.get(k)+1);
                    k = 0;
                }
            }
            i++; 
        }
        if(k != 0){
            listRunsCount.set(k, listRunsCount.get(k)+1);
            k = 0;
        }
        return listRunsCount;
    }

    // 4) merge
    private ArrayList<Integer> merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount){
        ArrayList<Integer> listRunsCount = arrayListCreate(pListRunsUpCount.size(), 0);
        for (int i = 0; i < pListRunsUpCount.size() ; i++ ){
            listRunsCount.set(i, pListRunsDnCount.get(i) + pListRunsUpCount.get(i));
        }
        return listRunsCount;
    }

    // 5) output
    private void output(String pFilename, ArrayList<Integer> plistRuns){
        PrintWriter out = null;
        int sum = 0;
        for(Integer num : plistRuns){
            sum += num;
        }           
        try {    
            out = new PrintWriter(new FileWriter(new File(pFilename), true));
            out.println("runs_total, " + sum);
            // loop through arraylist
            for(int k = 1 ; k < plistRuns.size(); k++ ){
                // write on output file
                out.println("runs_" + k + ", "+ plistRuns.get(k));
            }
            
        } catch (IOException ex) {
            System.err.println("=========================================================");
            System.err.println("An IOException was caught!\n");
            System.err.println("Program will stop here.");  
            System.out.println(ex);
            System.err.println("==========================================================");
            
        } finally {
            if(out != null){
                out.close();
            }                     
        }      

    }
}