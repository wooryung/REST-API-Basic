package iotree.wrsungrestapi.dto;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class UpdatePostRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message = null;
}
