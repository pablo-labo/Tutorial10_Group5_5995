package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class abb {
    public final AutofillManager a;

    public abb(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            j51.a(view, this.a, i, z);
        }
    }
}
