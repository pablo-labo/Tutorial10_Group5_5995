package defpackage;

import defpackage.w5b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y6h {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = w5b.b;
        w5b w5bVarA = w5b.a.a("/");
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(w5bVarA, new t6h(w5bVarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (t6h t6hVar : z92.p1(arrayList, new hhd(2))) {
            if (((t6h) linkedHashMapB0.put(t6hVar.a, t6hVar)) == null) {
                while (true) {
                    w5b w5bVar = t6hVar.a;
                    w5b w5bVarE = w5bVar.e();
                    if (w5bVarE != null) {
                        t6h t6hVar2 = (t6h) linkedHashMapB0.get(w5bVarE);
                        if (t6hVar2 != null) {
                            t6hVar2.q.add(w5bVar);
                            break;
                        }
                        t6h t6hVar3 = new t6h(w5bVarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapB0.put(w5bVarE, t6hVar3);
                        t6hVar3.q.add(w5bVar);
                        t6hVar = t6hVar3;
                    }
                }
            }
        }
        return linkedHashMapB0;
    }

    public static final String b(int i) {
        ypd.s(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:18|149|19|(3:21|(2:56|57)(4:24|134|25|(2:27|(2:39|40)(8:31|146|32|142|33|34|36|(1:52)(1:53)))(2:42|43))|(1:69)(1:70))|58|132|59|60|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7 A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #12 {all -> 0x0156, blocks: (B:3:0x0010, B:5:0x001e, B:6:0x0026, B:16:0x007d, B:18:0x0087, B:70:0x0155, B:66:0x014e, B:73:0x015a, B:101:0x01b7, B:104:0x01c4, B:99:0x01b2, B:111:0x01d0, B:114:0x01dc, B:115:0x01e3, B:116:0x01e4, B:117:0x01e7, B:118:0x01e8, B:119:0x01fd, B:7:0x002f, B:9:0x0038, B:15:0x005e, B:108:0x01c8, B:109:0x01cd, B:63:0x0149, B:96:0x01ad, B:19:0x0090, B:21:0x0099, B:24:0x00aa, B:53:0x0136, B:49:0x012f, B:56:0x013a, B:57:0x013f, B:58:0x0140), top: B:148:0x0010, inners: #2, #6, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[Catch: all -> 0x0156, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0156, blocks: (B:3:0x0010, B:5:0x001e, B:6:0x0026, B:16:0x007d, B:18:0x0087, B:70:0x0155, B:66:0x014e, B:73:0x015a, B:101:0x01b7, B:104:0x01c4, B:99:0x01b2, B:111:0x01d0, B:114:0x01dc, B:115:0x01e3, B:116:0x01e4, B:117:0x01e7, B:118:0x01e8, B:119:0x01fd, B:7:0x002f, B:9:0x0038, B:15:0x005e, B:108:0x01c8, B:109:0x01cd, B:63:0x0149, B:96:0x01ad, B:19:0x0090, B:21:0x0099, B:24:0x00aa, B:53:0x0136, B:49:0x012f, B:56:0x013a, B:57:0x013f, B:58:0x0140), top: B:148:0x0010, inners: #2, #6, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x0156, TryCatch #12 {all -> 0x0156, blocks: (B:3:0x0010, B:5:0x001e, B:6:0x0026, B:16:0x007d, B:18:0x0087, B:70:0x0155, B:66:0x014e, B:73:0x015a, B:101:0x01b7, B:104:0x01c4, B:99:0x01b2, B:111:0x01d0, B:114:0x01dc, B:115:0x01e3, B:116:0x01e4, B:117:0x01e7, B:118:0x01e8, B:119:0x01fd, B:7:0x002f, B:9:0x0038, B:15:0x005e, B:108:0x01c8, B:109:0x01cd, B:63:0x0149, B:96:0x01ad, B:19:0x0090, B:21:0x0099, B:24:0x00aa, B:53:0x0136, B:49:0x012f, B:56:0x013a, B:57:0x013f, B:58:0x0140), top: B:148:0x0010, inners: #2, #6, #10, #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.u6h c(defpackage.w5b r24, defpackage.pa5 r25, kotlin.jvm.functions.Function1<? super defpackage.t6h, java.lang.Boolean> r26) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6h.c(w5b, pa5, kotlin.jvm.functions.Function1):u6h");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t6h d(uqc uqcVar) throws IOException {
        int iX1 = uqcVar.x1();
        if (iX1 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iX1));
        }
        uqcVar.skip(4L);
        short sN0 = uqcVar.n0();
        int i = sN0 & 65535;
        if ((sN0 & 1) != 0) {
            r40.h("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        int iN0 = uqcVar.n0() & 65535;
        int iN02 = uqcVar.n0() & 65535;
        int iN03 = uqcVar.n0() & 65535;
        long jX1 = ((long) uqcVar.x1()) & 4294967295L;
        kuc kucVar = new kuc();
        kucVar.element = ((long) uqcVar.x1()) & 4294967295L;
        kuc kucVar2 = new kuc();
        kucVar2.element = ((long) uqcVar.x1()) & 4294967295L;
        int iN04 = uqcVar.n0() & 65535;
        int iN05 = uqcVar.n0() & 65535;
        int iN06 = uqcVar.n0() & 65535;
        uqcVar.skip(8L);
        kuc kucVar3 = new kuc();
        kucVar3.element = ((long) uqcVar.x1()) & 4294967295L;
        String strH = uqcVar.h(iN04);
        if (zve.M(strH, (char) 0)) {
            r40.h("bad zip: filename contains 0x00");
            return null;
        }
        long j = kucVar2.element == 4294967295L ? 8L : 0L;
        if (kucVar.element == 4294967295L) {
            j += 8;
        }
        if (kucVar3.element == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        luc lucVar = new luc();
        luc lucVar2 = new luc();
        luc lucVar3 = new luc();
        huc hucVar = new huc();
        e(uqcVar, iN05, new w6h(hucVar, j2, kucVar2, uqcVar, kucVar, kucVar3, lucVar, lucVar2, lucVar3));
        if (j2 > 0 && !hucVar.element) {
            r40.h("bad zip: zip64 extra required but absent");
            return null;
        }
        String strH2 = uqcVar.h(iN06);
        String str = w5b.b;
        return new t6h(w5b.a.a("/").h(strH), wve.D(strH, "/", false), strH2, jX1, kucVar.element, kucVar2.element, iN0, kucVar3.element, iN03, iN02, (Long) lucVar.element, (Long) lucVar2.element, (Long) lucVar3.element, 57344);
    }

    public static final void e(to1 to1Var, int i, Function2<? super Integer, ? super Long, j6g> function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                r40.h("bad zip: truncated header in extra field");
                return;
            }
            int iN0 = to1Var.n0() & 65535;
            long jN0 = ((long) to1Var.n0()) & 65535;
            long j2 = j - 4;
            if (j2 < jN0) {
                r40.h("bad zip: truncated value in extra field");
                return;
            }
            to1Var.x0(jN0);
            long j3 = to1Var.f().b;
            function2.invoke(Integer.valueOf(iN0), Long.valueOf(jN0));
            long j4 = (to1Var.f().b + jN0) - j3;
            if (j4 < 0) {
                r40.h(p6.c(iN0, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    to1Var.f().skip(j4);
                }
                j = j2 - jN0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t6h f(uqc uqcVar, t6h t6hVar) throws IOException {
        int iX1 = uqcVar.x1();
        if (iX1 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iX1));
        }
        uqcVar.skip(2L);
        short sN0 = uqcVar.n0();
        int i = sN0 & 65535;
        if ((sN0 & 1) != 0) {
            r40.h("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        uqcVar.skip(18L);
        long jN0 = ((long) uqcVar.n0()) & 65535;
        int iN0 = uqcVar.n0() & 65535;
        uqcVar.skip(jN0);
        if (t6hVar == null) {
            uqcVar.skip(iN0);
            return null;
        }
        luc lucVar = new luc();
        luc lucVar2 = new luc();
        luc lucVar3 = new luc();
        e(uqcVar, iN0, new x6h(uqcVar, lucVar, lucVar2, lucVar3));
        return new t6h(t6hVar.a, t6hVar.b, t6hVar.c, t6hVar.d, t6hVar.e, t6hVar.f, t6hVar.g, t6hVar.h, t6hVar.i, t6hVar.j, t6hVar.k, t6hVar.l, t6hVar.m, (Integer) lucVar.element, (Integer) lucVar2.element, (Integer) lucVar3.element);
    }
}
