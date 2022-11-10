package iotree.wrsungrestapi.dto.album;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.AlbumVo;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAlbumRespDto {
    private AlbumVo album;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
