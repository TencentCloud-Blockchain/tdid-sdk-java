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

public class GetTDidByObjectIdRequest extends AbstractModel{

    /**
    * 业务层用户ID
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * DID应用ID
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
     * Get 业务层用户ID 
     * @return ObjectId 业务层用户ID
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 业务层用户ID
     * @param ObjectId 业务层用户ID
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
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

    public GetTDidByObjectIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTDidByObjectIdRequest(GetTDidByObjectIdRequest source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);

    }
}

