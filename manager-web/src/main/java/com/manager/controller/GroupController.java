/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.Groups;
import com.manager.entity.GroupsExample;
import com.manager.service.GroupService;

@Controller
@RequestMapping(value ="/m/group")
public class GroupController extends BaseController<GroupService,GroupsExample,Groups>{

	@Autowired
	private GroupService groupService;

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
	
	@Override
	public GroupsExample getExample(Groups record){
		return record.getExample();
	}
}
