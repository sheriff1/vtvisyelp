package yelp;
//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class UserProf
{
	public static class Votes
	{
		private String [] type; //(both size 3, "useful,cool,funny")
		private int [] count; //(both size 3, "useful,cool,funny")
		//(will need getters and setters probably)
	}	

	private String user_id;
	private String name; 
	private String url;
	private double average_stars;
	private int review_count;
	private String type;

}	
/*
ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
UserProfile[] user_profs = mapper.readValue(new File("user_profiles.json"), UserProfile[].class);
*/