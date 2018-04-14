## 字段设置
- 用户模块
```json
{
	"uuid": "id",
	"userName" :  "用户名",
	"password": "(密码)",
	"userSingal": "(签名)",
	"userBirthday": "(生日)",
	"userPhone": "(联系方式)",
	"userStatus": "(状态working/worked)",
	"userAddress": "(地址)",
	"userRank": "(职级1-13)",
	"parentUserId" : "(上级)"
}
```

- 客户模块
```json
{
	"uuid":"(id)",
	"cusName":"(客户名称)",
	"cusBirthday":"(生日)",
	"cusPhone":"(联系方式)",
	"cusStatus":"(状态disabled/enabled/pending)",
	"cusAddress":"(地址)",
	"userId":"(用户ID)",
	"groupId":"(分组ID)"
}
```

- 分组模块
```json
{
	"uuid": "(ID)",
	"groupName": "(分组名称)",
    	"groupCode": "(分组编号)",
    	"parentGroupId": "(上级分组)"
}
```

- 计划/日志模块
```json
{
	"uuid": "(ID)",
	"title": "(标题)",
	"createTime": "(创建时间)",
	"userId": "(用户ID)",
	"type": "(类型log/plan)",
	"content": "(内容)"
}
```

- 库存管理模块
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```

- 销售报销管理模块
```json
{
	"uuid": "(ID)",
	"userName": "(报销人)",
	"expanseTime": "(报销时间)",
	"expanseReason": "(报销原因)",
	"expanseMoney": "(报销金额)",
	"bankAccount": "(银行账户)",
	"docStatus": "(状态)"
}
```

- 员工离职模块
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```

- 销售业绩管理
```json
{
    "uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```

- 销售登记管理
```json
{
    "uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
    "itemName": "成交类型",
    "itemNum": "成交数量",
    "itemPrice": "成交金额",
    "itemTime": "(成交时间)",
    "itemType": "0",
    "remark": "审批意见"
}
```

## 登录
- PATH： /manager-web/doLogin.do
- 方法： POST
- 说明：登录
- 请求内容：
```json
{
	"userName": "",
	"password": ""
}
```
- 返回值:
```json
{
	"status": "200",
	"message": "登录成功"
}
```


## 登出
- PATH: /manager-web/logout.do
- 方法: GET/POST
- 说明: 登出，注销session
- 请求内容：
```text
无
```
- 返回值:  /login.do（页面）


## 注册
- PATH: /manager-web/register.do
- 方法: POST
- 说明: 注册
- 请求内容：
```json
{
	"userName": "",
	"password": "",
	"password2": ""
}
```
- 返回值:
```json
{
	"status": "200",
	"message": "登录成功"
}
```

# 用户模块

## 修改密码
- PATH: /manager-web/m/user/changePassword.do
- 方法: POST
- 说明: 修改密码
- 请求内容:
```json
{
	"uuid": "",
	"password": "",
	"password2": "",
	"password3": "",
}
```

- 返回值
```json
{
	"status": "200",
	"message": "成功"
}
```

## 选择用户
- PATH: /manager-web/m/user/selectOne.do
- 方法: GET/POST
- 说明: 通过某几个字段获取用户，没有当前用户返回null
- 请求内容:
```json
{
	"uuid": "(可选)",
	"userName" :  "(可选)",
	"password": "(可选)",
	"userSingal": "(可选)",
	"userBirthday": "(可选)",
	"userPhone": "(可选)",
	"userStatus" : "(可选)",
	"userStatus": "(可选)",
	"userAddress": "(可选)",
	"userRank": "(可选)",
	"parentUserId" : "(可选)"
}
```
- 返回值: 
```json
{
	"uuid": "",
	"userName" :  "",
	"password": "",
	"userSingal": "",
	"userBirthday": "",
	"userPhone": "",
	"userStatus" : "",
	"userStatus": "",
	"userAddress": "",
	"userRank": "",
	"parentUserId" : ""
}
```

