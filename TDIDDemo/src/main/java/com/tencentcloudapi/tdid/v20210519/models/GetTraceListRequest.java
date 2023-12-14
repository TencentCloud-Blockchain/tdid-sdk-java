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

public class GetTraceListRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 资源类型，目前支持：DID、CPT
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 搜索起始时间，必须与EndTime成对出现
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 搜索截止时间，必须与StartTime成对出现
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 应用ID 
     * @return DAPId 应用ID
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set 应用ID
     * @param DAPId 应用ID
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 资源类型，目前支持：DID、CPT 
     * @return ResourceType 资源类型，目前支持：DID、CPT
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，目前支持：DID、CPT
     * @param ResourceType 资源类型，目前支持：DID、CPT
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 搜索起始时间，必须与EndTime成对出现 
     * @return StartTime 搜索起始时间，必须与EndTime成对出现
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 搜索起始时间，必须与EndTime成对出现
     * @param StartTime 搜索起始时间，必须与EndTime成对出现
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 搜索截止时间，必须与StartTime成对出现 
     * @return EndTime 搜索截止时间，必须与StartTime成对出现
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 搜索截止时间，必须与StartTime成对出现
     * @param EndTime 搜索截止时间，必须与StartTime成对出现
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public GetTraceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTraceListRequest(GetTraceListRequest source) {
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

