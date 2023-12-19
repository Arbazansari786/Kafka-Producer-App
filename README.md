commands for console

Step 01 :- Start the zooKeeper server
            .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
Step 02 :- Strat the kafka server
            C:\Jars\kafka>.\bin\windows\kafka-server-start.bat ./config/server.properties
Step 03 :- select the topic for producer
            kafka-console-producer.bat --broker-list localhost:9092 --topic DemoTopic

