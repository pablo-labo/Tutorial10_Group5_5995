package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
public final class t17 extends z81<Object> {
    public final gh3 b;
    public long c = -1;

    public t17(gh3 gh3Var) {
        this.b = gh3Var;
    }

    @Override // defpackage.z81, defpackage.vu2
    public final void j(String str, Object obj, Animatable animatable) {
        str.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        gh3 gh3Var = this.b;
        gh3Var.s = jCurrentTimeMillis;
        gh3Var.invalidateSelf();
    }

    @Override // defpackage.z81, defpackage.vu2
    public final void l(Object obj, String str) {
        str.getClass();
        this.c = System.currentTimeMillis();
    }
}
