package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class at0 implements ub4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt0 b;

    public at0(bt0 bt0Var, int i) {
        this.b = bt0Var;
        this.a = i;
    }

    @Override // defpackage.ub4
    public final Drawable e(Drawable drawable) {
        return this.b.c(this.a, drawable);
    }

    @Override // defpackage.ub4
    public final Drawable q() {
        return this.b.a(this.a);
    }
}
