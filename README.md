### 说明
* SpringBoot: 2.7.3
* JDK: JDK 11
* MySQL: RDS MySQL 8.x
* Placement group: cluster
* 用途：Java应用压测样例

### 接口

* path: `/pi?steps=xx`, 蒙特卡罗计算PI
* path: `/user/all`, REST API从数据库获取用户清单

### 压测工具选择

* [wrk2](https://github.com/giltene/wrk2): 指定RPS查看延迟分布情况
* [k6](https://k6.io/): 指定虚拟用户数，查看rps、延迟分布情况


### 压测环境准备

* 压测目标机
```shell script
sudo yum install java-11-amazon-corretto git tmux -y
wget https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
sudo tar xf apache-maven-*.tar.gz -C /opt
sudo ln -s /opt/apache-maven-3.8.6 /opt/maven

sudo bash -c 'cat <<EOF > /etc/profile.d/maven.sh
export M2_HOME=/opt/maven
export MAVEN_HOME=/opt/maven
export PATH=/opt/maven/bin:${PATH}
EOF'

```

* 压测发起机

```shell script
sudo yum group install "Development Tools" -y
sudo yum install openssl-devel -y
git clone https://github.com/giltene/wrk2.git
cd wrk2 && make

```