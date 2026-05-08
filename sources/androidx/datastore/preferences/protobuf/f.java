package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.a6c;
import defpackage.ot8;
import defpackage.r0h;
import defpackage.tr1;
import defpackage.uod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d0 {
    public final e a;
    public int b;
    public int c;
    public int d = 0;

    public f(e eVar) {
        p.a(eVar, "input");
        this.a = eVar;
        eVar.d = this;
    }

    public static void U(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void V(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void A(java.util.Map<K, V> r10, androidx.datastore.preferences.protobuf.u.a<K, V> r11, androidx.datastore.preferences.protobuf.i r12) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.T(r0)
            androidx.datastore.preferences.protobuf.e r1 = r9.a
            int r2 = r1.w()
            int r2 = r1.f(r2)
            r11.getClass()
            V r3 = r11.c
            java.lang.String r4 = ""
            r5 = r3
        L16:
            int r6 = r9.E()     // Catch: java.lang.Throwable -> L3a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5c
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L26
            goto L5c
        L26:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L47
            if (r6 == r0) goto L3c
            boolean r6 = r9.I()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            if (r6 == 0) goto L34
            goto L16
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            throw r6     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
        L3a:
            r9 = move-exception
            goto L63
        L3c:
            r0h r6 = r11.b     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Object r5 = r9.O(r6, r7, r12)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L47:
            r0h r6 = r11.a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r7 = 0
            java.lang.Object r4 = r9.O(r6, r7, r7)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L4f:
            boolean r6 = r9.I()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L56
            goto L16
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r9     // Catch: java.lang.Throwable -> L3a
        L5c:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L3a
            r1.e(r2)
            return
        L63:
            r1.e(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f.A(java.util.Map, androidx.datastore.preferences.protobuf.u$a, androidx.datastore.preferences.protobuf.i):void");
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void B(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iW = eVar.w();
                U(iW);
                int iC = eVar.c() + iW;
                do {
                    list.add(Integer.valueOf(eVar.k()));
                } while (eVar.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(eVar.k()));
                if (eVar.d()) {
                    return;
                } else {
                    iV = eVar.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iW2 = eVar.w();
            U(iW2);
            int iC2 = eVar.c() + iW2;
            do {
                oVar.b(eVar.k());
            } while (eVar.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            oVar.b(eVar.k());
            if (eVar.d()) {
                return;
            } else {
                iV2 = eVar.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final long C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final String D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(2);
        return this.a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int E() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.v();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void F(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final <T> T G(uod<T> uodVar, i iVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(2);
        return (T) Q(uodVar, iVar);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void H(List<Float> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof m;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iW = eVar.w();
                U(iW);
                int iC = eVar.c() + iW;
                do {
                    list.add(Float.valueOf(eVar.m()));
                } while (eVar.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Float.valueOf(eVar.m()));
                if (eVar.d()) {
                    return;
                } else {
                    iV = eVar.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        m mVar = (m) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iW2 = eVar.w();
            U(iW2);
            int iC2 = eVar.c() + iW2;
            do {
                mVar.b(eVar.m());
            } while (eVar.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            mVar.b(eVar.m());
            if (eVar.d()) {
                return;
            } else {
                iV2 = eVar.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final boolean I() {
        int i;
        e eVar = this.a;
        if (eVar.d() || (i = this.b) == this.c) {
            return false;
        }
        return eVar.y(i);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int J() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(5);
        return this.a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void K(List<tr1> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(q());
            e eVar = this.a;
            if (eVar.d()) {
                return;
            } else {
                iV = eVar.v();
            }
        } while (iV == this.b);
        this.d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void L(List<Double> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof h;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(eVar.i()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = eVar.w();
            V(iW);
            int iC = eVar.c() + iW;
            do {
                list.add(Double.valueOf(eVar.i()));
            } while (eVar.c() < iC);
            return;
        }
        h hVar = (h) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                hVar.b(eVar.i());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = eVar.w();
        V(iW2);
        int iC2 = eVar.c() + iW2;
        do {
            hVar.b(eVar.i());
        } while (eVar.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final long M() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final String N() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(2);
        return this.a.u();
    }

    public final Object O(r0h r0hVar, Class<?> cls, i iVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (r0hVar.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(M());
            case 3:
                return Long.valueOf(u());
            case 4:
                return Integer.valueOf(r());
            case 5:
                return Long.valueOf(b());
            case 6:
                return Integer.valueOf(w());
            case 7:
                return Boolean.valueOf(g());
            case 8:
                return N();
            case DatadogLogGenerator.CRASH /* 9 */:
            default:
                defpackage.b0.o("unsupported field type.");
                return null;
            case 10:
                T(2);
                return Q(a6c.c.a(cls), iVar);
            case 11:
                return q();
            case 12:
                return Integer.valueOf(j());
            case 13:
                return Integer.valueOf(m());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(J());
            case 15:
                return Long.valueOf(h());
            case 16:
                return Integer.valueOf(n());
            case 17:
                return Long.valueOf(C());
        }
    }

    public final <T> T P(uod<T> uodVar, i iVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T tA = uodVar.a();
            uodVar.b(tA, this, iVar);
            uodVar.c(tA);
            if (this.b == this.c) {
                return tA;
            }
            throw InvalidProtocolBufferException.e();
        } finally {
            this.c = i;
        }
    }

    public final <T> T Q(uod<T> uodVar, i iVar) throws InvalidProtocolBufferException {
        e eVar = this.a;
        int iW = eVar.w();
        if (eVar.a >= eVar.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iF = eVar.f(iW);
        T tA = uodVar.a();
        eVar.a++;
        uodVar.b(tA, this, iVar);
        uodVar.c(tA);
        eVar.a(0);
        eVar.a--;
        eVar.e(iF);
        return tA;
    }

    public final void R(List<String> list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        int iV2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z2 = list instanceof ot8;
        e eVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? N() : D());
                if (eVar.d()) {
                    return;
                } else {
                    iV = eVar.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        ot8 ot8Var = (ot8) list;
        do {
            ot8Var.f0(q());
            if (eVar.d()) {
                return;
            } else {
                iV2 = eVar.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    public final void S(int i) throws InvalidProtocolBufferException {
        if (this.a.c() != i) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void T(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int a() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final long b() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(1);
        return this.a.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d0
    public final <T> void c(List<T> list, uod<T> uodVar, i iVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(P(uodVar, iVar));
            e eVar = this.a;
            if (eVar.d() || this.d != 0) {
                return;
            } else {
                iV = eVar.v();
            }
        } while (iV == i);
        this.d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void d(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iW = eVar.w();
                U(iW);
                int iC = eVar.c() + iW;
                do {
                    list.add(Integer.valueOf(eVar.p()));
                } while (eVar.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(eVar.p()));
                if (eVar.d()) {
                    return;
                } else {
                    iV = eVar.v();
                }
            } while (iV == this.b);
            this.d = iV;
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iW2 = eVar.w();
            U(iW2);
            int iC2 = eVar.c() + iW2;
            do {
                oVar.b(eVar.p());
            } while (eVar.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            oVar.b(eVar.p());
            if (eVar.d()) {
                return;
            } else {
                iV2 = eVar.v();
            }
        } while (iV2 == this.b);
        this.d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void e(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof t;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eVar.s()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Long.valueOf(eVar.s()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        t tVar = (t) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tVar.b(eVar.s());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            tVar.b(eVar.s());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d0
    public final <T> void f(List<T> list, uod<T> uodVar, i iVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Q(uodVar, iVar));
            e eVar = this.a;
            if (eVar.d() || this.d != 0) {
                return;
            } else {
                iV = eVar.v();
            }
        } while (iV == i);
        this.d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final boolean g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final long h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(1);
        return this.a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void i(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof t;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eVar.x()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Long.valueOf(eVar.x()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        t tVar = (t) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tVar.b(eVar.x());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            tVar.b(eVar.x());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void k(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof t;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eVar.o()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Long.valueOf(eVar.o()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        t tVar = (t) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tVar.b(eVar.o());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            tVar.b(eVar.o());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void l(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eVar.j()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Integer.valueOf(eVar.j()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                oVar.b(eVar.j());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            oVar.b(eVar.j());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int m() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int n() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void o(List<Boolean> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof d;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(eVar.g()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Boolean.valueOf(eVar.g()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        d dVar = (d) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                dVar.b(eVar.g());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            dVar.b(eVar.g());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void p(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final tr1 q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(2);
        return this.a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(1);
        return this.a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(5);
        return this.a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void s(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof t;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(eVar.l()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = eVar.w();
            V(iW);
            int iC = eVar.c() + iW;
            do {
                list.add(Long.valueOf(eVar.l()));
            } while (eVar.c() < iC);
            return;
        }
        t tVar = (t) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                tVar.b(eVar.l());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = eVar.w();
        V(iW2);
        int iC2 = eVar.c() + iW2;
        do {
            tVar.b(eVar.l());
        } while (eVar.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void t(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eVar.r()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Integer.valueOf(eVar.r()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                oVar.b(eVar.r());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            oVar.b(eVar.r());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final long u() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(0);
        return this.a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void v(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eVar.w()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Integer.valueOf(eVar.w()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                oVar.b(eVar.w());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            oVar.b(eVar.w());
        } while (eVar.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(5);
        return this.a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final <T> T x(uod<T> uodVar, i iVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(3);
        return (T) P(uodVar, iVar);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void y(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof t;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(eVar.q()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = eVar.w();
            V(iW);
            int iC = eVar.c() + iW;
            do {
                list.add(Long.valueOf(eVar.q()));
            } while (eVar.c() < iC);
            return;
        }
        t tVar = (t) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                tVar.b(eVar.q());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = eVar.w();
        V(iW2);
        int iC2 = eVar.c() + iW2;
        do {
            tVar.b(eVar.q());
        } while (eVar.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void z(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z = list instanceof o;
        int i = this.b;
        e eVar = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eVar.n()));
                    if (eVar.d()) {
                        return;
                    } else {
                        iV = eVar.v();
                    }
                } while (iV == this.b);
                this.d = iV;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = eVar.c() + eVar.w();
            do {
                list.add(Integer.valueOf(eVar.n()));
            } while (eVar.c() < iC);
            S(iC);
            return;
        }
        o oVar = (o) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                oVar.b(eVar.n());
                if (eVar.d()) {
                    return;
                } else {
                    iV2 = eVar.v();
                }
            } while (iV2 == this.b);
            this.d = iV2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = eVar.c() + eVar.w();
        do {
            oVar.b(eVar.n());
        } while (eVar.c() < iC2);
        S(iC2);
    }
}
