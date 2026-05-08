package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l4i<T> implements w5i<T> {
    public final l3i a;
    public final b8i<?, ?> b;
    public final boolean c;
    public final qxh<?> d;

    public l4i(b8i<?, ?> b8iVar, qxh<?> qxhVar, l3i l3iVar) {
        this.b = b8iVar;
        this.c = qxhVar.e(l3iVar);
        this.d = qxhVar;
        this.a = l3iVar;
    }

    @Override // defpackage.w5i
    public final boolean a(T t) {
        this.d.b(t).e();
        return true;
    }

    @Override // defpackage.w5i
    public final void b(T t) {
        this.b.h(t);
        this.d.g(t);
    }

    @Override // defpackage.w5i
    public final int c(zth zthVar) {
        b8i<?, ?> b8iVar = this.b;
        int i = b8iVar.i(b8iVar.e(zthVar));
        if (this.c) {
            d6i d6iVar = this.d.b(zthVar).a;
            if (d6iVar.b.size() > 0) {
                uxh.c(d6iVar.f(0));
                throw null;
            }
            Iterator<T> it = d6iVar.h().iterator();
            if (it.hasNext()) {
                uxh.c((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // defpackage.w5i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(T r17, byte[] r18, int r19, int r20, defpackage.yuh r21) throws com.google.android.gms.internal.measurement.zzfw {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r4 = r20
            r6 = r21
            r1 = r17
            dzh r1 = (defpackage.dzh) r1
            x7i r3 = r1.zzb
            x7i r5 = defpackage.x7i.f
            if (r3 != r5) goto L19
            x7i r3 = new x7i
            r3.<init>()
            r1.zzb = r3
        L19:
            r5 = r3
            r1 = r17
            dzh$b r1 = (dzh.b) r1
            r1.r()
            r1 = r19
            r3 = 0
        L24:
            if (r1 >= r4) goto La4
            r8 = r3
            int r3 = defpackage.zuh.i(r2, r1, r6)
            int r1 = r6.a
            lxh r9 = r6.d
            r10 = 11
            l3i r11 = r0.a
            qxh<?> r12 = r0.d
            r13 = 2
            if (r1 == r10) goto L57
            r10 = r1 & 7
            if (r10 != r13) goto L52
            int r8 = r1 >>> 3
            dzh$d r8 = r12.c(r9, r11, r8)
            if (r8 != 0) goto L4a
            int r1 = defpackage.zuh.d(r1, r2, r3, r4, r5, r6)
        L48:
            r3 = r8
            goto L24
        L4a:
            l5i r0 = defpackage.l5i.c
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L52:
            int r1 = defpackage.zuh.b(r1, r2, r3, r4, r6)
            goto L48
        L57:
            r1 = 0
            r10 = 0
        L59:
            if (r3 >= r4) goto L99
            int r3 = defpackage.zuh.i(r2, r3, r6)
            int r14 = r6.a
            int r15 = r14 >>> 3
            r7 = r14 & 7
            if (r15 == r13) goto L83
            r13 = 3
            if (r15 == r13) goto L6b
            goto L90
        L6b:
            if (r8 != 0) goto L7b
            r13 = 2
            if (r7 != r13) goto L90
            int r3 = defpackage.zuh.n(r2, r3, r6)
            java.lang.Object r7 = r6.c
            r10 = r7
            fvh r10 = (defpackage.fvh) r10
        L79:
            r13 = 2
            goto L59
        L7b:
            l5i r0 = defpackage.l5i.c
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L83:
            if (r7 != 0) goto L90
            int r3 = defpackage.zuh.i(r2, r3, r6)
            int r1 = r6.a
            dzh$d r8 = r12.c(r9, r11, r1)
            goto L79
        L90:
            r7 = 12
            if (r14 == r7) goto L99
            int r3 = defpackage.zuh.b(r14, r2, r3, r4, r6)
            goto L79
        L99:
            if (r10 == 0) goto La2
            int r1 = r1 << 3
            r13 = 2
            r1 = r1 | r13
            r5.a(r1, r10)
        La2:
            r1 = r3
            goto L48
        La4:
            if (r1 != r4) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfw r0 = com.google.android.gms.internal.measurement.zzfw.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4i.d(java.lang.Object, byte[], int, int, yuh):void");
    }

    @Override // defpackage.w5i
    public final int e(dzh dzhVar) {
        int iHashCode = this.b.e(dzhVar).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.b(dzhVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.w5i
    public final T f() {
        return (T) this.a.g().l();
    }

    @Override // defpackage.w5i
    public final void g(T t, hai haiVar) {
        Iterator itD = this.d.b(t).d();
        if (itD.hasNext()) {
            ((cyh) ((Map.Entry) itD.next()).getKey()).zzc();
            throw null;
        }
        b8i<?, ?> b8iVar = this.b;
        b8iVar.f(b8iVar.e(t), haiVar);
    }

    @Override // defpackage.w5i
    public final void h(dzh dzhVar, dzh dzhVar2) {
        Class<?> cls = z5i.a;
        b8i<?, ?> b8iVar = this.b;
        b8iVar.c(dzhVar, b8iVar.g(b8iVar.e(dzhVar), b8iVar.e(dzhVar2)));
        if (this.c) {
            z5i.h(this.d, dzhVar, dzhVar2);
        }
    }

    @Override // defpackage.w5i
    public final boolean i(dzh dzhVar, dzh dzhVar2) {
        b8i<?, ?> b8iVar = this.b;
        if (!b8iVar.e(dzhVar).equals(b8iVar.e(dzhVar2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        qxh<?> qxhVar = this.d;
        return qxhVar.b(dzhVar).equals(qxhVar.b(dzhVar2));
    }
}