## 动态更新用户
- PATH:  /manager-web/m/user/updateSelective.do
- 方法: POST
- 说明: 通过UUID获取用户，动态更新，字段为null则不更新
- 请求内容:
```json
{
	"uuid": "(必填)",
	"userName" :  "(可选)",
	"password": "(可选)",
	"userSingal": "(可选)",
	"userBirthday": "(可选)",
	"userPhone": "(可选)",
	"userStatus" : "(可选)",
	"userStatus": "(可选)",
	"userAddress": "(可选)",
	"userRank": "(可选)",
	"parentUserId" : "(可选)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
		"uuid": "",
		"userName" :  "",
		"password": "",
		"userSingal": "",
		"userBirthday": "",
		"userPhone": "",
		"userStatus" : "",
		"userStatus": "",
		"userAddress": "",
		"userRank": "",
		"parentUserId" : ""
	}
}
```
## 强制更新用户
- PATH:  /manager-web/m/user/update.do
- 方法: POST
- 说明: 通过UUID获取用户，强制更新，字段为null也更新为NULL
- 请求内容:
```json
{
	"uuid": "(必填)",
	"userName" :  "(可选)",
	"password": "(可选)",
	"userSingal": "(可选)",
	"userBirthday": "(可选)",
	"userPhone": "(可选)",
	"userStatus" : "(可选)",
	"userStatus": "(可选)",
	"userAddress": "(可选)",
	"userRank":"(可选)",
	"parentUserId" : "(可选)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
		"uuid": "",
		"userName" :  "",
		"password": "",
		"userSingal": "",
		"userBirthday": "",
		"userPhone": "",
		"userStatus" : "",
		"userStatus": "",
		"userAddress": "",
		"userRank": "",
		"parentUserId" : ""
	}
}
```


## 动态插入用户
- PATH:  /manager-web/m/user/insertSelective.do
- 方法: POST
- 说明: 动态插入，字段为null则不添加数据
- 请求内容:
```json
{
	"userName" :  "(可选)",
	"password": "(可选)",
	"userSingal": "(可选)",
	"userBirthday": "(可选)",
	"userPhone": "(可选)",
	"userStatus" : "(可选)",
	"userStatus": "(可选)",
	"userAddress": "(可选)",
	"userRank": "(可选)",
	"parentUserId" : "(可选)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "",
		"userName" :  "",
		"password": "",
		"userSingal": "",
		"userBirthday": "",
		"userPhone": "",
		"userStatus" : "",
		"userStatus": "",
		"userAddress": "",
		"userRank": "",
		"parentUserId" : ""
	}
}
```
## 强制插入用户
- PATH:  /manager-web/m/user/insert.do
- 方法: POST
- 说明: 强制插入，字段为null插入为null字符串或者""
- 请求内容:
```json
{
	"userName" :  "(可选)",
	"password": "(可选)",
	"userSingal": "(可选)",
	"userBirthday": "(可选)",
	"userPhone": "(可选)",
	"userStatus" : "(可选)",
	"userStatus": "(可选)",
	"userAddress": "(可选)",
	"userRank": "(可选)",
	"parentUserId" : "(可选)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "",
		"userName" :  "",
		"password": "",
		"userSingal": "",
		"userBirthday": "",
		"userPhone": "",
		"userStatus" : "",
		"userStatus": "",
		"userAddress": "",
		"userRank": "",
		"parentUserId" : ""
	}
}
```

## 删除用户
- PATH:  /manager-web/m/user/delete.do
- 方法: POST
- 说明: 删除用户
- 请求内容:
```json
{
	"uuid": ""
}
```
- 返回值
```json
{
	"status": "200",
	"message": "删除成功"
}
```

