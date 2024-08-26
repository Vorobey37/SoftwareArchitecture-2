package org.example;

public class Main {
    public static void main(String[] args) {
        LogReader logReader = new ConcreteReaderCreator()
                .createLogReader(LogType.Poem);

    }
}