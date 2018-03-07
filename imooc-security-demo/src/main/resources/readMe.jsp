<%
    /**
     demo 项目演示步骤
     1、启动 项目 src\main\java\com\imooc\DemoApplication.java
     2、访问 UserController中任何一个需登录后才可访问的接口如
     http://localhost:8080/user/me
     系统提示需先登录  "content": "访问的服务需要身份认证，请引导用户到登录页"
     3、访问 http://localhost:8080/imooc-signIn.html  登录页面
       输入用户信息，其中 密码为 123456
     4、然后访问   http://localhost:8080/user/me  可得到认证后的服务器返回json信息
     */
%>