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

public class CreateCPTResponse extends AbstractModel{

    /**
    * 上链交易信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transaction")
    @Expose
    private ChainTransaction Transaction;

    /**
    * 凭证模板索引ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 凭证模板ID
    */
    @SerializedName("CPTId")
    @Expose
    private Long CPTId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上链交易信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transaction 上链交易信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChainTransaction getTransaction() {
        return this.Transaction;
    }

    /**
     * Set 上链交易信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transaction 上链交易信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransaction(ChainTransaction Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get 凭证模板索引ID 
     * @return Id 凭证模板索引ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 凭证模板索引ID
     * @param Id 凭证模板索引ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 凭证模板ID 
     * @return CPTId 凭证模板ID
     */
    public Long getCPTId() {
        return this.CPTId;
    }

    /**
     * Set 凭证模板ID
     * @param CPTId 凭证模板ID
     */
    public void setCPTId(Long CPTId) {
        this.CPTId = CPTId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateCPTResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCPTResponse(CreateCPTResponse source) {
        if (source.Transaction != null) {
            this.Transaction = new ChainTransaction(source.Transaction);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CPTId != null) {
            this.CPTId = new Long(source.CPTId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Transaction.", this.Transaction);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CPTId", this.CPTId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

