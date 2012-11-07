package yelp;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Q1 
{
	public static void main(String[] args) 	
	{
		try
		{
			int rev = 0;
			ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
			/*Collection<UserProf> user_profs =  
				      mapper.readValue(new File("/Users/sheriff/Documents/eclipse-Java EE/workspace/InfoVis_Yelp/jsons/user_profiles.json"),  
				        new TypeReference<Collection<UserProf>>() {});*/
			List<UserProf> user_profs = mapper.readValue(new File("/Users/sheriff/Documents/eclipse-Java EE/workspace/InfoVis_Yelp/jsons/user_profiles.json"), 
					new TypeReference<List<UserProf>>(){});
			for(UserProf up : user_profs)
			{
				if (up.getReview_count() > 500)
				{
					System.out.println(up.getName());
					rev++;
				}
			}
			System.out.println("rev = " + rev);
		}
		catch (JsonGenerationException e) 
		{
			System.out.println("JsonGenerationException");
			e.printStackTrace();
		} 
		catch (JsonParseException e) 
		{
			System.out.println("JsonParseException");
			e.printStackTrace();
		} 
		catch (JsonMappingException e) 
		{
			System.out.println("JsonMappingException");
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			System.out.println("IOException");
			e.printStackTrace();
		}

	}

}
