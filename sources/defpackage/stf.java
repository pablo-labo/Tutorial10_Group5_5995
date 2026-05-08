package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class stf<K, V> {
    public static final stf e = new stf(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final bf9 c;
    public Object[] d;

    public static final class a<K, V> {
        public stf<K, V> a;
        public final int b;

        public a(stf<K, V> stfVar, int i) {
            this.a = stfVar;
            this.b = i;
        }
    }

    public stf(int i, int i2, Object[] objArr, bf9 bf9Var) {
        this.a = i;
        this.b = i2;
        this.c = bf9Var;
        this.d = objArr;
    }

    public static stf j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, bf9 bf9Var) {
        if (i3 > 30) {
            return new stf(0, 0, new Object[]{obj, obj2, obj3, obj4}, bf9Var);
        }
        int iD = wtf.d(i, i3);
        int iD2 = wtf.d(i2, i3);
        if (iD != iD2) {
            return new stf((1 << iD) | (1 << iD2), 0, iD < iD2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bf9Var);
        }
        return new stf(0, 1 << iD, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, bf9Var)}, bf9Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, bf9 bf9Var) {
        Object obj = this.d[i];
        stf stfVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i), i3, k, v, i4 + 5, bf9Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        pyd.l(objArr, 0, objArr2, i, 6);
        pyd.j(objArr, i, objArr2, i + 2, i5);
        objArr2[iT - 1] = stfVarJ;
        pyd.j(objArr, iT, objArr2, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(K k) {
        mh7 mh7VarG = nic.G(2, nic.H(0, this.d.length));
        int i = mh7VarG.a;
        int i2 = mh7VarG.b;
        int i3 = mh7VarG.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!wl7.b(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Object obj, int i, int i2) {
        int iD = 1 << wtf.d(i, i2);
        if (h(iD)) {
            return wl7.b(obj, this.d[f(iD)]);
        }
        if (!i(iD)) {
            return false;
        }
        stf<K, V> stfVarS = s(t(iD));
        return i2 == 30 ? stfVarS.c(obj) : stfVarS.d(obj, i, i2 + 5);
    }

    public final boolean e(stf<K, V> stfVar) {
        if (this == stfVar) {
            return true;
        }
        if (this.b == stfVar.b && this.a == stfVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == stfVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(Object obj, int i, int i2) {
        int iD = 1 << wtf.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (wl7.b(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iD)) {
            return null;
        }
        stf<K, V> stfVarS = s(t(iD));
        if (i2 != 30) {
            return stfVarS.g(obj, i, i2 + 5);
        }
        mh7 mh7VarG = nic.G(2, nic.H(0, stfVarS.d.length));
        int i3 = mh7VarG.a;
        int i4 = mh7VarG.b;
        int i5 = mh7VarG.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!wl7.b(obj, stfVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return stfVarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final stf<K, V> k(int i, w8b<K, V> w8bVar) {
        w8bVar.b(w8bVar.f - 1);
        w8bVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != w8bVar.b) {
            return new stf<>(0, 0, wtf.b(i, objArr), w8bVar.b);
        }
        this.d = wtf.b(i, objArr);
        return this;
    }

    public final stf<K, V> l(int i, K k, V v, int i2, w8b<K, V> w8bVar) {
        w8b<K, V> w8bVar2;
        stf<K, V> stfVarL;
        int iD = 1 << wtf.d(i, i2);
        boolean zH = h(iD);
        bf9 bf9Var = this.c;
        if (zH) {
            int iF = f(iD);
            if (!wl7.b(k, this.d[iF])) {
                w8bVar.b(w8bVar.f + 1);
                bf9 bf9Var2 = w8bVar.b;
                if (bf9Var != bf9Var2) {
                    return new stf<>(this.a ^ iD, this.b | iD, a(iF, iD, i, k, v, i2, bf9Var2), bf9Var2);
                }
                this.d = a(iF, iD, i, k, v, i2, bf9Var2);
                this.a ^= iD;
                this.b |= iD;
                return this;
            }
            w8bVar.d = x(iF);
            if (x(iF) == v) {
                return this;
            }
            if (bf9Var == w8bVar.b) {
                this.d[iF + 1] = v;
                return this;
            }
            w8bVar.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = v;
            return new stf<>(this.a, this.b, objArrCopyOf, w8bVar.b);
        }
        if (!i(iD)) {
            w8bVar.b(w8bVar.f + 1);
            bf9 bf9Var3 = w8bVar.b;
            int iF2 = f(iD);
            Object[] objArr2 = this.d;
            if (bf9Var != bf9Var3) {
                return new stf<>(this.a | iD, this.b, wtf.a(objArr2, iF2, k, v), bf9Var3);
            }
            this.d = wtf.a(objArr2, iF2, k, v);
            this.a |= iD;
            return this;
        }
        int iT = t(iD);
        stf<K, V> stfVarS = s(iT);
        if (i2 == 30) {
            mh7 mh7VarG = nic.G(2, nic.H(0, stfVarS.d.length));
            int i3 = mh7VarG.a;
            int i4 = mh7VarG.b;
            int i5 = mh7VarG.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                w8bVar.b(w8bVar.f + 1);
                stfVarL = new stf<>(0, 0, wtf.a(stfVarS.d, 0, k, v), w8bVar.b);
                w8bVar2 = w8bVar;
            } else {
                while (!wl7.b(k, stfVarS.d[i3])) {
                    if (i3 == i4) {
                        w8bVar.b(w8bVar.f + 1);
                        stfVarL = new stf<>(0, 0, wtf.a(stfVarS.d, 0, k, v), w8bVar.b);
                        break;
                    }
                    i3 += i5;
                }
                w8bVar.d = stfVarS.x(i3);
                if (stfVarS.c == w8bVar.b) {
                    stfVarS.d[i3 + 1] = v;
                    stfVarL = stfVarS;
                } else {
                    w8bVar.e++;
                    Object[] objArr3 = stfVarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = v;
                    stfVarL = new stf<>(0, 0, objArrCopyOf2, w8bVar.b);
                }
                w8bVar2 = w8bVar;
            }
        } else {
            w8bVar2 = w8bVar;
            stfVarL = stfVarS.l(i, k, v, i2 + 5, w8bVar2);
        }
        return stfVarS == stfVarL ? this : r(iT, stfVarL, w8bVar2.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r27v0, types: [stf, stf<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [stf] */
    /* JADX WARN: Type inference failed for: r5v14, types: [stf] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20, types: [stf] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [stf] */
    /* JADX WARN: Type inference failed for: r5v28, types: [stf] */
    /* JADX WARN: Type inference failed for: r5v29, types: [stf] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type stf<K, V> to ?? for r27v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:138)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:213)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final defpackage.stf<K, V> m(defpackage.stf<K, V> r28, int r29, defpackage.hy3 r30, defpackage.w8b<K, V> r31) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stf.m(stf, int, hy3, w8b):stf");
    }

    public final stf<K, V> n(int i, K k, int i2, w8b<K, V> w8bVar) {
        stf<K, V> stfVarN;
        int iD = 1 << wtf.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (wl7.b(k, this.d[iF])) {
                return p(iF, iD, w8bVar);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            stf<K, V> stfVarS = s(iT);
            if (i2 == 30) {
                mh7 mh7VarG = nic.G(2, nic.H(0, stfVarS.d.length));
                int i3 = mh7VarG.a;
                int i4 = mh7VarG.b;
                int i5 = mh7VarG.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    stfVarN = stfVarS;
                    break;
                }
                while (!wl7.b(k, stfVarS.d[i3])) {
                    if (i3 == i4) {
                        stfVarN = stfVarS;
                        break;
                    }
                    i3 += i5;
                }
                stfVarN = stfVarS.k(i3, w8bVar);
            } else {
                stfVarN = stfVarS.n(i, k, i2 + 5, w8bVar);
            }
            return q(stfVarS, stfVarN, iT, iD, w8bVar.b);
        }
        return this;
    }

    public final stf<K, V> o(int i, K k, V v, int i2, w8b<K, V> w8bVar) {
        w8b<K, V> w8bVar2;
        stf<K, V> stfVarO;
        int iD = 1 << wtf.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            return (wl7.b(k, this.d[iF]) && wl7.b(v, x(iF))) ? p(iF, iD, w8bVar) : this;
        }
        if (!i(iD)) {
            return this;
        }
        int iT = t(iD);
        stf<K, V> stfVarS = s(iT);
        if (i2 == 30) {
            mh7 mh7VarG = nic.G(2, nic.H(0, stfVarS.d.length));
            int i3 = mh7VarG.a;
            int i4 = mh7VarG.b;
            int i5 = mh7VarG.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                stfVarO = stfVarS;
                w8bVar2 = w8bVar;
            } else {
                while (true) {
                    if (!wl7.b(k, stfVarS.d[i3]) || !wl7.b(v, stfVarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        stfVarO = stfVarS.k(i3, w8bVar);
                        break;
                    }
                }
                stfVarO = stfVarS;
                w8bVar2 = w8bVar;
            }
        } else {
            w8bVar2 = w8bVar;
            stfVarO = stfVarS.o(i, k, v, i2 + 5, w8bVar2);
        }
        return q(stfVarS, stfVarO, iT, iD, w8bVar2.b);
    }

    public final stf<K, V> p(int i, int i2, w8b<K, V> w8bVar) {
        w8bVar.b(w8bVar.f - 1);
        w8bVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != w8bVar.b) {
            return new stf<>(i2 ^ this.a, this.b, wtf.b(i, objArr), w8bVar.b);
        }
        this.d = wtf.b(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final stf<K, V> q(stf<K, V> stfVar, stf<K, V> stfVar2, int i, int i2, bf9 bf9Var) {
        bf9 bf9Var2 = this.c;
        if (stfVar2 != null) {
            return (bf9Var2 == bf9Var || stfVar != stfVar2) ? r(i, stfVar2, bf9Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (bf9Var2 != bf9Var) {
            return new stf<>(this.a, this.b ^ i2, wtf.c(i, objArr), bf9Var);
        }
        this.d = wtf.c(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final stf<K, V> r(int i, stf<K, V> stfVar, bf9 bf9Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && stfVar.d.length == 2 && stfVar.b == 0) {
            stfVar.a = this.b;
            return stfVar;
        }
        if (this.c == bf9Var) {
            objArr[i] = stfVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = stfVar;
        return new stf<>(this.a, this.b, objArrCopyOf, bf9Var);
    }

    public final stf<K, V> s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (stf) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.a = w(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final stf.a u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stf.u(java.lang.Object, int, int, java.lang.Object):stf$a");
    }

    public final stf v(Object obj, int i, int i2) {
        stf<K, V> stfVarV;
        int iD = 1 << wtf.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (!wl7.b(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new stf(this.a ^ iD, this.b, wtf.b(iF, objArr), null);
            }
        } else {
            if (!i(iD)) {
                return this;
            }
            int iT = t(iD);
            stf<K, V> stfVarS = s(iT);
            if (i2 == 30) {
                mh7 mh7VarG = nic.G(2, nic.H(0, stfVarS.d.length));
                int i3 = mh7VarG.a;
                int i4 = mh7VarG.b;
                int i5 = mh7VarG.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    stfVarV = stfVarS;
                    break;
                }
                while (!wl7.b(obj, stfVarS.d[i3])) {
                    if (i3 == i4) {
                        stfVarV = stfVarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = stfVarS.d;
                stfVarV = objArr2.length == 2 ? null : new stf<>(0, 0, wtf.b(i3, objArr2), null);
            } else {
                stfVarV = stfVarS.v(obj, i, i2 + 5);
            }
            if (stfVarV != null) {
                return stfVarS != stfVarV ? w(iT, iD, stfVarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new stf(this.a, this.b ^ iD, wtf.c(iT, objArr3), null);
            }
        }
        return null;
    }

    public final stf<K, V> w(int i, int i2, stf<K, V> stfVar) {
        Object[] objArr = stfVar.d;
        if (objArr.length != 2 || stfVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = stfVar;
            return new stf<>(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            stfVar.a = this.b;
            return stfVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        pyd.j(objArrCopyOf2, i + 2, objArrCopyOf2, i + 1, objArr3.length);
        pyd.j(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new stf<>(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
