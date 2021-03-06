<%--
  Created by IntelliJ IDEA.
  User: JIN54
  Date: 2019/6/26
  Time: 16:23
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
            <h4 class="text-center"><strong>学籍卡片</strong></h4>
            <div class="col-md-offset-2">
                <span class="col-md-2 text-center">院系:</span>
                <span class="col-md-2 text-center">专业:</span>
                <span class="col-md-2 text-center">学制:</span>
                <span class="col-md-2 text-center">班级:</span>
                <span class="col-md-2 text-center">学号:</span>
            </div>
            <table class="table table-bordered">
                <tbody>
                <tr>
                    <td class="text-center">姓名</td>
                    <td class="text-center"></td>
                    <td class="text-center">性别</td>
                    <td class="text-center"></td>
                    <td class="text-center">姓名拼音</td>
                    <td class="text-center"></td>
                    <td align="center" colspan="2" rowspan="5">
                        <img alt="照片" src="/" style="width:78px; height:110px;">
                    </td>
                </tr>
                <tr>
                    <td class="text-center">出生日期</td>
                    <td class="text-center"></td>
                    <td class="text-center">婚否</td>
                    <td class="text-center"></td>
                    <td class="text-center">本人电话</td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center">专业方向</td>
                    <td class="text-center"></td>
                    <td class="text-center">政治面貌</td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center">籍贯</td>
                    <td class="text-center" colspan="5"></td>
                </tr>
                <tr>
                    <td class="text-center">入党团时间</td>
                    <td class="text-center"></td>
                    <td class="text-center">民族</td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center">学习形式</td>
                    <td class="text-center"></td>
                    <td class="text-center">学习层次</td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center">外语种类</td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center">家庭现住址</td>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center">下车火车站</td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center">邮政编码</td>
                    <td class="text-center"></td>
                    <td class="text-center">家庭电话</td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center">联系人</td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="7">学籍变动情况</td>
                </tr>
                <tr>
                    <td class="text-center">异动类别</td>
                    <td class="text-center">异动原因</td>
                    <td class="text-center">异动日期</td>
                    <td class="text-center" colspan="2">原院系</td>
                    <td class="text-center">原专业</td>
                    <td class="text-center">原年级</td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="7">学籍预警情况</td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4">预警学期</td>
                    <td class="text-center" colspan="3">预警结果</td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="4"></td>
                    <td class="text-center" colspan="3"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="7">奖励情况</td>
                </tr>
                <tr>
                    <td class="text-center">奖励年度</td>
                    <td class="text-center" colspan="2">奖励名称</td>
                    <td class="text-center" colspan="3">颁奖单位</td>
                    <td class="text-center">奖励等级</td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="7">处分情况</td>
                </tr>
                <tr>
                    <td class="text-center">处分日期</td>
                    <td class="text-center" colspan="2">处分名称</td>
                    <td class="text-center" colspan="3">处分单位</td>
                    <td class="text-center">处分原因</td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center" colspan="2"></td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center"></td>
                </tr>
                <tr>
                    <td class="text-center">入学日期</td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center">毕业日期</td>
                    <td class="text-center" colspan="2"></td>
                </tr>
                <tr>
                    <td class="text-center">入学考号</td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center">身份证编号</td>
                    <td class="text-center" colspan="2"></td>
                </tr>
                <tr>
                    <td class="text-center">毕(结)业证书号</td>
                    <td class="text-center" colspan="3"></td>
                    <td class="text-center">学士证书号</td>
                    <td class="text-center" colspan="2"></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</div>
</body>
</html>
