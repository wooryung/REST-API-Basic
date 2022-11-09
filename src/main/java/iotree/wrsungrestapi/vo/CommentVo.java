package iotree.wrsungrestapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentVo {
    private Long id;
    private Long postId;
    private String name;
    private String email;
    private String body;
}
