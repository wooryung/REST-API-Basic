package iotree.wrsungrestapi.dto.photo;

import com.fasterxml.jackson.annotation.JsonInclude;
import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PhotoVo;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPhotoRespDto {
    private PhotoVo photo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
