package iotree.wrsungrestapi.dto.album;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class DeleteAlbumRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}