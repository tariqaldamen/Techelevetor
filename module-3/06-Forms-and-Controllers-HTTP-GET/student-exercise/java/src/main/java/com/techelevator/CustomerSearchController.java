package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    
	@RequestMapping("/customerList")
	public String showCustomer(
			@RequestParam String Search,String Sort,
			ModelMap modelHolder) {
		List<Customer> customer = customerDao.searchAndSortCustomers(Search , Sort);
		modelHolder.put("customer", customer);

		return "customerList";
	}
	@RequestMapping("/customer")
	public String showSearchActorForm() { // lazm t76ha bs mara wa7de bel home baje l2nha el root
	    return "customerList";
	}

}