import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Day3 extends Day {
    Day3() {
        inputFile = "days/Day3/input.txt";
    }

    public void part1() {
        String input = this.getInput();
        int num = 218;
        int iN= 0,jN = 0, kN = 0;
        int i= 0,j = 0, k = 0;

        int zn = 0, z = 0, c = 0;

        for (String line : input.split("\n")) {
            // System.out.println(String.format("output: %d", i % line.length()));
            if(line.charAt(i%(line.length())) == '#')iN++;
            i+=1;
            if(line.charAt(j%(line.length())) == '#')jN++;
            j+=5;
            if(line.charAt(k%(line.length())) == '#')kN++;
            k+=7;
        }
        for (String line : input.split("\n")) {
          if(c%2 == 0 && line.charAt(z%(line.length())) == '#'){
            zn++;
          }
          if(c%2 == 0){
            z++;
            System.out.println(String.format("output: %d, %d", z%line.length(), z));
          }
          c++;
        }

        System.out.println(String.format("output: %d, %d, %d, %d", iN, jN, kN, zn));
    }

    public void part2() {
        // String input = this.getInput();
        // List<Integer> l = new ArrayList<Integer>();

        // for (String line : input.split("\n")) {
        //     l.add(Integer.parseInt(line));
        // }

        
        // System.out.println(String.format("output: %d", 0));
    }
}