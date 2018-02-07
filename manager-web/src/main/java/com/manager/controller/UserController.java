/**
 * @author kexiaohong
 * @version 1.0 2017年12月16日
 *
 */
package com.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manager.entity.Customer;
import com.manager.entity.CustomerExample;
import com.manager.entity.User;
import com.manager.entity.UserExample;
import com.manager.inner.dto.AjaxResult;
import com.manager.inner.dto.Page;
import com.manager.inner.tree.entity.TreeNode;
import com.manager.inner.tree.util.TreeUtil;
import com.manager.service.CustomerService;
import com.manager.service.UserService;
import com.manager.utils.StringUtil;

@Controller
@RequestMapping(value = "/m/user")
public class UserController extends BaseController<UserService,UserExample,User>{

	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "index.do")
	public String index(){
		return "user/index";
	}
	
	@RequestMapping(value = "/getCustomerByUserId.do")
	@ResponseBody
	public List<Customer> getCustomerByUserId(User user){
		return userService.getCustomerByUserId(user);
	}
	
	@RequestMapping(value = "/getUserList.do")
	@ResponseBody
	public List<User> getUserList(User user){
		User _user = userService.selectByPrimaryKey(user.getUuid());
		return userService.getUser(_user);
	}
	
	@RequestMapping(value = "/getUserPage.do")
	@ResponseBody
	public Page<User> getUserPage(User user,Page<User> page){
		return userService.getUserPage(user, page);
	}
	
	@RequestMapping(value = "/getUserPageWithCustomer.do")
	@ResponseBody
	public Page<User> getUserPageWithCustomer(User user,Page<User> page){
		return userService.getUserPageWithCustomer(user, page);
	}
	
	@RequestMapping(value = "/changePassword.do")
	@ResponseBody
	public AjaxResult<String> changePassword(@RequestBody User user){
		AjaxResult<String> ajax = new AjaxResult<String>();
		if(StringUtil.isNull(user.getPassword()) || StringUtil.isNull(user.getPassword2()) || StringUtil.isNull(user.getPassword3())){
			ajax.setStatus("500");
			ajax.setMessage("请填写密码");
			return ajax;
		}
		if(!user.getPassword2().equals(user.getPassword3())){
			ajax.setStatus("500");
			ajax.setMessage("两次密码不一样");
			return ajax;
		}
		User _user = userService.selectByPrimaryKey(user.getUuid());
		if(!_user.getPassword().equals(user.getPassword())){
			ajax.setStatus("500");
			ajax.setMessage("密码错误");
			return ajax;
		}
		user.setPassword(user.getPassword2());
		userService.updateByPrimaryKeySelective(user);
		ajax.setStatus("200");
		ajax.setMessage("修改成功");
		return ajax;
	}
	
	@RequestMapping(value = "/getUserTree.do")
	@ResponseBody
	public List<TreeNode> getUserTree(User user) throws Exception{
		List<User> users = userService.getUser(user);
		if(null == users || users.isEmpty()){
			return new ArrayList<TreeNode>();
		}
		TreeNode temp = new TreeNode();
		temp.setId("uuid");
		temp.setFdName("userName");
		temp.setFdParentId("parentUserId");
		List<TreeNode> tree = TreeUtil.coverToTreeNode(users, temp);
		List<String> userIds = new ArrayList<String>();
		for(User _user: users){
			userIds.add(_user.getUuid());
		}
		CustomerExample example = new CustomerExample();
		example.createCriteria().andUserIdIn(userIds);
		List<Customer> customers = customerService.selectByExample(example);
		if(null != customers && !customers.isEmpty()){
			TreeNode _temp = new TreeNode();
			_temp.setId("uuid");
			_temp.setFdName("cusName");
			_temp.setFdParentId("userId");
			tree.addAll(TreeUtil.coverToTreeNode(customers, _temp));
		}
		TreeNode _temps = new TreeNode();
		_temps.setId("id");
		_temps.setFdName("fdName");
		_temps.setFdParentId("fdParentId");
		return TreeUtil.coverToTreeData(tree, _temps);
	}
	
	@Override
	public UserExample getExample(User user){
		return user.getExample();
	}
}
