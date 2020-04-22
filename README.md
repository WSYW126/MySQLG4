MAC配置
1. 下载antlr
2. 配置~/.bash_profile
	alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'
3. 查看antlr4版本
	ANTLR Parser Generator  Version 4.7.2


idea配置
1. 下载ANTLR preview


编写antlr的文件
1. 编写G4文件。例子：Statements.g4
2. antlr配置，选择生成Java代码。
3. 选择visitor模式创建。
4. 执行antlr4生成文件，并且编译java源代码。例子：java -jar /usr/local/lib/antlr-4.7.2-complete.jar Statements.g4