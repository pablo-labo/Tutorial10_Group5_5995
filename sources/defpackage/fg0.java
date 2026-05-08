package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class fg0 {
    public static final void a(tgb tgbVar, eg0 eg0Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (eg0Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = tgbVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, eg0Var);
    }

    public static final void b(tgb tgbVar, eg0 eg0Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (eg0Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = tgbVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(eg0Var);
    }
}
