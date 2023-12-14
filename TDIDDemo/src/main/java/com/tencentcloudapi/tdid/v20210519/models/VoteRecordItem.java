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

public class VoteRecordItem extends AbstractModel{

    /**
    * 投票记录Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 投票者DID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Voter")
    @Expose
    private String Voter;

    /**
    * 投票权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 投票选择
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 投票时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoteTime")
    @Expose
    private String VoteTime;

    /**
     * Get 投票记录Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 投票记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 投票记录Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 投票记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 投票者DID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Voter 投票者DID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoter() {
        return this.Voter;
    }

    /**
     * Set 投票者DID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Voter 投票者DID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoter(String Voter) {
        this.Voter = Voter;
    }

    /**
     * Get 投票权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 投票权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 投票权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 投票权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 投票选择
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 投票选择
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 投票选择
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 投票选择
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 投票时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoteTime 投票时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoteTime() {
        return this.VoteTime;
    }

    /**
     * Set 投票时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoteTime 投票时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoteTime(String VoteTime) {
        this.VoteTime = VoteTime;
    }

    public VoteRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoteRecordItem(VoteRecordItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Voter != null) {
            this.Voter = new String(source.Voter);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VoteTime != null) {
            this.VoteTime = new String(source.VoteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Voter", this.Voter);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VoteTime", this.VoteTime);

    }
}

