# MyEnginering
健康项目管理系统（毕业设计）
项目技术：
Spring、Spring MVC、Spring Security、MyBatis、Dubbo、Zookeeper、Vue、ElementUI、bootstrap、Echarts、MySQL、Redis、Maven、阿里云通信（短信服务）、七牛云（存储服务）；项目描述：
教育背景
项目经验
个人简历专业技能
实习经验
本项目前端采用 Vue 框架与开源的 ElementUI 组件，后端采用 SSM 框架与Dubbo+zookeeper开源分布式服务框架进行开发，数据库采用非关系型数据库 Redis 和关系型数据库MySQL 对数据进行存储。系统管理项目采用 Maven 项目管理工具实现，Spring Security 实现权限控制。在线短信验证码和在线图片存储分别采用的是阿里云通信（短信服务）和七牛云的云存储服务实现。
责任描述：
登录功能、预约设置功能、套餐管理功能、检查组管理功能 、会员数量统计功能、套餐预约占比统计功能 、运营数据统计功能、体检预约功能、图片缓存和自动清除功能；
技术描述：
1. 登录账号密码采用市面主流的 bcrypt 加密方式；
2. 图片上传云存储到云端（七牛云）并且通过 redis 实现自动清理垃圾图片；3. Spring Security 实现不同账户之间的权限控制；
4. 在 CentOS 虚拟机启动 Dubbo 和 Zookeeper 后本地运行项目实现分布式架构；5. 通过 Apache POI 实现批量导入预约设置；
6. 采用阿里云通信（短信服务）实现在线发送和接受短信验证码；7. 使用 Echarts 开源可视化库实现本地数据可视化和图片动态化；
