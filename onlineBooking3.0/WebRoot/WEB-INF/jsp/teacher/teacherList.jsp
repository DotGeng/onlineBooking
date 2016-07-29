<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String path = request.getContextPath() ; %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/logo.png"/>
    <title></title>
    <link href="<%=path %>/css/css-indextwo/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="<%=path %>/css/css-indextwo/mmss.css"/>
    <link rel="stylesheet" href="<%=path %>/css/css-indextwo/font-awesome.min.css"/>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <style>

    </style>
</head>
<body>

<section >
    <div class="container-fluid">
        <div class="row ">
           
               
            <!--左侧导航结束-->
            <!----------------------------------------------------------------------------------------------------->
            <!--右侧内容开始-->
            <div class="col-xs-10">
                
                <table class="table table-bordered table-striped text-center bg-info">
                    <thead >
                    <tr class="info">
                        <th class="text-center">序号</th>
                        <th class="text-center">用户名</th>
                        <th class="text-center">姓名</th>
                        <th class="text-center">性别</th>
                        <th class="text-center">身份证</th>
                        <th class="text-center">职位</th>
                        <th class="text-center">邮箱</th>
                        <th class="text-center">备注</th>
                        <th class="text-center">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add1">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#edit">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm" >删除</a>
                        </td>
                        <!-- Modal begin-->
                        <!--添加-->
                        <div class="modal fade" id="add1" tabindex="-1" role="dialog" aria-labelledby="add11">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="add11">添加</h4>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>
                                                <label><span>序号 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>用户名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>姓名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>性别 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>身份证 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>职位 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>邮箱 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>备注 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">取消</button>
                                        <button type="button" class="btn btn-primary btn-sm">保存</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="edit" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="myModalLabel1">编辑</h4>
                                    </div>
                                    <div class="modal-body">
                                        <ul>
                                            <li>
                                                <label><span>序号 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>用户名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>姓名 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>性别 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>身份证 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>职位 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>邮箱 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                            <li>
                                                <label><span>备注 ：</span></label>
                                                <input type="text"/>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default btn-sm" data-dismiss="modal">取消</button>
                                        <button type="button" class="btn btn-primary btn-sm">保存</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Modal end-->
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>mmss</td>
                        <td>小小</td>
                        <td>女</td>
                        <td>12345678901</td>
                        <td>经理</td>
                        <td>1234567@163.com</td>
                        <td>无</td>
                        <td>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="添加">添加</a>
                            <a href="#" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#add"data-whatever="编辑">编辑</a>
                            <a href="#" class="btn btn-primary btn-sm">删除</a>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <ul class="pagination right">
                    <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
                    </li>
                    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                </ul>
            </div>
            <!--右侧内容结束-->
        </div>
    </div>
</section>

<footer class="bg-primary navbar-fixed-bottom">
   
</footer>

<script src="<%=path %>/js/js-indextwo/jquery-1.11.3.js"></script>
<script src="<%=path %>/js/js-indextwo/bootstrap.js"></script>
<script>
    /*Bootlint工具用于对页面中的HTML标签以及Bootstrapclass的使用进行检测*/
    (function () {
        var s = document.createElement("script");
        s.onload = function () {
            bootlint.showLintReportForCurrentDocument([]);
        };
        s.src = "js/bootlint.js";
        document.body.appendChild(s)
    })();

//    添加编辑模态框
    $('#add').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-title').text('' + recipient)
        modal.find('.modal-body input').val(recipient)
    })
</script>
</body>
</html>