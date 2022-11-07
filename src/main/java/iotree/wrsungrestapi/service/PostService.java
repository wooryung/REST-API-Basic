package iotree.wrsungrestapi.service;

import iotree.wrsungrestapi.exception.NoSuchDataException;
import iotree.wrsungrestapi.mapper.PostMapper;
import iotree.wrsungrestapi.vo.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<PostVo> getPostList() {
        return postMapper.getPostList();
    }

    public List<PostVo> getPostListByUserId(Long userId) {
        return postMapper.getPostListByUserId(userId);
    }

    public PostVo getPostById(Long id) {
        return postMapper.getPostById(id);
    }

    public void createPost(PostVo postVo) {
        postMapper.insertPost(postVo);
    }

    public void updatePost(PostVo postVo) {
        int result = postMapper.updatePost(postVo);
        if (result == 0)
            throw new NoSuchDataException("No such error");
    }

    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }
}
