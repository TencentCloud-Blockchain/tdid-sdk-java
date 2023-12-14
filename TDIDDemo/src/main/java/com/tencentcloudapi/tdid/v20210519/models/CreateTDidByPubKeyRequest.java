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

public class CreateTDidByPubKeyRequest extends AbstractModel{

    /**
    * pem格式的认证公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * pem格式的加密公钥
    */
    @SerializedName("EncryptPubKey")
    @Expose
    private String EncryptPubKey;

    /**
    * 自定义DID初始化属性json字符串
    */
    @SerializedName("CustomAttribute")
    @Expose
    private String CustomAttribute;

    /**
    * 0:did存在返回错误，1:did存在返回该did，默认:0
    */
    @SerializedName("IgnoreExisted")
    @Expose
    private Long IgnoreExisted;

    /**
    * 用户应用id
    */
    @SerializedName("UAPId")
    @Expose
    private Long UAPId;

    /**
     * Get pem格式的认证公钥 
     * @return PublicKey pem格式的认证公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set pem格式的认证公钥
     * @param PublicKey pem格式的认证公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
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
     * Get pem格式的加密公钥 
     * @return EncryptPubKey pem格式的加密公钥
     */
    public String getEncryptPubKey() {
        return this.EncryptPubKey;
    }

    /**
     * Set pem格式的加密公钥
     * @param EncryptPubKey pem格式的加密公钥
     */
    public void setEncryptPubKey(String EncryptPubKey) {
        this.EncryptPubKey = EncryptPubKey;
    }

    /**
     * Get 自定义DID初始化属性json字符串 
     * @return CustomAttribute 自定义DID初始化属性json字符串
     */
    public String getCustomAttribute() {
        return this.CustomAttribute;
    }

    /**
     * Set 自定义DID初始化属性json字符串
     * @param CustomAttribute 自定义DID初始化属性json字符串
     */
    public void setCustomAttribute(String CustomAttribute) {
        this.CustomAttribute = CustomAttribute;
    }

    /**
     * Get 0:did存在返回错误，1:did存在返回该did，默认:0 
     * @return IgnoreExisted 0:did存在返回错误，1:did存在返回该did，默认:0
     */
    public Long getIgnoreExisted() {
        return this.IgnoreExisted;
    }

    /**
     * Set 0:did存在返回错误，1:did存在返回该did，默认:0
     * @param IgnoreExisted 0:did存在返回错误，1:did存在返回该did，默认:0
     */
    public void setIgnoreExisted(Long IgnoreExisted) {
        this.IgnoreExisted = IgnoreExisted;
    }

    /**
     * Get 用户应用id 
     * @return UAPId 用户应用id
     */
    public Long getUAPId() {
        return this.UAPId;
    }

    /**
     * Set 用户应用id
     * @param UAPId 用户应用id
     */
    public void setUAPId(Long UAPId) {
        this.UAPId = UAPId;
    }

    public CreateTDidByPubKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTDidByPubKeyRequest(CreateTDidByPubKeyRequest source) {
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.EncryptPubKey != null) {
            this.EncryptPubKey = new String(source.EncryptPubKey);
        }
        if (source.CustomAttribute != null) {
            this.CustomAttribute = new String(source.CustomAttribute);
        }
        if (source.IgnoreExisted != null) {
            this.IgnoreExisted = new Long(source.IgnoreExisted);
        }
        if (source.UAPId != null) {
            this.UAPId = new Long(source.UAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "EncryptPubKey", this.EncryptPubKey);
        this.setParamSimple(map, prefix + "CustomAttribute", this.CustomAttribute);
        this.setParamSimple(map, prefix + "IgnoreExisted", this.IgnoreExisted);
        this.setParamSimple(map, prefix + "UAPId", this.UAPId);

    }
}

