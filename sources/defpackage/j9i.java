package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;
import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class j9i<T> implements cbi<T> {
    public final x8i a;
    public final rci<?, ?> b;
    public final boolean c;
    public final t3i<?> d;

    public j9i(rci<?, ?> rciVar, t3i<?> t3iVar, x8i x8iVar) {
        this.b = rciVar;
        this.c = t3iVar.e(x8iVar);
        this.d = t3iVar;
        this.a = x8iVar;
    }

    @Override // defpackage.cbi
    public final T a() {
        return (T) this.a.c().h();
    }

    @Override // defpackage.cbi
    public final void b(a5i a5iVar, a5i a5iVar2) {
        Class<?> cls = hbi.a;
        rci<?, ?> rciVar = this.b;
        rciVar.i(a5iVar, rciVar.k(rciVar.e(a5iVar), rciVar.e(a5iVar2)));
        if (this.c) {
            hbi.b(this.d, a5iVar, a5iVar2);
        }
    }

    @Override // defpackage.cbi
    public final int c(a5i a5iVar) {
        int iHashCode = this.b.e(a5iVar).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.f(a5iVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.cbi
    public final boolean d(a5i a5iVar, a5i a5iVar2) {
        rci<?, ?> rciVar = this.b;
        if (!rciVar.e(a5iVar).equals(rciVar.e(a5iVar2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        t3i<?> t3iVar = this.d;
        return t3iVar.f(a5iVar).equals(t3iVar.f(a5iVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // defpackage.cbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(T r17, byte[] r18, int r19, int r20, defpackage.d0i r21) throws com.google.android.gms.internal.firebase_remote_config.zzhq {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r4 = r20
            r6 = r21
            r1 = r17
            a5i r1 = (defpackage.a5i) r1
            kdi r3 = r1.zztc
            kdi r5 = defpackage.kdi.e
            if (r3 != r5) goto L19
            kdi r3 = new kdi
            r3.<init>()
            r1.zztc = r3
        L19:
            r5 = r3
            r1 = r17
            a5i$d r1 = (a5i.d) r1
            r1.i()
            r1 = r19
            r3 = 0
        L24:
            if (r1 >= r4) goto La4
            r8 = r3
            int r3 = defpackage.vzh.i(r2, r1, r6)
            int r1 = r6.a
            m3i r9 = r6.d
            r10 = 11
            x8i r11 = r0.a
            t3i<?> r12 = r0.d
            r13 = 2
            if (r1 == r10) goto L57
            r10 = r1 & 7
            if (r10 != r13) goto L52
            int r8 = r1 >>> 3
            a5i$c r8 = r12.b(r9, r11, r8)
            if (r8 != 0) goto L4a
            int r1 = defpackage.vzh.d(r1, r2, r3, r4, r5, r6)
        L48:
            r3 = r8
            goto L24
        L4a:
            oai r0 = defpackage.oai.c
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L52:
            int r1 = defpackage.vzh.b(r1, r2, r3, r4, r6)
            goto L48
        L57:
            r1 = 0
            r10 = 0
        L59:
            if (r3 >= r4) goto L99
            int r3 = defpackage.vzh.i(r2, r3, r6)
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
            int r3 = defpackage.vzh.n(r2, r3, r6)
            java.lang.Object r7 = r6.c
            r10 = r7
            h0i r10 = (defpackage.h0i) r10
        L79:
            r13 = 2
            goto L59
        L7b:
            oai r0 = defpackage.oai.c
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L83:
            if (r7 != 0) goto L90
            int r3 = defpackage.vzh.i(r2, r3, r6)
            int r1 = r6.a
            a5i$c r8 = r12.b(r9, r11, r1)
            goto L79
        L90:
            r7 = 12
            if (r14 == r7) goto L99
            int r3 = defpackage.vzh.b(r14, r2, r3, r4, r6)
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
            com.google.android.gms.internal.firebase_remote_config.zzhq r0 = com.google.android.gms.internal.firebase_remote_config.zzhq.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j9i.e(java.lang.Object, byte[], int, int, d0i):void");
    }

    @Override // defpackage.cbi
    public final void f(T t) {
        this.b.m(t);
        this.d.h(t);
    }

    @Override // defpackage.cbi
    public final void g(T t, f4b f4bVar, m3i m3iVar) {
        boolean zD;
        int i;
        int i2;
        a2i a2iVar = (a2i) f4bVar.d;
        rci<?, ?> rciVar = this.b;
        kdi kdiVarF = rciVar.f(t);
        t3i<?> t3iVar = this.d;
        t3iVar.g(t);
        do {
            try {
                if (f4bVar.E() == Integer.MAX_VALUE) {
                    rciVar.j(t, kdiVarF);
                    return;
                }
                int i3 = f4bVar.a;
                boolean z = false;
                x8i x8iVar = this.a;
                if (i3 == 11) {
                    int iQ = 0;
                    a5i.c cVarB = null;
                    h0i h0iVarD = null;
                    for (int i4 = Integer.MAX_VALUE; f4bVar.E() != i4; i4 = Integer.MAX_VALUE) {
                        int i5 = f4bVar.a;
                        if (i5 == 16) {
                            f4bVar.s(0);
                            iQ = a2iVar.q();
                            cVarB = t3iVar.b(m3iVar, x8iVar, iQ);
                        } else if (i5 != 26) {
                            if (!((a2iVar.w() || (i = f4bVar.a) == f4bVar.b) ? false : a2iVar.z(i))) {
                                break;
                            }
                        } else {
                            if (cVarB != null) {
                                t3iVar.c();
                                throw null;
                            }
                            h0iVarD = f4bVar.D();
                        }
                    }
                    if (f4bVar.a != 12) {
                        throw new zzhq("Protocol message end-group tag did not match expected tag.");
                    }
                    if (h0iVarD != null) {
                        if (cVarB != null) {
                            t3iVar.d();
                            throw null;
                        }
                        rciVar.c(kdiVarF, iQ, h0iVarD);
                    }
                    zD = true;
                } else if ((i3 & 7) != 2) {
                    if (!a2iVar.w() && (i2 = f4bVar.a) != f4bVar.b) {
                        z = a2iVar.z(i2);
                    }
                    zD = z;
                } else {
                    if (t3iVar.b(m3iVar, x8iVar, i3 >>> 3) != null) {
                        t3iVar.c();
                        throw null;
                    }
                    zD = rciVar.d(kdiVarF, f4bVar);
                }
            } catch (Throwable th) {
                rciVar.j(t, kdiVarF);
                throw th;
            }
        } while (zD);
        rciVar.j(t, kdiVarF);
    }

    @Override // defpackage.cbi
    public final boolean h(T t) {
        return this.d.f(t).a();
    }
}
