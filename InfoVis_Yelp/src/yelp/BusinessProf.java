package yelp;
//JSON Java parser. based on: http://wiki.fasterxml.com/JacksonInFiveMinutes
public class BusinessProf
{
	private String business_id;
	private String full_address;
	private String schools;
	private boolean open;
	private String categories;
	private String photo_url;
	private String city;
	private double review_count;	
	private String name;
	private String neighborhoods;
	private String url;
	private double longitude; //(might be Strings though)
	private String state;
	private double stars;
	private double latitude; //(might be Strings though)
	private String type;
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public String getFull_address() {
		return full_address;
	}
	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public String getSchools() {
		return schools;
	}
	public void setSchools(String schools) {
		this.schools = schools;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getReview_count() {
		return review_count;
	}
	public void setReview_count(double review_count) {
		this.review_count = review_count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNeighborhoods() {
		return neighborhoods;
	}
	public void setNeighborhoods(String neighborhoods) {
		this.neighborhoods = neighborhoods;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

/*
ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
BusinessProfile[] bps = mapper.readValue(new File("business_profiles.json"), BusinessProfile[].class);
*/