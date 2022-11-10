package iotree.wrsungrestapi.dto.post;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PostVo;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostRespDto {
    private PostVo post;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
