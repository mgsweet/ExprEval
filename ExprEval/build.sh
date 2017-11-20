echo off
cd src
javac -d ../bin -classpath ../bin parser/*.java scanner/*.java symbols/*.java
cd ..
echo on