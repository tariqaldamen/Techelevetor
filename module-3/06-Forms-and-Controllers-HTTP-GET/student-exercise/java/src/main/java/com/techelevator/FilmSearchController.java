package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;



	@RequestMapping("/filmList")
	public String showfilm(
			@RequestParam String chooseGenre,int MinimumLength,int MaximumLength,
			ModelMap modelHolder) {
		List<Film> films = filmDao.getFilmsBetween(chooseGenre , MinimumLength , MaximumLength);
		modelHolder.put("films", films);

		return "filmList";
	}
	@RequestMapping("/film")
	public String showSearchActorForm() { // lazm t76ha bs mara wa7de bel home baje lanha rl root
	    return "filmList";
	}

}