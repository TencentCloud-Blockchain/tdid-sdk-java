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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCPTRequest extends AbstractModel{

    /**
    * CPT模板的JSON字符串
    */
    @SerializedName("CPTJson")
    @Expose
    private String CPTJson;

    /**
    * CPT ID
    */
    @SerializedName("CPTId")
    @Expose
    private Long CPTId;

    /**
    * 用户应用ID
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
    * DID应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
     * Get CPT模板的JSON字符串 
     * @return CPTJson CPT模板的JSON字符串
     */
    public String getCPTJson() {
        return this.CPTJson;
    }

    /**
     * Set CPT模板的JSON字符串
     * @param CPTJson CPT模板的JSON字符串
     */
    public void setCPTJson(String CPTJson) {
        this.CPTJson = CPTJson;
    }

    /**
     * Get CPT ID 
     * @return CPTId CPT ID
     */
    public Long getCPTId() {
        return this.CPTId;
    }

    /**
     * Set CPT ID
     * @param CPTId CPT ID
     */
    public void setCPTId(Long CPTId) {
        this.CPTId = CPTId;
    }

    /**
     * Get 用户应用ID 
     * @return UAPId 用户应用ID
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set 用户应用ID
     * @param UAPId 用户应用ID
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    /**
     * Get DID应用ID 
     * @return DAPId DID应用ID
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用ID
     * @param DAPId DID应用ID
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    public CreateCPTRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCPTRequest(CreateCPTRequest source) {
        if (source.CPTJson != null) {
            this.CPTJson = new String(source.CPTJson);
        }
        if (source.CPTId != null) {
            this.CPTId = new Long(source.CPTId);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPTJson", this.CPTJson);
        this.setParamSimple(map, prefix + "CPTId", this.CPTId);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);

    }
}

