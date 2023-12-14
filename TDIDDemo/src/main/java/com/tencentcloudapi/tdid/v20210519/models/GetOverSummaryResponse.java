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

public class GetOverSummaryResponse extends AbstractModel{

    /**
    * 用户参与应用的统计指标
    */
    @SerializedName("AppCounter")
    @Expose
    private ResourceCounterData AppCounter;

    /**
    * 用户部署应用的统计指标
    */
    @SerializedName("UserCounter")
    @Expose
    private ResourceCounterData UserCounter;

    /**
    * 用户参与的应用总数
    */
    @SerializedName("AppCnt")
    @Expose
    private Long AppCnt;

    /**
    * 用户部署的应用总数
    */
    @SerializedName("DeployCnt")
    @Expose
    private Long DeployCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户参与应用的统计指标 
     * @return AppCounter 用户参与应用的统计指标
     */
    public ResourceCounterData getAppCounter() {
        return this.AppCounter;
    }

    /**
     * Set 用户参与应用的统计指标
     * @param AppCounter 用户参与应用的统计指标
     */
    public void setAppCounter(ResourceCounterData AppCounter) {
        this.AppCounter = AppCounter;
    }

    /**
     * Get 用户部署应用的统计指标 
     * @return UserCounter 用户部署应用的统计指标
     */
    public ResourceCounterData getUserCounter() {
        return this.UserCounter;
    }

    /**
     * Set 用户部署应用的统计指标
     * @param UserCounter 用户部署应用的统计指标
     */
    public void setUserCounter(ResourceCounterData UserCounter) {
        this.UserCounter = UserCounter;
    }

    /**
     * Get 用户参与的应用总数 
     * @return AppCnt 用户参与的应用总数
     */
    public Long getAppCnt() {
        return this.AppCnt;
    }

    /**
     * Set 用户参与的应用总数
     * @param AppCnt 用户参与的应用总数
     */
    public void setAppCnt(Long AppCnt) {
        this.AppCnt = AppCnt;
    }

    /**
     * Get 用户部署的应用总数 
     * @return DeployCnt 用户部署的应用总数
     */
    public Long getDeployCnt() {
        return this.DeployCnt;
    }

    /**
     * Set 用户部署的应用总数
     * @param DeployCnt 用户部署的应用总数
     */
    public void setDeployCnt(Long DeployCnt) {
        this.DeployCnt = DeployCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetOverSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOverSummaryResponse(GetOverSummaryResponse source) {
        if (source.AppCounter != null) {
            this.AppCounter = new ResourceCounterData(source.AppCounter);
        }
        if (source.UserCounter != null) {
            this.UserCounter = new ResourceCounterData(source.UserCounter);
        }
        if (source.AppCnt != null) {
            this.AppCnt = new Long(source.AppCnt);
        }
        if (source.DeployCnt != null) {
            this.DeployCnt = new Long(source.DeployCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppCounter.", this.AppCounter);
        this.setParamObj(map, prefix + "UserCounter.", this.UserCounter);
        this.setParamSimple(map, prefix + "AppCnt", this.AppCnt);
        this.setParamSimple(map, prefix + "DeployCnt", this.DeployCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

