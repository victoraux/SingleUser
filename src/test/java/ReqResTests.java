import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
public class ReqResTests {


    @Test
    public void getSingleUserTest(){

        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)

                .get("https://reqres.in/api/users/2")
                .then()
                .log().all()
                .statusCode(200)

                //resultado del response date, id = 2
                .body("data.id", equalTo(2));


        // .extract()
        // .asString();

        // System.out.println(response);
    }


}
