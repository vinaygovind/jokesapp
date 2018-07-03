/**
 * 
 */
package com.spring.jokeapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author vgovind
 *
 */
@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes quotes;
	
	public JokeServiceImpl() {
		quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}
}