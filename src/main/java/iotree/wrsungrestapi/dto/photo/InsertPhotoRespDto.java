package iotree.wrsungrestapi.dto.photo;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class InsertPhotoRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}