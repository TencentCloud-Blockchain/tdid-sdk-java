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

public class RotateTDidAuthPubKeyRequest extends AbstractModel{

    /**
    * DID标识
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 轮换DID公钥的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
    */
    @SerializedName("OperateCredential")
    @Expose
    private String OperateCredential;

    /**
    * 新的公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

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
     * Get 轮换DID公钥的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内 
     * @return OperateCredential 轮换DID公钥的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     */
    public String getOperateCredential() {
        return this.OperateCredential;
    }

    /**
     * Set 轮换DID公钥的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     * @param OperateCredential 轮换DID公钥的临时凭证内容，通过创建凭证接口(CreateCredential)生成并签名，凭证类型为：OperateCredential, 为安全起见凭证过期时间不适合太长，建议设置为1分钟内
     */
    public void setOperateCredential(String OperateCredential) {
        this.OperateCredential = OperateCredential;
    }

    /**
     * Get 新的公钥 
     * @return PublicKey 新的公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 新的公钥
     * @param PublicKey 新的公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public RotateTDidAuthPubKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateTDidAuthPubKeyRequest(RotateTDidAuthPubKeyRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.OperateCredential != null) {
            this.OperateCredential = new String(source.OperateCredential);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "OperateCredential", this.OperateCredential);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

