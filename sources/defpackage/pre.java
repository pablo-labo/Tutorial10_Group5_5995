package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class pre implements o55 {
    public final long a;
    public final o55 b;

    public class a extends dq5 {
        public final /* synthetic */ zxd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zxd zxdVar, zxd zxdVar2) {
            super(zxdVar);
            this.b = zxdVar2;
        }

        @Override // defpackage.dq5, defpackage.zxd
        public final zxd.a e(long j) {
            zxd.a aVarE = this.b.e(j);
            byd bydVar = aVarE.a;
            long j2 = bydVar.a;
            long j3 = bydVar.b;
            long j4 = pre.this.a;
            byd bydVar2 = new byd(j2, j3 + j4);
            byd bydVar3 = aVarE.b;
            return new zxd.a(bydVar2, new byd(bydVar3.a, bydVar3.b + j4));
        }
    }

    public pre(long j, o55 o55Var) {
        this.a = j;
        this.b = o55Var;
    }

    @Override // defpackage.o55
    public final void b(zxd zxdVar) {
        this.b.b(new a(zxdVar, zxdVar));
    }

    @Override // defpackage.o55
    public final void m() {
        this.b.m();
    }

    @Override // defpackage.o55
    public final zpf o(int i, int i2) {
        return this.b.o(i, i2);
    }
}
