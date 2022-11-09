package iotree.wrsungrestapi.dto.todo;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.TodoVo;
import lombok.Data;

import java.util.List;

@Data
public class GetTodoListRespDto {
    private List<TodoVo> todoList;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
