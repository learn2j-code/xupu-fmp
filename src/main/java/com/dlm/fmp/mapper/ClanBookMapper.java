package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.ClanBook;
import com.dlm.fmp.pojo.ClanBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClanBookMapper {
    long countByExample(ClanBookExample example);

    int deleteByExample(ClanBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClanBook record);

    int insertSelective(ClanBook record);

    List<ClanBook> selectByExample(ClanBookExample example);

    ClanBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClanBook record, @Param("example") ClanBookExample example);

    int updateByExample(@Param("record") ClanBook record, @Param("example") ClanBookExample example);

    int updateByPrimaryKeySelective(ClanBook record);

    int updateByPrimaryKey(ClanBook record);
}