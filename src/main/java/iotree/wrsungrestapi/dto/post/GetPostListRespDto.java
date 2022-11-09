package iotree.wrsungrestapi.dto.post;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PostVo;
import lombok.Data;

import java.util.List;

@Data
public class GetPostListRespDto {
    private List<PostVo> postList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
