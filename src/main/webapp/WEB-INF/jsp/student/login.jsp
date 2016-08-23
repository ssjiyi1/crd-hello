<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../../common/jsp/common.jsp" %>
<html>
<head>
    <title>hello</title>


    <link rel="stylesheet" href="${ctx}/common/ace/assets/css/bootstrap.css"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="${ctx}/common/ace/assets/css/ace-fonts.css"/>
    <!-- ace styles -->
    <link rel="stylesheet" href="${ctx}/common/ace/assets/css/ace.css"
          class="ace-main-stylesheet" id="main-ace-style"/>

    <link rel="stylesheet" href="${ctx}/common/ace/assets/css/font-awesome.css"/>



    <%--<link rel="stylesheet" href="${ctx}/common/ace/assets/css/jquery-ui.css" />--%>
    <%--<link rel="stylesheet" href="${ctx}/common/ace/assets/css/datepicker.css" />--%>
    <%--<link rel="stylesheet" href="${ctx}/common/ace/assets/css/ui.jqgrid.css" />--%>

    <!-- ace settings handler -->
    <%--<script src="${ctx}/common/ace/assets/js/ace-extra.js"></script>--%>


</head>

<style>

    body {
        padding: 0;
    }

    div {

    }

    .container {
        margin: 0 auto;
        width: 980px;
        height: 600px;

    }

    .header {
        width: 100%;
        height: 100px;
        margin-top: 10px;
        border: 1px solid #abcdef;
    }

    .content {
        margin-top: 10px;
    }

    .content .content-left {
        float: left;
        width: 200px;
        height: 400px;
    }

    .content .content-right {
        float: left;
        width: 700px;
        height: 400px;
        margin-left: 50px;

    }


    .someClass { background-color: #DDDDDC; background-image: none; }

</style>

<body>


<div class="container">


    <div class="header">

        <h5>this is a header</h5>

    </div>
    <div class="content">
        <div class="content-left">
            <h5>this is a left</h5>
        </div>
        <div class="content-right ">



            <table id="__student_list"></table>
            <div id="__student_pager"></div>

        </div>
    </div>




</div>


</div>
<script type="text/javascript" src="${ctx}/common/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${ctx}/common/js/public/student.js"></script>
<script type="text/javascript" src="${ctx}/common/js/utils.js"></script>
<script type="text/javascript" src="${ctx}/common/ace/assets/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/common/ace/assets/js/jqGrid/jquery.jqGrid.src.js"></script>
<script type="text/javascript" src="${ctx}/common/ace/assets/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${ctx}/common/ace/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${ctx}/common/ace/assets/js/jqGrid/i18n/grid.locale-cn.js" type="text/javascript"></script>





</body>
</html>
