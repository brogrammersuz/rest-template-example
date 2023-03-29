package uz.brogrammers.restapiexample.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uz.brogrammers.restapiexample.service.ApiService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    void getPhotos() {

        var data = apiService.getPhotos();

        var list = data.stream()
                .filter(photoItem -> photoItem.getTitle().startsWith("a"))
                .toList();

        System.out.println(list.size());

        assertEquals(1, data.get(0).getId());
        assertEquals(5000, data.size());

    }
}