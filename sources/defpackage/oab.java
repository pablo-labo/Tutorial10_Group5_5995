package defpackage;

import android.content.Context;
import com.facebook.imagepipeline.request.a;
import defpackage.a2;

/* JADX INFO: loaded from: classes2.dex */
public final class oab extends a2<oab, a, n82<l82>, b17> {
    public final m27 j;
    public final qab k;

    public oab(Context context, qab qabVar, m27 m27Var) {
        c();
        this.j = m27Var;
        this.k = qabVar;
    }

    @Override // defpackage.a2
    public final u1 b(nab nabVar, String str, Object obj, Object obj2, a2.b bVar) {
        a.c cVar;
        a aVar = (a) obj;
        m27 m27Var = this.j;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            cVar = a.c.FULL_FETCH;
        } else if (iOrdinal == 1) {
            cVar = a.c.DISK_CACHE;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException("Cache level" + bVar + "is not supported. ");
            }
            cVar = a.c.BITMAP_MEMORY_CACHE;
        }
        synchronized (nabVar) {
        }
        return m27Var.a(aVar, obj2, cVar, null, str);
    }

    @Override // defpackage.a2
    public final nab d() {
        nab nabVar;
        vg1 vg1VarC;
        it5.a();
        try {
            gc4 gc4Var = this.f;
            String strValueOf = String.valueOf(a2.i.getAndIncrement());
            if (gc4Var instanceof nab) {
                nabVar = (nab) gc4Var;
            } else {
                qab qabVar = this.k;
                nab nabVar2 = new nab(qabVar.a, qabVar.b, qabVar.c, qabVar.d, qabVar.e, qabVar.f);
                if (qabVar.g != null) {
                    nabVar2.x = Boolean.FALSE.booleanValue();
                }
                nabVar = nabVar2;
            }
            gze<ye3<n82<l82>>> gzeVarE = e(nabVar, strValueOf);
            a aVar = this.b;
            am3 am3Var = this.j.h;
            if (am3Var == null || aVar == null) {
                vg1VarC = null;
            } else {
                vhb vhbVar = aVar.p;
                Object obj = this.a;
                vg1VarC = vhbVar != null ? am3Var.c(aVar, obj) : am3Var.a(aVar, obj);
            }
            Object obj2 = this.a;
            it5.a();
            nabVar.n(obj2, strValueOf);
            nabVar.o = false;
            nabVar.w = gzeVarE;
            nabVar.B(null);
            nabVar.v = vg1VarC;
            nabVar.B(null);
            it5.a();
            synchronized (nabVar) {
            }
            return nabVar;
        } finally {
            it5.a();
        }
    }
}
