/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.entity.Groups;
import com.manager.entity.GroupsExample;
import com.manager.inner.tree.entity.TreeNode;
import com.manager.inner.tree.util.TreeUtil;
import com.manager.service.CustomerService;
import com.manager.service.GroupService;

@Controller
@RequestMapping(value ="/m/group")
public class GroupController extends BaseController<GroupService,GroupsExample,Groups>{

	@Autowired
	private GroupService groupService;

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/getGroupList.do")
	@ResponseBody
	public List<Groups> getGroupList(Groups group){
		return groupService.getGroupList(group);
	}
	
	@RequestMapping(value = "/getCustomerByGroupId.do")
	@ResponseBody
	public List<Customer> getCustomerByGroupId(Groups group){
		return groupService.getCustomerByGroupId(group);
	}
	

	@RequestMapping(value = "/getGroupTree.do")
	@ResponseBody
	public List<TreeNode> getGroupTree(Groups group) throws Exception{
		List<Groups> groups = groupService.selectByExample(group.getExample());
		if(null == groups || groups.isEmpty()){
			return new ArrayList<TreeNode>();
		}
		TreeNode temp = new TreeNode();
		temp.setId("uuid");
		temp.setFdName("groupName");
		temp.setFdParentId("parentGroupId");
		List<TreeNode> tree = TreeUtil.coverToTreeNode(groups, temp);
		List<String> groupIds = new ArrayList<String>();
		for(Groups _group: groups){
			groupIds.add(_group.getUuid());
		}
		CustomerExample example = new CustomerExample();
		example.createCriteria().andGroupIdIn(groupIds);
		List<Customer> customers = customerService.selectByExample(example);
		if(null != customers && !customers.isEmpty()){
			TreeNode _temp = new TreeNode();
			_temp.setId("uuid");
			_temp.setFdName("cusName");
			_temp.setFdParentId("groupId");
			tree.addAll(TreeUtil.coverToTreeNode(customers, _temp));
		}
		TreeNode _temps = new TreeNode();
		_temps.setId("id");
		_temps.setFdName("fdName");
		_temps.setFdParentId("fdParentId");
		return TreeUtil.coverToTreeData(tree, _temps);
	}
	
	@Override
	public GroupsExample getExample(Groups record){
		return record.getExample();
	}
}
