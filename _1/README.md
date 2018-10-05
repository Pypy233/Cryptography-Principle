# 作业1说明

## 一个简单的One-Time-Pad
### 运行
	java jar- otp-0.0.1-SNAPSHOT.jar
打开浏览器输入:	
		
		http://localhost:8080/
		
### 加密
输入明文点击encode即可自动生成强随机密钥和密文
![](img/encode.png)

### 解密
复制密文和**对应的密钥**点击decode即可解密成明文

### 代码说明
使用JCA框架下的SecureRandom生成随机数，作异或运算加密，由于随机数只使用一次保证安全性。

**使用的Unicode是包含所有已定义过的，但不排除在浏览器页面上无法显示部分字符orz，若存在此类情况重置即可//以防万一**

[项目地址](https://github.com/Pypy233/Cryptography-Principle/tree/master/_1)

reference: [JCA官方文档](https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html)