## 获取用户下的客户
- PATH: /manager-web/m/user/getCustomerByUserId.do
- 方法: GET/POST
- 说明: 根据用户信息获取用户所属的客户
- 请求内容:
```json
	"uuid": "",
	"userName" :  "",
	"password": "",
	"userSingal": "",
	"userBirthday": "",
	"userPhone": "",
	"userStatus" : "",
	"userStatus": "",
	"userAddress": "",
	"userRank": "",
	"parentUserId" : ""
```
- 返回值:
```json
[
	{
		"uuid":"",
		"cusName":"",
		"cusBirthday":"",
		"cusPhone":"",
		"cusStatus":"",
		"cusAddress":"",
		"userId":"",
		"groupId":""
	},{
		"uuid":"",
		"cusName":"",
		"cusBirthday":"",
		"cusPhone":"",
		"cusStatus":"",
		"cusAddress":"",
		"userId":"",
		"groupId":""
	},
]
```

## 获取用户列表(带客户)
- PATH: /manager-web/m/user/getUserList.do
- 方法: GET/POST
- 说明: 根据条件获取用户列表及其客户
- 请求内容:
```json
	"uuid": "",
	"userName" :  "",
	"password": "",
	"userSingal": "",
	"userBirthday": "",
	"userPhone": "",
	"userStatus" : "",
	"userStatus": "",
	"userAddress": "",
	"userRank": "",
	"parentUserId" : ""
```
- 返回值:
```json
[
    {
        "uuid": "",
        "userName": "",
        "password": "",
        "userSingal": "",
        "userBirthday": "",
        "userPhone": "",
        "userStatus": "",
        "userAddress": "",
        "userRank": "",
        "parentUserId": "",
        "cus": [
            {
                "uuid": "",
                "name": "",
                "cusName": "",
                "cusBirthday": "",
                "cusPhone": "",
                "cusStatus": "",
                "cusAddress": "",
                "userId": "",
                "groupId": ""
            },
            {
                "uuid": "",
                "name": "",
                "cusName": "",
                "cusBirthday": "",
                "cusPhone": "",
                "cusStatus": "",
                "cusAddress": "",
                "userId": "",
                "groupId": ""
            }
        ]
    }
]
```

## 获取用户分页信息(不带客户)
- PATH: /manager-web/m/user/getUserPage.do
- 方法: GET/POST
- 说明: 根据条件获取用户列表及其客户
- 请求内容:
```json
	"page":"",
	"pageSize":"",
	"uuid": "",
	"userName" :  "",
	"password": "",
	"userSingal": "",
	"userBirthday": "",
	"userPhone": "",
	"userStatus" : "",
	"userStatus": "",
	"userAddress": "",
	"userRank": "",
	"parentUserId" : ""
```
- 返回值:
```json
{
    "page": "",
    "pageNum": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": "",
    "pageResultCount": "",
    "list": [
        {
            "uuid": "",
            "userName": "",
            "password": "",
            "userSingal": "",
            "userBirthday": "",
            "userPhone": "",
            "userStatus": "",
            "userAddress": "",
            "userRank": "",
            "parentUserId": ""
        },
        {
            "uuid": "",
            "userName": "",
            "password": "",
            "userSingal": "",
            "userBirthday": "",
            "userPhone": "",
            "userStatus": "",
            "userAddress": "",
            "userRank": "",
            "parentUserId": ""
        }
    ]
}
```


## 获取用户分页(带客户)
- PATH: /manager-web/m/user/getUserPageWithCustomer.do
- 方法: GET/POST
- 说明: 根据条件获取用户列表及其客户
- 请求内容:
```json
	"page":"",
	"pageSize":"",
	"uuid": "",
	"userName" :  "",
	"password": "",
	"userSingal": "",
	"userBirthday": "",
	"userPhone": "",
	"userStatus" : "",
	"userStatus": "",
	"userAddress": "",
	"userRank": "",
	"parentUserId" : ""
```
- 返回值:
```json
{
    "page": "",
    "pageNum": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": "",
    "pageResultCount": "",
    "list": [
        {
            "uuid": "",
            "userName": "",
            "password": "",
            "userSingal": "",
            "userBirthday": "",
            "userPhone": "",
            "userStatus": "",
            "userAddress": "",
            "userRank": "",
            "parentUserId": "",
            "cus": [
                {
                    "uuid": "",
                    "name": "",
                    "cusName": "",
                    "cusBirthday": "",
                    "cusPhone": "",
                    "cusStatus": "",
                    "cusAddress": "",
                    "userId": "",
                    "groupId": ""
                },
                {
                    "uuid": "",
                    "name": "",
                    "cusName": "",
                    "cusBirthday": "",
                    "cusPhone": "",
                    "cusStatus": "",
                    "cusAddress": "",
                    "userId": "",
                    "groupId": ""
                }
            ]
        }
    ]
}
```

