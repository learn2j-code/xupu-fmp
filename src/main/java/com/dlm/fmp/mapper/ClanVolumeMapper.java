package com.dlm.fmp.mapper;

import com.dlm.fmp.pojo.ClanVolume;
import com.dlm.fmp.pojo.ClanVolumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClanVolumeMapper {
    long countByExample(ClanVolumeExample example);

    int deleteByExample(ClanVolumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClanVolume record);

    int insertSelective(ClanVolume record);

    List<ClanVolume> selectByExample(ClanVolumeExample example);

    ClanVolume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClanVolume record, @Param("example") ClanVolumeExample example);

    int updateByExample(@Param("record") ClanVolume record, @Param("example") ClanVolumeExample example);

    int updateByPrimaryKeySelective(ClanVolume record);

    int updateByPrimaryKey(ClanVolume record);
}