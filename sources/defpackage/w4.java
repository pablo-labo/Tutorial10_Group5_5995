package defpackage;

import defpackage.iwf;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w4 {
    public static final w4 a = new w4();

    public static final boolean a(fyf fyfVar, fdd fddVar) {
        p7g p7gVarD;
        return fyfVar.W(fddVar) || ((fddVar instanceof px1) && (p7gVarD = fyfVar.d(fyfVar.Q(fyfVar.P((px1) fddVar)))) != null && fyfVar.W(fyfVar.v(p7gVarD)));
    }

    public static final boolean b(fyf fyfVar, iwf iwfVar, fdd fddVar, fdd fddVar2, boolean z) {
        Collection<zi8> collectionZ = fyfVar.Z(fddVar);
        if ((collectionZ instanceof Collection) && collectionZ.isEmpty()) {
            return false;
        }
        for (zi8 zi8Var : collectionZ) {
            if (wl7.b(fyfVar.g0(zi8Var), fyfVar.V(fddVar2))) {
                return true;
            }
            if (z && j(a, iwfVar, fddVar2, zi8Var)) {
                return true;
            }
        }
        return false;
    }

    public static List c(iwf iwfVar, fdd fddVar, lwf lwfVar) {
        iwf.a aVarY;
        fyf fyfVar = iwfVar.c;
        fyfVar.o0(fddVar, lwfVar);
        if (fyfVar.f(lwfVar) || !fyfVar.h(fddVar)) {
            if (!fyfVar.G(lwfVar)) {
                lke lkeVar = new lke();
                iwfVar.b();
                ArrayDeque<fdd> arrayDeque = iwfVar.g;
                arrayDeque.getClass();
                mke mkeVar = iwfVar.h;
                mkeVar.getClass();
                arrayDeque.push(fddVar);
                while (!arrayDeque.isEmpty()) {
                    fdd fddVarPop = arrayDeque.pop();
                    fddVarPop.getClass();
                    if (mkeVar.add(fddVarPop)) {
                        fdd fddVarD = fyfVar.D(fddVarPop);
                        if (fddVarD == null) {
                            fddVarD = fddVarPop;
                        }
                        if (fyfVar.d0(fyfVar.V(fddVarD), lwfVar)) {
                            lkeVar.add(fddVarD);
                            aVarY = iwf.a.c.a;
                        } else {
                            aVarY = fyfVar.L(fddVarD) == 0 ? iwf.a.b.a : fyfVar.Y(fddVarD);
                        }
                        if (wl7.b(aVarY, iwf.a.c.a)) {
                            aVarY = null;
                        }
                        if (aVarY != null) {
                            Iterator<zi8> it = fyfVar.T(fyfVar.V(fddVarPop)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(aVarY.a(iwfVar, it.next()));
                            }
                        }
                    }
                }
                iwfVar.a();
                return lkeVar;
            }
            if (fyfVar.d0(fyfVar.V(fddVar), lwfVar)) {
                mge mgeVarD = fyfVar.D(fddVar);
                if (mgeVarD != null) {
                    fddVar = mgeVarD;
                }
                return u63.Z(fddVar);
            }
        }
        return zr4.a;
    }

    public static List d(iwf iwfVar, fdd fddVar, lwf lwfVar) {
        int i;
        List listC = c(iwfVar, fddVar, lwfVar);
        fyf fyfVar = iwfVar.c;
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                cwf cwfVarI = fyfVar.I((fdd) obj);
                int iB = fyfVar.b(cwfVarI);
                while (true) {
                    if (i >= iB) {
                        arrayList.add(obj);
                        break;
                    }
                    p7g p7gVarD = fyfVar.d(fyfVar.l0(cwfVarI, i));
                    i = (p7gVarD != null ? fyfVar.f0(p7gVarD) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b2 A[EDGE_INSN: B:354:0x02b2->B:183:0x02b2 BREAK  A[LOOP:11: B:174:0x0293->B:355:0x0293]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(defpackage.iwf r18, defpackage.zi8 r19, defpackage.zi8 r20) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4.e(iwf, zi8, zi8):boolean");
    }

    public static boolean f(iwf iwfVar, zi8 zi8Var, zi8 zi8Var2) {
        ka6 ka6Var = iwfVar.d;
        v1 v1Var = iwfVar.e;
        zi8Var.getClass();
        zi8Var2.getClass();
        fyf fyfVar = iwfVar.c;
        if (zi8Var == zi8Var2) {
            return true;
        }
        if (h(fyfVar, zi8Var) && h(fyfVar, zi8Var2)) {
            p7g p7gVarL0 = ka6Var.L0(v1Var.n0(zi8Var));
            p7g p7gVarL02 = ka6Var.L0(v1Var.n0(zi8Var2));
            mge mgeVarS = fyfVar.S(p7gVarL0);
            if (!fyfVar.d0(fyfVar.g0(p7gVarL0), fyfVar.g0(p7gVarL02))) {
                return false;
            }
            if (fyfVar.L(mgeVarS) == 0) {
                return fyfVar.o(p7gVarL0) || fyfVar.o(p7gVarL02) || fyfVar.n0(mgeVarS) == fyfVar.n0(fyfVar.S(p7gVarL02));
            }
        }
        w4 w4Var = a;
        return j(w4Var, iwfVar, zi8Var, zi8Var2) && j(w4Var, iwfVar, zi8Var2, zi8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return r6.A(r6.g0(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.txf g(defpackage.fyf r6, defpackage.zi8 r7, defpackage.zi8 r8) {
        /*
            int r0 = r6.L(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            dwf r4 = r6.H(r7, r2)
            boolean r5 = r6.N(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            p7g r3 = r6.d(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            mge r4 = r6.S(r3)
            boolean r4 = r6.e0(r4)
            if (r4 == 0) goto L33
            mge r4 = r6.S(r8)
            boolean r4 = r6.e0(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kwf r4 = r6.g0(r3)
            kwf r5 = r6.g0(r8)
            boolean r4 = defpackage.wl7.b(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            txf r3 = g(r6, r3, r8)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kwf r7 = r6.g0(r7)
            txf r6 = r6.A(r7, r2)
            return r6
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w4.g(fyf, zi8, zi8):txf");
    }

    public static boolean h(fyf fyfVar, zi8 zi8Var) {
        return (!fyfVar.U(fyfVar.g0(zi8Var)) || fyfVar.c(zi8Var) || fyfVar.p(zi8Var) || fyfVar.B(zi8Var) || fyfVar.m0(zi8Var)) ? false : true;
    }

    public static boolean i(iwf iwfVar, cwf cwfVar, fdd fddVar) {
        boolean zJ;
        cwfVar.getClass();
        fyf fyfVar = iwfVar.c;
        kwf kwfVarV = fyfVar.V(fddVar);
        int iB = fyfVar.b(cwfVar);
        int iU = fyfVar.u(kwfVarV);
        if (iB == iU && iB == fyfVar.L(fddVar)) {
            for (int i = 0; i < iU; i++) {
                dwf dwfVarH = fyfVar.H(fddVar, i);
                p7g p7gVarD = fyfVar.d(dwfVarH);
                if (p7gVarD != null) {
                    dwf dwfVarL0 = fyfVar.l0(cwfVar, i);
                    fyfVar.O(dwfVarL0);
                    p7g p7gVarD2 = fyfVar.d(dwfVarL0);
                    p7gVarD2.getClass();
                    nyf nyfVarJ = fyfVar.j(fyfVar.A(kwfVarV, i));
                    nyf nyfVarO = fyfVar.O(dwfVarH);
                    nyf nyfVar = nyf.INV;
                    if (nyfVarJ == nyfVar) {
                        nyfVarJ = nyfVarO;
                    } else if (nyfVarO != nyfVar && nyfVarJ != nyfVarO) {
                        nyfVarJ = null;
                    }
                    if (nyfVarJ == null) {
                        return iwfVar.a;
                    }
                    if (nyfVarJ != nyfVar || (!k(fyfVar, p7gVarD2, p7gVarD, kwfVarV) && !k(fyfVar, p7gVarD, p7gVarD2, kwfVarV))) {
                        int i2 = iwfVar.f;
                        if (i2 > 100) {
                            ja.i(p7gVarD2, "Arguments depth is too high. Some related argument: ");
                            return false;
                        }
                        iwfVar.f = i2 + 1;
                        int iOrdinal = nyfVarJ.ordinal();
                        w4 w4Var = a;
                        if (iOrdinal == 0) {
                            zJ = j(w4Var, iwfVar, p7gVarD, p7gVarD2);
                        } else if (iOrdinal == 1) {
                            zJ = j(w4Var, iwfVar, p7gVarD2, p7gVarD);
                        } else {
                            if (iOrdinal != 2) {
                                l.g();
                                return false;
                            }
                            zJ = f(iwfVar, p7gVarD2, p7gVarD);
                        }
                        iwfVar.f--;
                        if (!zJ) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean j(w4 w4Var, iwf iwfVar, zi8 zi8Var, zi8 zi8Var2) {
        zi8Var.getClass();
        zi8Var2.getClass();
        if (zi8Var == zi8Var2) {
            return true;
        }
        return e(iwfVar, zi8Var, zi8Var2);
    }

    public static boolean k(fyf fyfVar, zi8 zi8Var, zi8 zi8Var2, lwf lwfVar) {
        rxf rxfVarS;
        cwf cwfVarE = fyfVar.E(zi8Var);
        if (!(cwfVarE instanceof px1)) {
            return false;
        }
        px1 px1Var = (px1) cwfVarE;
        if (fyfVar.a(px1Var) || !fyfVar.N(fyfVar.Q(fyfVar.P(px1Var))) || fyfVar.n(px1Var) != hx1.a) {
            return false;
        }
        kwf kwfVarG0 = fyfVar.g0(zi8Var2);
        myf myfVar = kwfVarG0 instanceof myf ? (myf) kwfVarG0 : null;
        return (myfVar == null || (rxfVarS = fyfVar.s(myfVar)) == null || !fyfVar.K(rxfVarS, lwfVar)) ? false : true;
    }
}
