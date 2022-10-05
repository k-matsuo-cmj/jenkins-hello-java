package com.example;

/** 決済結果画面 */
public class ResultPane extends Pane {
    public ResultPane(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch (command) {
            case "OK_BUTTON":
                app.setPane(HomePane.class);
                break;
        }
    }

}
