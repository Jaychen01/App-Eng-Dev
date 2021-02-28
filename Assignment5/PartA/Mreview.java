package Assignment5.PartA;

import java.util.*;

public class Mreview implements Comparable<Mreview>{
		
		//instance variables
		private String title;
		private ArrayList<Integer> ratings;
		
		//method
		public Mreview() {
			this.title = "";
			this.ratings = new ArrayList<Integer> ();			
		}
		
		public Mreview(String ttl) {		
			this.title = ttl;
			this.ratings = new ArrayList<Integer> ();			
		}
		
		public Mreview(String ttl, int firstRating) {	
			this.title = ttl;
			this.ratings = new ArrayList<Integer> (1);
			ratings.add(firstRating);
		}
		
		public String getTitle() {
			return title;
		}
		
		public void addRating(int r) {			
			ratings.add(r);
		}
		
		public double aveRating() {
			if (ratings.size() == 0) {
				return 0.00;
			} else {
			int sum = 0;
			for( int i = 0; i < ratings.size(); i++) {
				sum += ratings.get(i);
			}
			return (double) sum / ratings.size();
			}
		}
		
		public int numRatings() {
			return ratings.size();
		}
		
		
		@Override
		public int compareTo(Mreview obj) {
			return this.getTitle().compareTo(obj.getTitle());
		}
		
		@Override
		public boolean equals(Object obj) {
			Mreview mreview = (Mreview) obj;
			return this.getTitle().equals(mreview.getTitle());
		}
		
		public String toString() {
//			return "XXX, average YYY out of ZZZ ratings";
			String text = title + ", average " + String.format("%.2f", aveRating()) + " out of " + numRatings() + " ratings";
			return text;
		}		
		
		public static void main(String[] args) {
			
			Mreview mre = new Mreview("Kill Bill");
			mre.ratings.add(3);
			mre.ratings.add(4);
			mre.ratings.add(3);			
			System.out.println(mre.aveRating());
			System.out.println(mre.toString());
			
			Mreview mre2 = new Mreview("Kill Bill");	
			System.out.println(mre2.compareTo(mre));
			
			Object mre3 = new Mreview("Kill Bills");
			System.out.println(mre3.equals(mre));
			
		} 
}
