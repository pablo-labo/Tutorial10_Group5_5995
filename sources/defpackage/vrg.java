package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class vrg implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ wrg<View> b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ qw1 d;

    public vrg(wrg wrgVar, ViewTreeObserver viewTreeObserver, qw1 qw1Var) {
        this.b = wrgVar;
        this.c = viewTreeObserver;
        this.d = qw1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        wrg<View> wrgVar = this.b;
        iie iieVarA = wrgVar.a();
        if (iieVarA != null) {
            wrgVar.s(this.c, this);
            if (!this.a) {
                this.a = true;
                this.d.resumeWith(iieVarA);
            }
        }
        return true;
    }
}
