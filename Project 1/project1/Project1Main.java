package project1;

public class Project1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tweet t1 = new Tweet("0", "123", "dog", "if i didn't still have a history presentation to pull out of the air by tomorrow; i'd be kicking back with the half-blood prince ");
		
		//Big text data...25+ minutes of running
		//TweetCollection tc = new TweetCollection("tweets.txt");
		
		TweetCollection tc1 = new TweetCollection("testProcessed.txt");
		Predictor p = new Predictor();
		
		
		//run a predict on single tweet. Will return 0 or 4. Takes a parameter because we're only doing a single tweet
		//directly using the predictor object 'p'
		int outcome = p.predict(t1);
		System.out.println("Outcome of tweet: " + outcome + ". \nFor tweet: " + t1);
		
	
		//run a predict on a collection of tweets (400 total here)
		//Takes no parameter because the predictor class is being fed by the TweetCollection class.
		//Print out the % correct for neg/pos, as well as total % correct.
		System.out.println(tc1.predict());
		
		
//		//To reset stored data in the global variables storing the positive/negative tweet data use .reset
//		tc1.reset();	
//		System.out.println(tc1.predict());
//	
		//just print prediction info after object reset, or you could make a new object.
		
		
				
		tc1.reset();
		tc1.predict();
		// print tweets w/ prediction info.
		System.out.println(tc1);
		
		//get array list of tweet ids.
		System.out.println(tc1.getIds());
		
		
		
		
		
		// random testing
//		System.out.println(tc);
//		tc.add(t1);
//		//print tweet
//		System.out.println(t1);
//		//print collection
//		
//		
//		tc1.add(new Tweet("2", "4443", "Bob", "Hello World"));
//		tc.add(new Tweet("2", "4444", "Bob", "Hello World"));
//		tc.add(new Tweet("4", "4445", "Bob", "Hello World"));
//		tc.add(new Tweet("4", "4446", "Bob", "Hello World"));
//		tc.add(new Tweet("4", "4447", "Bob", "Hello World"));
//		System.out.println(tc.get("4443"));
//		System.out.println(tc.getUserTweetIds("Bob"));
//		System.out.println(tc);
//		tc.remove("4444");
//		System.out.println(tc);
//		System.out.println(tc.getUserTweetIds("mimism"));
//		System.out.println(tc.get("1467813137"));
//		
//		tc.writeFile();
		
	}
	

}
