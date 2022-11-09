package iotree.wrsungrestapi.mapper;

import iotree.wrsungrestapi.vo.CommentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<CommentVo> getCommentList();
    List<CommentVo> getCommentListByPostId(Long postId);
    CommentVo getCommentById(Long id);
    int insertComment(CommentVo commentVo);
    int updateComment(CommentVo commentVo);
    int deleteComment(Long id);
}
