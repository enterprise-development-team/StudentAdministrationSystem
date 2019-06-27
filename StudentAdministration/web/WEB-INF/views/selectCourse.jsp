<%--
  Created by IntelliJ IDEA.
  User: JIN54
  Date: 2019/6/26
  Time: 16:26
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
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li><a href="#">选课学分情况</a></li>
            <li><a href="#">必修选课</a></li>
            <li><a href="#">选修选课</a></li>
            <li><a href="#">公选课选课</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="enSelectCourse.html"><span class="glyphicon glyphicon-log-out"></span>&nbsp;安全退出</a></li>
        </ul>
    </div>
</nav>
<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <table class="table table-bordered">
            <tbody>
            <tr>
                <td class="text-center" colspan="8">本学期选课学分/门数要求及已选情况</td>
            </tr>
            <tr>
                <td class="text-center" rowspan="2">&nbsp;</td>
                <td class="text-center" rowspan="2" style="vertical-align: middle;">最高总学分</td>
                <td class="text-center" colspan="4">校公共选修课选课(控制)</td>
            </tr>
            <tr>
                <td class="text-center" colspan="2">学分</td>
                <td class="text-center" colspan="2">门数</td>
            </tr>
            <tr>
                <td class="text-center">设置(控制)要求</td>
                <td class="text-center">不控制</td>
                <td class="text-center" colspan="2">不控制</td>
                <td class="text-center" colspan="2">不控制</td>
            </tr>
            <tr>
                <td class="text-center">已选统计</td>
                <td class="text-center">0.0</td>
                <td class="text-center" colspan="2">0.0</td>
                <td class="text-center" colspan="2">0</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div class="row">
    <h4 class="text-center">选课课表</h4>
    <div class="col-md-8 col-md-offset-2">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th class="text-center">&nbsp;</th>
                <th class="text-center">星期一</th>
                <th class="text-center">星期二</th>
                <th class="text-center">星期三</th>
                <th class="text-center">星期四</th>
                <th class="text-center">星期五</th>
                <th class="text-center">星期六</th>
                <th class="text-center">星期日</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td class="text-center"><strong>01~02节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>03~04节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>中午休</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>05-06节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>07~08节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>下午休</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>09~10节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            <tr>
                <td class="text-center"><strong>11~12节</strong></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
                <td class="text-center"></td>
            </tr>
            </tbody>
        </table>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th class="text-center">课程号</th>
                <th class="text-center">课程名</th>
                <th class="text-center">学分</th>
                <th class="text-center">课程属性</th>
                <th class="text-center">上课教师</th>
                <th class="text-center">上课时间</th>
                <th class="text-center">上课地点</th>
                <th class="text-center">上课校区</th>
                <th class="text-center">选修类型</th>
                <th class="text-center">选课状态</th>
                <th class="text-center">操作</th>
            </tr>
            </thead>
        </table>
    </div>
</div>
</body>
</html>
