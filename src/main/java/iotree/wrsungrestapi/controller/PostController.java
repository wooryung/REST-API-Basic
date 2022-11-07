package iotree.wrsungrestapi.controller;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.dto.UpdatePostReqDto;
import iotree.wrsungrestapi.dto.UpdatePostRespDto;
import iotree.wrsungrestapi.exception.NoSuchDataException;
import iotree.wrsungrestapi.service.PostService;
import iotree.wrsungrestapi.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<PostVo> showPosts(@RequestParam(value = "userId", required = false) Long userId) {
        if (userId != null) {
            return postService.getPostListByUserId(userId);
        }
        return postService.getPostList();
    }

    @GetMapping("/posts/{id}")
    public PostVo showPost(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @PostMapping("/posts")
    public void createPost(@RequestBody PostVo postVo) {
        postService.createPost(postVo);
    }

    @PutMapping("/posts/{id}")
    public UpdatePostRespDto editPost(@PathVariable Long id, @RequestBody UpdatePostReqDto updatePostReqDto) {
        UpdatePostRespDto updatePostRespDto = new UpdatePostRespDto();
        try {
            PostVo postVo = new PostVo(id, updatePostReqDto.getBody(), updatePostReqDto.getTitle());
            postService.updatePost(postVo);
        } catch (NoSuchDataException e) {
            updatePostRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            updatePostRespDto.setMessage("No such post exists.");
        } catch (Exception e) {
            updatePostRespDto.setCode(ResCode.UNKNOWN.value());
            updatePostRespDto.setMessage(e.getLocalizedMessage());
        }
        return updatePostRespDto;
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
