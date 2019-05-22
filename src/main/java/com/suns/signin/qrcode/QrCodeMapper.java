package com.suns.signin.qrcode;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * Created by sunshuai on 2019/5/22
 */
@Mapper
public interface QrCodeMapper {

    @Insert("insert into tb_qrcode(description) values(#{description})")
    @Options(useGeneratedKeys = true,keyProperty = "serial",keyColumn = "serial")
    Integer addQrCode(QrCode qrCode);
}
