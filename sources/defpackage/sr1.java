package defpackage;

import defpackage.tr1;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends tr1.a {
    public int a = 0;
    public final int b;
    public final /* synthetic */ tr1 c;

    public sr1(tr1 tr1Var) {
        this.c = tr1Var;
        this.b = tr1Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
