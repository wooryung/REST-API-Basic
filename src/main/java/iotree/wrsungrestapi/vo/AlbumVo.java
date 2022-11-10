package iotree.wrsungrestapi.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlbumVo {
    private Long id;
    private Long userId;
    private String title;
}
