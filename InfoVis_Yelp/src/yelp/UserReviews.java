package yelp;


//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class UserReviews
{
	public static class Votes //this class may be problematic in the case that we can't format the "votes" json object
	{
		private int funny; 
		private int useful; 
		private int cool;
		public int getFunny() {
			return funny;
		}
		public void setFunny(int funny) {
			this.funny = funny;
		}
		public int getUseful() {
			return useful;
		}
		public void setUseful(int useful) {
			this.useful = useful;
		}
		public int getCool() {
			return cool;
		}
		public void setCool(int cool) {
			this.cool = cool;
		} 
	}	

	private Votes votes;
	private String user_id;
	private String review_id;
	private double stars;	
	private String date; //(might have to be double)
	private String text;
	private String type;
	private String business_id;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReview_id() {
		return review_id;
	}
	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}
	public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public Votes getVotes() {
		return votes;
	}
	public void setVotes(Votes votes) {
		this.votes = votes;
	}
}
/*
ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
UserReview[] user_reviews = mapper.readValue(new File("user_reviews.json"), UserReview[].class);
*/