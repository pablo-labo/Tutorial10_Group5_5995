package defpackage;

import defpackage.zsg;

/* JADX INFO: loaded from: classes3.dex */
public final class zw7 extends i7 {
    public static final zw7 d = new zw7("package", false);

    @Override // defpackage.i7
    public final String V() {
        return "public/*package*/";
    }

    @Override // defpackage.i7
    public final i7 d0() {
        return zsg.g.d;
    }

    @Override // defpackage.i7
    public final Integer r(i7 i7Var) {
        i7Var.getClass();
        if (this == i7Var) {
            return 0;
        }
        hb9 hb9Var = zsg.a;
        return (i7Var == zsg.e.d || i7Var == zsg.f.d) ? 1 : -1;
    }
}
