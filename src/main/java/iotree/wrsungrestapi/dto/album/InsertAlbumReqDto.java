package iotree.wrsungrestapi.dto.album;

import lombok.Data;

@Data
public class InsertAlbumReqDto {
    private Long userId;
    private String title;
}
