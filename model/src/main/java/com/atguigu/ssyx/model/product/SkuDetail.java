package com.atguigu.ssyx.model.product;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * @Author：tangzhiqiang
 * @Date：2023/7/1 18:38
 * @Filename：SkuDetail
 */
@Data
@ApiModel(description = "SkuDetail")
@TableName("sku_detail")
public class SkuDetail {


    private Integer id;

    private Integer skuId;

    private String detailHtml;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

}
