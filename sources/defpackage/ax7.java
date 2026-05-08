package defpackage;

import defpackage.zsg;

/* JADX INFO: loaded from: classes3.dex */
public final class ax7 extends i7 {
    public static final ax7 d = new ax7("protected_and_package", true);

    @Override // defpackage.i7
    public final String V() {
        return "protected/*protected and package*/";
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
        if (i7Var == zsg.b.d) {
            return null;
        }
        hb9 hb9Var = zsg.a;
        return (i7Var == zsg.e.d || i7Var == zsg.f.d) ? 1 : -1;
    }
}
