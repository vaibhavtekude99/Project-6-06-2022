package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.SlabMaster;

public interface SlabMasterServiceInterface {
	
    public boolean addSlabMasterDetails(SlabMaster slabMaster);
    
    public boolean updateSlabMasterDetails(SlabMaster slabMaster);
    
    public boolean deleteSlabBySlabId(int slabId);
    
    public SlabMaster getSlabBySlabId(int slabId);
    
    public List<SlabMaster> getAllSlabs();

}
