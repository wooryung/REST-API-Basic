package iotree.wrsungrestapi.dto.post;

import lombok.Data;

@Data
public class InsertPostReqDto {
    private Long userId;
    private String title;
    private String body;
}
