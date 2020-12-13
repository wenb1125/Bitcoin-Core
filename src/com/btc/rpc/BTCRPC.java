package com.btc.rpc;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class BTCRPC {
    public static void main(String[] args) {
        //1、准备json-rpc链接的数据
        JSONObject rpcJson = new JSONObject();
        rpcJson.put("id", System.currentTimeMillis());
        rpcJson.put("jsonrpc", "2.0");
        rpcJson.put("method", "getbestblockhash");//调用的命令：最后一个区块的hash
        //rpcJson.put("method", "getblockcount");//调用的命令：最后一个区块的hash
        //rpcJson.put("params","1");
        //rpcJson.put("Authorization", "Basic " + authBase64);//用户密码认证
        String json = rpcJson.toJSONString();
        //System.out.println(rpcJson.toJSONString());
        System.out.println("请求的数据:"+json);

        //2.1发起网络请求
//        try {
//            URL url = new URL("ip:port");
//            URLConnection connection = url.openConnection();
//            connection.connect();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //2.2发起网络请求
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(Constants.RPCURL);
        try {
            //将认证信息放在请求头中
            String authStr = Constants.USER + ":" + Constants.PASSWORD;
            String authBase64 = RPCUtils.base64Str(authStr);
            post.addHeader("Authorization","Basic " + authBase64);
            //设置头信息
            post.addHeader("Encoding","UTF-8");
            post.addHeader("Content-Type","application/json");

            StringEntity entity = new StringEntity(json);
            post.setEntity(entity);



            //post.addHeader();
            HttpResponse response = client.execute(post);//发起post请求
            int code = response.getStatusLine().getStatusCode();
            if (code == 200){
                System.out.println("恭喜rpc请求成功");
                String result = EntityUtils.toString(response.getEntity());
                System.out.println(result);
                //StringEntity resultEntity = (StringEntity) response.getEntity();
                //System.out.println(resultEntity.getContentLength());
            }else {
                System.out.println("抱歉,rpc请求失败,请求状态码是:"+code);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
