package iotree.wrsungrestapi.vo;

import lombok.*;

@Data
@AllArgsConstructor
public class PostVo {
    private Long id;
    private Long userId;
    private String title;
    private String body;
}
