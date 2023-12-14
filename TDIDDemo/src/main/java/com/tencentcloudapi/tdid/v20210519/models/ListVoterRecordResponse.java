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

public class ListVoterRecordResponse extends AbstractModel{

    /**
    * 提案投票记录列表
    */
    @SerializedName("VoterRecordList")
    @Expose
    private VoteRecordItem [] VoterRecordList;

    /**
    * 是否已加载结束
    */
    @SerializedName("IsEnded")
    @Expose
    private Boolean IsEnded;

    /**
    * 下载加载的起始Id
    */
    @SerializedName("NextStartId")
    @Expose
    private Long NextStartId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 提案投票记录列表 
     * @return VoterRecordList 提案投票记录列表
     */
    public VoteRecordItem [] getVoterRecordList() {
        return this.VoterRecordList;
    }

    /**
     * Set 提案投票记录列表
     * @param VoterRecordList 提案投票记录列表
     */
    public void setVoterRecordList(VoteRecordItem [] VoterRecordList) {
        this.VoterRecordList = VoterRecordList;
    }

    /**
     * Get 是否已加载结束 
     * @return IsEnded 是否已加载结束
     */
    public Boolean getIsEnded() {
        return this.IsEnded;
    }

    /**
     * Set 是否已加载结束
     * @param IsEnded 是否已加载结束
     */
    public void setIsEnded(Boolean IsEnded) {
        this.IsEnded = IsEnded;
    }

    /**
     * Get 下载加载的起始Id 
     * @return NextStartId 下载加载的起始Id
     */
    public Long getNextStartId() {
        return this.NextStartId;
    }

    /**
     * Set 下载加载的起始Id
     * @param NextStartId 下载加载的起始Id
     */
    public void setNextStartId(Long NextStartId) {
        this.NextStartId = NextStartId;
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

    public ListVoterRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVoterRecordResponse(ListVoterRecordResponse source) {
        if (source.VoterRecordList != null) {
            this.VoterRecordList = new VoteRecordItem[source.VoterRecordList.length];
            for (int i = 0; i < source.VoterRecordList.length; i++) {
                this.VoterRecordList[i] = new VoteRecordItem(source.VoterRecordList[i]);
            }
        }
        if (source.IsEnded != null) {
            this.IsEnded = new Boolean(source.IsEnded);
        }
        if (source.NextStartId != null) {
            this.NextStartId = new Long(source.NextStartId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VoterRecordList.", this.VoterRecordList);
        this.setParamSimple(map, prefix + "IsEnded", this.IsEnded);
        this.setParamSimple(map, prefix + "NextStartId", this.NextStartId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

