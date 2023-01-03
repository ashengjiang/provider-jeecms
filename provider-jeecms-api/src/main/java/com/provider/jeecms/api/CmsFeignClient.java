package com.provider.jeecms.api;

import com.alibaba.fastjson.JSONObject;
import com.idata.common.util.result.Result;
import com.idata.provider.jeecms.common.dto.ChannelSaveDTO;
import com.idata.provider.jeecms.common.dto.DeleteDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * The interface Cms feign client.
 *
 * @author jiangasheng
 */
@FeignClient(name = "provider-jeecms", contextId = "cms")
public interface CmsFeignClient {

    /**
     * Save.
     *
     * @param channelSaveDTO the channel save dto
     * @return the result
     */
    @PostMapping(value = "/cms/save/channel")
    Result<JSONObject> save(@RequestBody ChannelSaveDTO channelSaveDTO);


    /**
     * Gets channel tree.
     *
     * @param name     the name
     * @param username the username
     * @return the channel tree
     */
    @Operation(summary = "产看栏目id")
    @GetMapping(value = "/cms/channel/tree/{name}/{username}")
    Result<Integer> getChannelTreeId(@PathVariable String name,@PathVariable String username);


    /**
     * Get content by id result.
     *
     * @param contentId the content id
     * @param username  the username
     * @return the result
     */
    @Operation(summary = "根据文章id 获取文章内容")
    @GetMapping(value = "/cms/content/{contentId}/{username}")
    Result<JSONObject> getContentById(@PathVariable String contentId,@PathVariable String username);

    /**
     * Delete channel result.
     *
     * @param deleteDTO the delete dto
     * @return the result
     */
    @Operation(summary = "根据栏目id 删除栏目")
    @DeleteMapping(value = "/cms/delete/channel")
    Result<JSONObject> deleteChannel(@RequestBody DeleteDTO deleteDTO);


    /**
     * Delete content result.
     *
     * @param deleteDTO the delete dto
     * @return the result
     */
    @Operation(summary = "根据文章id 删除文章")
    @DeleteMapping(value = "/cms/delete/content")
    Result<JSONObject> deleteContent(@RequestBody  DeleteDTO deleteDTO);
}
