**项目说明** 
- spring-vue-demo 是针对vue前端框架，搭建的后端请求服务，真正实现了前后端完全分离，使得开发变得清晰明朗，
前端，后端真正意义上的相互协作
前端框架请参考：https://github.com/yaukie/my-vue.git

**项目实现功能**
- 简单登录操作
- 多数据源部署
- 自动生成dao层代码
<br> 

**项目结构** 
```
spring-vue-demo
├─controller 基础请求层
├─dao 数据访问层
├─datasources 多数据源配置
│ 
├─model 实体层
├─service 服务层
├─MySpringbootApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  ├─generator 代码机配置
│  └─

```
<br> 
 
**部署指南**
- doc有1个数据库
    user.sql 
- 项目的配置都在 application.yml 


