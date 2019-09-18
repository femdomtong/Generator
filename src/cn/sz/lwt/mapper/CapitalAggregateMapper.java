package cn.sz.lwt.mapper;

import cn.sz.lwt.pojo.CapitalAggregate;
import cn.sz.lwt.pojo.CapitalAggregateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalAggregateMapper {
    long countByExample(CapitalAggregateExample example);

    int deleteByExample(CapitalAggregateExample example);

    int deleteByPrimaryKey(BigDecimal capitalid);

    int insert(CapitalAggregate record);

    int insertSelective(CapitalAggregate record);

    List<CapitalAggregate> selectByExample(CapitalAggregateExample example);

    CapitalAggregate selectByPrimaryKey(BigDecimal capitalid);

    int updateByExampleSelective(@Param("record") CapitalAggregate record, @Param("example") CapitalAggregateExample example);

    int updateByExample(@Param("record") CapitalAggregate record, @Param("example") CapitalAggregateExample example);

    int updateByPrimaryKeySelective(CapitalAggregate record);

    int updateByPrimaryKey(CapitalAggregate record);
}