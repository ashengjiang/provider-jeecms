package com.idata.provider.jeecms.common.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * The type We chat public article dto.
 *
 * @author jiangasheng
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WeChatPublicArticleDTO {
    /**
     * 文章id
     */
    private String  articleId;
    /**
     * 图文消息的标题
     */
    private String  title;
    /**
     * 作者
     */
    private String  author;
    /**
     * 图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空。
     */
    private String  digest;
    /**
     * 图文消息的具体内容，支持 HTML 标签，必须少于2万字符，小于1M，且此处会去除JS。
     */
    private String  content;
    /**
     * 图文消息的原文地址，即点击“阅读原文”后的URL
     */
    private String  contentSourceUrl;
    /**
     * 图文消息的封面图片素材id（一定是永久MediaID）
     */
    private String  thumbMediaId;
    /**
     * 图文消息的封面图片url
     */
    private String  thumbUrl;
    /**
     * 是否显示封面，0为false，即不显示，1为true，即显示(默认)
     */
    private Boolean showCoverPic;
    /**
     * 是否打开评论，0不打开(默认)，1打开
     */
    private Boolean needOpenComment;
    /**
     * 是否粉丝才可评论，0所有人可评论(默认)，1粉丝才可评论
     */
    private Boolean onlyFansCanComment;
    /**
     * 图文消息的URL
     */
    private String  url;
    /**
     * 该图文是否被删除
     */
    private Boolean isDeleted;

    /**
     * offset
     */
    private Integer   offset;
    /**
     * 文章最后修改时间
     */
    private LocalDate updateTime;

    /**
     * 企业code
     */
    private String enterpriseCode;

}
