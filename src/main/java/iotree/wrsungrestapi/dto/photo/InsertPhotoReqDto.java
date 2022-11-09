package iotree.wrsungrestapi.dto.photo;

import lombok.Data;

@Data
public class InsertPhotoReqDto {
    private Long albumId;
    private String title;
    private String url;
    private String thumbnailUrl;
}
