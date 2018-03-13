<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<html>
	<head>
		<mate charset>
	</head>
</html>
<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
<p>数据表格</p>
<table id="datatable">
    <thead>
        <tr>
            <th></th>
            <th>小张</th>
            <th>小潘</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th>苹果</th>
            <td>3</td>
            <td>4</td>
        </tr>
        <tr>
            <th>梨</th>
            <td>2</td>
            <td>0</td>
        </tr>
        <tr>
            <th>葡萄</th>
            <td>5</td>
            <td>1</td>
        </tr>
        <tr>
            <th>香蕉</th>
            <td>1</td>
            <td>1</td>
        </tr>
        <tr>
            <th>橘子</th>
            <td>2</td>
            <td>4</td>
        </tr>
    </tbody>
</table>