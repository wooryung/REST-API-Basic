package iotree.wrsungrestapi.dto.comment;

import lombok.Data;

@Data
public class InsertCommentReqDto {
    private Long postId;
    private String name;
    private String email;
    private String body;
}
