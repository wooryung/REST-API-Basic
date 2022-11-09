package iotree.wrsungrestapi.dto.user;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class UpdateUserRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}
