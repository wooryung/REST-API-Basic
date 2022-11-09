package iotree.wrsungrestapi.dto.user;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.UserVo;
import lombok.Data;

import java.util.List;

@Data
public class GetUserListRespDto {
    private List<UserVo> userList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
