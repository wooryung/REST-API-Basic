package iotree.wrsungrestapi.dto.comment;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.CommentVo;
import lombok.Data;

import java.util.List;

@Data
public class GetCommentListRespDto {
    private List<CommentVo> commentList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
