package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class aee implements sea {
    public final /* synthetic */ hee a;
    public final /* synthetic */ Function1<Float, j6g> b;

    public aee(hee heeVar, Function1 function1) {
        this.a = heeVar;
        this.b = function1;
    }

    @Override // defpackage.sea
    public final Object T0(long j, long j2, lu2<? super vmg> lu2Var) {
        this.b.invoke(new Float(vmg.c(j2)));
        return new vmg(j2);
    }

    @Override // defpackage.sea
    public final long Z0(long j, int i, long j2) {
        if (i == 1) {
            return wab.c(0.0f, this.a.c.d(Float.intBitsToFloat((int) (4294967295L & j2))));
        }
        return 0L;
    }

    @Override // defpackage.sea
    public final long e0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        return wab.c(0.0f, this.a.c.d(fIntBitsToFloat));
    }

    @Override // defpackage.sea
    public final Object s0(long j, lu2<? super vmg> lu2Var) {
        float fC = vmg.c(j);
        hee heeVar = this.a;
        float fG = heeVar.c.g();
        float fE = heeVar.c.e().e();
        if (fC >= 0.0f || fG <= fE) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new vmg(j);
    }
}