# 分组模块

## 新建分组(动态)
- PATH: /manager-web/m/group/insertSelective.do
- 方法: POST
- 说明: 动态插入分组
- 请求内容
```json
{
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "",
	    "groupName": "",
	    "groupCode": "",
	    "parentGroupId": ""
	}
}
```

## 新建分组(非动态)
- PATH: /manager-web/m/group/insert.do
- 方法: POST
- 说明: 插入分组
- 请求内容
```json
{
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "",
	    "groupName": "",
	    "groupCode": "",
	    "parentGroupId": ""
	}
}
```

## 获取单个分组
- PATH: /manager-web/m/group/selectOne.do
- 方法: POST
- 说明: 插入分组
- 请求内容
```json
{
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"uuid": "",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```


## 动态更新分组
- PATH: /manager-web/m/group/updateSelective.do
- 方法: POST
- 说明: 插入分组
- 请求内容
```json
{
	"uuid": "(必须)",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
		"uuid": "",
	    "groupName": "",
	    "groupCode": "",
	    "parentGroupId": ""
	}
}
```

## 强制更新分组
- PATH: /manager-web/m/group/update.do
- 方法: POST
- 说明: 插入分组
- 请求内容
```json
{
	"uuid": "(必须)",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
		"uuid": "",
	    "groupName": "",
	    "groupCode": "",
	    "parentGroupId": ""
	}
}
```


## 删除分组
- PATH: /manager-web/m/group/delete.do
- 方法: POST
- 说明: 插入分组
- 请求内容
```json
{
	"uuid": "(必须)",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
}
```


## 获取分组列表(带客户)
- PATH: /manager-web/m/group/getGroupList.do
- 方法: POST
- 说明: 获取分组
- 请求内容
```json
{
	"uuid": "",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
[
    {
        "uuid": "",
        "groupName": "",
        "groupCode": "",
        "parentGroupId": "",
        "cus": [
            {
                "uuid": "",
                "cusName": "",
                "cusBirthday": "",
                "cusPhone": "",
                "cusStatus": "",
                "cusAddress": "",
                "userId": "",
                "groupId": ""
            }
        ]
    }
]
```

## 根据ID获取分组(带客户)
- PATH: /manager-web/m/group/getCustomerByGroupId.do
- 方法: POST
- 说明: 获取分组
- 请求内容
```json
{
	"uuid": "",
    "groupName": "",
    "groupCode": "",
    "parentGroupId": ""
}
```
- 返回值: 
```json
[
    {
        "uuid": "",
        "groupName": "",
        "groupCode": "",
        "parentGroupId": "",
        "cus": [
            {
                "uuid": "",
                "cusName": "",
                "cusBirthday": "",
                "cusPhone": "",
                "cusStatus": "",
                "cusAddress": "",
                "userId": "",
                "groupId": ""
            }
        ]
    },{
        "uuid": "",
        "groupName": "",
        "groupCode": "",
        "parentGroupId": "",
        "cus": [
            {
                "uuid": "",
                "cusName": "",
                "cusBirthday": "",
                "cusPhone": "",
                "cusStatus": "",
                "cusAddress": "",
                "userId": "",
                "groupId": ""
            }
        ]
    }
]
```

