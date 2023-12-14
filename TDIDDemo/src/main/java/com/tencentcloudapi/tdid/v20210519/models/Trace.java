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

public class Trace extends AbstractModel{

    /**
    * 区块高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
    * 交易Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 调用的合约类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractType")
    @Expose
    private String ContractType;

    /**
    * 调用的合约方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractMethod")
    @Expose
    private String ContractMethod;

    /**
    * 调用的合约参数，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 合约执行过程中抛出的事件，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventData")
    @Expose
    private String EventData;

    /**
    * 交易时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 资源类型，目前包含两类资源：DID、CPT
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 区块高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockHeight 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockHeight 区块高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    /**
     * Get 交易Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TxId 交易Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set 交易Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TxId 交易Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get 调用的合约类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractType 调用的合约类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractType() {
        return this.ContractType;
    }

    /**
     * Set 调用的合约类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractType 调用的合约类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractType(String ContractType) {
        this.ContractType = ContractType;
    }

    /**
     * Get 调用的合约方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractMethod 调用的合约方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractMethod() {
        return this.ContractMethod;
    }

    /**
     * Set 调用的合约方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractMethod 调用的合约方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractMethod(String ContractMethod) {
        this.ContractMethod = ContractMethod;
    }

    /**
     * Get 调用的合约参数，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parameters 调用的合约参数，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 调用的合约参数，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parameters 调用的合约参数，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 合约执行过程中抛出的事件，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventData 合约执行过程中抛出的事件，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventData() {
        return this.EventData;
    }

    /**
     * Set 合约执行过程中抛出的事件，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventData 合约执行过程中抛出的事件，以JSON形式展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventData(String EventData) {
        this.EventData = EventData;
    }

    /**
     * Get 交易时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 交易时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 资源类型，目前包含两类资源：DID、CPT
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型，目前包含两类资源：DID、CPT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，目前包含两类资源：DID、CPT
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型，目前包含两类资源：DID、CPT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public Trace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Trace(Trace source) {
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.ContractType != null) {
            this.ContractType = new String(source.ContractType);
        }
        if (source.ContractMethod != null) {
            this.ContractMethod = new String(source.ContractMethod);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.EventData != null) {
            this.EventData = new String(source.EventData);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "ContractType", this.ContractType);
        this.setParamSimple(map, prefix + "ContractMethod", this.ContractMethod);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "EventData", this.EventData);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

