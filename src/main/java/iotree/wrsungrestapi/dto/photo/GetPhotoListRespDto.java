package iotree.wrsungrestapi.dto.photo;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.PhotoVo;
import lombok.Data;

import java.util.List;

@Data
public class GetPhotoListRespDto {
    private List<PhotoVo> photoList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
