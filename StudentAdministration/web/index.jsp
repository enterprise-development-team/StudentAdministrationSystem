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
  <script src="/resources/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
  <title>教务处信息网登录页面</title>
  <style type="text/css">
    body{
      background: url("../../resources/login.jpg")no-repeat;
      background-size:100% 100%;
      background-attachment:fixed;
    }
    #login_box{

      padding: 35px;
      border-radius:15px;  /*div圆角*/
      background: #56666B;
      color: #fff;
    }
    #login_title{
      color: #000000;
    }
  </style>
</head>
<body>

<div style="width: 100%; height: 86px ;background: #4e555b; overflow: hidden;"><h1 style="position: absolute;left: 100px;color: white">学生信息管理系统</h1></div>
<div style="width: 100%; height:54px; margin:  0 auto; background: #56666B;overflow: hidden;"></div>

<div class="container" >
  <div class="row" style="margin-top: 75px;">
    <div class="col-md-4 col-md-offset-8" id='login_box'>
      <div class="center-block">
        <h4>管理员账号登录</h4>
      </div>
      <form class="form-horizontal" name="login" action="/Login/login">
        <div class="form-group">
          <label class="col-md-3 control-label">账号</label> <!--control-label标签对齐 -->
          <div class="col-md-9">
            <input class="form-control" type="text" name="id" placeholder="请输入名字"/>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">密码</label>
          <div class="col-md-9">
            <input class="form-control" type="text"name="password" placeholder="请输入密码" />
          </div>
        </div>
        <div class="form-group">
          <div class="col-md-offset-3 col-md-6">
            <input type="submit" class="form-control" class="btn-default" value="登录"/>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<div style="position: absolute;left: 0; bottom: 0; width: 100%; height:96px; line-height: 96px; background: #56666B;color: #ffffff; font-size: 12px; text-align: center;">
  版权所有©&nbsp;学生系统开发公司; 地址：上海市奉贤区&nbsp;邮编：200237
</div>
</body>
</html>
