<%-- 
    Document   : menuPage
    Created on : Dec 11, 2012, 2:38:03 PM
    Author     : krutij
--%>
<%@page import="com.nfdil.pwm.common.enums.PropertyEnum"%>
<%@page import="com.nfdil.pwm.common.util.PromotionPropertyUtil"%>
<%@page import="com.nfdil.pwm.common.constants.WebConstants"%>
<%@page import="java.util.List"%>
<%-- <%@page import="com.fks.promo.master.service.MessageBroadcastVo" %> --%>
<%-- <%@page import="com.fks.promo.master.service.MessageBroadcast" %> --%>
<%-- <%@page import="com.fks.ui.constants.ServiceMaster" %> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Promotion Management Workflow</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />

        <!--        <script type="text/javascript" src="js/jquery.min.js"></script>-->
        <script type="text/javascript" src="js/ddsmoothmenu.js"></script>
        <script type="text/javascript">

            ddsmoothmenu.init({
                mainmenuid: "menulink", //menu DIV id
                orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
                classname: 'main_nav', //class added to menu's outer DIV
                //customtheme: ["#1c5a80", "#18374a"],
                contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
            })
        </script>        
    </head>
    <body>

        <jsp:include page="topHeader.jsp" />
      		<a href="/category"> Category Master</a>
      		<a href="/test"> Dump data</a>
      		
    </body>
</html>
