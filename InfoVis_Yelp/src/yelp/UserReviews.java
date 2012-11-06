package yelp;
//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class UserReviews
{
	public static class Votes //this class may be problematic in the case that we can't format the "votes" json object
	{
		private String [] type; //(both size 3, "useful,cool,funny")
		private int [] count; //(both size 3, "useful,cool,funny")
		//(will need getters and setters probably)
	}	

	private String user_id;
	private String review_id;
	private double stars;	
	private String date; //(might have to be double)
	private String text;
	private String type;
	private String business_id;
}
/*
ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
UserReview[] user_reviews = mapper.readValue(new File("user_reviews.json"), UserReview[].class);
*/