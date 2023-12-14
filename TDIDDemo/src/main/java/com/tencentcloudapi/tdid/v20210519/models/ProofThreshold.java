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

public class ProofThreshold extends AbstractModel{

    /**
    * 致盲因子
    */
    @SerializedName("Opening")
    @Expose
    private String Opening;

    /**
    * 承诺声明字段名称
    */
    @SerializedName("Commitment")
    @Expose
    private String Commitment;

    /**
    * 范围证明的目标阈值:，证明命题为: Commitment>=Threshold
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 原始值声明字段名称，DiffVal存在时，此字段忽略
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 原始值与阈值的差值，此字段存在时，origin字段忽略
    */
    @SerializedName("DiffVal")
    @Expose
    private Long DiffVal;

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

    /**
     * Get 范围证明的目标阈值:，证明命题为: Commitment>=Threshold 
     * @return Threshold 范围证明的目标阈值:，证明命题为: Commitment>=Threshold
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 范围证明的目标阈值:，证明命题为: Commitment>=Threshold
     * @param Threshold 范围证明的目标阈值:，证明命题为: Commitment>=Threshold
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 原始值声明字段名称，DiffVal存在时，此字段忽略 
     * @return Origin 原始值声明字段名称，DiffVal存在时，此字段忽略
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 原始值声明字段名称，DiffVal存在时，此字段忽略
     * @param Origin 原始值声明字段名称，DiffVal存在时，此字段忽略
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 原始值与阈值的差值，此字段存在时，origin字段忽略 
     * @return DiffVal 原始值与阈值的差值，此字段存在时，origin字段忽略
     */
    public Long getDiffVal() {
        return this.DiffVal;
    }

    /**
     * Set 原始值与阈值的差值，此字段存在时，origin字段忽略
     * @param DiffVal 原始值与阈值的差值，此字段存在时，origin字段忽略
     */
    public void setDiffVal(Long DiffVal) {
        this.DiffVal = DiffVal;
    }

    public ProofThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProofThreshold(ProofThreshold source) {
        if (source.Opening != null) {
            this.Opening = new String(source.Opening);
        }
        if (source.Commitment != null) {
            this.Commitment = new String(source.Commitment);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.DiffVal != null) {
            this.DiffVal = new Long(source.DiffVal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Opening", this.Opening);
        this.setParamSimple(map, prefix + "Commitment", this.Commitment);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "DiffVal", this.DiffVal);

    }
}

