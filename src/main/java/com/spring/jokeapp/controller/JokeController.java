/**
 * 
 */
package com.spring.jokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.jokeapp.service.JokeService;

/**
 * @author vgovind
 *
 */
@Controller
public class JokeController {
	
	private JokeService jokeService;
	
	@Autowired
	public JokeController(JokeService pJokeService) {
		jokeService = pJokeService;
	}
	
	@RequestMapping({"/",""})
	public String getJoke(Model pModel) {
		pModel.addAttribute("joke", jokeService.getJoke());
		return "jokePage";
	}
}