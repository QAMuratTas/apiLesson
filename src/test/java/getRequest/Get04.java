package getRequest;

import baseURLs.JsonPlaceHolderBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get04 extends JsonPlaceHolderBaseURL {

    @Test
    public void get04(){
         /*
        Given
            https://jsonplaceholder.typicode.com/users
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    Data uzunluğunun 10 olduğunu assert ediniz.

     */

        /*
        1) Set URL
        2) Set expected data
        3) Send a Request
        4) assertion

         */
specification.pathParams("userpath","users");

Response response = given().spec(specification).when().get("/{userpath}");
response.prettyPrint();
response.then().assertThat().statusCode(200).
        contentType(ContentType.JSON).
        body("id", Matchers.equalTo("10"));

    }



}
