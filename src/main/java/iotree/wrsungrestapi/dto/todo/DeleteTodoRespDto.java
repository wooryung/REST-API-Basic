package iotree.wrsungrestapi.dto.todo;

import iotree.wrsungrestapi.consts.ResCode;
import lombok.Data;

@Data
public class DeleteTodoRespDto {
    private int code = ResCode.SUCCESS.value();
    private String message;
}
