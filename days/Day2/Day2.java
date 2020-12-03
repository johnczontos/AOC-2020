import java.util.*;

public class Day2 extends Day {
    Day2() {
        inputFile = "days/Day2/input.txt";
    }

    public void part1() {
        String input = this.getInput();
        int min = 0, max = 0, num, tot = 0;
        char c = 'a';
        for (String line : input.split("\n")) {
          num = 0;
          min = Integer.parseInt(line.substring(0, line.indexOf('-')));
          max = Integer.parseInt(line.substring(line.indexOf('-')+ 1, line.indexOf(' ')));
          c = line.charAt(line.indexOf(' ')+1);
          // System.out.println(String.format("output: %d, %d, %c, %s", min, max, c, line.substring(line.lastIndexOf(' '))));
          for (char scan : line.substring(line.lastIndexOf(' ')).toCharArray()) {
            if(scan == c)num++;
          }
          if(num >= min && num <= max)tot++;
        }
        System.out.println(String.format("output: %d",tot));
    }

    public void part2() {
        String input = this.getInput();

        int i = 0, j = 0, tot = 0;
        char c = 'a';
        for (String line : input.split("\n")) {
          i = Integer.parseInt(line.substring(0, line.indexOf('-')));
          j = Integer.parseInt(line.substring(line.indexOf('-')+ 1, line.indexOf(' ')));
          c = line.charAt(line.indexOf(' ')+1);
          String word = line.substring(line.lastIndexOf(' '));
          System.out.println(String.format("output: %c, %c, %c, %b, s", word.charAt(i), word.charAt(j), c, c == word.charAt(i) ^ c == word.charAt(j), word));

          if(c == word.charAt(i) ^ c == word.charAt(j))tot++;
        }
        System.out.println(String.format("output: %d",tot));
    }
}