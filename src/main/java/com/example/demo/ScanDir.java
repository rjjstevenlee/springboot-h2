package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ScanDir {
    public static void main(String[] args) {
        scanDir();
    }
    public static void scanDir(){

        String path = "C:\\Java\\springboot-h2\\src\\main\\java\\com\\example\\demo\\controller";
        File file = new File(path);
        File[] list = file.listFiles();
        System.out.println("filesTotal:"+list.length);
        int methodsTotal = 0;
        for(File fs : list){
            //System.out.println(fs.getPath());
            int methodsCount = 0;
            try {
                FileReader fr = new FileReader(fs);
                BufferedReader br = new BufferedReader(fr);
                String str = null;
                while((str=br.readLine())!=null){
                    if(str.contains("@RequestMapping")){
                        System.out.println(str);
                        methodsCount ++;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("methodsCount:"+methodsCount);
            methodsTotal +=methodsCount;
        }
        System.out.println("methodsTotal:"+methodsTotal);
    }
}
