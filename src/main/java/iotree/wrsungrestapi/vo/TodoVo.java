package iotree.wrsungrestapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoVo {
    private Long id;
    private Long userId;
    private String title;
    private int completed;
}
