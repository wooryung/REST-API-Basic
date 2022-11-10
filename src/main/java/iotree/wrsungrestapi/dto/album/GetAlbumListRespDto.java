package iotree.wrsungrestapi.dto.album;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.AlbumVo;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAlbumListRespDto {
    private List<AlbumVo> albumList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
