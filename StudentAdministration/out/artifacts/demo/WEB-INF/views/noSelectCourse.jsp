<%--
  Created by IntelliJ IDEA.
  User: JIN54
  Date: 2019/6/26
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
    <script src="resources/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
    <title>学生管理系统</title>
</head>
<body>

<div style="width: 100%; height: 86px ;background: #4e555b; overflow: hidden;"><h1 style="position: absolute;left: 100px;color: white">学生信息管理系统</h1></div>
<div style="width: 100%; height: 30px; margin:  0 auto; background: #56666B;overflow: hidden;"></div>
<div  class="container" >
    <div class="row" >
        <div class="col-md-2" style="margin-top: 40px;height:550px;border-right: solid 1px #4e555b">
            <h4><strong>学籍管理管理</strong></h4>
            <br />
            <ul class=" nav-stacked " style="border-bottom: solid 1px #4e555b">
                <li><a href="#" style="color: #1b1e21">学籍卡片</a> </li>
                <br />
            </ul>
            <br />
            <h4><strong>选课管理</strong></h4>
            <br />
            <ul class=" nav-stacked " style="border-bottom: solid 1px #4e555b">
                <li><a href="#" style="color: #1b1e21">学生初修选课</a> </li>
                <br />
            </ul>
            <br />
            <h4><strong>成绩管理</strong></h4>
            <br />
            <ul class="nav-stacked" style="color: #1b1e21;border-bottom: solid 1px #4e555b;">
                <li><a href="#" style="color: #1b1e21" >课程成绩查询</a> </li>
                <br />
            </ul>
            <br />
            <h4><strong>课表管理</strong></h4>
            <br />
            <ul class="nav-stacked" style="color: #1b1e21;border-bottom: solid 1px #4e555b;">
                <li><a href="#" style="color: #1b1e21" >课程课表查询</a> </li>
                <br />
            </ul>
            <br />
        </div>
        <div class="col-md-10" style="margin-top: 40px;height:550px;">
            <ul class="breadcrumb" style="background-color: white;">
                <li><a href="main.html">首页</a></li>
                <li class="active">选课</li>
            </ul>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th class="text-center">学年学期</th>
                    <th class="text-center">选课名称</th>
                    <th class="text-center">选课时间</th>
                    <th class="text-center">操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="text-center" colspan="4">选课暂未开放</td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>

</div>
</body>
</html>
