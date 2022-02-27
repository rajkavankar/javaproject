import java.time.Year;
import java.util.Scanner;
import java.util.Vector;

public class Game {
    
    public void grid1() {
        System.out.println(
                "\n1\t3\t5\t7\n9\t11\t13\t15\n17\t19\t21\t23\n25\t27\t29\t31\nDoes the number exist in the grid(y/n)\n");
    }

    public void grid2() {
        System.out.println(
                "\n2\t3\t6\t7\n10\t11\t14\t15\n18\t19\t22\t23\n26\t27\t30\t31\nDoes the number exist in the grid(y/n)\n");
    }

    public void grid3() {
        System.out.println(
                "\n4\t5\t6\t7\n12\t13\t14\t15\n20\t21\t22\t23\n28\t29\t30\t31\nDoes the number exist in the grid(y/n)\n");
    }

    public void grid4() {
        System.out.println(
                "\n8\t9\t10\t11\n12\t13\t14\t15\n24\t25\t26\t27\n28\t26\t30\t31\nDoes the number exist in the grid(y/n)\n");
    }

    public void grid5() {
        System.out.println(
                "\n16\t17\t18\t19\n20\t21\t22\t23\n24\t25\t26\t27\n28\t29\t30\t31\nDoes the number exist in the grid(y/n)\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>(5);
        Game g = new Game();
        
        g.grid1();
        String inputOne = sc.next();
        if (inputOne.equals("y")) {
            v.add(0, 1);
        }else if(inputOne.equals("n")){
            v.add(0, 0);
        }
       
       
        g.grid2();
        String inputTwo = sc.next();
        if (inputTwo.equals("y")) {
            v.add(1, 2);
        }else if(inputTwo.equals("n")){
            v.add(1, 0);
        }

        g.grid3();
        String inputThree = sc.next();
        if (inputThree.equals("y")) {
            v.add(2, 4);
        }else if(inputThree.equals("n")){
            v.add(2, 0);
        }

        g.grid4();
        String inputfour = sc.next();
        if (inputfour.equals("y")) {
            v.add(3, 8);
        }else if(inputfour.equals("n")){
            v.add(3, 0);
        }

        g.grid5();
        String inputFive = sc.next();
        if (inputFive.equals("y")) {
            v.add(4, 16);
        }else if(inputFive.equals("n")){
            v.add(4, 0);
        }

      
        int sum = 0;
        for (int i = 0; i < v.capacity(); i++) {
            sum += v.get(i);
        }

        System.out.println("Your number is: " + sum);
    }
}