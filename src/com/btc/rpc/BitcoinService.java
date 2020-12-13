package com.btc.rpc;

import com.alibaba.fastjson.JSON;
import com.btc.rpc.entity.*;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 该类用于封装调用比特币节点不同的功能方法,并返回相应的结果
 */
public class BitcoinService {
    private static final Map< String, String > map = new HashMap<>();
    //静态代码块
    static {
        map.put("Encoding","UTF_8");
        map.put("Content-Type","application/json");
        map.put("Authorization","Basic "+ RPCUtils.base64Str(Constants.USER + ":" + Constants.PASSWORD));
    }

    /**
     * 获取Bitcoin Core的rpc信息
     * @return 返回Bitcoin Core的rpc信息
     */
    public String getrpcinfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_RPC_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            //String resultStr =
            return rpcResult.getData().getResult();
            //return JSON.parseObject(resultStr,RpcInfo.class);
        }
        return null;
    }

    /**
     * 获取bitcoin core状态日志
     * @return 返回bitcoin core日志
     */
    public Logging logging(){
        String json = RPCUtils.prepareJSON(Constants.LOGGING);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,Logging.class);
        }
        return null;
    }



    /**
     * 获取Bitcoin Core运行时间
     * @return 返回Bitcoin Core运行时间
     */
    public String uptime(){
        String json = RPCUtils.prepareJSON(Constants.UPTIME);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            return rpcResult.getData().getResult();
        }
        return null;
    }

    /**
     * 获取挖矿信息
     * @return 返回挖矿信息
     */
    public MiningInfo getmininginfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_MINING_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,MiningInfo.class);
        }
        return null;
    }


    /**
     * 获取交易输出信息
     * @return 返回交易信息
     */
    public TxoutSetInfo gettxoutsetinfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_TXOUTSET_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,TxoutSetInfo.class);
        }
        return null;
    }


    /**
     * 验证比特币地址
     * @param address 比特币地址
     * @return 返回验证结果
     */
    public ValidateAddress validateaddress(String address){
        String json = RPCUtils.prepareJSON(Constants.VALIDATE_ADDRESS,address);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,ValidateAddress.class);
        }
        return null;
    }


    /**
     * 获取比特币钱包网络信息
     * @return 返回比特币网络信息
     */
    public NetTotals getnettotals(){
        String json = RPCUtils.prepareJSON(Constants.GET_NET_TOTALS);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,NetTotals.class);
        }
        return null;
    }

    /**
     * 获取比特币钱包信息
     * @return 返回比特币钱包信息
     */
    public WalletInfo getwalletinfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_WALLET_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr,WalletInfo.class);
        }
        return null;
    }


    /**
     * 获取内存池中的数据
     * @return 内存池中的数据
     */
    public MempoolInfo getmempoolinfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_MEMPOOL_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            return JSON.parseObject(resultStr, MempoolInfo.class);
        }
        return null;
    }


    /**
     * 根据区块的hash获取区块头的信息
     * @param hash 区块的hash
     * @return 返回区块头信息
     */
    public BlockHeader getBlockHeader(String hash){
        String json = RPCUtils.prepareJSON(Constants.GET_BLOCK_HEADER,hash);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String jsonStr = rpcResult.getData().getResult();
            return JSON.parseObject(jsonStr,BlockHeader.class);
        }
        return null;
    }





    //-------------------------------------------------//
    /**
     * 生成一个新的比特币的地址
     * @param label 地址标签,可自定义
     * @param address_type 地址类型,可选的有:legacy, p2sh-segwit, bech32.
     * @return 返回一个新的比特币地址
     */
    public String getNewAddress(String label, ADDRESS_TYPE address_type){
        String type = EnumUtils.getAddressType(address_type);
        String json = RPCUtils.prepareJSON(Constants.GET_NEW_ADDRESS,label,type);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            return rpcResult.getData().getResult();
        }
        return null;
    }

    /**
     * 根据区块的hash值获取区块的信息
     * @param hash 区块的hash
     * @return 返回区块的信息
     */
    public Block getblock(String hash){
        String json = RPCUtils.prepareJSON(Constants.GET_BLOCK,hash);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String jsonStr = rpcResult.getData().getResult();
            return JSON.parseObject(jsonStr,Block.class);
        }
        return null;
    }


    /**
     * 根据指定高度获取该高度区块的hash
     * @param height 区块的高度
     * @return 返回该区块高度的hash
     */
    public String getBlockHash(int height){
        String json = RPCUtils.prepareJSON(Constants.GET_BLOCK_HASH,height);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            return rpcResult.getData().getResult();
        }

        return null;
    }

    /**
     * 获取区块链节点信息
     * @return 返回区块链信息类对象
     */
    public BlockChainInfo getBlockChainInfo(){
        String json = RPCUtils.prepareJSON(Constants.GET_BLOCKCHAIN_INFO);
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            String resultStr = rpcResult.getData().getResult();
            //反序列化
            return JSON.parseObject(resultStr, BlockChainInfo.class);
        }
        return null;
    }
    /**
     * 获取最新区块
     * @return 返回最新区块hash
     */
    public String getBestBlockHash(){
        String json = RPCUtils.prepareJSON(Constants.GET_BEST_BLOCK_HASH);
        Map<String,String> map = new HashMap<>();
        RPCResult rpcResult = RPCUtils.doPost(Constants.RPCURL,map,json);
        if (rpcResult == null){
            return null;
        }
        if (rpcResult.getCode() == HttpStatus.SC_OK){
            return rpcResult.getData().getResult();
        }
        return null;
    }
    /**
     * 该方法用于获取当前节点的区块数
     * @return 节点的区块数
     */
    public int getBlockCount() {
        String json = RPCUtils.prepareJSON(Constants.GET_BLOCK_COUNT);
        Map<String, String> map = new HashMap<>();
        map.put("Encoding", "UTF-8");
        map.put("Content-Type", "application/json");
        map.put("Authorization", "Basic " + RPCUtils.base64Str(Constants.USER + ":" + Constants.PASSWORD));
        RPCResult result = RPCUtils.doPost(Constants.RPCURL, map, json);
        if (result == null){
            return -1;
        }
        if (result.getCode() == HttpStatus.SC_OK) {
            String count = result.getData().getResult();
            return Integer.parseInt(count);
        }
        return -1;
    }
}
