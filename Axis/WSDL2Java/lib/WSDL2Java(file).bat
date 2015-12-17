set Axis_Lib=.\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Output_Path=D:\AxisTest
set Package= com.test.webservice.client
java -classpath ".;commons-logging-1.0.4.jar;axis.jar;commons-discovery-0.2.jar;jaxrpc.jar;wsdl4j-1.5.1.jar;saaj.jar;activation.jar;mail.jar" org.apache.axis.wsdl.WSDL2Java -o "abccba" http://172.17.64.133:8080/sdk/SDKService?wsdl