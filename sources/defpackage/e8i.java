package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e8i extends b8i<x7i, x7i> {
    @Override // defpackage.b8i
    public final x7i a() {
        return new x7i();
    }

    @Override // defpackage.b8i
    public final /* synthetic */ void b(x7i x7iVar, int i, long j) {
        x7iVar.a(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.b8i
    public final void c(Object obj, x7i x7iVar) {
        ((dzh) obj).zzb = x7iVar;
    }

    @Override // defpackage.b8i
    public final /* synthetic */ void d(x7i x7iVar, hai haiVar) {
        x7iVar.b(haiVar);
    }

    @Override // defpackage.b8i
    public final /* synthetic */ x7i e(Object obj) {
        return ((dzh) obj).zzb;
    }

    @Override // defpackage.b8i
    public final void f(x7i x7iVar, hai haiVar) {
        x7i x7iVar2 = x7iVar;
        x7iVar2.getClass();
        haiVar.getClass();
        for (int i = 0; i < x7iVar2.a; i++) {
            int i2 = x7iVar2.b[i] >>> 3;
            Object obj = x7iVar2.c[i];
            boolean z = obj instanceof fvh;
            zzev zzevVar = ((qwh) haiVar).a;
            if (z) {
                zzevVar.W1(i2, (fvh) obj);
            } else {
                zzevVar.P1(i2, (l3i) obj);
            }
        }
    }

    @Override // defpackage.b8i
    public final x7i g(Object obj, Object obj2) {
        x7i x7iVar = (x7i) obj;
        x7i x7iVar2 = (x7i) obj2;
        if (x7iVar2.equals(x7i.f)) {
            return x7iVar;
        }
        int i = x7iVar.a + x7iVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(x7iVar.b, i);
        System.arraycopy(x7iVar2.b, 0, iArrCopyOf, x7iVar.a, x7iVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(x7iVar.c, i);
        System.arraycopy(x7iVar2.c, 0, objArrCopyOf, x7iVar.a, x7iVar2.a);
        return new x7i(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // defpackage.b8i
    public final void h(Object obj) {
        ((dzh) obj).zzb.e = false;
    }

    @Override // defpackage.b8i
    public final int i(x7i x7iVar) {
        x7i x7iVar2 = x7iVar;
        int i = x7iVar2.d;
        if (i != -1) {
            return i;
        }
        int iX1 = 0;
        for (int i2 = 0; i2 < x7iVar2.a; i2++) {
            int i3 = x7iVar2.b[i2] >>> 3;
            iX1 += zzev.X1(3, (fvh) x7iVar2.c[i2]) + zzev.i2(2, i3) + (zzev.d2(1) << 1);
        }
        x7iVar2.d = iX1;
        return iX1;
    }

    @Override // defpackage.b8i
    public final /* synthetic */ int j(x7i x7iVar) {
        return x7iVar.c();
    }
}
