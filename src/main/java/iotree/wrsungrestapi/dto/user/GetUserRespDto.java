package iotree.wrsungrestapi.dto.user;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.UserVo;
import lombok.Data;

@Data
public class GetUserRespDto {
    private UserVo userVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
