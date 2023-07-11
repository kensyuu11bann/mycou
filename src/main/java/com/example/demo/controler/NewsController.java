package com.example.demo.controler;
/*
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NewsApiService;

@RestController
public class NewsApiController {

    @Autowired
    private NewsApiService newsApiService;

    @GetMapping("/news/top-headlines")
    public JSONArray getTopHeadlines(@RequestParam("country") String country) {
        return newsApiService.getTopHeadlines(country);
    }
}
*/

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewsController {

	@GetMapping("/news")
	public String news() {
		 final String uri = "http://newsapi.org/v2/top-headlines?country=jp&apiKey=d8c819299df24d048262832b733aef1c";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		 
		
		
		//HttpHeaders headers = new HttpHeaders();
		//HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);

		
		ResponseEntity<String> responseEntity = new RestTemplate().exchange(
				"https://newsapi.org/v2/top-headlines?country=uk&apiKey=d8c819299df24d048262832b733aef1c",
				HttpMethod.GET,
				null,
				String.class);
				
		
		//afdstt
		//ResponseEntity<String> responseEntity = new RestTemplate().

	/*	String result = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(responseEntity.getBody());

			JsonNode documentsNode = jsonNode.get("articles").get(0);
			return documentsNode.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

		return result;

	}

}
