package iotree.wrsungrestapi.dto.photo;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PhotoVo;
import lombok.Data;

@Data
public class GetPhotoRespDto {
    private PhotoVo photoVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
