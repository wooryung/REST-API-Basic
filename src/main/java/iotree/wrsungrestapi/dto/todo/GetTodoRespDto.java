package iotree.wrsungrestapi.dto.todo;

import iotree.wrsungrestapi.consts.ResCode;
import iotree.wrsungrestapi.vo.TodoVo;
import lombok.Data;

@Data
public class GetTodoRespDto {
    private TodoVo todoVo;
    private int code = ResCode.SUCCESS.value();
    private String message;
}
