# 背景介绍

通过一个简单的demo了解如何利用SAP CAP快速构建一个微服务。

## 前提条件

- 可以访问公网网络的一台计算机
- 计算机上安装Firefox, Google Chrome, Intenet Exploer较新版本
- 具备管理员权限

## 观众群体

具备一定经验或者无SAP CAP使用经验的开发者。

## 学习目标

从更高维度上通过本练习，您将了解如何使用SAP CAP实现一个微服务增删改查场景，以及如何部署、运行该应用到SAP Cloud Platform上。

在接下来的练习中，您将了解到以下知识点：

- 初步认识SBAS(SAP Business Application Studio)
- Spring Boot与SAP CAP的集成
- 通过SAP CAP创建数据库持久化层对象
- 通过SAP CAP创建服务层，同时定义自定义业务逻辑
- 通过SAP CAP实现CRUD功能，简单直接高效
- 通过SAP CAP实现Event Handler
- 部署SAP CAP应用到SAP云平台

## 章节目录

您将经历以下章节最终完成本次练习，请按照条目顺序依次完成每个章节

| 章节目录   |     章节介绍      |
|:----------|:-------------|
| [01-熟悉云平台和SBAS](exercises/01/README.md) |  SBAS是SAP的网页版VSCode，SBAS包含插件，通过这些插件可快速的与SAP其他产品集成 |
| [02-配置SBAS开发环境](exercises/02/README.md) |    创建SBAS工作区间，配置工作环境   |
| [03-创建CAP应用](exercises/03/README.md) |    创建Spring Boot基础应用，同时引入CAP Java SDK   |
| [04-定义CAP Service](exercises/04/README.md) | 添加CAP Service对外提供服务 |
| [05-添加自定义业务逻辑](exercises/05/README.md) | CAP允许用户添加自定义业务逻辑来对应用进行增强 |
| [06-新建持久层以及重用CDS通用特性](exercises/06/README.md) | 优化CAP应用，新建持久层，同时重用CDS的通用特性 |
| [07-创建测试数据以及Sqlite工具的使用](exercises/07/README.md) | 创建测试数据同时使用sqlite工具查看部署的测试数据 |
| [08-配置应用使用SAP HANA数据库](exercises/08/README.md) | 创建并消费SAP云平台中的HANA数据库服务实例|
| [09-部署应用到SAP云平台](exercises/09/README.md)| 部署应用到SAP云平台 |