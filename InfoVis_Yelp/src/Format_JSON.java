import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Format_JSON {

	public static void main (String[] args)
	{
		try 
		{
			String more = "";
			BufferedReader dammit = new BufferedReader(new FileReader("/Users/sheriff/Documents/VT/FA12/CS5764-InfoVis/project/vtvisyelp/InfoVis_Yelp/jsons/business_profiles.json"));
			PrintWriter out = new PrintWriter(new FileWriter("/Users/sheriff/Documents/VT/FA12/CS5764-InfoVis/project/vtvisyelp/InfoVis_Yelp/jsons/bp_nobrackers.json")); 
			while(dammit.ready())
			{
				more = dammit.readLine();
				if(more.contains("[") || more.contains("]"))
				{
					more = more.replace("[", "");
					more = more.replace("]", "");
					out.println(more);
				}
			}
			out.flush();
			out.close();
			dammit.close();
			/*
		    String crap = "";
			BufferedReader dammit = new BufferedReader(new FileReader("/Users/sheriff/Documents/eclipse-Java EE/workspace/InfoVis_Yelp/jsons/user_reviews.json"));
			PrintWriter out = new PrintWriter(new FileWriter("/Users/sheriff/Documents/eclipse-Java EE/workspace/InfoVis_Yelp/jsons/user_reviews_comma.json")); 
			while(dammit.ready())
			{
				crap = dammit.readLine() + ",";
				out.println(crap);
			}
			out.flush();
			out.close();
			dammit.close();
			*/
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
