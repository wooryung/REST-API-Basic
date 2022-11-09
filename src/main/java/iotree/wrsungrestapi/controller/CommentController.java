package iotree.wrsungrestapi.controller;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.dto.comment.*;
import iotree.wrsungrestapi.exception.NoSuchDataException;
import iotree.wrsungrestapi.service.CommentService;
import iotree.wrsungrestapi.vo.CommentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public GetCommentListRespDto getCommentList(@RequestParam(value = "postId", required = false) Long postId) {
        GetCommentListRespDto getCommentListRespDto = new GetCommentListRespDto();
        try {
            if (postId != null)
                getCommentListRespDto.setCommentList(commentService.getCommentListByPostId(postId));
            else
                getCommentListRespDto.setCommentList(commentService.getCommentList());
        } catch (NoSuchDataException e) {
            getCommentListRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            getCommentListRespDto.setMessage("No such comment exists.");
        } catch (Exception e) {
            log.error("[CommentController getCommentList] " + e);
            getCommentListRespDto.setCode(ResCode.UNKNOWN.value());
            getCommentListRespDto.setMessage(e.getLocalizedMessage());
        }
        return getCommentListRespDto;
    }

    @GetMapping("/comments/{id}")
    public GetCommentRespDto getComment(@PathVariable Long id) {
        GetCommentRespDto getCommentRespDto = new GetCommentRespDto();
        try {
            getCommentRespDto.setCommentVo(commentService.getCommentById(id));
        } catch (NoSuchDataException e) {
            getCommentRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            getCommentRespDto.setMessage("No such comment exists.");
        } catch (Exception e) {
            log.error("[CommentController getComment] " + e);
            getCommentRespDto.setCode(ResCode.UNKNOWN.value());
            getCommentRespDto.setMessage(e.getLocalizedMessage());
        }
        return getCommentRespDto;
    }

    @PostMapping("/comments")
    public InsertCommentRespDto createComment(@RequestBody InsertCommentReqDto insertCommentReqDto) {
        InsertCommentRespDto insertCommentRespDto = new InsertCommentRespDto();
        try {
            CommentVo commentVo = new CommentVo(0L, insertCommentReqDto.getPostId(), insertCommentReqDto.getName(), insertCommentReqDto.getEmail(), insertCommentReqDto.getBody());
            commentService.createComment(commentVo);
        } catch (NoSuchDataException e) {
            insertCommentRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            insertCommentRespDto.setMessage("No such comment created.");
        } catch (Exception e) {
            log.error("[CommentController createComment] " + e);
            insertCommentRespDto.setCode(ResCode.UNKNOWN.value());
            insertCommentRespDto.setMessage(e.getLocalizedMessage());
        }
        return insertCommentRespDto;
    }

    @PutMapping("/comments/{id}")
    public UpdateCommentRespDto updateComment(@PathVariable Long id, @RequestBody UpdateCommentReqDto updateCommentReqDto) {
        UpdateCommentRespDto updateCommentRespDto = new UpdateCommentRespDto();
        try {
            CommentVo commentVo = new CommentVo(id, 0L, updateCommentReqDto.getName(), updateCommentReqDto.getEmail(), updateCommentReqDto.getBody());
            commentService.updateComment(commentVo);
        } catch (NoSuchDataException e) {
            updateCommentRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            updateCommentRespDto.setMessage("No such comment exists.");
        } catch (Exception e) {
            log.error("[CommentController updateComment] " + e);
            updateCommentRespDto.setCode(ResCode.UNKNOWN.value());
            updateCommentRespDto.setMessage(e.getLocalizedMessage());
        }
        return updateCommentRespDto;
    }

    @DeleteMapping("/comments/{id}")
    public DeleteCommentRespDto deleteComment(@PathVariable Long id) {
        DeleteCommentRespDto deleteCommentRespDto = new DeleteCommentRespDto();
        try {
            commentService.deleteComment(id);
        } catch (NoSuchDataException e) {
            deleteCommentRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            deleteCommentRespDto.setMessage("No such comment exists.");
        } catch (Exception e) {
            log.error("[CommentController deleteComment] " + e);
            deleteCommentRespDto.setCode(ResCode.UNKNOWN.value());
            deleteCommentRespDto.setMessage(e.getLocalizedMessage());
        }
        return deleteCommentRespDto;
    }
}
