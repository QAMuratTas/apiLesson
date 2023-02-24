package baseURLs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseURL {

  protected   RequestSpecification specification;
    @Before
    public void setUpBaseURL (){

      //https://jsonplaceholder.typicode.com
        specification =new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com").build();

    }



}
