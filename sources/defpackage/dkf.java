package defpackage;

import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class dkf {
    public static void a(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str != text) {
            if (str == null && text.length() == 0) {
                return;
            }
            if (!(str instanceof Spanned)) {
                if ((str == null) == (text == null)) {
                    if (str == null) {
                        return;
                    }
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (str.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }
}
