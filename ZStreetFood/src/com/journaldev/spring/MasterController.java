package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.hb.model.City;
import com.journaldev.spring.hb.model.District;
import com.journaldev.spring.hb.model.Region;
import com.journaldev.spring.hb.model.State;
import com.journaldev.spring.service.MasterService;

@Controller
public class MasterController {
	
	private MasterService masterService;
	/**
	 * @param masterService the masterService to set
	 */
	@Autowired(required=true)
	@Qualifier(value="masterService")
	public void setMasterService(MasterService masterService) {
		this.masterService = masterService;
	}
	
	
	//State -----------------------------------------------------------------------------------
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public String listStates(Model model) {
		model.addAttribute("state", new State());
		model.addAttribute("listStates", this.masterService.listStates());
		return "state";
	}
	
	//For add and update state both
	@RequestMapping(value= "/state/add", method = RequestMethod.POST)
	public String addState(@ModelAttribute("state") State p){
		if(p.getId() == 0){
			//new person, add it
			this.masterService.addState(p);
		}else{
			//existing person, call update
			this.masterService.updateState(p);
		}
		return "redirect:/states";
	}
	
	@RequestMapping("/state/remove/{id}")
    public String removeState(@PathVariable("id") int id){
		
        this.masterService.removeState(id);
        return "redirect:/states";
    }
 
    @RequestMapping("state/edit/{id}")
    public String editState(@PathVariable("id") int id, Model model){
        model.addAttribute("state", this.masterService.getStateById(id));
        model.addAttribute("listStates", this.masterService.listStates());
        return "state";
    }
    
    
  //District -----------------------------------------------------------------------------------
  	@RequestMapping(value = "/districts", method = RequestMethod.GET)
  	public String listDistricts(Model model) {
  		model.addAttribute("district", new District());
  		model.addAttribute("listDistricts", this.masterService.listDistricts());
  		return "district";
  	}
  	
  	//For add and update district both
  	@RequestMapping(value= "/district/add", method = RequestMethod.POST)
  	public String addDistrict(@ModelAttribute("district") District p){
  		if(p.getId() == 0){
  			//new person, add it
  			this.masterService.addDistrict(p);
  		}else{
  			//existing person, call update
  			this.masterService.updateDistrict(p);
  		}
  		return "redirect:/districts";
  	}
  	
  	@RequestMapping("/district/remove/{id}")
      public String removeDistrict(@PathVariable("id") int id){
  		
          this.masterService.removeDistrict(id);
          return "redirect:/districts";
      }
   
      @RequestMapping("district/edit/{id}")
      public String editDistrict(@PathVariable("id") int id, Model model){
          model.addAttribute("district", this.masterService.getDistrictById(id));
          model.addAttribute("listDistricts", this.masterService.listDistricts());
          return "district";
      }
      
      
      
    //City -----------------------------------------------------------------------------------
    	@RequestMapping(value = "/citys", method = RequestMethod.GET)
    	public String listCitys(Model model) {
    		model.addAttribute("city", new City());
    		model.addAttribute("listCitys", this.masterService.listCitys());
    		return "city";
    	}
    	
    	//For add and update city both
    	@RequestMapping(value= "/city/add", method = RequestMethod.POST)
    	public String addCity(@ModelAttribute("city") City p){
    		if(p.getId() == 0){
    			//new person, add it
    			this.masterService.addCity(p);
    		}else{
    			//existing person, call update
    			this.masterService.updateCity(p);
    		}
    		return "redirect:/citys";
    	}
    	
    	@RequestMapping("/city/remove/{id}")
        public String removeCity(@PathVariable("id") int id){
    		
            this.masterService.removeCity(id);
            return "redirect:/citys";
        }
     
        @RequestMapping("city/edit/{id}")
        public String editCity(@PathVariable("id") int id, Model model){
            model.addAttribute("city", this.masterService.getCityById(id));
            model.addAttribute("listCitys", this.masterService.listCitys());
            return "city";
        }
        
        
      //Region -----------------------------------------------------------------------------------
      	@RequestMapping(value = "/regions", method = RequestMethod.GET)
      	public String listRegions(Model model) {
      		model.addAttribute("region", new Region());
      		model.addAttribute("listRegions", this.masterService.listRegions());
      		return "region";
      	}
      	
      	//For add and update region both
      	@RequestMapping(value= "/region/add", method = RequestMethod.POST)
      	public String addRegion(@ModelAttribute("region") Region p){
      		if(p.getId() == 0){
      			//new person, add it
      			this.masterService.addRegion(p);
      		}else{
      			//existing person, call update
      			this.masterService.updateRegion(p);
      		}
      		return "redirect:/regions";
      	}
      	
      	@RequestMapping("/region/remove/{id}")
          public String removeRegion(@PathVariable("id") int id){
      		
              this.masterService.removeRegion(id);
              return "redirect:/regions";
          }
       
          @RequestMapping("region/edit/{id}")
          public String editRegion(@PathVariable("id") int id, Model model){
              model.addAttribute("region", this.masterService.getRegionById(id));
              model.addAttribute("listRegions", this.masterService.listRegions());
              return "region";
          }
}
