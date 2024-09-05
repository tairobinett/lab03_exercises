# Tai Robinett Lab 03 Exercises
1.1
.  ..  .git  README.md
Running the git init command adds the .git folder to the working directory. In my terminal (Windows Powershell with WSL), folders are displayed with a different color than files.

.  ..  HEAD  branches  config  description  hooks  info  objects  refs
Above are the contents of the .git folder.


1.2 + 1.3
tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)
tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git add README.md
tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   README.md

tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git commit -m "add README.md to the repository"
[master (root-commit) d346454] add README.md to the repository
 1 file changed, 18 insertions(+)
 create mode 100644 README.md
tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
On branch master
nothing to commit, working tree clean


1.4
tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git log
commit d34645419c0c4ebedfcec08281668d2f77edb7e8 (HEAD -> master)
Author: Tai Robinett <tairobinett@gmail.com>
Date:   Thu Sep 5 10:34:45 2024 -0400

    add README.md to the repository


#Add to README.md
##Find All Duplicates

Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.


1.5

tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git diff
diff --git a/README.md b/README.md
index 464d51d..55148cc 100644
--- a/README.md
+++ b/README.md
@@ -6,7 +6,9 @@ Running the git init command adds the .git folder to the working directory. In m
 .  ..  HEAD  branches  config  description  hooks  info  objects  refs
 Above are the contents of the .git folder.

-1.2
+
+1.2 + 1.3
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
 On branch master

 No commits yet
@@ -15,4 +17,37 @@ Untracked files:
   (use "git add <file>..." to include in what will be committed)
         README.md

-nothing added to commit but untracked files present (use "git add" to track)
\ No newline at end of file
+nothing added to commit but untracked files present (use "git add" to track)
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git add README.md
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
+On branch master
+
+No commits yet
+
+Changes to be committed:
+  (use "git rm --cached <file>..." to unstage)
+        new file:   README.md
+
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git commit -m "add README.md to the repository"
+[master (root-commit) d346454] add README.md to the repository
+ 1 file changed, 18 insertions(+)
+ create mode 100644 README.md
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git status
+On branch master
+nothing to commit, working tree clean
+
+
+1.4
+tairo@LAPTOP-7MBITRAI:~/csci338/lab03-exercises$ git log
+commit d34645419c0c4ebedfcec08281668d2f77edb7e8 (HEAD -> master)
+Author: Tai Robinett <tairobinett@gmail.com>
+Date:   Thu Sep 5 10:34:45 2024 -0400
+
+    add README.md to the repository
+
:

