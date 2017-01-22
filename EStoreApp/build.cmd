CLS
SET JAVA_HOME="C:\Program Files\Java\jdk1.7.0_45"
SET SPRING_LIB=.\lib
SET WORKING_AREA=.
SET CLASSPATH=.;"%SPRING_LIB%\*";
echo %CLASSPATH%

REM builds all java files
%JAVA_HOME%\bin\javac -classpath %CLASSPATH% -d .\classes .\src\main\java\com\uciext\springfw\class01\courses\model\*.java .\src\main\java\com\uciext\springfw\class01\courses\service\*.java .\src\main\java\com\uciext\springfw\class01\courses\service\impl\*.java .\src\main\java\com\uciext\springfw\class01\*.java