# 客户模块

## 新建客户(动态)
- PATH: /manager-web/m/customer/insertSelective.do
- 方法: POST
- 说明: 动态插入客户
- 请求内容
```json
{
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
   		"uuid": "",
	    "cusName": "",
	    "cusBirthday": "",
	    "cusPhone": "",
	    "cusStatus": "",
	    "cusAddress": "",
	    "userId": "",
	    "groupId": ""
	}
}
```

## 新建客户(非动态)
- PATH: /manager-web/m/customer/insert.do
- 方法: POST
- 说明: 插入客户
- 请求内容
```json
{
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
   		"uuid": "",
	    "cusName": "",
	    "cusBirthday": "",
	    "cusPhone": "",
	    "cusStatus": "",
	    "cusAddress": "",
	    "userId": "",
	    "groupId": ""
	}
}
```


## 获取单个用户(动态)
- PATH: /manager-web/m/customer/selectOne.do
- 方法: POST
- 说明: 插入客户
- 请求内容
```json
{
	"uuid": "",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"uuid": "",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```

## 更新客户信息(动态)
- PATH: /manager-web/m/customer/updateSelective.do
- 方法: POST
- 说明: 插入客户
- 请求内容
```json
{
	"uuid": "必须",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
   		"uuid": "",
	    "cusName": "",
	    "cusBirthday": "",
	    "cusPhone": "",
	    "cusStatus": "",
	    "cusAddress": "",
	    "userId": "",
	    "groupId": ""
	}
}
```

## 更新客户信息(动态)
- PATH: /manager-web/m/customer/update.do
- 方法: POST
- 说明: 插入客户
- 请求内容
```json
{
	"uuid": "必须",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
   		"uuid": "",
	    "cusName": "",
	    "cusBirthday": "",
	    "cusPhone": "",
	    "cusStatus": "",
	    "cusAddress": "",
	    "userId": "",
	    "groupId": ""
	}
}
```

## 删除信息
- PATH: /manager-web/m/customer/delete.do
- 方法: POST
- 说明: 插入客户
- 请求内容
```json
{
	"uuid": "必须",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "更新成功",
	"object" : {
   		"uuid": "",
	    "cusName": "",
	    "cusBirthday": "",
	    "cusPhone": "",
	    "cusStatus": "",
	    "cusAddress": "",
	    "userId": "",
	    "groupId": ""
	}
}
```

## 获取客户分页信息
- PATH: /manager-web/m/customer/getCustomerPage.do
- 方法: GET/POST
- 说明: 插入客户
- 请求内容
```json
{
	"page":"",
	"pageSize":"",
	"uuid": "",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": "",
    "pageResultCount": "",
    "list": [
        {
            "uuid": "",
            "name": "",
            "cusName": "",
            "cusBirthday": "",
            "cusPhone": "",
            "cusStatus": "",
            "cusAddress": "",
            "userId": "",
            "groupId": ""
        }
    ]
}
```

## 获取客户信息
- PATH: /manager-web/m/customer/getCustomerList.do
- 方法: GET
- 说明: 插入客户
- 请求内容
```json
{
	"uuid": "",
    "cusName": "",
    "cusBirthday": "",
    "cusPhone": "",
    "cusStatus": "",
    "cusAddress": "",
    "userId": "",
    "groupId": ""
}
```
- 返回值: 
```json
[
    {
        "uuid": "",
        "name": "",
        "cusName": "",
        "cusBirthday": "",
        "cusPhone": "",
        "cusStatus": "",
        "cusAddress": "",
        "userId": "",
        "groupId": ""
    },{
        "uuid": "",
        "name": "",
        "cusName": "",
        "cusBirthday": "",
        "cusPhone": "",
        "cusStatus": "",
        "cusAddress": "",
        "userId": "",
        "groupId": ""
    }
]
```

# 工作计划/日志模块

