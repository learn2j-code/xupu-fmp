package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.ClanPicture;
import com.dlm.fmp.pojo.ClanPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClanPictureMapper {
    long countByExample(ClanPictureExample example);

    int deleteByExample(ClanPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClanPicture record);

    int insertSelective(ClanPicture record);

    List<ClanPicture> selectByExample(ClanPictureExample example);

    ClanPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClanPicture record, @Param("example") ClanPictureExample example);

    int updateByExample(@Param("record") ClanPicture record, @Param("example") ClanPictureExample example);

    int updateByPrimaryKeySelective(ClanPicture record);

    int updateByPrimaryKey(ClanPicture record);
}