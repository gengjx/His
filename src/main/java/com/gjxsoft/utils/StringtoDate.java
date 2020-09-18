package com.gjxsoft.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        DateFormat dateFormat =null;

        dateFormat= new SimpleDateFormat("yyyy-mm-dd");
        try {
            if(StringUtils.isEmpty(source)) {
                throw new NullPointerException("请输入要转换的日期");
            }
            Date date =dateFormat.parse(source);
            return  date;
        } catch (ParseException e) {
            throw new NullPointerException("转换有误");
        }

    }
}
