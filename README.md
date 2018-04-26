# sayhi
需要实现的功能： 
实现用户数据的查询功能。查询功能要能够根据 ID 和登录名(字母序)分别排序
 
要求： 
1. 避免数据库操作，数据不需要持久化到文件中，CRUD通过自己组织的数据结构和代码实现 
2. 用最熟悉的技术做一个简单的可以交互的 web 系统，不需要特意美化 CSS 样式，可以使用 ajax 
3. 应当尽量使用 maven 或者 gradle 打包和解决依赖 
4. 最终只提交代码，不需要提交编译后的结果，可以提交 git 的 bundle 

基本数据结构： UserInfo { private long id; private String loginname; private String password; // 加密 private String name; } 

使用的初始数据如下： 
id | loginname | password | name
1 | andy | | Andy 
2 | carl | | Carl 
3 | bruce | | Bruce 
4 | dolly | | Dolly