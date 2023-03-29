package uz.brogrammers.restapiexample.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.brogrammers.restapiexample.model.PhotoItem;
import uz.brogrammers.restapiexample.service.ApiService;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    @Override
    public List<PhotoItem> getPhotos() {

        var data = restTemplate.getForObject("/photos", PhotoItem[].class);
        return Arrays.asList(data);
    }
}
