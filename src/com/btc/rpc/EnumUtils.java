package com.btc.rpc;

enum ADDRESS_TYPE {
    LEGACY,
    P2SH_SEGWIT,
    BECH32,
}
public class EnumUtils{
    /**
     * 根据枚举返回对应的字符串
     * @param address_type 枚举变量
     * @return 地址类型
     */
    public static String getAddressType(ADDRESS_TYPE address_type){
        switch (address_type){
            case LEGACY:
                return "legacy";
            case P2SH_SEGWIT:
                return "p2sh-segwit";
            case BECH32:
                return "bech32";
        }
        return null;
    }
}

