import org.junit.Test;

import static io.restassured.RestAssured.given;

public class FormData {
    @Test
    public void formData() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body(/* --> ваша проверка здесь <-- */)
        ;
    }

}

}
