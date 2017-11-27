package pe.royalsystems.springerp.erpspringsalud.controller;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.royalsystems.springerp.commons.UtilesCommons;

@RestController
@EnableAutoConfiguration
public class HomeController {
	

	
    @RequestMapping("/home")
    String home() {
    	return "Bienvenido en la fecha:"+UtilesCommons.printDate("dd/MM/yyyyy HH:mm:ss",new Date()) ;
    }
}
