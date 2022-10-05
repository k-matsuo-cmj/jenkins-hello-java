package com.example;

/** 決済処理失敗画面 */
public class FailurePane extends Pane {
    public FailurePane(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch (command) {
            case "OK_BUTTON":
                app.setPane(HomePane.class);
                break;
            case "REREAD_BUTTON":
                app.setPane(BarcodeReaderPane.class);
                break;
        }

    }
}
