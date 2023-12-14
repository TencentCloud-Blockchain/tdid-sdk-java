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

public class CredentialProof extends AbstractModel{

    /**
    * 可验证凭证内容
    */
    @SerializedName("Credential")
    @Expose
    private String Credential;

    /**
    * 零知识范围证明阈值信息
    */
    @SerializedName("ProofThreshold")
    @Expose
    private ProofThreshold [] ProofThreshold;

    /**
     * Get 可验证凭证内容 
     * @return Credential 可验证凭证内容
     */
    public String getCredential() {
        return this.Credential;
    }

    /**
     * Set 可验证凭证内容
     * @param Credential 可验证凭证内容
     */
    public void setCredential(String Credential) {
        this.Credential = Credential;
    }

    /**
     * Get 零知识范围证明阈值信息 
     * @return ProofThreshold 零知识范围证明阈值信息
     */
    public ProofThreshold [] getProofThreshold() {
        return this.ProofThreshold;
    }

    /**
     * Set 零知识范围证明阈值信息
     * @param ProofThreshold 零知识范围证明阈值信息
     */
    public void setProofThreshold(ProofThreshold [] ProofThreshold) {
        this.ProofThreshold = ProofThreshold;
    }

    public CredentialProof() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialProof(CredentialProof source) {
        if (source.Credential != null) {
            this.Credential = new String(source.Credential);
        }
        if (source.ProofThreshold != null) {
            this.ProofThreshold = new ProofThreshold[source.ProofThreshold.length];
            for (int i = 0; i < source.ProofThreshold.length; i++) {
                this.ProofThreshold[i] = new ProofThreshold(source.ProofThreshold[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Credential", this.Credential);
        this.setParamArrayObj(map, prefix + "ProofThreshold.", this.ProofThreshold);

    }
}

