package yelp;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class VT_Get_Business {

		public static void main(String[] args) 	
		{
			try
			{
				ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
				List<Business_Prof> biz_profs = mapper.readValue(new File("/Users/sheriff/Documents/VT/FA12/CS5764-InfoVis/project/vtvisyelp/InfoVis_Yelp/jsons/business_profiles.json"), 
						new TypeReference<List<Business_Prof>>(){});
				PrintWriter out = new PrintWriter(new FileWriter("/Users/sheriff/Documents/VT/FA12/CS5764-InfoVis/project/vtvisyelp/InfoVis_Yelp/jsons/VT_business_profiles.json"));
				for(Business_Prof bp : biz_profs)
				{
					if(bp.getSchools().contains("Virginia Tech"))
					{
						out.println(mapper.writeValueAsString(bp));
					}
				}
				out.close();
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
