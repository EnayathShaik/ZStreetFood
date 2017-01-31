package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.journaldev.spring.hb.model.Trainee;
import com.journaldev.spring.service.MasterService;
import com.journaldev.spring.service.TraineeService;

@Controller
@RequestMapping("/trainee")
public class TraineeController {
	private TraineeService traineeService;
	private MasterService masterService;
	
	
	@Autowired(required=true)
	@Qualifier(value="masterService")
	public void setMasterService(MasterService masterService) {
		this.masterService = masterService;
	}

	@Autowired(required=true)
	@Qualifier(value="traineeService")
	public void setTraineeService(TraineeService traineeService) {
		this.traineeService = traineeService;
	}
	
	//Trainee -----------------------------------------------------------------------------------
			@RequestMapping(value = "/trainees", method = RequestMethod.GET)
			public String listTrainees(Model model) {
				model.addAttribute("trainee", new Trainee());
				model.addAttribute("listTrainees", this.traineeService.listTrainees());
				
				
				return "registerTrainee";
			}
			
			//For add and update Trainee both
			@RequestMapping(value= "/trainee/add", method = RequestMethod.POST)
			public String addTrainee(@ModelAttribute("trainee") Trainee p){
				System.out.println("Add Trainee");
				if(p.getId() == 0){
					//new person, add it
					this.traineeService.addTrainee(p);
				}else{
					//existing person, call update
					this.traineeService.updateTrainee(p);
				}
				return "redirect:/trainee/trainees";
			}
			
			@RequestMapping("/trainee/remove/{id}")
		    public String removeTrainee(@PathVariable("id") int id){
				
		        this.traineeService.removeTrainee(id);
		        return "redirect:/trainee/trainees";
		    }
		 
		    @RequestMapping("trainee/edit/{id}")
		    public String editTrainee(@PathVariable("id") int id, Model model){
		        model.addAttribute("trainee", this.traineeService.getTraineeById(id));
		        model.addAttribute("listTrainees", this.traineeService.listTrainees());
		        return "registerTrainee";
		    }
	
}
