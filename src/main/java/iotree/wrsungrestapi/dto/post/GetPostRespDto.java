package iotree.wrsungrestapi.dto.post;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PostVo;
import lombok.Data;

@Data
public class GetPostRespDto {
    private PostVo postVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
