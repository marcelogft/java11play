package org.mocr.reactive.web.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mocr.reactive.web.demo.controller.ReactiveController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReactiveController.class)
public class ReactiveControllerTest {


    private WebTestClient webTestClient;

    @Before
    public void initClient() {
        webTestClient = WebTestClient.bindToController(ReactiveController.class).build();
    }

    @Test
    public void getGreeting () {
        webTestClient.get().uri("/greeting")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .consumeWith(response ->
                        Assertions.assertThat(response.getResponseBody()).isNotNull());
    }

    @Test
    public void testGetMap() {
        webTestClient.get().uri("/map")
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
                .expectBody().json("[{\"1\": \"one\",\"2\": \"two\"}]");
    }

}