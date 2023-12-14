import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tdid.v20210519.TdidClient;
import com.tencentcloudapi.tdid.v20210519.models.CreateTDidByHostRequest;
import com.tencentcloudapi.tdid.v20210519.models.CreateTDidByHostResponse;
import org.junit.Test;

public class DIDTest
{
    public static TdidClient getClient() {
        // 实例化一个认证对象，入参需要传入TDID账户密钥对secretId，secretKey
        Credential cred = new Credential("AKIDMl9RenlUyEF5fy2rPxVxCBwSiiS0Wopc", "aw3tY2HLCpIZgZCcpmTwGVddT6VnqdEd");
        // 设置访问地址
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint("tdid.test.tencentcloudapi.com");
        // 实例化一个client对象
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        // 设置签名算法为TC3
        clientProfile.setSignMethod("TC3-HMAC-SHA256");
        // 第二个参数是地域信息，直接填写字符串ap-guangzhou
        TdidClient client = new TdidClient(cred, "ap-beijing", clientProfile);
        return client;
    }

    @Test
    public void testCreateTDidByHost() throws TencentCloudSDKException {
        TdidClient client = DIDTest.getClient();
        // 实例化一个请求对象，根据调用的接口和实际情况，可以进一步设置请求参数
        CreateTDidByHostRequest req = new CreateTDidByHostRequest();
        req.setDAPId(Long.valueOf(25));
        // 通过client对象调用想要访问的接口，需要传入请求对象
        CreateTDidByHostResponse resp = client.CreateTDidByHost(req);
        // 输出json格式的字符串回包
        System.out.println(CreateTDidByHostResponse.toJsonString(resp));
    }
}