/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDBInstanceResponse  extends AbstractModel{

    /**
    * 未打折的原价，其值除以100表示最终的价格。比如10094表示100.94元
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Integer OriginalPrice;

    /**
    * 实际需要支付价格，其值除以100表示最终的价格。比如10094表示100.94元
    */
    @SerializedName("Price")
    @Expose
    private Integer Price;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取未打折的原价，其值除以100表示最终的价格。比如10094表示100.94元
     * @return OriginalPrice 未打折的原价，其值除以100表示最终的价格。比如10094表示100.94元
     */
    public Integer getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置未打折的原价，其值除以100表示最终的价格。比如10094表示100.94元
     * @param OriginalPrice 未打折的原价，其值除以100表示最终的价格。比如10094表示100.94元
     */
    public void setOriginalPrice(Integer OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 获取实际需要支付价格，其值除以100表示最终的价格。比如10094表示100.94元
     * @return Price 实际需要支付价格，其值除以100表示最终的价格。比如10094表示100.94元
     */
    public Integer getPrice() {
        return this.Price;
    }

    /**
     * 设置实际需要支付价格，其值除以100表示最终的价格。比如10094表示100.94元
     * @param Price 实际需要支付价格，其值除以100表示最终的价格。比如10094表示100.94元
     */
    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

