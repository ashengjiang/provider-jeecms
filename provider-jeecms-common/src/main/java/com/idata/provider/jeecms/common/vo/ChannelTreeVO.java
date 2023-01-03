package com.idata.provider.jeecms.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * the ChannelTreeVO
 *
 * @author fzj
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChannelTreeVO {


    private Integer        id;
    private Integer        parentId;
    private String         name;
    private Integer        sortNum;
    private List<Children> children;

    @Data
    public static class Children {
        private Integer id;
        private Integer parentId;
        private String  name;
        private Integer sortNum;
    }
}
