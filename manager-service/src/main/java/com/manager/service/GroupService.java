package com.manager.service;

import java.util.List;

import com.manager.entity.Customer;
import com.manager.entity.Groups;
import com.manager.entity.GroupsExample;
import com.manager.inner.base.service.BaseService;

public interface GroupService extends BaseService<GroupsExample,Groups>{
	public List<Groups> getGroupList(Groups group);
	
	public List<Customer> getCustomerByGroupId(Groups group);
}