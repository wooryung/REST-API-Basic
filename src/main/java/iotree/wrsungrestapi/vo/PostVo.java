package iotree.wrsungrestapi.vo;

import lombok.*;

@Data
@NoArgsConstructor
public class PostVo {
    private Long id;
    private Long userId;
    private String title;
    private String body;

    public PostVo(Long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
