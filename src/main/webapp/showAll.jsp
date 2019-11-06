<%@ page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--引入BootStrap的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">
    <!--BootStrap与JQGRID整合后的css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot-jqgrid/css/trirand/ui.jqgrid-bootstrap.css">
    <!--引入jquery的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap/js/jquery-3.3.1.min.js"></script>
    <!--引入BootStrap的js文件-->
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
    <!--jqgrid与bootstrap整合的国际化的js文件-->
    <script src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <!--jqgrid与bootstrap整合的js文件-->
    <script src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>
    <script type="application/javascript">
        $(function () {
            $("#table").jqGrid({
                styleUI: "Bootstrap",
                url:"${pageContext.request.contextPath}/user/showAll",
                datatype: "json",
                autowidth: true,
                caption: "用户列表",
                pager: "#pager", //开启分页的工具栏
                rowNum: "3",//每页展示的条数
                rowList: ["3", "6", "9"],//下拉框选择每页展示的条数
                viewrecords: true,//是否展示总记录数
                editurl: "${pageContext.request.contextPath}/user/edit",
                colNames:["用户ID","用户名","密码","电话","邮箱","用户来源","用户IP","状态"],
                colModel:[
                    {name:"id"},
                    {name:"username",editable: true},
                    {name:"password",editable: true},
                    {name:"phone",editable: true},
                    {name:"email",editable: true},
                    {name:"sources",editable: true},
                    {name:"ip",editable: true},
                    {name:"status",editable: true}
                ],
            }).jqGrid("navGrid", "#pager", {edit: true});
        });
    </script>
</head>
<body>
    <table id="table"></table>

    <div id="pager"></div>
</body>
</html>