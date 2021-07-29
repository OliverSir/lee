# 宁波银行前端页面
## 环境要求 
* node node版本 推荐 >= v12.18.3
* npm或者cnpm
## 本地开发
``` javascript
// 先安装依赖包
cnpm install
// 之后运行
cnpm start 或 cnpm run dev
```
## 服务器打包
### 开发，dev环境
``` javascript
// 先安装依赖包
cnpm install
// 之后运行
npm run build:dev
// 打包完毕，目标文件在dist文件夹
```
### 测试环境，sit环境
``` javascript
// 先安装依赖包
cnpm install
// 之后运行
npm run build:sit
// 打包完毕，目标文件在dist文件夹
```
### 测试环境，uat环境
``` javascript
// 先安装依赖包
cnpm install
// 之后运行
npm run build:uat
// 打包完毕，目标文件在dist文件夹
```
### 生产环境，prd环境
``` javascript
// 先安装依赖包
cnpm install
// 之后运行
npm run build:prd 或 npm run build
// 打包完毕，目标文件在dist文件夹
```