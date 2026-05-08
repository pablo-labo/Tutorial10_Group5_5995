package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import defpackage.uzg;

/* JADX INFO: loaded from: classes.dex */
public class kf4 extends jf4 {
    @Override // defpackage.if4
    public void b(l2f l2fVar, l2f l2fVar2, Window window, View view, boolean z, boolean z2) {
        l2fVar.getClass();
        l2fVar2.getClass();
        window.getClass();
        view.getClass();
        izg.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ine ineVar = new ine(view);
        int i = Build.VERSION.SDK_INT;
        uzg.g fVar = i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar);
        fVar.d(!z);
        fVar.c(true ^ z2);
    }
}
