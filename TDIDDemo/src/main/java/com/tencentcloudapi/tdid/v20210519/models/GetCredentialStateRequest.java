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

public class GetCredentialStateRequest extends AbstractModel{

    /**
    * 凭证唯一ID
    */
    @SerializedName("CredentialId")
    @Expose
    private String CredentialId;

    /**
    * 用户应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * DID应用id
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
     * Get 凭证唯一ID 
     * @return CredentialId 凭证唯一ID
     */
    public String getCredentialId() {
        return this.CredentialId;
    }

    /**
     * Set 凭证唯一ID
     * @param CredentialId 凭证唯一ID
     */
    public void setCredentialId(String CredentialId) {
        this.CredentialId = CredentialId;
    }

    /**
     * Get 用户应用id 
     * @return DAPId 用户应用id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set 用户应用id
     * @param DAPId 用户应用id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get DID应用id 
     * @return UAPId DID应用id
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set DID应用id
     * @param UAPId DID应用id
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    public GetCredentialStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCredentialStateRequest(GetCredentialStateRequest source) {
        if (source.CredentialId != null) {
            this.CredentialId = new String(source.CredentialId);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CredentialId", this.CredentialId);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);

    }
}

