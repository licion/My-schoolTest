# 学生管理系统


**简介**:学生管理系统


**HOST**:localhost:8888

**联系人**: 马鞭程

**Version**:1.0


[TOC]


# 学生管理


## 添加学生

**接口地址**:`/student`


**请求方式**:`POST`

**请求数据类型**:`application/json`

**响应数据类型**:`application/json`

**接口描述**:


**请求示例**:


```javascript
{
  "age": 0,
  "birthday": "2011-11-20",
  "name": "马蓉",
  "remark": "学习很好",
  "sex": "女"
}
```

**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|&emsp;&emsp;age|用户年龄||false|integer(int32)||
|&emsp;&emsp;birthday|用户生日||false|string(date-time)||
|&emsp;&emsp;name|用户姓名||false|string||
|&emsp;&emsp;remark|用户备注||false|string||
|&emsp;&emsp;sex|用户性别||false|string||





**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|code|响应状态码|integer(int32)|integer(int32)|
|msg|响应信息|string||


**响应示例**:
```javascript
{
	"code": 0,
	"msg": "操作成功"
}

{
	"code": 500,
	"msg": "操作失败"
}
```


## 根据id更新学生


**接口地址**:`/student`


**请求方式**:`PUT`

**请求数据类型**:`application/json`

**响应数据类型**:`application/json`

**接口描述**:


**请求示例**:


```javascript
{
  "age": 119,
  "birthday": "1988-04-20",
  "id": 1,
  "name": "马蓉蓉",
  "remark": "学习不咋地",
  "sex": "男"
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|&emsp;&emsp;age|用户年龄||false|integer(int32)||
|&emsp;&emsp;birthday|用户生日||false|string(date-time)||
|&emsp;&emsp;id|用户id||true|integer(int64)||
|&emsp;&emsp;name|用户姓名||false|string||
|&emsp;&emsp;remark|用户备注||false|string||
|&emsp;&emsp;sex|用户性别||false|string||





**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|code|响应状态码|integer(int32)|integer(int32)|
|msg|响应信息|string||


**响应示例**:
```javascript
{
	"code": 0,
	"msg": "操作成功"
}
```


## 批量删除学生

**接口地址**:`/student`

**请求方式**:`DELETE`

**请求数据类型**:`application/x-www-form-urlencoded`

**响应数据类型**:`application/json`


**接口描述**:

**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|ids|ids|query|true|array|integer|

**示例**:

​	/student?ids=1,2,3,5


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|code|响应状态码|integer(int32)|integer(int32)|
|msg|响应信息|string||


**响应示例**:
```javascript
{
	"code": 0,
	"msg": "操作成功"
}
```


## 根据姓名分页查询学生


**接口地址**:`/student/pager`


**请求方式**:`GET`

**请求数据类型**:`application/x-www-form-urlencoded`

**响应数据类型**:`application/json`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum|当前页|query|true|integer(int32)||
|size|每页显示条数|query|true|integer(int32)||
|name|姓名|query|false|string||

**示例**:

​	/student?pageNum=1&size=5&name=张三

​    /student?pageNum=1&size=5


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|code|响应状态码|integer(int32)|integer(int32)|
|data|响应数据|object||
|msg|响应信息|string||
|total|总记录数|long||
|records|当前页数据|array||


**响应示例**:
```javascript
{
  "code": 0,
  "msg": "操作成功",
  "data": {
    "total": 2,
    "records": [
      {
        "id": 3,
        "name": "213",
        "age": 1,
        "sex": "男",
        "birthday": "2023-02-04",
        "remark": null
      },
      {
        "id": 7,
        "name": "搜索22",
        "age": 1,
        "sex": "男",
        "birthday": "2023-02-03",
        "remark": "搜索22"
      }
    ]
  }
}
```


## 根据id查询学生

**接口地址**:`/student/{id}`

**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`

**响应数据类型**:`application/json`

**接口描述**:

**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|用户id|path|true|integer(int64)||

**示例**:

​	/student/1


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- |
|code|响应状态码|integer(int32)|integer(int32)|
|msg|响应信息|string||

**响应示例**:

```javascript
{
  "age": 119,
  "birthday": "1988-04-20",
  "id": 1,
  "name": "马蓉蓉",
  "remark": "学习不咋地",
  "sex": "男"
}
```