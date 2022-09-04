/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;
/**
 *
 
 */
public class ScoreFootball implements MyObserver{
    @Override
    public void update(Source o) {
        System.out.println(
	 "live result: " 
                + ((FootballCenter)o).getSomeData());
    }
    
}
