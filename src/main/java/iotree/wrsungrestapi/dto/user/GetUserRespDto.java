package iotree.wrsungrestapi.dto.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.UserVo;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserRespDto {
    private UserVo user;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
