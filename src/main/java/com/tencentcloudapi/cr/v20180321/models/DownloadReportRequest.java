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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadReportRequest  extends AbstractModel{

    /**
    * 模块名
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 报告日期
    */
    @SerializedName("ReportDate")
    @Expose
    private String ReportDate;

    /**
     * 获取模块名
     * @return Module 模块名
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名
     * @param Module 模块名
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取报告日期
     * @return ReportDate 报告日期
     */
    public String getReportDate() {
        return this.ReportDate;
    }

    /**
     * 设置报告日期
     * @param ReportDate 报告日期
     */
    public void setReportDate(String ReportDate) {
        this.ReportDate = ReportDate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ReportDate", this.ReportDate);

    }
}

