package com.test.combine_mod.service.logic.impl;

import java.util.Map;

import com.test.combine_mod.service.logic.BaseLogic;

public class UserGenderFilter extends BaseLogic {

	@Override
	public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
		
		return decisionMatter.get("gender");
	}
}
