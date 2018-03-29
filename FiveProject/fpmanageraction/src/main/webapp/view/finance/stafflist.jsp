<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/common/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/common/global.css" media="all">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/personal.css" media="all">
</head>
<body>
<section class="layui-larry-box">
    <div class="larry-personal">
        <div class="layui-tab">
            <blockquote class="layui-elem-quote news_search">
                <form id="subform" action="/stafflist?flag=false" method="post">
                    <div class="layui-inline">
                        <div class="layui-input-inline">
                            <input name="staffername" placeholder="请输入关键字" class="layui-input search_input" type="text">
                        </div>
                        <a href="#" onclick="document.getElementById('subform').submit();return false"  class="layui-btn" >查询</a>
                    </div>
                </form>
            </blockquote>

            <!-- 操作日志 -->
            <div class="layui-form news_list">
                <table class="layui-table">
                    <colgroup>
                        <col width="5%">
                        <col width="5%">
                        <col width="9%">
                        <col width="9%">
                        <col width="9%">
                        <col width="9%">
                        <col width="20%">
                        <col width="15%">
                    </colgroup>
                    <thead>
                    <tr>
                        <th><input name="" lay-skin="primary" lay-filter="allChoose" id="allChoose" type="checkbox">
                            <div class="layui-unselect layui-form-checkbox" lay-skin="primary"><i class="layui-icon"></i></div>
                        </th>
                        <th>编号</th>
                        <th>员工姓名</th>
                        <th>工资发放状态</th>
                        <th>税后工资</th>
                        <th>发布时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody class="news_content">
                    <c:forEach items="${stulist}" var="s">
                        <tr>
                            <td><input name="checked" lay-skin="primary" lay-filter="choose" type="checkbox">
                                <div class="layui-unselect layui-form-checkbox" lay-skin="primary"><i class="layui-icon"></i></div>
                            </td>
                            <td align="left">${s.id}</td>
                            <td>${s.staffername}</td>
                            <td>${s.stafferstate}</td>
                            <td>${s.stafferwages}</td>
                            <td>${s.createdAt}</td>
                            <td>
                                <a class="layui-btn layui-btn-mini news_edit"><i class="iconfont icon-edit"></i> 编辑</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="larry-table-page clearfix">

                    <div id="page" class="page"></div>
                </div>
            </div>
            <!-- 登录日志 -->
            <div class="layui-tab-item layui-field-box">
                <table class="layui-table table-hover" lay-even="" lay-skin="nob">
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="selected-all"></th>
                        <th>ID</th>
                        <th>管理员账号</th>
                        <th>状态</th>
                        <th>最后登录时间</th>
                        <th>上次登录IP</th>
                        <th>登录IP</th>
                        <th>IP所在位置</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>110</td>
                        <td>admin</td>
                        <td>后台登录成功</td>
                        <td>2016-12-19 14:26:03</td>
                        <td>127.0.0.1</td>
                        <td>127.0.0.1</td>
                        <td>Unknown</td>
                    </tr>
                    </tbody>
                </table>



            </div>
        </div>
    </div>

</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/newslist.js"></script>
<script type="text/javascript">
    layui.use(['jquery','layer','element','laypage'],function(){
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            laypage = layui.laypage;



    });
</script>
<table border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
        <td align="center" style="font-size: 14px">
            <span>第${currentPage }/${totalPage }页</span>
            <span>
        <c:set var="page" value="${pageContext.request.contextPath }/stafflist?currentPage="></c:set>
        	<c:if test="${currentPage!=1 }">
                <a href="${page }1">[首页]</a>&nbsp;&nbsp;
                <a href="${page }${currentPage-1}">[上一页]</a>&nbsp;&nbsp;
            </c:if>

            <c:forEach begin="1" end="${totalPage }" var="i" >

                <c:if test="${i==currentPage }">
                    ${i }
                </c:if>

                <c:if test="${i!=currentPage }">
                    <a href="${page }${i}">${i }</a>
                </c:if>
            </c:forEach>

            <c:if test="${currentPage!=totalPage }">
                <a href="${page }${currentPage+1}">[下一页]</a>&nbsp;&nbsp;
                <a href="${page }${totalPage}">[尾页]</a>
            </c:if>
        </span>
        </td>

    </tr>
</table>
</body>
</html>