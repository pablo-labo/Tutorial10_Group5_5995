package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hnf extends j72 {
    public boolean A0;
    public Function1<? super Boolean, j6g> B0;
    public final zh C0;

    public hnf() {
        throw null;
    }

    public hnf(final boolean z, d3a d3aVar, boolean z2, qed qedVar, final Function1 function1) {
        super(d3aVar, null, false, z2, null, qedVar, new gu5() { // from class: gnf
            @Override // defpackage.gu5
            public final Object invoke() {
                function1.invoke(Boolean.valueOf(!z));
                return j6g.a;
            }
        });
        this.A0 = z;
        this.B0 = function1;
        this.C0 = new zh(this, 25);
    }

    @Override // defpackage.b1
    public final void f2(s5e s5eVar) {
        inf infVar = this.A0 ? inf.a : inf.b;
        qf8<Object>[] qf8VarArr = o5e.a;
        r5e<inf> r5eVar = k5e.I;
        qf8<Object> qf8Var = o5e.a[24];
        s5eVar.a(r5eVar, infVar);
    }
}
