package iotree.wrsungrestapi.dto.todo;

import lombok.Data;

@Data
public class InsertTodoReqDto {
    private Long userId;
    private String title;
    private int completed;
}
