package org.example;

public abstract class BaseLogReaderCreator {

    protected LogReader createLogReader(LogType logType){
        LogReader logReader = createLogReaderInstance(logType);
        return logReader;
    }

    protected abstract LogReader createLogReaderInstance(LogType logType);
}