## 新建计划/日志(动态)
- PATH: /manager-web/m/plan/insertSelective.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "title": "必须",
    "createTime": "",
    "type": "必须",
    "content": "必须"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid":"",
   		"title": "",
	    "createTime": "",
	    "userId": "",
	    "type": "",
	    "content": ""
	}
}
```

## 新建计划/日志(非动态)
- PATH: /manager-web/m/plan/insert.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "title": "必须",
    "createTime": "",
    "type": "必须",
    "content": "必须"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid":"",
   		"title": "",
	    "createTime": "",
	    "userId": "",
	    "type": "",
	    "content": ""
	}
}
```

## 选择单个计划/日志
- PATH: /manager-web/m/plan/selectOne.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"uuid":"",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": ""
}
```
- 返回值: 
```json
{
	"uuid":"",
	"title": "",
    "createTime": "",
    "userId": "",
    "type": "",
    "content": ""
}
```

## 新建计划/日志(非动态)
- PATH: /manager-web/m/plan/updateSelective.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"uuid":"必须",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid":"",
   		"title": "",
	    "createTime": "",
	    "userId": "",
	    "type": "",
	    "content": ""
	}
}
```

## 强制更新计划/日志
- PATH: /manager-web/m/plan/update.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"uuid":"必须",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid":"",
   		"title": "",
	    "createTime": "",
	    "userId": "",
	    "type": "",
	    "content": ""
	}
}
```

## 删除计划/日志
- PATH: /manager-web/m/plan/delete.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"uuid":"必须",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": ""
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功"
}
```

## 获取计划/日志分页信息
- PATH: /manager-web/m/plan/getPlanPage.do
- 方法: GET/POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid":"",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": "",
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": 1,
    "pageResultCount": "",
    "list": [
        {
            "uuid": "",
            "title": "",
            "createTime": "",
            "userId": "",
            "type": "",
            "content": ""
        }
    ]
}
```

## 获取计划/日志列表
- PATH: /manager-web/m/plan/getList.do
- 方法: GET/POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid":"",
    "title": "",
    "createTime": "",
    "type": "",
	"userId": "",
    "content": "",
}
```
- 返回值: 
```json
[
    {
        "uuid": "",
        "title": "",
        "createTime": "",
        "userId": "",
        "type": "",
        "content": ""
    },{
        "uuid": "",
        "title": "",
        "createTime": "",
        "userId": "",
        "type": "",
        "content": ""
    }
]
```














# 库存管理模块

## 新建库存管理(动态)
- PATH: /manager-web/m/item/insertSelective.do
- 方法: POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
	}
}
```

## 新建库存管理(非动态)
- PATH: /manager-web/m/item/insert.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
	}
}
```

## 选择单个库存管理
- PATH: /manager-web/m/item/selectOne.do
- 方法: POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```

## 新建库存管理(非动态)
- PATH: /manager-web/m/item/updateSelective.do
- 方法: POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
	}
}
```

## 强制更新库存管理
- PATH: /manager-web/m/item/update.do
- 方法: POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
	}
}
```

## 删除库存管理
- PATH: /manager-web/m/item/delete.do
- 方法: POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功"
}
```

## 获取库存管理分页信息
- PATH: /manager-web/m/item/getPage.do
- 方法: GET/POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": 1,
    "pageResultCount": "",
    "list": [
        {
            "uuid": "(ID)",
			"itemCompany": "(厂商名称)",
			"itemName": "(商品名)",
			"itemNo": "(商品编号)",
			"itemNum": "(数量)",
			"itemType": "(类型)",
			"itemPrice": "(价格)"
        }
    ]
}
```

## 获取库存管理列表
- PATH: /manager-web/m/item/getLists.do
- 方法: GET/POST
- 说明: 动态插入库存管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"itemCompany": "(厂商名称)",
	"itemName": "(商品名)",
	"itemNo": "(商品编号)",
	"itemNum": "(数量)",
	"itemType": "(类型)",
	"itemPrice": "(价格)"
}
```
- 返回值: 
```json
[
    {
        "uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
    },{
        "uuid": "(ID)",
		"itemCompany": "(厂商名称)",
		"itemName": "(商品名)",
		"itemNo": "(商品编号)",
		"itemNum": "(数量)",
		"itemType": "(类型)",
		"itemPrice": "(价格)"
    }
]
```





