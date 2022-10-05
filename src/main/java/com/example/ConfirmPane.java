package com.example;

/** 金額確認画面 */
public class ConfirmPane extends Pane {
    public ConfirmPane(JustPayApp app) {
        super(app);
    }

    @Override
    public void doAction(String command) {
        switch (command) {
            case "SETTLEMENT_BUTTON_OK":
                // 決済処理正常
                app.setPane(ResultPane.class);
                break;
            case "SETTLEMENT_BUTTON_FAIL":
                // 決済処理失敗
                app.setPane(FailurePane.class);
                break;
            case "CANCEL_BUTTON":
                // キャンセルボタン
                app.setPane(HomePane.class);
                break;
        }

    }
}
