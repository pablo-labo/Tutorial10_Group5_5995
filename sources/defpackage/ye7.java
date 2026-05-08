package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class ye7 implements we7 {
    public final View a;
    public final Lazy b = boa.E(qt8.c, new j30(this, 9));

    public ye7(View view) {
        this.a = view;
    }

    @Override // defpackage.we7
    public final void a() {
        if (Build.VERSION.SDK_INT >= 34) {
            jg0.a(b(), this.a);
        }
    }

    public final InputMethodManager b() {
        return (InputMethodManager) this.b.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        b().updateSelection(this.a, i, i2, i3, i4);
    }
}
