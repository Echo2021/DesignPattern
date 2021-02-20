package com.test.combine_mod.service.engine;

import java.util.Map;

import com.test.combine_mod.model.aggregates.TreeRich;
import com.test.combine_mod.model.vo.EngineResult;

public interface IEngine {

	EngineResult process(final Long treeId,final String userId,TreeRich treeRich,final Map<String,String> decisionMatter);
}
