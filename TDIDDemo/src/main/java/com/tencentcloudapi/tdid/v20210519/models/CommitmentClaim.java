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

public class CommitmentClaim extends AbstractModel{

    /**
    * 致盲因子
    */
    @SerializedName("Opening")
    @Expose
    private String Opening;

    /**
    * 原始值声明字段名称
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 承诺声明字段名称
    */
    @SerializedName("Commitment")
    @Expose
    private String Commitment;

    /**
     * Get 致盲因子 
     * @return Opening 致盲因子
     */
    public String getOpening() {
        return this.Opening;
    }

    /**
     * Set 致盲因子
     * @param Opening 致盲因子
     */
    public void setOpening(String Opening) {
        this.Opening = Opening;
    }

    /**
     * Get 原始值声明字段名称 
     * @return Origin 原始值声明字段名称
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 原始值声明字段名称
     * @param Origin 原始值声明字段名称
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 承诺声明字段名称 
     * @return Commitment 承诺声明字段名称
     */
    public String getCommitment() {
        return this.Commitment;
    }

    /**
     * Set 承诺声明字段名称
     * @param Commitment 承诺声明字段名称
     */
    public void setCommitment(String Commitment) {
        this.Commitment = Commitment;
    }

    public CommitmentClaim() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitmentClaim(CommitmentClaim source) {
        if (source.Opening != null) {
            this.Opening = new String(source.Opening);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.Commitment != null) {
            this.Commitment = new String(source.Commitment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Opening", this.Opening);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "Commitment", this.Commitment);

    }
}

