package yelp;
//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class UserProf
{
	public static class Votes
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
	private String name; 
	private String url;
	private double average_stars;
	private int review_count;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getReview_count() {
		return review_count;
	}
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getAverage_stars() {
		return average_stars;
	}
	public void setAverage_stars(double average_stars) {
		this.average_stars = average_stars;
	}
	public Votes getVotes() {
		return votes;
	}
	public void setVotes(Votes votes) {
		this.votes = votes;
	}
}	