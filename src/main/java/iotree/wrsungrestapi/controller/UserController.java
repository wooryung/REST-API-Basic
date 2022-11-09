package iotree.wrsungrestapi.controller;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.dto.user.*;
import iotree.wrsungrestapi.exception.NoSuchDataException;
import iotree.wrsungrestapi.service.UserService;
import iotree.wrsungrestapi.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public GetUserListRespDto getUserList() {
        GetUserListRespDto getUserListRespDto = new GetUserListRespDto();
        try {
            getUserListRespDto.setUserList(userService.getUserList());
        } catch (NoSuchDataException e) {
            getUserListRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            getUserListRespDto.setMessage("No such user exists.");
        } catch (Exception e) {
            log.error("[UserController getUserList] " + e);
            getUserListRespDto.setCode(ResCode.UNKNOWN.value());
            getUserListRespDto.setMessage(e.getLocalizedMessage());
        }
        return getUserListRespDto;
    }

    @GetMapping("/users/{id}")
    public GetUserRespDto getUser(@PathVariable Long id) {
        GetUserRespDto getUserRespDto = new GetUserRespDto();
        try {
            getUserRespDto.setUserVo(userService.getUserById(id));
        } catch (NoSuchDataException e) {
            getUserRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            getUserRespDto.setMessage("No such user exists.");
        } catch (Exception e) {
            log.error("[UserController getUser] " + e);
            getUserRespDto.setCode(ResCode.UNKNOWN.value());
            getUserRespDto.setMessage(e.getLocalizedMessage());
        }
        return getUserRespDto;
    }

    @PostMapping("/users")
    public InsertUserRespDto createUser(@RequestBody InsertUserReqDto insertUserReqDto) {
        InsertUserRespDto insertUserRespDto = new InsertUserRespDto();
        try {
            UserVo userVo = new UserVo(0L, insertUserReqDto.getName(), insertUserReqDto.getUsername(), insertUserReqDto.getEmail(), insertUserReqDto.getPassword(), insertUserReqDto.getAddress(), insertUserReqDto.getPhone(), insertUserReqDto.getWebsite(), insertUserReqDto.getCompany());
            userService.createUser(userVo);
        } catch (NoSuchDataException e) {
            insertUserRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            insertUserRespDto.setMessage("No such user created.");
        } catch (Exception e) {
            log.error("[UserController createUser] " + e);
            insertUserRespDto.setCode(ResCode.UNKNOWN.value());
            insertUserRespDto.setMessage(e.getLocalizedMessage());
        }
        return insertUserRespDto;
    }

    @PutMapping("/users/{id}")
    public UpdateUserRespDto updateUser(@PathVariable Long id, @RequestBody UpdateUserReqDto updateUserReqDto) {
        UpdateUserRespDto updateUserRespDto = new UpdateUserRespDto();
        try {
            UserVo userVo = new UserVo(id, updateUserReqDto.getName(), updateUserReqDto.getUsername(), updateUserReqDto.getEmail(), updateUserReqDto.getPassword(), updateUserReqDto.getAddress(), updateUserReqDto.getPhone(), updateUserReqDto.getWebsite(), updateUserReqDto.getCompany());
            userService.updateUser(userVo);
        } catch (NoSuchDataException e) {
            updateUserRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            updateUserRespDto.setMessage("No such user exists.");
        } catch (Exception e) {
            log.error("[UserController updateUser] " + e);
            updateUserRespDto.setCode(ResCode.UNKNOWN.value());
            updateUserRespDto.setMessage(e.getLocalizedMessage());
        }
        return updateUserRespDto;
    }

    @DeleteMapping("/users/{id}")
    public DeleteUserRespDto deleteUser(@PathVariable Long id) {
        DeleteUserRespDto deleteUserRespDto = new DeleteUserRespDto();
        try {
            userService.deleteUser(id);
        } catch (NoSuchDataException e) {
            deleteUserRespDto.setCode(ResCode.NO_SUCH_DATA.value());
            deleteUserRespDto.setMessage("No such user exists.");
        } catch (Exception e) {
            log.error("[UserController deleteUser] " + e);
            deleteUserRespDto.setCode(ResCode.UNKNOWN.value());
            deleteUserRespDto.setMessage(e.getLocalizedMessage());
        }
        return deleteUserRespDto;
    }
}
