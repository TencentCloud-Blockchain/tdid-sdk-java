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

public class GetProposalResultResponse extends AbstractModel{

    /**
    * 当前支持权重/投票数
    */
    @SerializedName("AgreeWeight")
    @Expose
    private Long AgreeWeight;

    /**
    * 当前反对权重/投票数
    */
    @SerializedName("RefuseWeight")
    @Expose
    private Long RefuseWeight;

    /**
    * 当前弃权权重/投票数
    */
    @SerializedName("AbandonWeight")
    @Expose
    private Long AbandonWeight;

    /**
    * 当前控制台用户投票选择，-1代表暂未投票，0代表反对，1代表支持，2代表弃权
    */
    @SerializedName("VoterChoice")
    @Expose
    private Long VoterChoice;

    /**
    * 当前控制台用户是否参与提案
    */
    @SerializedName("IsParticipate")
    @Expose
    private Boolean IsParticipate;

    /**
    * 总权重/投票数
    */
    @SerializedName("TotalWeight")
    @Expose
    private Long TotalWeight;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前支持权重/投票数 
     * @return AgreeWeight 当前支持权重/投票数
     */
    public Long getAgreeWeight() {
        return this.AgreeWeight;
    }

    /**
     * Set 当前支持权重/投票数
     * @param AgreeWeight 当前支持权重/投票数
     */
    public void setAgreeWeight(Long AgreeWeight) {
        this.AgreeWeight = AgreeWeight;
    }

    /**
     * Get 当前反对权重/投票数 
     * @return RefuseWeight 当前反对权重/投票数
     */
    public Long getRefuseWeight() {
        return this.RefuseWeight;
    }

    /**
     * Set 当前反对权重/投票数
     * @param RefuseWeight 当前反对权重/投票数
     */
    public void setRefuseWeight(Long RefuseWeight) {
        this.RefuseWeight = RefuseWeight;
    }

    /**
     * Get 当前弃权权重/投票数 
     * @return AbandonWeight 当前弃权权重/投票数
     */
    public Long getAbandonWeight() {
        return this.AbandonWeight;
    }

    /**
     * Set 当前弃权权重/投票数
     * @param AbandonWeight 当前弃权权重/投票数
     */
    public void setAbandonWeight(Long AbandonWeight) {
        this.AbandonWeight = AbandonWeight;
    }

    /**
     * Get 当前控制台用户投票选择，-1代表暂未投票，0代表反对，1代表支持，2代表弃权 
     * @return VoterChoice 当前控制台用户投票选择，-1代表暂未投票，0代表反对，1代表支持，2代表弃权
     */
    public Long getVoterChoice() {
        return this.VoterChoice;
    }

    /**
     * Set 当前控制台用户投票选择，-1代表暂未投票，0代表反对，1代表支持，2代表弃权
     * @param VoterChoice 当前控制台用户投票选择，-1代表暂未投票，0代表反对，1代表支持，2代表弃权
     */
    public void setVoterChoice(Long VoterChoice) {
        this.VoterChoice = VoterChoice;
    }

    /**
     * Get 当前控制台用户是否参与提案 
     * @return IsParticipate 当前控制台用户是否参与提案
     */
    public Boolean getIsParticipate() {
        return this.IsParticipate;
    }

    /**
     * Set 当前控制台用户是否参与提案
     * @param IsParticipate 当前控制台用户是否参与提案
     */
    public void setIsParticipate(Boolean IsParticipate) {
        this.IsParticipate = IsParticipate;
    }

    /**
     * Get 总权重/投票数 
     * @return TotalWeight 总权重/投票数
     */
    public Long getTotalWeight() {
        return this.TotalWeight;
    }

    /**
     * Set 总权重/投票数
     * @param TotalWeight 总权重/投票数
     */
    public void setTotalWeight(Long TotalWeight) {
        this.TotalWeight = TotalWeight;
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

    public GetProposalResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProposalResultResponse(GetProposalResultResponse source) {
        if (source.AgreeWeight != null) {
            this.AgreeWeight = new Long(source.AgreeWeight);
        }
        if (source.RefuseWeight != null) {
            this.RefuseWeight = new Long(source.RefuseWeight);
        }
        if (source.AbandonWeight != null) {
            this.AbandonWeight = new Long(source.AbandonWeight);
        }
        if (source.VoterChoice != null) {
            this.VoterChoice = new Long(source.VoterChoice);
        }
        if (source.IsParticipate != null) {
            this.IsParticipate = new Boolean(source.IsParticipate);
        }
        if (source.TotalWeight != null) {
            this.TotalWeight = new Long(source.TotalWeight);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgreeWeight", this.AgreeWeight);
        this.setParamSimple(map, prefix + "RefuseWeight", this.RefuseWeight);
        this.setParamSimple(map, prefix + "AbandonWeight", this.AbandonWeight);
        this.setParamSimple(map, prefix + "VoterChoice", this.VoterChoice);
        this.setParamSimple(map, prefix + "IsParticipate", this.IsParticipate);
        this.setParamSimple(map, prefix + "TotalWeight", this.TotalWeight);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

