package com.example;

/** バーコード読取画面 */
public class BarcodeReaderPane extends Pane {

    public BarcodeReaderPane(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch (command) {
            case "READ_BARCORD":
                // バーコード読取:金額確認画面
                app.setPane(ConfirmPane.class);
                break;
            case "CANCEL_BUTTON":
                // キャンセルボタン
                app.setPane(HomePane.class);
                break;
        }
    }
}
