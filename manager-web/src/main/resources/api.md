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