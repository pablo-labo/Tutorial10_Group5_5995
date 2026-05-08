package androidx.compose.runtime;

import defpackage.gu5;
import defpackage.i6c;
import defpackage.olg;
import defpackage.rt8;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<T> {
    public final rt8 a;

    public h() {
        throw null;
    }

    public h(gu5 gu5Var) {
        this.a = new rt8(gu5Var);
    }

    public abstract i6c<T> a(T t);

    public olg<Object> b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 java.lang.Object) = (r4v6 java.lang.Object), (r4v7 java.lang.Object) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.olg<T> c(defpackage.i6c<T> r3, defpackage.olg<T> r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.pe4
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.d
            if (r2 == 0) goto L44
            r0 = r4
            pe4 r0 = (defpackage.pe4) r0
            g4a<T> r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L44
        L16:
            boolean r2 = r4 instanceof defpackage.nte
            if (r2 == 0) goto L36
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            T r2 = r3.e
            if (r2 == 0) goto L44
        L22:
            boolean r2 = r3.d
            if (r2 != 0) goto L44
            java.lang.Object r2 = r3.a()
            nte r4 = (defpackage.nte) r4
            T r1 = r4.a
            boolean r2 = defpackage.wl7.b(r2, r1)
            if (r2 == 0) goto L44
        L34:
            r0 = r4
            goto L44
        L36:
            boolean r2 = r4 instanceof defpackage.en2
            if (r2 == 0) goto L44
            r3.getClass()
            en2 r4 = (defpackage.en2) r4
            kotlin.jvm.functions.Function1<mm2, T> r2 = r4.a
            if (r2 != 0) goto L44
            goto L34
        L44:
            if (r0 != 0) goto L67
            boolean r2 = r3.d
            if (r2 == 0) goto L5d
            pe4 r2 = new pe4
            T r4 = r3.e
            hme<T> r3 = r3.c
            if (r3 != 0) goto L54
            wab r3 = defpackage.wab.a0
        L54:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5d:
            nte r2 = new nte
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.h.c(i6c, olg):olg");
    }
}
