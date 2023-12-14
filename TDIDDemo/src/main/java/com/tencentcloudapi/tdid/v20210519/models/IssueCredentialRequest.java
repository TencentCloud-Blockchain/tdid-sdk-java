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

public class IssueCredentialRequest extends AbstractModel{

    /**
    * 参数集合，详见示例
    */
    @SerializedName("CRDLArg")
    @Expose
    private CRDLArg CRDLArg;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 凭证版本
    */
    @SerializedName("CredentialVersion")
    @Expose
    private String CredentialVersion;

    /**
    * 是否未签名
    */
    @SerializedName("UnSigned")
    @Expose
    private Boolean UnSigned;

    /**
    * 零知识范围证明承诺信息
    */
    @SerializedName("CommitmentClaims")
    @Expose
    private CommitmentClaim [] CommitmentClaims;

    /**
     * Get 参数集合，详见示例 
     * @return CRDLArg 参数集合，详见示例
     */
    public CRDLArg getCRDLArg() {
        return this.CRDLArg;
    }

    /**
     * Set 参数集合，详见示例
     * @param CRDLArg 参数集合，详见示例
     */
    public void setCRDLArg(CRDLArg CRDLArg) {
        this.CRDLArg = CRDLArg;
    }

    /**
     * Get DID应用id 
     * @return DAPId DID应用id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用id
     * @param DAPId DID应用id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 凭证版本 
     * @return CredentialVersion 凭证版本
     */
    public String getCredentialVersion() {
        return this.CredentialVersion;
    }

    /**
     * Set 凭证版本
     * @param CredentialVersion 凭证版本
     */
    public void setCredentialVersion(String CredentialVersion) {
        this.CredentialVersion = CredentialVersion;
    }

    /**
     * Get 是否未签名 
     * @return UnSigned 是否未签名
     */
    public Boolean getUnSigned() {
        return this.UnSigned;
    }

    /**
     * Set 是否未签名
     * @param UnSigned 是否未签名
     */
    public void setUnSigned(Boolean UnSigned) {
        this.UnSigned = UnSigned;
    }

    /**
     * Get 零知识范围证明承诺信息 
     * @return CommitmentClaims 零知识范围证明承诺信息
     */
    public CommitmentClaim [] getCommitmentClaims() {
        return this.CommitmentClaims;
    }

    /**
     * Set 零知识范围证明承诺信息
     * @param CommitmentClaims 零知识范围证明承诺信息
     */
    public void setCommitmentClaims(CommitmentClaim [] CommitmentClaims) {
        this.CommitmentClaims = CommitmentClaims;
    }

    public IssueCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IssueCredentialRequest(IssueCredentialRequest source) {
        if (source.CRDLArg != null) {
            this.CRDLArg = new CRDLArg(source.CRDLArg);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.CredentialVersion != null) {
            this.CredentialVersion = new String(source.CredentialVersion);
        }
        if (source.UnSigned != null) {
            this.UnSigned = new Boolean(source.UnSigned);
        }
        if (source.CommitmentClaims != null) {
            this.CommitmentClaims = new CommitmentClaim[source.CommitmentClaims.length];
            for (int i = 0; i < source.CommitmentClaims.length; i++) {
                this.CommitmentClaims[i] = new CommitmentClaim(source.CommitmentClaims[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CRDLArg.", this.CRDLArg);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "CredentialVersion", this.CredentialVersion);
        this.setParamSimple(map, prefix + "UnSigned", this.UnSigned);
        this.setParamArrayObj(map, prefix + "CommitmentClaims.", this.CommitmentClaims);

    }
}

