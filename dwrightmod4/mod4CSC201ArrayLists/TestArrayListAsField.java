package mod4CSC201ArrayLists;
import java.util.*;

public class TestArrayListAsField {
	
	public static void main(String[] args) {
		Card c1 = new Card("Diamonds", "five");
		Card c2 = new Card("Diamonds", "jack");
		Card c3 = new Card("Hearts", "five");
		Card c4 = new Card("Spades", "ten");
		Card c5 = new Card("Clubs", "five");
		
		ArrayList<Card> myCards = new ArrayList<Card>();
		myCards.add(c1); myCards.add(c2); myCards.add(c3); myCards.add(c4); myCards.add(c5);
		Hand myHand = new Hand( "Sam",myCards);		
		
		System.out.println( myHand.toString());
	}
}

class Card {
	
	private String suit;
	private String value;
	
	public Card() { }
	public Card(String s, String v) { suit=s; value=v; }
	
	public String toString()
	{
		return value + " of " + suit;
	}

	public String getSuit() {	return suit;	}
	public void setSuit(String suit) {	this.suit = suit;	}
	public String getValue() {	return value;	}
	public void setValue(String value) {	this.value = value;	}	
}

class Hand {
	private String owner;
	private ArrayList<Card> cards;
	
	public Hand()	{	cards = new ArrayList<Card>();	}
	public Hand(String who, ArrayList<Card> c) { owner = who; cards = c; }

	public String toString()
	{
		String ans = "The owner is "+ owner +" and the cards are ";
		for (int i=0;i<cards.size();i++)
		{
			ans = ans + "\n   " + cards.get(i).toString()+ "  ";
		}
		return ans;
	}
	
	public ArrayList<Card> getCards() {	return cards;	}
	public void setCards(ArrayList<Card> cards) {this.cards = cards;}
	
}
