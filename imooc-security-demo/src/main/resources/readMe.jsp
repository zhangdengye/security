<%
    /**
     demo 项目演示步骤
     1、启动 项目 src\main\java\com\imooc\DemoApplication.java
     2、访问 UserController中任何一个需登录后才可访问的接口如
     http://localhost:8080/user/me
     系统提示需先登录  "content": "访问的服务需要身份认证，请引导用户到登录页"
     如果直接访问 http://localhost:8080/index.html 类似的html页，系统自动重定向到登陆页
     3、访问 http://localhost:8080/imooc-signIn.html  登录页面
       输入用户信息，其中 密码为 123456
     4、然后访问   http://localhost:8080/user/me  可得到认证后的服务器返回json信息
     5、经测试 ，短信登录，微信登录等都可以用
     6、imooc-security-authorize 工程是 基于JPA 和 RBAC （角色、菜单【资源】、url，用户）的一套 示例 权限控制代码
        其中的 \web\controller\AdminController.java 中的 query 方法 ，灵活的用到了 JPA 中的自定义查询条件，可以考虑其它项目上封装用
     7,注意测试 app下 社交登录（如微信时） 后，跳转到用户注册页时，要 去注释UserController 中的 @PostMapping("/appRegist")注册方法
     */
%>