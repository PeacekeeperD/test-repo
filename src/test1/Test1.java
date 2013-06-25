//import java.io.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Grey
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String("Hello, world");
        System.out.println(s);

        
        PrintWriter zzz = null;
    try
    {
     zzz = new PrintWriter(new FileOutputStream("my_test_file.txt"));
     }
     catch(FileNotFoundException e)
       {
           System.out.println("Ошибка открытия файла my_test_file.txt");
            System.exit(0);
        }
        zzz.println("Это первая строка");
        zzz.println("Это вторая строка");
        
        zzz.close();
         
        System.out.println("Программа завершена");
        
    }
    
    
}
