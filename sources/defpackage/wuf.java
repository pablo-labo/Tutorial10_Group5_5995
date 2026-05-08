package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.sg0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class wuf implements b1g {
    public static final Object a(Object obj, hv1 hv1Var) {
        ui8 ui8VarC;
        Class clsJ;
        return (((hv1Var instanceof d4c) && fe7.d((vlg) hv1Var)) || (ui8VarC = c(hv1Var)) == null || (clsJ = j(ui8VarC)) == null) ? obj : d(clsJ, hv1Var).invoke(obj, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if ((r0 != null ? defpackage.fe7.e(r0) : false) == true) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.pv1 b(defpackage.hv1 r3, defpackage.pv1 r4, boolean r5) {
        /*
            r3.getClass()
            boolean r0 = defpackage.fe7.a(r3)
            if (r0 != 0) goto Lbf
            java.util.List r0 = r3.w0()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L21
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L21
            goto L4c
        L21:
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            hsc r1 = (defpackage.hsc) r1
            ui8 r1 = r1.getType()
            r1.getClass()
            kwf r1 = r1.M0()
            v62 r1 = r1.d()
            if (r1 == 0) goto L47
            boolean r1 = defpackage.fe7.e(r1)
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 == 0) goto L25
            goto Lbf
        L4c:
            java.util.List r0 = r3.i()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L63
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L63
            goto L8d
        L63:
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r0.next()
            rlg r1 = (defpackage.rlg) r1
            ui8 r1 = r1.getType()
            r1.getClass()
            kwf r1 = r1.M0()
            v62 r1 = r1.d()
            if (r1 == 0) goto L89
            boolean r1 = defpackage.fe7.e(r1)
            goto L8a
        L89:
            r1 = r2
        L8a:
            if (r1 == 0) goto L67
            goto Lbf
        L8d:
            ui8 r0 = r3.getReturnType()
            r1 = 1
            if (r0 == 0) goto La7
            kwf r0 = r0.M0()
            v62 r0 = r0.d()
            if (r0 == 0) goto La3
            boolean r0 = defpackage.fe7.b(r0)
            goto La4
        La3:
            r0 = r2
        La4:
            if (r0 != r1) goto La7
            goto Lbf
        La7:
            ui8 r0 = c(r3)
            if (r0 == 0) goto Lbe
            kwf r0 = r0.M0()
            v62 r0 = r0.d()
            if (r0 == 0) goto Lbb
            boolean r2 = defpackage.fe7.e(r0)
        Lbb:
            if (r2 != r1) goto Lbe
            goto Lbf
        Lbe:
            return r4
        Lbf:
            glg r0 = new glg
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wuf.b(hv1, pv1, boolean):pv1");
    }

    public static final ui8 c(hv1 hv1Var) {
        hsc hscVarO = hv1Var.O();
        hsc hscVarL = hv1Var.L();
        if (hscVarO != null) {
            return hscVarO.getType();
        }
        if (hscVarL != null) {
            if (hv1Var instanceof uq2) {
                return hscVarL.getType();
            }
            aj3 aj3VarD = hv1Var.d();
            t52 t52Var = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
            if (t52Var != null) {
                return t52Var.o();
            }
        }
        return null;
    }

    public static final Method d(Class cls, hv1 hv1Var) {
        hv1Var.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            akb.p("No unbox method found in inline class: ", cls, " (calling ", hv1Var);
            return null;
        }
    }

    public static final ArrayList e(mge mgeVar) {
        ArrayList arrayListF = f(dyf.a(mgeVar));
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(t92.r0(arrayListF, 10));
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        v62 v62VarD = mgeVar.M0().d();
        v62VarD.getClass();
        Class<?> clsJ = akg.j((t52) v62VarD);
        clsJ.getClass();
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList f(mge mgeVar) {
        ?? Z;
        if (!fe7.f(mgeVar)) {
            return null;
        }
        v62 v62VarD = mgeVar.M0().d();
        v62VarD.getClass();
        int i = b04.a;
        hlg<mge> hlgVarU = ((t52) v62VarD).U();
        j1a j1aVar = hlgVarU instanceof j1a ? (j1a) hlgVarU : null;
        j1aVar.getClass();
        ArrayList<Pair> arrayList = j1aVar.a;
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            n8a n8aVar = (n8a) pair.a();
            ArrayList arrayListF = f((mge) pair.b());
            if (arrayListF != null) {
                Z = new ArrayList(t92.r0(arrayListF, 10));
                Iterator it = arrayListF.iterator();
                while (it.hasNext()) {
                    Z.add(n8aVar.e() + '-' + ((String) it.next()));
                }
            } else {
                Z = u63.Z(n8aVar.e());
            }
            w92.w0(arrayList2, (Iterable) Z);
        }
        return arrayList2;
    }

    public static boolean g(String str) {
        sg0.d dVar = xwg.a;
        Set<tn2> setUnmodifiableSet = Collections.unmodifiableSet(sg0.c);
        HashSet hashSet = new HashSet();
        for (tn2 tn2Var : setUnmodifiableSet) {
            if (tn2Var.b().equals(str)) {
                hashSet.add(tn2Var);
            }
        }
        if (hashSet.isEmpty()) {
            b0.o("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((tn2) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public static long h(g4b g4bVar, int i, int i2) {
        g4bVar.J(i);
        if (g4bVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = g4bVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i2 || (iJ & 32) == 0 || g4bVar.x() < 7 || g4bVar.a() < 7 || (g4bVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        g4bVar.h(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static final Class i(aj3 aj3Var) {
        if (!(aj3Var instanceof t52) || !fe7.b(aj3Var)) {
            return null;
        }
        t52 t52Var = (t52) aj3Var;
        Class<?> clsJ = akg.j(t52Var);
        if (clsJ != null) {
            return clsJ;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(t52Var.getName());
        a62 a62VarF = b04.f((v62) aj3Var);
        sb.append(" cannot be found (classId=");
        sb.append(a62VarF);
        sb.append(')');
        throw new qi8(sb.toString());
    }

    public static final Class j(ui8 ui8Var) {
        mge mgeVarG;
        Class clsI = i(ui8Var.M0().d());
        if (clsI == null) {
            return null;
        }
        if (kyf.e(ui8Var) && ((mgeVarG = fe7.g(ui8Var)) == null || kyf.e(mgeVarG) || ei8.H(mgeVarG))) {
            return null;
        }
        return clsI;
    }

    public static String k(ivh ivhVar) {
        StringBuilder sb = new StringBuilder(ivhVar.c());
        for (int i = 0; i < ivhVar.c(); i++) {
            byte bA = ivhVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
