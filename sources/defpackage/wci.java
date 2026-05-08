package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wci extends rci<kdi, kdi> {
    @Override // defpackage.rci
    public final /* synthetic */ void a(int i, Object obj, Object obj2) {
        ((kdi) obj).a((i << 3) | 3, (kdi) obj2);
    }

    @Override // defpackage.rci
    public final /* synthetic */ void b(kdi kdiVar, int i, long j) {
        kdiVar.a(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.rci
    public final /* synthetic */ void c(kdi kdiVar, int i, h0i h0iVar) {
        kdiVar.a((i << 3) | 2, h0iVar);
    }

    @Override // defpackage.rci
    public final /* synthetic */ kdi e(Object obj) {
        return ((a5i) obj).zztc;
    }

    @Override // defpackage.rci
    public final kdi f(Object obj) {
        a5i a5iVar = (a5i) obj;
        kdi kdiVar = a5iVar.zztc;
        if (kdiVar != kdi.e) {
            return kdiVar;
        }
        kdi kdiVar2 = new kdi();
        a5iVar.zztc = kdiVar2;
        return kdiVar2;
    }

    @Override // defpackage.rci
    public final /* synthetic */ void g(kdi kdiVar, int i, long j) {
        kdiVar.a((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.rci
    public final /* synthetic */ void h(kdi kdiVar, int i, int i2) {
        kdiVar.a((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.rci
    public final void i(Object obj, kdi kdiVar) {
        ((a5i) obj).zztc = kdiVar;
    }

    @Override // defpackage.rci
    public final void j(Object obj, kdi kdiVar) {
        ((a5i) obj).zztc = kdiVar;
    }

    @Override // defpackage.rci
    public final kdi k(Object obj, Object obj2) {
        kdi kdiVar = (kdi) obj;
        kdi kdiVar2 = (kdi) obj2;
        if (kdiVar2.equals(kdi.e)) {
            return kdiVar;
        }
        int i = kdiVar.a + kdiVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(kdiVar.b, i);
        System.arraycopy(kdiVar2.b, 0, iArrCopyOf, kdiVar.a, kdiVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(kdiVar.c, i);
        System.arraycopy(kdiVar2.c, 0, objArrCopyOf, kdiVar.a, kdiVar2.a);
        return new kdi(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // defpackage.rci
    public final kdi l() {
        return new kdi();
    }

    @Override // defpackage.rci
    public final void m(Object obj) {
        ((a5i) obj).zztc.d = false;
    }

    @Override // defpackage.rci
    public final kdi n(Object obj) {
        kdi kdiVar = (kdi) obj;
        kdiVar.d = false;
        return kdiVar;
    }
}
