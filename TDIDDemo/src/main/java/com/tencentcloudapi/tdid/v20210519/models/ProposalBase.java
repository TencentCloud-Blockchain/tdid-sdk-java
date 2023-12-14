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

public class ProposalBase extends AbstractModel{

    /**
    * 提案Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 提案发布者DID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorDid")
    @Expose
    private String CreatorDid;

    /**
    * 提案名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 提案状态，0 代表已否决，1 代表已通过，2 代表待开始，3 代表投票中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当前控制台用户是否关注提案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Followed")
    @Expose
    private Boolean Followed;

    /**
    * 提案发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 投票开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VotingStartTime")
    @Expose
    private String VotingStartTime;

    /**
    * 投票截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VotingDeadline")
    @Expose
    private String VotingDeadline;

    /**
    * 提案类型：0代表普通提案，1代表DAO提案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProposalType")
    @Expose
    private Long ProposalType;

    /**
    * 提案摘要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 提案发布者 DID 归属应用的 UAPId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUAPIds")
    @Expose
    private Long [] CreatorUAPIds;

    /**
    * 提案描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 提案合约地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractAddress")
    @Expose
    private String ContractAddress;

    /**
    * 提案实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VotingEndTime")
    @Expose
    private String VotingEndTime;

    /**
     * Get 提案Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 提案Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 提案Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 提案Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 提案发布者DID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorDid 提案发布者DID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorDid() {
        return this.CreatorDid;
    }

    /**
     * Set 提案发布者DID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorDid 提案发布者DID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorDid(String CreatorDid) {
        this.CreatorDid = CreatorDid;
    }

    /**
     * Get 提案名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 提案名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 提案名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 提案名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 提案状态，0 代表已否决，1 代表已通过，2 代表待开始，3 代表投票中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 提案状态，0 代表已否决，1 代表已通过，2 代表待开始，3 代表投票中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 提案状态，0 代表已否决，1 代表已通过，2 代表待开始，3 代表投票中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 提案状态，0 代表已否决，1 代表已通过，2 代表待开始，3 代表投票中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当前控制台用户是否关注提案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Followed 当前控制台用户是否关注提案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFollowed() {
        return this.Followed;
    }

    /**
     * Set 当前控制台用户是否关注提案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Followed 当前控制台用户是否关注提案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowed(Boolean Followed) {
        this.Followed = Followed;
    }

    /**
     * Get 提案发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 提案发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 提案发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 提案发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 投票开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VotingStartTime 投票开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVotingStartTime() {
        return this.VotingStartTime;
    }

    /**
     * Set 投票开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VotingStartTime 投票开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVotingStartTime(String VotingStartTime) {
        this.VotingStartTime = VotingStartTime;
    }

    /**
     * Get 投票截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VotingDeadline 投票截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVotingDeadline() {
        return this.VotingDeadline;
    }

    /**
     * Set 投票截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VotingDeadline 投票截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVotingDeadline(String VotingDeadline) {
        this.VotingDeadline = VotingDeadline;
    }

    /**
     * Get 提案类型：0代表普通提案，1代表DAO提案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProposalType 提案类型：0代表普通提案，1代表DAO提案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProposalType() {
        return this.ProposalType;
    }

    /**
     * Set 提案类型：0代表普通提案，1代表DAO提案
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProposalType 提案类型：0代表普通提案，1代表DAO提案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProposalType(Long ProposalType) {
        this.ProposalType = ProposalType;
    }

    /**
     * Get 提案摘要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 提案摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 提案摘要
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 提案摘要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 提案发布者 DID 归属应用的 UAPId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUAPIds 提案发布者 DID 归属应用的 UAPId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCreatorUAPIds() {
        return this.CreatorUAPIds;
    }

    /**
     * Set 提案发布者 DID 归属应用的 UAPId
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUAPIds 提案发布者 DID 归属应用的 UAPId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUAPIds(Long [] CreatorUAPIds) {
        this.CreatorUAPIds = CreatorUAPIds;
    }

    /**
     * Get 提案描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 提案描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 提案描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 提案描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 提案合约地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractAddress 提案合约地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractAddress() {
        return this.ContractAddress;
    }

    /**
     * Set 提案合约地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractAddress 提案合约地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractAddress(String ContractAddress) {
        this.ContractAddress = ContractAddress;
    }

    /**
     * Get 提案实际结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VotingEndTime 提案实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVotingEndTime() {
        return this.VotingEndTime;
    }

    /**
     * Set 提案实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VotingEndTime 提案实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVotingEndTime(String VotingEndTime) {
        this.VotingEndTime = VotingEndTime;
    }

    public ProposalBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProposalBase(ProposalBase source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CreatorDid != null) {
            this.CreatorDid = new String(source.CreatorDid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Followed != null) {
            this.Followed = new Boolean(source.Followed);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VotingStartTime != null) {
            this.VotingStartTime = new String(source.VotingStartTime);
        }
        if (source.VotingDeadline != null) {
            this.VotingDeadline = new String(source.VotingDeadline);
        }
        if (source.ProposalType != null) {
            this.ProposalType = new Long(source.ProposalType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatorUAPIds != null) {
            this.CreatorUAPIds = new Long[source.CreatorUAPIds.length];
            for (int i = 0; i < source.CreatorUAPIds.length; i++) {
                this.CreatorUAPIds[i] = new Long(source.CreatorUAPIds[i]);
            }
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.ContractAddress != null) {
            this.ContractAddress = new String(source.ContractAddress);
        }
        if (source.VotingEndTime != null) {
            this.VotingEndTime = new String(source.VotingEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreatorDid", this.CreatorDid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Followed", this.Followed);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VotingStartTime", this.VotingStartTime);
        this.setParamSimple(map, prefix + "VotingDeadline", this.VotingDeadline);
        this.setParamSimple(map, prefix + "ProposalType", this.ProposalType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "CreatorUAPIds.", this.CreatorUAPIds);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "ContractAddress", this.ContractAddress);
        this.setParamSimple(map, prefix + "VotingEndTime", this.VotingEndTime);

    }
}

