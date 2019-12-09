package cn.bupt.devgroup.ShardingAlgorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * @author zhuangxu
 * @date 2019/12/9 13:59
 */
public class TableShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    private static String tableName="user_table_";
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        long password=Long.parseLong(preciseShardingValue.getValue());
        if(password>2000) {
            return tableName + "1";
        }
        return tableName+"0";
    }
}
