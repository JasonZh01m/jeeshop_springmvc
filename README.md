jeeshop_springmvc
=================

开源电商系统jeeshop的springmvc版

原作者的 struts2版本请参见：http://www.iteye.com/topic/1134678

具体下载，安装到本地环境可以参考 http://luckytyy.iteye.com/blog/2146498

具体修改MVC框架 struts2为 springmvc的过程可以参考：
http://luckytyy.iteye.com/blog/2153478
按照上述步骤可以自己实践
本版本的安装说明
==========================
1.  本版本使用maven管理jar依赖，需要安装maven3，执行mvn eclipse:eclipse添加依赖，当然也可以把原项目里的web\lib全部复制到本项目中。
2.  需要安装jdk6+，mysql5+，tomcat6+，eclipse jee版本，或其他类似软件。
3.  初始化mysql数据库，先执行webapp\doc下的sql文件，然后执行resources下的add.sql和t_menu.sql，注意mysql本身的字符集和数据库的字符集。
4.  将项目导入eclipse，许改resources下的datasource.properties中的数据库连接参数。
5.  注册用户需要系统发生验证邮件，可以先申请一个163的邮箱，然后在设置里开通SMTP功能。再把邮箱的用户名密码配置到system.properties中的from_email。
6.  在eclipse中将项目export成war包部署到tomcat，或者直接部署到eclipse中集成的tomcat。
7.  启动tomcat后，先进入http://localhost:8080/jeeshop/manage/admin.jsp后台管理，在左边的菜单里找到系统设置，进入后将所有官网的配置地址改成本地地址：http://localhost:8080/jeeshop。
8.  支付功能需要有自己的网站，并申请了支付宝的支付接口。
9.  图片存储使用了阿里云存储，如果需用使用的话，也需要申请一个阿里云账号，开通服务。
10.  如果要把例子中的图片放到本地实现本地无网环境的演示，需要先把数据库中product表里引用的aliyun图片全部按原来的路径存入本地web下，然后修改系统配置中的图片网址。
