1) Warum werden Logging Bibliotheken verwendet?

Logging libraries are used to record errors and events in an application to help with debugging and monitoring the system's operation.

2) Welche Loglevel gibt es in Log4J und was hat es damit auf sich?

Log levels are a mechanism to categorise logs. Levels used for identifying the severity of an event. We can easily configure levels to specify which log details we want to see. Log4j provides below levels:-

ALL – To log all events.

DEBUG – A general debugging event.

ERROR – An error in the application, possibly recoverable.

FATAL – A severe error that will prevent the application from continuing.

INFO – An event for informational purposes.

TRACE – A fine-grained debug message, typically capturing the flow through the application.

WARN – An event that might possibly lead to an error.

OFF – No events will be logged.

3) Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?

Log4j offers various configuration options:

* Appenders define where logs are stored (e.g., in a file or console).

* Loggers determine which messages are logged for specific areas.

* Layouts define the format of the log messages (e.g., text, JSON).

* Filters control which logs are processed. 
