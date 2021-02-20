package com.test.combine_mod.model.aggregates;

import java.util.Map;

import com.test.combine_mod.model.vo.TreeNode;
import com.test.combine_mod.model.vo.TreeRoot;

public class TreeRich {

	private TreeRoot treeRoot;
	
	private Map<Long,TreeNode> treeNodeMap;
	
	 public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
	 
	 public TreeRoot getTreeRoot() {
	        return treeRoot;
	    }

	    public void setTreeRoot(TreeRoot treeRoot) {
	        this.treeRoot = treeRoot;
	    }

	    public Map<Long, TreeNode> getTreeNodeMap() {
	        return treeNodeMap;
	    }

	    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
	        this.treeNodeMap = treeNodeMap;
	    }
}
