package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class xid extends tpc implements ViewTreeObserver.OnPreDrawListener {
    public wu5<? super xid, ? super gf4, ? super ptc, j6g> a;
    public gf4 b;
    public ptc c;

    public final void g() {
        gf4 gf4VarB;
        wu5<? super xid, ? super gf4, ? super ptc, j6g> wu5Var = this.a;
        if (wu5Var == null || (gf4VarB = zid.b(this)) == null) {
            return;
        }
        View rootView = getRootView();
        rootView.getClass();
        ptc ptcVarA = zid.a((ViewGroup) rootView, this);
        if (ptcVarA == null) {
            return;
        }
        if (wl7.b(this.b, gf4VarB) && wl7.b(this.c, ptcVarA)) {
            return;
        }
        wu5Var.q(this, gf4VarB, ptcVarA);
        this.b = gf4VarB;
        this.c = ptcVarA;
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        g();
        return true;
    }

    public final void setOnInsetsChangeHandler(wu5<? super xid, ? super gf4, ? super ptc, j6g> wu5Var) {
        this.a = wu5Var;
        g();
    }
}
