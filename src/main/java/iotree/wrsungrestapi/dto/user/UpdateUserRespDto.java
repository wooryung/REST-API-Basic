package iotree.wrsungrestapi.dto.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}
