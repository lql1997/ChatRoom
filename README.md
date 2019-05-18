# 记录搭建SSM框架  
首先主要参考的链接为：[https://www.cnblogs.com/toutou/p/ssm_spring.html],特此感谢头头哥  
  
### 这里说一下自己的问题：
- 首先是数据库的配置问题，本人数据库版本为8.0.16，所以需要修改pom.xml中的jdbc的版本，特别地Mysql8以上的driver是com.mysql.cj.jdbc.Driver
注意有个cj,
- 然后是左侧的Maven没有mydatis-generator:generate，在这里进行的操作是将 ![avatar](./src/main/resources/z_markdown/picture_1.png)  
 由图片可知，注意层级管旭，将数据库的配置放在与与pluginManagement同级的目录下  
- 运行会出现404错误，这是因为参考文章中web.xml首页的配置路径为/WEB-INF/index.jsp，这里需要修改为/index.jsp，特此感谢讨论区给出的修改意见！  
