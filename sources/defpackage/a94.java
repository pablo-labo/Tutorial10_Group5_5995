package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class a94 {
    public boolean a;

    public final boolean a(View view, int i) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.a) {
                this.a = false;
                return true;
            }
            this.a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new z84(this, 0), 200L);
        }
        return false;
    }
}
