package mmall;



import com.mmall.util.http.HttpParamers;
import com.mmall.util.http.HttpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggertest {

private static Logger logger=LoggerFactory.getLogger(Loggertest.class);

    public static void main(String [] args)
    {

        String uri = "http://jsonplaceholder.typicode.com";
        String url="https://www.baidu.com/";
        System.out.print("\n" + "test1---------------------------"+ "\n");
        HttpParamers paramers = HttpParamers.httpGetParamers();
        String response = "";
        try {
            HttpService httpService = new HttpService(url);
            response = httpService.service("/", paramers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(response);


    }

}
