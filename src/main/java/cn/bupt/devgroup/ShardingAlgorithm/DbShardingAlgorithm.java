package cn.bupt.devgroup.ShardingAlgorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author zhuangxu
 * @date 2019/12/6 17:05
 */
public class DbShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    private static String dataBaseName="database";
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String value = preciseShardingValue.getValue();
        if(Long.parseLong(value)%2==0){
            return dataBaseName+"0";
        }else {
            return dataBaseName+"1";
        }
    }
}
