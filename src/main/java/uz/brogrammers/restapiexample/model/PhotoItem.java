package uz.brogrammers.restapiexample.model;

import lombok.Data;

@Data
public class PhotoItem {
    private Integer albumId;
    private Integer id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
