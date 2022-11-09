package iotree.wrsungrestapi.dto.album;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.AlbumVo;
import lombok.Data;

@Data
public class GetAlbumRespDto {
    private AlbumVo albumVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
