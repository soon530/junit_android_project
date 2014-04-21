junit_android_project
=====================

研究android的測試用法，以利TDD的方式開發。

共有4個不同的projct。

1.appcompat_v7 (android project)
actionbar相容性lib

2.junit_android_study (android project)
用來模擬測試
  本來就有建project了，所以用android update project -p..
  D:\eclipse\adt-bundle-windows-x86_64\sdk\tools>
  android update project -p D:\example\junit_android_project\junit_android_study

3.junit_android_study_test (android project)
junit學習
  D:\eclipse\adt-bundle-windows-x86_64\sdk\tools>
  android update test-project -m D:\example\junit_android_project\junit_android_study -p D:\example\junit_android_project\junit_android_study_test

4.uiautomator_study (java project)
android ui的單元測試，用來模擬ui的點選

step1.產生build.xml
  D:\eclipse\adt-bundle-windows-x86_64\sdk\tools>
  android create uitest-project -n MyUiAutomatorTest -t 11 -p D:\example\junit_android_project\uiautomator_study

step2.執行ant
ant clean build

step3.push jar
  D:\example\junit_android_project\uiautomator_study\bin>
  adb push MyUiAutomatorTest.jar /data/local/tmp/

step4.執行ui test case
  D:\example\junit_android_project\uiautomator_study\bin>
  adb shell uiautomator runtest MyUiAutomatorTest.jar -c tw.tasker.uiautomator_study.MyUiAutomatorTest
