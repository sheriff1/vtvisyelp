vtvisyelp
=========
-Parse objects to get the following information - http://wiki.fasterxml.com/JacksonInFiveMinutes

    S---> All of the user profile objects match up with a review object                             [X]           
    S---> Extract all Virginia Tech objects to separate JSON files                                  [X]
		    -expecting 770 review objects, <=770 user profile objects, and 91 business profile objects
		OUTPUT FROM ID_Match.java: Number of VT objects:
						Business profiles: 143
						User profiles: 320
						User reviews: 992

	S---> How many restaurants are near Virginia Tech (can be verified by "stufte" website)         [*]
		-see above			

	D---> How many categories of restaurants are there near Virginia Tech                           [*]
		this was done in Extract_Categories.java, the problem now is to identify 
		which categories we need to consider for our visualization.
		see list_categories_VT.txt to see the list. 

 	D---> How many restaurants are within each these categories     								[ ]
	S---> The earliest and latest dates of reviews of restaurants                                   [ ]
			-near Virginia Tech
			-for each category
			-for each restaurant
			-think of date boundary - for whole area? for a category only? for a restaurant only?
	*** gauge the amount of time it took to parse each of these things

[above done by 11-13-12???]

    -Incorporate submit button into menu interface (figure 1) - D                                       [ ]

    -the algorithm for incorporating voting metrics into rating. VERIFY. write the report about it.     [ ]
  
    -layout the visualization and menu interface                                                        [ ]

    -load and use JSON into D3 and connect it somehow to our layout                                     [ ]
