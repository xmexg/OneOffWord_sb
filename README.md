# OneOffWord_sb
阅后即焚SpringBoot


## 说明  
因[阅后即焚](https://github.com/xmexg/OneOffWord)在宝塔总是出现问题  
于是改成了SpringBoot版的


## 在线预览
http://mexvina.top

## 数据库配置  
+ 创建名叫 `oneoffword` 的库  
```
create database if not exists oneoffword;
```
(应该会失败,因为没有权限,创建失败可以去  phpMyAdmin 创建) 

+ 查看当前 有哪些库  
```
show databases;
```

+ 使用 `oneoffword` 库 
```
use oneoffword;
```
+ 创建名为 `messagedata` 的表   
```
create table if not exists messagedata(`id` char(5) not null, `word` varchar(10000) not null, `date` datetime not null, `timelimit` smallint not null, primary key(id)) engine=InnoDB default charset=utf8; 
```  
+ 查看该库有哪些表
```
show tables;
```
+ 查看 `messagedata` 表中的数据
```
select * from messagedata;
```


## 运行  
+  [下载](https://github.com/xmexg/OneOffWord_sb/releases/)文件  

+ 进入文件保存的文件夹执行 `java -jar 文件名.jar`   

+ 初次运行后会生成 `config_sql` 文件,编辑此文件后再次运行

+ 编辑好 `config_sql` 文件后打开浏览器访问 `http://127.0.0.1:8443` 进行浏览  
