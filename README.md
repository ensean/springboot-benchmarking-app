### 说明
* SpringBoot: 2.7.3
* JDK: JDK 11
* MySQL: RDS MySQL 8.x
* 用途：Java应用压测样例

### 接口

* path: `/pi?steps=xx`, 蒙特卡罗计算PI
* path: `/user/all`, REST API从数据库获取用户清单

### 压测工具选择

* [wrk2](https://github.com/giltene/wrk2): 指定RPS查看延迟分布情况
* [k6](https://k6.io/): 指定虚拟用户数，查看rps、延迟分布情况