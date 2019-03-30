package org.example;

import org.apache.avro.reflect.ReflectData;

public class App {

    public static class TextMetaData {
        private String textMessage;
        private String skillId;
        private String skillType;
        private String language;
    }

    public static void main(String args[]) {
        final String schemaString = ReflectData.get().getSchema(TextMetaData.class).toString();
        System.out.println(schemaString);
    }
}