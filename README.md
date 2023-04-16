# DevOpsTools

Github 创建和配置连接
* 设置Username 和email，每次的commit都会记录他们
-bash-3.2$ git config --global user.name "Jssice"
-bash-3.2$ git config --global user.email "jiaxiaobin@hotmail.com"

* 通过terminal来创建ssh key
-bash-3.2$ ssh-keygen -t rsa -C "jiaxiaobin@hotmail.com"

* 在github的setting中添加一个New SSH keys，which通过cat来查看
-bash-3.2$ cat .ssh/id_rsa.pub 中

* 确认链接github成功
-bash-3.2$ ssh -T git@github.com
Output 像这样
> Hi Jssice! You've successfully authenticated, but GitHub does not provide shell access.


Issue: Connecting to GitHub.com via SSH
https://github.blog/2023-03-23-we-updated-our-rsa-ssh-host-key/#:~:text=Add%20correct%20host%20key%20in%20~%2F.ssh%2Fknown_hosts%20to%20get,by%20running%20this%20command%3A%20%24%20ssh-keygen%20-R%20github.com


Github的使用
在localhost 的desktop中clone github中的新创建的repositories named as DevopsTool。
-bash-3.2$ git clone git@github.com:Jssice/DevOpsTools.git

在MacBook中打开Xcode来import project that clone from github

然后开始进行添加文件到GitHub 的repositories中
-bash-3.2$ git add .
-bash-3.2$ git commit -m "First commit"
-bash-3.2$ git push
