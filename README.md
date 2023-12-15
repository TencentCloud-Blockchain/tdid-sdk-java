<p align="center">
<a href="https://cloud.tencent.com/"><img src="https://imgcache.qq.com/qcloud/tcloud_dtc/static/static_source_business/eec00e38-a178-479f-83d4-853a18575ac4.png" height="100" ></a>
</p>
<h1 align="center">TDID Tencent Cloud SDK DEMO for java</h1>

# 简介
欢迎使用腾讯云TDID API接口DEMO用例。本示例代码依赖腾讯云开发者工具套件（SDK），此 SDK 是云 API 3.0 平台的配套开发工具。
源码地址：https://github.com/tencentcloud/tencentcloud-sdk-java

# 依赖环境
1. 依赖环境：JDK 7 版本及以上。
2. 获取 SecretID、SecretKey 以及调用地址（endpoint），endpoint 调用地址为 tdid.tencentcloudapi.com。

# 获取安装
安装 Java SDK 前,先获取安全凭证。在第一次使用云API之前，用户首先需要在腾讯云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey，SecretID 是用于标识 API 调用者的身份，SecretKey 是用于加密签名字符串和服务器端验证签名字符串的密钥 SecretKey 必须严格保管，避免泄露。您也可以前往[从零开始使用腾讯云 Java SDK ](https://cloud.tencent.com/developer/article/1839228)界面查看更为基础和详细的 Java SDK 的安装和使用说明。
## 通过 Maven 安装(推荐)

从 3.1.500 版本开始，本项目使用 [KonaJDK](https://github.com/Tencent/TencentKona-8) 编译发布。

通过 Maven 获取安装是使用 JAVA SDK 的推荐方法，Maven 是 JAVA 的依赖管理工具，支持您项目所需的依赖项，并将其安装到项目中。关于 Maven 详细可参考 Maven 官网。
1. 请访问[Maven官网](https://maven.apache.org/)下载对应系统Maven安装包进行安装；
2. 为您的项目添加 Maven 依赖项，只需在 Maven pom.xml 添加以下依赖项即可。注意这里的版本号只是举例，您可以在[Maven仓库](https://search.maven.org/search?q=tencentcloud-sdk-java)上找到最新的版本(最新版本是3.1.708)。请知悉，SDK 是先确认 `mvn deploy` 发布成功后再更新 GitHub tag，但是 Maven 官网索引更新有延迟，导致新发布的版本暂时（约1-2小时）在 Maven 官网搜索不到，实际不影响使用最新版本，您可以正常执行 `mvn compile` 等指令。
3. maven仓库中显示的4.0.11是废弃版本，我们已经联系maven官方删除jar包，但maven索引无法清除，请勿使用;
4. 引用方法可参考示例。
```xml
<dependency>
    <groupId>com.tencentcloudapi</groupId>
    <artifactId>tencentcloud-sdk-java</artifactId>
    <!-- go to https://search.maven.org/search?q=tencentcloud-sdk-java and get the latest version. -->
    <!-- 请到https://search.maven.org/search?q=tencentcloud-sdk-java查询所有版本，最新版本如下 -->
    <version>3.1.894</version>
</dependency>
```
1. 如上引用方式会将腾讯云所有产品sdk下载到本地，可以将artifactId换成tencentcloud-sdk-java-tdid仅引用tdid的sdk，代码中使用方式和大包相同，可参考示例。最新版本也可在[Maven仓库](https://search.maven.org/search?q=tencentcloud-sdk-java)查询，可大大节省存储空间。
2. 中国大陆地区的用户可以使用镜像源加速下载，编辑 maven 的 settings.xml 配置文件，在 mirrors 段落增加镜像配置：
```
    <mirror>
      <id>tencent</id>
      <name>tencent maven mirror</name>
      <url>https://mirrors.tencent.com/nexus/repository/maven-public/</url>
      <mirrorOf>*</mirrorOf>
    </mirror>
```

## 通过源码包安装
1. 前往 [Github 仓库](https://github.com/tencentcloud/tencentcloud-sdk-java) 或者 [Gitee 仓库](https://gitee.com/tencentcloud/tencentcloud-sdk-java) 下载源码压缩包；
2. 解压源码包到您项目合适的位置；
3. 需要将vendor目录下的jar包放在java的可找到的路径中；
4. 引用方法可参考示例。

# Demo单元测试用例

TDIDDemo目录下是TDID API接口调用单元测试用例示例，业务可参考相关代码进行编码。
TDIDDemo/src/main/java/com/tencentcloudapi的目录下为通过源码包安装方式安装的tdid tencentcloud-sdk-java源码
