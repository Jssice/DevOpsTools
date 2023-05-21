# DevOpsTools



### a) Implement Source control using Git and GitHub
Github Create and connect 
* Set Username & email，every commits will be recorded 
-bash-3.2$ git config --global user.name "Jssice"
-bash-3.2$ git config --global user.email "jiaxiaobin@hotmail.com"

* Use terminal make a new ssh key
-bash-3.2$ ssh-keygen -t rsa -C "jiaxiaobin@hotmail.com"

* github setting create a New SSH keys，which can show with cat command 
-bash-3.2$ cat .ssh/id_rsa.pub 中

* conform github
-bash-3.2$ ssh -T git@github.com
Output like
> Hi Jssice! You've successfully authenticated, but GitHub does not provide shell access.


* Issue: Connecting to GitHub.com via SSH
https://github.blog/2023-03-23-we-updated-our-rsa-ssh-host-key/#:~:text=Add%20correct%20host%20key%20in%20~%2F.ssh%2Fknown_hosts%20to%20get,by%20running%20this%20command%3A%20%24%20ssh-keygen%20-R%20github.com


Github
在localhost 的desktop中clone github中的新创建的repositories named as DevopsTool。
-bash-3.2$ git clone git@github.com:Jssice/DevOpsTools.git

Open Xcode in macOS and import project that clone from github

Local to GitHub repositories
-bash-3.2$ git add .
-bash-3.2$ git commit -m "First commit"
-bash-3.2$ git push





### b) Implement Unit testing
* ISSUE:How to fix Maven build issue in Eclipse? Perform maven-clean-install to fix any Java Dependency Issue

https://crunchify.com/mavenmvn-clean-install-update-project-and-project-clean-options-in-eclipse-ide-to-fix-any-dependency-issue/



### c) Implement Build automation

To build and run the project, follow these steps:

1. Install Java 8 and Maven
2. Create a new Java project Maven.
3. Use JUnit and add the following dependency to project's 
4. pom.xml file:
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>

4. Write main and test cases java file 
