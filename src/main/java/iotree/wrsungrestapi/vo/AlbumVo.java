package iotree.wrsungrestapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlbumVo {
    private Long id;
    private Long userId;
    private String title;
}
