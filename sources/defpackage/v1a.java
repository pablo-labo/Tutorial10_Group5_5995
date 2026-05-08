package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class v1a<K, V> {
    public final z3a<Object, Object> a;

    public /* synthetic */ v1a(z3a z3aVar) {
        this.a = z3aVar;
    }

    public static final void a(z3a<Object, Object> z3aVar, K k, V v) {
        int i = z3aVar.i(k);
        boolean z = i < 0;
        Object obj = z ? null : z3aVar.c[i];
        if (obj != null) {
            if (obj instanceof p3a) {
                p3a p3aVar = (p3a) obj;
                p3aVar.g(v);
                v = (V) p3aVar;
            } else {
                Object[] objArr = pna.a;
                p3a p3aVar2 = new p3a(2);
                p3aVar2.g(obj);
                p3aVar2.g(v);
                v = (V) p3aVar2;
            }
        }
        if (!z) {
            z3aVar.c[i] = v;
            return;
        }
        int i2 = ~i;
        z3aVar.b[i2] = k;
        z3aVar.c[i2] = v;
    }

    public static z3a b() {
        return new z3a((Object) null);
    }

    public static final Object c(z3a z3aVar, o0a o0aVar) {
        Object objD = z3aVar.d(o0aVar);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof p3a)) {
            z3aVar.k(o0aVar);
            return objD;
        }
        p3a p3aVar = (p3a) objD;
        if (p3aVar.d()) {
            s6.j("List is empty.");
            return null;
        }
        int i = p3aVar.b - 1;
        E eB = p3aVar.b(i);
        p3aVar.k(i);
        eB.getClass();
        if (p3aVar.d()) {
            z3aVar.k(o0aVar);
        }
        if (p3aVar.b == 1) {
            z3aVar.m(o0aVar, p3aVar.a());
        }
        return eB;
    }

    public static final void d(z3a z3aVar, o0a o0aVar, Function1 function1) {
        Object objD = z3aVar.d(o0aVar);
        if (objD != null) {
            if (!(objD instanceof p3a)) {
                if (((Boolean) function1.invoke(objD)).booleanValue()) {
                    z3aVar.k(o0aVar);
                    return;
                }
                return;
            }
            p3a p3aVar = (p3a) objD;
            int i = p3aVar.b;
            Object[] objArr = p3aVar.a;
            int i2 = 0;
            oh7 oh7VarH = nic.H(0, i);
            int i3 = oh7VarH.a;
            int i4 = oh7VarH.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            pyd.q(null, i - i2, objArr, i);
            p3aVar.b -= i2;
            if (p3aVar.d()) {
                z3aVar.k(o0aVar);
            }
            if (p3aVar.b == 0) {
                z3aVar.m(o0aVar, p3aVar.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.p3a e(defpackage.z3a r15) {
        /*
            boolean r0 = r15.e()
            if (r0 == 0) goto Lc
            p3a r15 = defpackage.pna.b
            r15.getClass()
            return r15
        Lc:
            p3a r0 = new p3a
            r1 = 0
            r0.<init>(r1)
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L85
            r3 = 0
            r4 = r3
        L1d:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L80
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L37:
            if (r9 >= r7) goto L7e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof defpackage.p3a
            if (r11 == 0) goto L74
            p3a r10 = (defpackage.p3a) r10
            boolean r11 = r10.d()
            if (r11 == 0) goto L54
            goto L7a
        L54:
            int r11 = r0.b
            int r12 = r10.b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.a
            int r13 = r12.length
            if (r13 >= r11) goto L61
            r0.m(r11, r12)
        L61:
            java.lang.Object[] r11 = r0.a
            java.lang.Object[] r12 = r10.a
            int r13 = r0.b
            int r14 = r10.b
            defpackage.pyd.j(r12, r13, r11, r3, r14)
            int r11 = r0.b
            int r10 = r10.b
            int r11 = r11 + r10
            r0.b = r11
            goto L7a
        L74:
            r10.getClass()
            r0.g(r10)
        L7a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L7e:
            if (r7 != r8) goto L85
        L80:
            if (r4 == r2) goto L85
            int r4 = r4 + 1
            goto L1d
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1a.e(z3a):p3a");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1a) {
            return this.a.equals(((v1a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
