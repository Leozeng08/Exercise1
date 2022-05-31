/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

//this is a comment from Liang Zeng
//this is our first in class exercise
/**
 * The class where we create Cards
 * @author dancye, 2019
 */
//student name: Liang Zeng
//student id: 991645183
public class CardDealer 
{
    public static void main(String[] args)
            
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card eightClubs = new Card("Clbs", 8);
        eightClubs.setSuit("Hearts");
        System.out.println("eight's suit is " + eightClubs.getSuit());
        
    }
}
