package com.idata.provider.jeecms.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 栏目新增扩展Dto
 *
 * @author: chenming
 * @date: 2019年4月17日 下午2:18:10
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ChannelSaveDTO {

    /**
     * 上级栏目ID
     */
    private Integer channelParentId;
    /**
     * 栏目模型ID
     */
    @NotNull
    @Schema(description = "911:图片 1081:采集 811：咨询")
    private Integer modelId;
    /**
     * 栏目名称
     */
    @NotBlank
    private String  channelName;
    /**
     * 栏目路径
     */
    @NotBlank
    private String  channelPath;
    /**
     * 站点ID
     */
    private Integer siteId;
    /**
     * 排序值
     */
    private Integer sortNum;

    @NotNull(message = "username 不能为空")
    private String username;
}
