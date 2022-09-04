/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;
import java.util.*;
/**
 *
 * @author price
 */
public class Football {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        FootballCenter obj = new FootballCenter();
        ScoreFootball obj1 = new ScoreFootball();
        int people = obj.setPeople();
        System.out.print();
        for (int i = 0;i < people;i++) obj.register(obj1);
        while (true){
        System.out.print("Enter Score ");
        String s = sc.nextLine();
        if (s.equals("")) break;
        System.out.println();
        obj.setSomeData(s);
        }        
	
    }
}

