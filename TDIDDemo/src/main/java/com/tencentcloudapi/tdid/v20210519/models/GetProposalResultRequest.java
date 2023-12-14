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

public class GetProposalResultRequest extends AbstractModel{

    /**
    * 提案Id
    */
    @SerializedName("ProposalId")
    @Expose
    private Long ProposalId;

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

    public GetProposalResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProposalResultRequest(GetProposalResultRequest source) {
        if (source.ProposalId != null) {
            this.ProposalId = new Long(source.ProposalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProposalId", this.ProposalId);

    }
}

