package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.JDBCActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;



	@RequestMapping("/actorList")
	public String showActorsSer(
			@RequestParam String Actors,
			ModelMap modelHolder) {
		List<Actor> actors = actorDao.getMatchingActors(Actors);
		modelHolder.put("actors", actors);

		return "actorList";
	}
	
	@RequestMapping("/")
	public String showSearchActorForm() { // lazm t76ha bs mara wa7de bel home baje lanha rl root
	    return "actorList";
	}

//	/* What about here? */
//	@RequestMapping("/actorListResults")
//	public String searchActors(HttpServletRequest request) {
//	/* What arguments go here to get parameters from the page? ////////////// bzb6 3la hai aw ele fogeha//beraje3 mn database ///////////////
//	    Call the model and pass values to the jsp */
//	    String actorsLastName = request.getParameter("Actors");
//	    List<Actor> actors = actorDao.getMatchingActors(actorsLastName);
//
//	    request.setAttribute("actors", actors);
//	    return "actorListResult";
//	}



		
	/* What about here? */
	public String searchActors(/* What arguments go here to get parameters from the page? */) {
		/* Call the model and pass values to the jsp */
		return null;
	}
}
