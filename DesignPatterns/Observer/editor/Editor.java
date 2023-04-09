package DesignPatterns.Observer.editor;

import DesignPatterns.Observer.producer.EventManager;

import java.io.File;
import java.util.Objects;

public class Editor {

    public static final String SAVE = "save";
    public static final String OPEN = "open";
    public static final String[] STRINGS = {OPEN, SAVE};
    public static final String OPEN_THE_FILE_FIRST = "OPEN THE FILE FIRST";
    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager(STRINGS);
    }

    public void openFile(String filepath) {
        this.file = new File(filepath);
        eventManager.notify(OPEN, file);
    }

    public void save() throws Exception {
        if (!Objects.isNull(this.file)){
            eventManager.notify(SAVE,file);
        }else {
            throw new Exception(OPEN_THE_FILE_FIRST);
        }
    }
}
