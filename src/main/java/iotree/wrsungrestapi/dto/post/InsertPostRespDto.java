package iotree.wrsungrestapi.dto.post;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class InsertPostRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}
