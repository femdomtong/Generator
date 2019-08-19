package cn.sz.lwt.mapper;

import cn.sz.lwt.pojo.Condiment;
import cn.sz.lwt.pojo.CondimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondimentMapper {
    long countByExample(CondimentExample example);

    int deleteByExample(CondimentExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Condiment record);

    int insertSelective(Condiment record);

    List<Condiment> selectByExample(CondimentExample example);

    Condiment selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Condiment record, @Param("example") CondimentExample example);

    int updateByExample(@Param("record") Condiment record, @Param("example") CondimentExample example);

    int updateByPrimaryKeySelective(Condiment record);

    int updateByPrimaryKey(Condiment record);
}