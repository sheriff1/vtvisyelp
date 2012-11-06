package yelp;
//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class BusinessProf
{
	private String business_id;
	private String full_address;
	private String [] schools;
	private boolean open;
	private String [] categories;
	private String photo_url;
	private String city;
	private double review_count;	
	private String name;
	private String [] neighborhoods;
	private String url;
	private double longitude; //(might be Strings though)
	private String state;
	private double stars;
	private double latitude; //(might be Strings though)
	private String type;
}

/*
ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
BusinessProfile[] bps = mapper.readValue(new File("business_profiles.json"), BusinessProfile[].class);
*/