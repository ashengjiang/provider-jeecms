package com.idata.provider.jeecms.common.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * the DeleteDTO
 *
 * @author fzj
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteDTO {

    private Integer[] ids;
    @NotBlank(message = "username 不能为空")
    private String    username;
}
