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