# 销售报销管理模块

## 新建销售报销(动态)
- PATH: /manager-web/m/expanse/insertSelective.do
- 方法: POST
- 说明: 销售报销销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
	"userName": "(报销人)",
	"expanseTime": "(报销时间)",
	"expanseReason": "(报销原因)",
	"expanseMoney": "(报销金额)",
	"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
	}
}
```

## 新建销售报销(非动态)
- PATH: /manager-web/m/expanse/insert.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "uuid": "(ID)",
	"userName": "(报销人)",
	"expanseTime": "(报销时间)",
	"expanseReason": "(报销原因)",
	"expanseMoney": "(报销金额)",
	"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
	}
}
```

## 选择单个销售报销
- PATH: /manager-web/m/expanse/selectOne.do
- 方法: POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```

## 新建销售报销(非动态)
- PATH: /manager-web/m/expanse/updateSelective.do
- 方法: POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
	}
}
```

## 强制更新销售报销
- PATH: /manager-web/m/expanse/update.do
- 方法: POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
	}
}
```

## 删除销售报销
- PATH: /manager-web/m/expanse/delete.do
- 方法: POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功"
}
```

## 获取销售报销分页信息
- PATH: /manager-web/m/expanse/getPage.do
- 方法: GET/POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": 1,
    "pageResultCount": "",
    "list": [
        {
            "uuid": "(ID)",
			"userName": "(报销人)",
			"expanseTime": "(报销时间)",
			"expanseReason": "(报销原因)",
			"expanseMoney": "(报销金额)",
			"bankAccount": "(银行账户)"
        }
    ]
}
```

## 获取销售报销列表
- PATH: /manager-web/m/expanse/getLists.do
- 方法: GET/POST
- 说明: 动态插入销售报销
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
[
    {
        "uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
    },{
        "uuid": "(ID)",
		"userName": "(报销人)",
		"expanseTime": "(报销时间)",
		"expanseReason": "(报销原因)",
		"expanseMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
    }
]
```








# 员工离职管理模块

## 新建员工离职(动态)
- PATH: /manager-web/m/quit/insertSelective.do
- 方法: POST
- 说明: 员工离职员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
	}
}
```

## 新建员工离职(非动态)
- PATH: /manager-web/m/quit/insert.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
	}
}
```

## 选择单个员工离职
- PATH: /manager-web/m/quit/selectOne.do
- 方法: POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```

## 新建员工离职(非动态)
- PATH: /manager-web/m/quit/updateSelective.do
- 方法: POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
	}
}
```

## 强制更新员工离职
- PATH: /manager-web/m/quit/update.do
- 方法: POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
	}
}
```

## 删除员工离职
- PATH: /manager-web/m/quit/delete.do
- 方法: POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
		"userName": "(报销人)",
		"quitTime": "(报销时间)",
		"quitReason": "(报销原因)",
		"quitMoney": "(报销金额)",
		"bankAccount": "(银行账户)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功"
}
```

