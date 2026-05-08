package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w4e implements s5e, Iterable<Map.Entry<? extends r5e<?>, ? extends Object>>, ze8 {
    public final z3a<r5e<?>, Object> a = lnd.b();
    public bc9 b;
    public boolean c;
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s5e
    public final <T> void a(r5e<T> r5eVar, T t) {
        boolean z = t instanceof r5;
        z3a<r5e<?>, Object> z3aVar = this.a;
        if (z && z3aVar.b(r5eVar)) {
            Object objD = z3aVar.d(r5eVar);
            objD.getClass();
            r5 r5Var = (r5) objD;
            r5 r5Var2 = (r5) t;
            String str = r5Var2.a;
            if (str == null) {
                str = r5Var.a;
            }
            vu5 vu5Var = r5Var2.b;
            if (vu5Var == null) {
                vu5Var = r5Var.b;
            }
            z3aVar.m(r5eVar, new r5(str, vu5Var));
        } else {
            z3aVar.m(r5eVar, t);
        }
        r5eVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.w4e b() {
        /*
            r17 = this;
            r0 = r17
            w4e r1 = new w4e
            r1.<init>()
            boolean r2 = r0.c
            r1.c = r2
            boolean r2 = r0.d
            r1.d = r2
            z3a<r5e<?>, java.lang.Object> r2 = r1.a
            r2.getClass()
            z3a<r5e<?>, java.lang.Object> r0 = r0.a
            r0.getClass()
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4e.b():w4e");
    }

    public final <T> T d(r5e<T> r5eVar) {
        T t = (T) this.a.d(r5eVar);
        if (t != null) {
            return t;
        }
        n6.d("Key not present: ", r5eVar, " - consider getOrElse or getOrNull");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4e)) {
            return false;
        }
        w4e w4eVar = (w4e) obj;
        return wl7.b(this.a, w4eVar.a) && this.c == w4eVar.c && this.d == w4eVar.d;
    }

    public final <T> T f(r5e<T> r5eVar, gu5<? extends T> gu5Var) {
        T t = (T) this.a.d(r5eVar);
        return t == null ? gu5Var.invoke() : t;
    }

    public final void g(w4e w4eVar) {
        z3a<r5e<?>, Object> z3aVar = w4eVar.a;
        Object[] objArr = z3aVar.b;
        Object[] objArr2 = z3aVar.c;
        long[] jArr = z3aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        r5e<?> r5eVar = (r5e) obj;
                        z3a<r5e<?>, Object> z3aVar2 = this.a;
                        Object objD = z3aVar2.d(r5eVar);
                        r5eVar.getClass();
                        Object objInvoke = r5eVar.b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            z3aVar2.m(r5eVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ia.f(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends r5e<?>, ? extends Object>> iterator() {
        bc9 bc9Var = this.b;
        if (bc9Var == null) {
            z3a<r5e<?>, Object> z3aVar = this.a;
            z3aVar.getClass();
            bc9 bc9Var2 = new bc9(z3aVar);
            this.b = bc9Var2;
            bc9Var = bc9Var2;
        }
        return ((sv4) bc9Var.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            z3a<r5e<?>, java.lang.Object> r4 = r0.a
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            r5e r8 = (defpackage.r5e) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = defpackage.ie7.z(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4e.toString():java.lang.String");
    }
}
