package getRequest;

import baseURLs.JsonPlaceHolderBaseURL;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get03  extends JsonPlaceHolderBaseURL {
@Test
    public void get03(){

     /*
        Given
            https://jsonplaceholder.typicode.com/todos/2
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    title ın "quis ut nam facilis et officia qui" olduğunu verify et.,
		And
		    "completed" ın false olduğunu verify et.
		And
		    "userId" in 1 olduğunu verify et
     */


//Step 1: Set URL

specification.pathParams("todosPath","todos","idPath","2");

//Step 2: set Expected Data (ignored)

    //Step 3: Sen Request
    Response  response =given().
            spec(specification).when().get("/{todosPath}/{idPath}");


    response.prettyPrint();
    //Step 4:

    response.then().assertThat().statusCode(200).contentType("application/json");


    response.then().assertThat().body("title",
            Matchers.equalTo("quis ut nam facilis et officia qui"),
            "completed", Matchers.equalTo(false),"userId",Matchers.equalTo(1));
}


}
