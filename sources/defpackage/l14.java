package defpackage;

import defpackage.j14;

/* JADX INFO: loaded from: classes3.dex */
public final class l14 implements gu5 {
    public final j14.b a;
    public final j14 b;

    public l14(j14.b bVar, j14 j14Var) {
        this.a = bVar;
        this.b = j14Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        return bbe.o(this.a.a.keySet(), this.b.o());
    }
}
