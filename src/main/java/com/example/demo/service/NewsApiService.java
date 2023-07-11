
/*
import java.net.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

@Service
public class NewsApiService {

    private static final String API_KEY = "8932d7691175436ea3d6ba7ba5721524Y";  // ここに自分のAPIキーを入力します

    public JSONArray getTopHeadlines(String country) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = "https://newsapi.org/v2/top-headlines?country=" + country + "&apiKey=" + API_KEY;
            HttpGet request = new HttpGet(url);
            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String responseBody = EntityUtils.toString(entity);
                return new JSONArray(responseBody);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
*/
