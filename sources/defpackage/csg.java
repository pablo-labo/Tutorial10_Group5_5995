package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class csg implements View.OnAttachStateChangeListener {
    public final View a;
    public zrg b;
    public uqe c;
    public asg d;
    public boolean e;

    public csg(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        asg asgVar = this.d;
        if (asgVar == null) {
            return;
        }
        this.e = true;
        asgVar.a.a(asgVar.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        asg asgVar = this.d;
        if (asgVar != null) {
            asgVar.e();
        }
    }
}
