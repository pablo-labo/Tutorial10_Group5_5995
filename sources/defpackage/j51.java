package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class j51 {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
