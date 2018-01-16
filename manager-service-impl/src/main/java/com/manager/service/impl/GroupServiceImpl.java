/**
 * @author kexiaohong
 * @version 1.0 2017年12月18日
 *
 */
package com.manager.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Customer;
import com.manager.entity.Groups;
import com.manager.entity.GroupsExample;
import com.manager.inner.base.serviceimpl.BaseServiceImpl;
import com.manager.mapper.CustomerMapper;
import com.manager.mapper.GroupsMapper;
import com.manager.service.GroupService;

@Service
public class GroupServiceImpl extends BaseServiceImpl<GroupsExample, Groups, GroupsMapper> implements GroupService {

	@Autowired
	private GroupsMapper groupMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Groups> getGroupList(Groups group) {
		GroupsExample example = group.getExample();
		List<Groups> groups = groupMapper.selectByExample(example);
		if(null == groups || groups.size() == 0){
			return new ArrayList<Groups>();
		}
		Map<String,Groups> map = new HashMap<String,Groups>();
		for(Groups g: groups){
			map.put(g.getUuid(), g);
		}
		List<Customer> gcs = customerMapper.getCustomerList(new Customer()); 
		if(null != gcs && gcs.size() > 0){
			for(Customer customer: gcs){
				String id = customer.getGroupId();
				if(map.containsKey(id)){
					map.get(id).addCustomer(customer);
				}
			}
		}
		return groups;
	}

	@Override
	public List<Customer> getCustomerByGroupId(Groups group) {
		GroupsExample example = group.getExample();
		List<Groups> groups = groupMapper.selectByExample(example);
		if(null == groups || groups.size() == 0){
			return new ArrayList<Customer>();
		}
		Map<String,Groups> map = new HashMap<String,Groups>();
		for(Groups g: groups){
			map.put(g.getUuid(), g);
		}
		List<Customer> customers = new ArrayList<Customer>();
		List<Customer> gcs = customerMapper.getCustomerList(new Customer()); 
		if(null != gcs && gcs.size() > 0){
			for(Customer customer: gcs){
				String id = customer.getGroupId();
				if(map.containsKey(id)){
					customers.add(customer);
				}
			}
		}
		return customers;
	}

}
