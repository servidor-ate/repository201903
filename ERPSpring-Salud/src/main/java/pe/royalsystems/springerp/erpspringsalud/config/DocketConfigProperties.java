package pe.royalsystems.springerp.erpspringsalud.config;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
//@ConfigurationProperties("swagger.info")
public class DocketConfigProperties {
	
	
	@Value("${swagger.info.title}")
	private String title;

	@Value("${swagger.info.description}")
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}
