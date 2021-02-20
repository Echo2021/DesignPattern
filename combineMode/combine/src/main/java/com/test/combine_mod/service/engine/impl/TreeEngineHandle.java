package com.test.combine_mod.service.engine.impl;

import java.util.Map;

import com.test.combine_mod.model.aggregates.TreeRich;
import com.test.combine_mod.model.vo.EngineResult;
import com.test.combine_mod.model.vo.TreeNode;
import com.test.combine_mod.service.engine.EngineBase;

public class TreeEngineHandle extends EngineBase {

	@Override
	public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
		
		//决策流程
		TreeNode treeNode = engineDecisionMaker(treeRich,treeId,userId,decisionMatter);
		
		
		//决策结果
		return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
	}

}
