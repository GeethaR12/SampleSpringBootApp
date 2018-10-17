package com.verizon.item.model;

import java.time.LocalDate;
import java.sql.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class LocalDateConvertor implements AttributeConverter<LocalDate, Date> {

	public Date convertToDatabaseColumn(LocalDate attribute) {
		return Date.valueOf(attribute);}

	public LocalDate convertToEntityAttribute(Date dbData) {
		return dbData.toLocalDate();
	}

	

}
