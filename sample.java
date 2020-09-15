D:\myapp> git config --global user.name vinodh1988
PS D:\myapp> git config --global user.email k.c.vinodh@hotmail.com
PS D:\myapp> git init
Initialized empty Git repository in D:/myapp/.git/
PS D:\myapp> git status
On branch master

 
No commits yet

 

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Sample.java

 

nothing added to commit but untracked files present (use "git add" to track)
PS D:\myapp> git add .
PS D:\myapp> git status
On branch master


No commits yet

 Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Sample.java

 PS D:\myapp> git commit -m "first commit"
[master (root-commit) 2385b80] first commit
 1 file changed, 5 insertions(+)
 create mode 100644 Sample.java
PS D:\myapp>