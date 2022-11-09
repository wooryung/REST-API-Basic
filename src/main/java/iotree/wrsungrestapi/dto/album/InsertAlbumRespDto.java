package iotree.wrsungrestapi.dto.album;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class InsertAlbumRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}
