package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.SlabMaster;
import com.mindgate.main.service.SlabMasterServiceInterface;

@RestController
@RequestMapping("/slabMaster")
public class SlabMasterController
{
	@Autowired
	private SlabMasterServiceInterface slabMasterService;
	
	@RequestMapping(value="slab" ,method=RequestMethod.POST)
    public @ResponseBody boolean addSlabMasterDetails(@RequestBody SlabMaster slabMaster)
    {
    	return slabMasterService.addSlabMasterDetails(slabMaster);
    }
    
	@RequestMapping(value="slab" , method=RequestMethod.PUT)
    public@ResponseBody boolean updateSlabMasterDetails(@RequestBody SlabMaster slabMaster)
    {
        return slabMasterService.updateSlabMasterDetails(slabMaster);	
    }
    @RequestMapping(value="slab/{id}" , method=RequestMethod.DELETE)
    public @ResponseBody boolean deleteSlabBySlabId(@PathVariable("id") int slabId)
    {
    	return slabMasterService.deleteSlabBySlabId(slabId);
    }
    
    @RequestMapping(value="slab/{id}" , method=RequestMethod.GET)
    public  SlabMaster getSlabBySlabId(@PathVariable("id") int slabId)
    {
    	return slabMasterService.getSlabBySlabId(slabId);
    }
    
    @RequestMapping(value="slab" , method=RequestMethod.GET)
    public List<SlabMaster> getAllSlabs()
    {
    	return slabMasterService.getAllSlabs();
    }
}
