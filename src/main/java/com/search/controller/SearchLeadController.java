package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.LeadDto;

@Controller
public class SearchLeadController {
	@Autowired
	private LeadRestController restController;
	
	@RequestMapping("/search")
	public String viewSearchLeadForm()
	{
		return "search_lead";
	}
	@RequestMapping("/findLeadbyId")
	public String findById(@RequestParam("id")long id,Model model)
	{
		LeadDto leadDto = restController.getLeadById(id);
		model.addAttribute("leadDto", leadDto);
		return"lead_info";
	}

}
