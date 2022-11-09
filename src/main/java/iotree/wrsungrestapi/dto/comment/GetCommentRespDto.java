package iotree.wrsungrestapi.dto.comment;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.CommentVo;
import lombok.Data;

@Data
public class GetCommentRespDto {
    private CommentVo commentVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
