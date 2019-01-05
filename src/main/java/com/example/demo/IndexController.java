package com.example.demo;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Autowired
	ServletContext servletContext;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/")
	public String index(Model m) {
		m.addAttribute("containerMajorVersion", servletContext.getMajorVersion());
		m.addAttribute("containerMinorVersion", servletContext.getMinorVersion());
		m.addAttribute("serverInfo", servletContext.getServerInfo());
		m.addAttribute("h2version", jdbcTemplate.queryForObject("SELECT H2VERSION()", String.class));
		return "index";
	}
}
