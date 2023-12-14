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

public class ListVoterRecordRequest extends AbstractModel{

    /**
    * 提案Id
    */
    @SerializedName("ProposalId")
    @Expose
    private Long ProposalId;

    /**
    * 加载更多的起始Id，第一次填0，后续根据接口返回值填写
    */
    @SerializedName("StartId")
    @Expose
    private Long StartId;

    /**
    * 每次加载条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * DID 标识的文本，精确搜索
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 是否获取全部提案成员
    */
    @SerializedName("IsAllVoter")
    @Expose
    private Boolean IsAllVoter;

    /**
     * Get 提案Id 
     * @return ProposalId 提案Id
     */
    public Long getProposalId() {
        return this.ProposalId;
    }

    /**
     * Set 提案Id
     * @param ProposalId 提案Id
     */
    public void setProposalId(Long ProposalId) {
        this.ProposalId = ProposalId;
    }

    /**
     * Get 加载更多的起始Id，第一次填0，后续根据接口返回值填写 
     * @return StartId 加载更多的起始Id，第一次填0，后续根据接口返回值填写
     */
    public Long getStartId() {
        return this.StartId;
    }

    /**
     * Set 加载更多的起始Id，第一次填0，后续根据接口返回值填写
     * @param StartId 加载更多的起始Id，第一次填0，后续根据接口返回值填写
     */
    public void setStartId(Long StartId) {
        this.StartId = StartId;
    }

    /**
     * Get 每次加载条数 
     * @return Count 每次加载条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 每次加载条数
     * @param Count 每次加载条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get DID 标识的文本，精确搜索 
     * @return SearchKey DID 标识的文本，精确搜索
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set DID 标识的文本，精确搜索
     * @param SearchKey DID 标识的文本，精确搜索
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 是否获取全部提案成员 
     * @return IsAllVoter 是否获取全部提案成员
     */
    public Boolean getIsAllVoter() {
        return this.IsAllVoter;
    }

    /**
     * Set 是否获取全部提案成员
     * @param IsAllVoter 是否获取全部提案成员
     */
    public void setIsAllVoter(Boolean IsAllVoter) {
        this.IsAllVoter = IsAllVoter;
    }

    public ListVoterRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVoterRecordRequest(ListVoterRecordRequest source) {
        if (source.ProposalId != null) {
            this.ProposalId = new Long(source.ProposalId);
        }
        if (source.StartId != null) {
            this.StartId = new Long(source.StartId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.IsAllVoter != null) {
            this.IsAllVoter = new Boolean(source.IsAllVoter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProposalId", this.ProposalId);
        this.setParamSimple(map, prefix + "StartId", this.StartId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "IsAllVoter", this.IsAllVoter);

    }
}

