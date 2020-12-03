import java.util.ArrayList;
import java.util.List;

public class Day1 extends Day {
    Day1() {
        inputFile = "days/Day1/input.txt";
    }

    public void part1() {
        String input = this.getInput();
        int MagicNum = 2020;
        int num = 0;
        List<Integer> comp = new ArrayList<Integer>();

        for (String line : input.split("\n")) {
            num = Integer.parseInt(line);
            comp.add(MagicNum - num);
            if(comp.contains(num))break;;
        }
        System.out.println(String.format("output: %d", num * (2020-num)));
    }

    public void part2() {
        String input = this.getInput();
        int d = 2020;
        int a = 0, b = 0, c = 0;
        List<Integer> l = new ArrayList<Integer>();

        for (String line : input.split("\n")) {
            l.add(Integer.parseInt(line));
        }

        for (int i = 0; i < l.size()-2; i++){
          a = l.get(i);
          for (int j = i+1; j < l.size()-1; j++){
            b = l.get(j);
            c = d - (a + b);
            if(l.contains(c) && a != b && b != c && a != c){
              i = l.size();
              break;
            }
          }
        }
        System.out.println(String.format("output: %d", a * b * c));
        System.out.println(String.format("output: %d %d %d", a, b, c));
    }
}