## 获取员工离职分页信息
- PATH: /manager-web/m/quit/getPage.do
- 方法: GET/POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": 1,
    "pageResultCount": "",
    "list": [
        {
            "uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
        }
    ]
}
```

## 获取员工离职列表
- PATH: /manager-web/m/quit/getLists.do
- 方法: GET/POST
- 说明: 动态插入员工离职
- 请求内容
```json
{
	"uuid": "(ID)",
	"quitIsAgree": "(离职同意情况)",
	"quitIsSave": "(是否存放物料)",
	"quitReason": "(离职原因)",
	"quitTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
[
    {
        "uuid": "(ID)",
		"quitIsAgree": "(离职同意情况)",
		"quitIsSave": "(是否存放物料)",
		"quitReason": "(离职原因)",
		"quitTime": "(离职时间)",
		"userName": "(离职人)"
    },{
        "uuid": "(ID)",
		"quitIsAgree": "(离职同意情况)",
		"quitIsSave": "(是否存放物料)",
		"quitReason": "(离职原因)",
		"quitTime": "(离职时间)",
		"userName": "(离职人)"
    }
]
```



# 销售管理模块

## 新建销售管理(动态)
- PATH: /manager-web/m/sale/insertSelective.do
- 方法: POST
- 说明: 销售管理销售管理
- 请求内容
```json
{
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
	}
}
```

## 新建销售管理(非动态)
- PATH: /manager-web/m/sale/insert.do
- 方法: POST
- 说明: 动态插入计划/日志
- 请求内容
```json
{
    "uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
	}
}
```

## 选择单个销售管理
- PATH: /manager-web/m/sale/selectOne.do
- 方法: POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```

## 新建销售管理(非动态)
- PATH: /manager-web/m/sale/updateSelective.do
- 方法: POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"saleIsAgree": "(离职同意情况)",
	"saleIsSave": "(是否存放物料)",
	"saleReason": "(离职原因)",
	"saleTime": "(离职时间)",
	"userName": "(离职人)"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
	}
}
```

## 强制更新销售管理
- PATH: /manager-web/m/sale/update.do
- 方法: POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功",
	"object" : {
		"uuid": "(ID)",
	"saleIsAgree": "(离职同意情况)",
	"saleIsSave": "(是否存放物料)",
	"saleReason": "(离职原因)",
	"saleTime": "(离职时间)",
	"userName": "(离职人)"
	}
}
```

## 删除销售管理
- PATH: /manager-web/m/sale/delete.do
- 方法: POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
	"status": "200",
	"message": "插入成功"
}
```

## 获取销售管理分页信息
- PATH: /manager-web/m/sale/getPage.do
- 方法: GET/POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"page" : "",
	"pageSize":"",
	"uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
{
    "page": "",
    "pageSize": "",
    "start": "",
    "end": "",
    "count": 1,
    "pageResultCount": "",
    "list": [
        {
            "uuid": "ID",
    "userId": "用户ID",
	customerId": "客户ID",
	customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
        }
    ]
}
```

## 获取销售管理列表
- PATH: /manager-web/m/sale/getLists.do
- 方法: GET/POST
- 说明: 动态插入销售管理
- 请求内容
```json
{
	"uuid": "(ID)",
	"uuid": "ID",
    "userId": "用户ID",
	"customerId": "客户ID",
	"customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
}
```
- 返回值: 
```json
[
    {
        "uuid": "(ID)",
	"uuid": "ID",
    "userId": "用户ID",
	"customerId": "客户ID",
	"customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
    },{
        "uuid": "(ID)",
	"uuid": "ID",
    "userId": "用户ID",
	"customerId": "客户ID",
	"customerName": "客户名称",
    "itemName": "进货类型",
    "itemNum": "进货数量",
    "itemPrice": "进价",
    "itemTime": "(进货时间)",
    "itemType": "1",
    "remark": "备注"
    }
]
```


## 获取销售管理统计
- PATH: /manager-web/m/sale/getSaleComp.do
- 方法: GET/POST
- 说明: 获取销售统计
- 请求内容
```json
{
	userId: ''
}
```
- 返回值: 
```json
{
    "axisData": [
        "2018-04-11",
        "2018-04-14"
    ],
    "legendData": [
        "yangyan",
        "yangzong"
    ],
    "series": [
        {
            "data": [
                "2",
                "1"
            ],
            "name": "yangyan",
            "type": "line"
        },
        {
            "data": [
                "1"
            ],
            "name": "yangzong",
            "type": "line"
        }
    ]
}
```