package iotree.wrsungrestapi.dto.comment;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class InsertCommentRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}