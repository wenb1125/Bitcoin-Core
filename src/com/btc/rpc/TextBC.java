package com.btc.rpc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.btc.rpc.entity.*;

import java.util.List;

public class TextBC {
    public static void main(String[] args) {
        //测试:获取节点的区块总数
        BitcoinService service = new BitcoinService();
        int blockCount = service.getBlockCount();
        System.out.println("当前节点的区块个数:" + blockCount);
        //测试:获取一个新的比特币地址


        //测试:获取当前节点的区块链信息
        BlockChainInfo chaininfo = service.getBlockChainInfo();
        if (chaininfo != null){
            System.out.println("当前节点最新区块的hash:" + chaininfo.getBestblockhash());
            System.out.println("当前节点的区块数:" + chaininfo.getBlocks());
            System.out.println("当前节点的难度值:" + chaininfo.getDifficulty());
            List<Bip> bipSoftForks = chaininfo.getSoftforks();
            //遍历
            for (Bip bip: bipSoftForks){
                System.out.println(bip.getId());
            }
        }
        //测试:获取最新区块的hash
        String newBlockHash = service.getBestBlockHash();
        System.out.println("最新区块的hash是: " + newBlockHash);

        //测试:获取指定高度的区块的hash值
        String hash1 = service.getBlockHash(1);
        System.out.println("当前指定高度的区块的hash值:" + hash1);

        //测试:根据指定区块的hash获取数据
        Block block = service.getblock(hash1);
        System.out.println("根据hash获取区块的交易信息:" + JSON.toJSONString(block.getTx()));
        System.out.println("根据hash获取区块的高度:" + block.getNonce());


        //String type = RPCUtils.getAddressType(ADDRESS_TYPE.LEGACY);
        //测试:根据所传的内容生成比特币地址
        String newAddress = service.getNewAddress("herixu",ADDRESS_TYPE.LEGACY);
        System.out.println("新生成的比特币地址是:" + newAddress);


        //测试:根据区块hash获取区块头信息
        BlockHeader header = service.getBlockHeader(hash1);
        System.out.println("根据hash获取区块头的信息:" + header.getNonce());

        //测试:获取内存池中的数据
        MempoolInfo mempoolInfo = service.getmempoolinfo();
        System.out.println("内存池中是否有数据: " + mempoolInfo.isLoaded());
        System.out.println("内存池最大容量是: " + mempoolInfo.getMaxmempool());

        //测试:获取比特币钱包数据
        WalletInfo walletInfo = service.getwalletinfo();
        System.out.println("比特币钱包版本: " + walletInfo.getWalletversion());

        //测试:获取比特币钱包网络信息
        NetTotals netTotals = service.getnettotals();
        System.out.println("接收到的总字节数: " + netTotals.getTotalbytesrecv());

        //测试:验证地址
        ValidateAddress validateAddress = service.validateaddress(newAddress);
        System.out.println("地址是否有效: " + validateAddress.isIsvalid());
        System.out.println("地址是: " + validateAddress.getAddress());
        System.out.println("验证公钥: " + validateAddress.getScriptPubKey());

        //测试:获取交易输出信息
        TxoutSetInfo txoutSetInfo = service.gettxoutsetinfo();
        System.out.println("区块的高度: " + txoutSetInfo.getHeight());
        System.out.println("最新区块的hash: " + txoutSetInfo.getBestblock());

        //测试:获取挖矿信息
        MiningInfo miningInfo = service.getmininginfo();
        System.out.println("区块个数: " + miningInfo.getBlocks());
        System.out.println("挖矿难度: : " + miningInfo.getDifficulty());
        System.out.println("入口: : " + miningInfo.getChain());

        //测试:获取bitcoin core运行时间
        String time = service.uptime();
        System.out.println("bitcoin运行时间: " + time + " s");

        //测试:获取bitcoin core日志信息
        Logging logging = service.logging();
        System.out.println("Bitcoin Core是否连接网络: " + logging.isNet());

        //测试:获取Bitcoin Core的rpc信息
        String rpcInfo = service.getrpcinfo();
        Object arr = JSONArray.parse(rpcInfo);
        System.out.println(arr);
        //System.out.println(rpcInfo.toString());
        //System.out.println("Bitcoin Core存放log的路径: " + rpcInfo.getLogpath());
    }
}
