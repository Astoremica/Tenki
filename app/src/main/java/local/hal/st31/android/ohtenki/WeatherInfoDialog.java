package local.hal.st31.android.ohtenki;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

/**
 * ST31 Androidサンプル15 Webアクセス
 * 
 * お天気情報ダイアログクラス。
 */
public class WeatherInfoDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle extras = getArguments();
        String msg = extras.getString("msg");
        String title = extras.getString("title");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    /**
     * 天気詳細ダイアログのOKボタンが押されたときの処理が記述されたメンバクラス。
     */
    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        }
    }
}