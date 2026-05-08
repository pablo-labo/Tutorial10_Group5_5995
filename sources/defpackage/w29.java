package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class w29 implements b0f {
    public final Object a;
    public Object b;
    public Object c;

    public w29(o8c o8cVar, d8c d8cVar) {
        p8c p8cVar = new p8c();
        o8cVar.getClass();
        d8cVar.getClass();
        this.a = o8cVar;
        this.b = d8cVar;
        this.c = p8cVar;
    }

    @Override // defpackage.b0f
    public boolean a() {
        v29 v29Var = (v29) this.c;
        if (v29Var != null) {
            return v29Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.b0f
    public void b() {
        if (a() || !d()) {
            return;
        }
        Activity activityB = ((w24) this.a).b();
        if (activityB == null || activityB.isFinishing()) {
            s55.f("ReactNative", "Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        v29 v29Var = new v29(activityB, (View) this.b);
        this.c = v29Var;
        v29Var.setCancelable(false);
        v29Var.show();
    }

    @Override // defpackage.b0f
    public void c() {
        v29 v29Var;
        if (a() && (v29Var = (v29) this.c) != null) {
            v29Var.dismiss();
        }
        View view = (View) this.b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView((View) this.b);
        }
        this.c = null;
    }

    @Override // defpackage.b0f
    public boolean d() {
        return ((View) this.b) != null;
    }

    @Override // defpackage.b0f
    public void e(String str) {
        View viewQ = ((w24) this.a).q();
        this.b = viewQ;
        if (viewQ == null) {
            s55.f("ReactNative", "Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // defpackage.b0f
    public void f() {
        View view = (View) this.b;
        if (view != null) {
            ((w24) this.a).o(view);
            this.b = null;
        }
    }

    public w29(w24 w24Var) {
        this.a = w24Var;
    }
}
