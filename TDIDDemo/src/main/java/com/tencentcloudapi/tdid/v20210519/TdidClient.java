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
package com.tencentcloudapi.tdid.v20210519;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdid.v20210519.models.*;

public class TdidClient extends AbstractClient{
    private static String endpoint = "tdid.tencentcloudapi.com";
    private static String service = "tdid";
    private static String version = "2021-05-19";
    
    public TdidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdidClient(Credential credential, String region, ClientProfile profile) {
        super(TdidClient.endpoint, TdidClient.version, credential, region, profile);
    }

    /**
     *创建凭证模板
     * @param req CreateCPTRequest
     * @return CreateCPTResponse
     * @throws TencentCloudSDKException
     */
    public CreateCPTResponse CreateCPT(CreateCPTRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCPTResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCPTResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCPT");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据披露策略创建选择性披露凭证
     * @param req CreateDisclosedCredentialRequest
     * @return CreateDisclosedCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisclosedCredentialResponse CreateDisclosedCredential(CreateDisclosedCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisclosedCredentialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisclosedCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDisclosedCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建凭证持有人的可验证表达
     * @param req CreatePresentationRequest
     * @return CreatePresentationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresentationResponse CreatePresentation(CreatePresentationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePresentationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePresentationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePresentation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *自动生成公私钥对托管在DID平台，并创建DID标识
     * @param req CreateTDidByHostRequest
     * @return CreateTDidByHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByHostResponse CreateTDidByHost(CreateTDidByHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过导入本地的公钥文件注册DID标识
     * @param req CreateTDidByPubKeyRequest
     * @return CreateTDidByPubKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPubKeyResponse CreateTDidByPubKey(CreateTDidByPubKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByPubKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByPubKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByPubKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新DID标识的禁用状态
     * @param req DeactivateTDidRequest
     * @return DeactivateTDidResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateTDidResponse DeactivateTDid(DeactivateTDidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeactivateTDidResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeactivateTDidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeactivateTDid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个应用关键指标统计数据
     * @param req GetAppSummaryRequest
     * @return GetAppSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetAppSummaryResponse GetAppSummary(GetAppSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAppSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAppSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAppSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取凭证链上状态信息
     * @param req GetCredentialStateRequest
     * @return GetCredentialStateResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialStateResponse GetCredentialState(GetCredentialStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个应用关键指标统计数据
     * @param req GetOverSummaryRequest
     * @return GetOverSummaryResponse
     * @throws TencentCloudSDKException
     */
    public GetOverSummaryResponse GetOverSummary(GetOverSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOverSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetOverSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOverSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取提案基础信息
     * @param req GetProposalBaseRequest
     * @return GetProposalBaseResponse
     * @throws TencentCloudSDKException
     */
    public GetProposalBaseResponse GetProposalBase(GetProposalBaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProposalBaseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetProposalBaseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetProposalBase");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取提案投票权重情况
     * @param req GetProposalResultRequest
     * @return GetProposalResultResponse
     * @throws TencentCloudSDKException
     */
    public GetProposalResultResponse GetProposalResult(GetProposalResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProposalResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetProposalResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetProposalResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过业务层对象ID获取DID标识
     * @param req GetTDidByObjectIdRequest
     * @return GetTDidByObjectIdResponse
     * @throws TencentCloudSDKException
     */
    public GetTDidByObjectIdResponse GetTDidByObjectId(GetTDidByObjectIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTDidByObjectIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTDidByObjectIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTDidByObjectId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看DID标识的文档
     * @param req GetTDidDocumentRequest
     * @return GetTDidDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GetTDidDocumentResponse GetTDidDocument(GetTDidDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTDidDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTDidDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTDidDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询DID标识的认证公钥
     * @param req GetTDidPubKeyRequest
     * @return GetTDidPubKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetTDidPubKeyResponse GetTDidPubKey(GetTDidPubKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTDidPubKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTDidPubKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTDidPubKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取TDID资源回溯记录
     * @param req GetTraceListRequest
     * @return GetTraceListResponse
     * @throws TencentCloudSDKException
     */
    public GetTraceListResponse GetTraceList(GetTraceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTraceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTraceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTraceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *颁发可验证凭证
     * @param req IssueCredentialRequest
     * @return IssueCredentialResponse
     * @throws TencentCloudSDKException
     */
    public IssueCredentialResponse IssueCredential(IssueCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IssueCredentialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IssueCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IssueCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定提案投票记录
     * @param req ListVoterRecordRequest
     * @return ListVoterRecordResponse
     * @throws TencentCloudSDKException
     */
    public ListVoterRecordResponse ListVoterRecord(ListVoterRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListVoterRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListVoterRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListVoterRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询权威机构信息
     * @param req QueryAuthorityInfoRequest
     * @return QueryAuthorityInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryAuthorityInfoResponse QueryAuthorityInfo(QueryAuthorityInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAuthorityInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAuthorityInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAuthorityInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询凭证模版内容
     * @param req QueryCPTRequest
     * @return QueryCPTResponse
     * @throws TencentCloudSDKException
     */
    public QueryCPTResponse QueryCPT(QueryCPTRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCPTResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCPTResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCPT");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *轮换DID标识的身份认证公钥
     * @param req RotateTDidAuthPubKeyRequest
     * @return RotateTDidAuthPubKeyResponse
     * @throws TencentCloudSDKException
     */
    public RotateTDidAuthPubKeyResponse RotateTDidAuthPubKey(RotateTDidAuthPubKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RotateTDidAuthPubKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RotateTDidAuthPubKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RotateTDidAuthPubKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置Did文档的自定义属性
     * @param req SetTDidAttributeRequest
     * @return SetTDidAttributeResponse
     * @throws TencentCloudSDKException
     */
    public SetTDidAttributeResponse SetTDidAttribute(SetTDidAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTDidAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetTDidAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTDidAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新凭证的链上状态
     * @param req UpdateCredentialStateRequest
     * @return UpdateCredentialStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCredentialStateResponse UpdateCredentialState(UpdateCredentialStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCredentialStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCredentialStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCredentialState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证已签名的凭证内容
     * @param req VerifyCredentialsRequest
     * @return VerifyCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public VerifyCredentialsResponse VerifyCredentials(VerifyCredentialsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyCredentialsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyCredentialsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyCredentials");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证可验证表达的内容
     * @param req VerifyPresentationRequest
     * @return VerifyPresentationResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPresentationResponse VerifyPresentation(VerifyPresentationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPresentationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPresentationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyPresentation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过凭证投票提案
     * @param req VoteProposalRequest
     * @return VoteProposalResponse
     * @throws TencentCloudSDKException
     */
    public VoteProposalResponse VoteProposal(VoteProposalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoteProposalResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoteProposalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoteProposal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
