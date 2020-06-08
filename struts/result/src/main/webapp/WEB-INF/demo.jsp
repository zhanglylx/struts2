<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/6/8
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Value Stack 演示</h1>
<div>
    <p>使用 el 表达式读取 valueStack 中的数据:${message}</p>
    <p>使用 OGNL 读取 valueStack 中的数据:
        <s:property value="message"/>
    </p>
    <p>
        访问Context区域:
    </p>
    <p>request:
        <s:property value="#request"/>
    </p>
    <p>request 的内容:
        <s:property value="#request['struts.actionMapping']"/>
    </p>
</div>
<div>
    <p>使用 el 表达式读取 valueStack中的数据:map</p>
    ${message}
    ${map.name}
    ${map.age}
    ${map['user.address']}
    ${map['001']}
    <p>使用 el 表达式读取 valueStack中的数据:arrary</p>
    ${data[0].name}
    ${data[0].age}
    ${data[1]['name']}
    ${data[1]['age']}
    <p>list:</p>
    ${list[0].name}
    ${list[0].age}
    ${list[1]['name']}
    ${list[1]['age']}
</div>
<div>
    使用 OGNL 读取 valueStack 中的数据:map: <br>
    <s:property value="message"/>
    <s:property value="map.name"/>
    <s:property value="map.age"/>
    <s:property value="map['user.address']"/>
    <s:property value="map['001']"/>
    <br>
    arrary: <br>
    <s:property value="data[0].name"/>
    <s:property value="data[0].age"/>
    <s:property value="data[1]['name']"/>
    <s:property value="data[1]['age']"/>
    <br>
    list:
    <s:property value="list[0].name"/>
    <s:property value="list[0].age"/>
    <s:property value="list[1]['name']"/>
    <s:property value="list[1]['age']"/>
</div>
<p>
    <s:debug/>
</p>
</body>
</html>
