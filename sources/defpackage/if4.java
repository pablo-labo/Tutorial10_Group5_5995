package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import defpackage.uzg;

/* JADX INFO: loaded from: classes.dex */
public class if4 {
    public void a(Window window) {
    }

    public void b(l2f l2fVar, l2f l2fVar2, Window window, View view, boolean z, boolean z2) {
        l2fVar.getClass();
        l2fVar2.getClass();
        window.getClass();
        view.getClass();
        izg.a(window, false);
        window.setStatusBarColor(z ? l2fVar.b : l2fVar.a);
        window.setNavigationBarColor(z2 ? l2fVar2.b : l2fVar2.a);
        ine ineVar = new ine(view);
        int i = Build.VERSION.SDK_INT;
        uzg.g fVar = i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar);
        fVar.d(!z);
        fVar.c(!z2);
    }
}
