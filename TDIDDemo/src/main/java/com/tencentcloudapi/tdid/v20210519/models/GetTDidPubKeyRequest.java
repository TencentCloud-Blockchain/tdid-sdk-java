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

public class GetTDidPubKeyRequest extends AbstractModel{

    /**
    * DID标识
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 用户应用ID
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
    * DID应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
     * Get DID标识 
     * @return Did DID标识
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID标识
     * @param Did DID标识
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 用户应用ID 
     * @return UAPId 用户应用ID
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set 用户应用ID
     * @param UAPId 用户应用ID
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    /**
     * Get DID应用ID 
     * @return DAPId DID应用ID
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用ID
     * @param DAPId DID应用ID
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    public GetTDidPubKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTDidPubKeyRequest(GetTDidPubKeyRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);

    }
}

