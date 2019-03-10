package chapter13.practice;

import java.io.*;

public class exercise1 {

  public static void main(String args[]){
    String lines = "";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the sentences, 'q' to quit.");

    do {
      try{
        lines += br.readLine()+"\n";
      }catch(IOException e){
        System.out.println("Keep calm");
      }
    }while(lines.charAt(lines.length() - 2) != 'q');

    lines = lines.substring(0, lines.length() - 3);
    System.out.println(lines);

    int i = 0;
    int b = 0;

    try {
      FileOutputStream fout = new FileOutputStream(args[0]);

      do {
        i = (int) lines.charAt(b++);
        if(i != -1) fout.write(i);
      }while(b < lines.length());
    }catch(IOException e){
      System.out.println("Keep calm 2");
    }

  }
}
