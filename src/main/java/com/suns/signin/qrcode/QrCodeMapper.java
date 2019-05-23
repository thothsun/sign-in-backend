package com.suns.signin.qrcode;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by sunshuai on 2019/5/22
 */
@Mapper
public interface QrCodeMapper {

    @Insert("insert into tb_qrcode(description) values(#{description})")
    @Options(useGeneratedKeys = true,keyProperty = "serial",keyColumn = "serial")
    Integer addQrCode(QrCode qrCode);


    @Select("select * from tb_qrcode where teacher=#{teacher}")
    List<QrCode> getAllSign(@Param("teacher") String teacher);

}
