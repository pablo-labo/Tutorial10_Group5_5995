package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.tq6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class le4 {
    public static final ra8 a = sa8.a(new ue(7));

    public static final void a(d4f d4fVar, String str, Function1 function1, Function1 function12, Function1 function13, b bVar, int i) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        String str2;
        str.getClass();
        function1.getClass();
        c cVarH = bVar.h(173201870);
        int i2 = (cVarH.K(d4fVar) ? 4 : 2) | i | (cVarH.K(str) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function12) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function13) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new ke4(function12, str, null);
                cVarH.p(objV);
            }
            int i3 = i2 >> 3;
            to4.d(cVarH, str, (Function2) objV);
            w3f.a(str, function1, function12, function13, bh2.c(1933810047, new ey(c(d4fVar, null), 1), cVarH), cVarH, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
            str2 = str;
            function16 = function1;
            function15 = function12;
            function14 = function13;
        } else {
            function14 = function13;
            function15 = function12;
            function16 = function1;
            str2 = str;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new te(d4fVar, str2, function16, function15, function14, i);
        }
    }

    public static final void b(tg2 tg2Var, Map<String, ? extends Object> map, b bVar, int i, int i2) {
        Map<String, ? extends Object> map2;
        int i3;
        Map<String, ? extends Object> map3;
        tg2 tg2Var2 = tg2Var;
        c cVarH = bVar.h(-1187888794);
        int i4 = (cVarH.x(tg2Var2) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            map2 = map;
        } else {
            map2 = map;
            i3 = i4 | (cVarH.x(map2) ? 32 : 16);
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            map3 = i5 != 0 ? bs4.a : map2;
            d4f d4fVar = tg2Var2.a;
            if (d4fVar instanceof fl1) {
                cVarH.L(2135672035);
                fl1 fl1Var = (fl1) d4fVar;
                r3f.a(tg2Var2, fl1Var.m, fl1Var.l, d4fVar.e, bh2.c(-1292528609, new lb(tg2Var2, 3), cVarH), cVarH, (i3 & 14) | 24576);
                cVarH.U(false);
            } else {
                int i6 = i3;
                if (d4fVar instanceof gq1) {
                    cVarH.L(900190874);
                    gq1 gq1Var = (gq1) d4fVar;
                    String str = gq1Var.i;
                    Object obj = map3.get(RumEventDeserializer.EVENT_TYPE_ACTION);
                    n3f n3fVar = obj instanceof n3f ? (n3f) obj : null;
                    if (n3fVar == null) {
                        n3fVar = gq1Var.o;
                    }
                    tg2Var2 = tg2Var;
                    u3f.a(tg2Var2, str, n3fVar, gq1Var.j, gq1Var.p, gq1Var.q, gq1Var.r, gq1Var.s, d4fVar.e, d4fVar.f, cVarH, i6 & 14);
                    cVarH = cVarH;
                    cVarH.U(false);
                } else {
                    tg2Var2 = tg2Var;
                    if (d4fVar instanceof vx1) {
                        cVarH.L(2136663198);
                        z3f.a(tg2Var2, d4fVar.e, bh2.c(-776590460, new yo0(tg2Var2, 2), cVarH), cVarH, (i6 & 14) | 384);
                        cVarH.U(false);
                    } else if (d4fVar instanceof cy1) {
                        cVarH.L(2136983831);
                        c4f.a(tg2Var2, d4fVar.e, bh2.c(1078071342, new he4(tg2Var2, 0), cVarH), cVarH, (i6 & 14) | 384);
                        cVarH.U(false);
                    } else if (d4fVar instanceof tq6) {
                        cVarH.L(900229226);
                        tq6 tq6Var = (tq6) d4fVar;
                        u4f.a(tq6Var.l, tq6Var.m, tq6Var.n, d4fVar.e, cVarH, 0);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else if (d4fVar instanceof zg6) {
                        cVarH.L(900237608);
                        zg6 zg6Var = (zg6) d4fVar;
                        o4f.a(tg2Var2, zg6Var.l, zg6Var.j, zg6Var.m, d4fVar.e, cVarH, i6 & 14);
                        cVarH.U(false);
                    } else if (d4fVar instanceof vcf) {
                        cVarH.L(900246907);
                        vcf vcfVar = (vcf) d4fVar;
                        tg2Var2 = tg2Var;
                        l5f.a(tg2Var2, vcfVar.i, vcfVar.n, vcfVar.o, vcfVar.p, vcfVar.q, d4fVar.e, cVarH, i6 & 14);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else if (d4fVar instanceof z7f) {
                        cVarH.L(2138217166);
                        z7f z7fVar = (z7f) d4fVar;
                        tq6.c cVar = z7fVar.p;
                        tg2Var2 = tg2Var;
                        i5f.a(tg2Var2, z7fVar.q, cVar, z7fVar.n, z7fVar.o, z7fVar.m, d4fVar.e, cVarH, i6 & 14);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else if (d4fVar instanceof y74) {
                        cVarH.L(900270495);
                        y74 y74Var = (y74) d4fVar;
                        g4f.a(tg2Var, y74Var.l, y74Var.m, d4fVar.e, bh2.c(-376128977, new vz2(tg2Var, 1), cVarH), cVarH, (i6 & 14) | 24576);
                        cVarH.U(false);
                    } else if (d4fVar instanceof dd9) {
                        cVarH.L(900282535);
                        dd9 dd9Var = (dd9) d4fVar;
                        tg2Var2 = tg2Var;
                        f5f.a(tg2Var2, dd9Var.l, dd9Var.j, dd9Var.m, d4fVar.e, cVarH, i6 & 14);
                        cVarH.U(false);
                    } else if (d4fVar instanceof oy7) {
                        cVarH.L(900291903);
                        oy7 oy7Var = (oy7) d4fVar;
                        tg2Var2 = tg2Var;
                        y4f.a(tg2Var2, oy7Var.i, oy7Var.j, oy7Var.k, d4fVar.e, cVarH, i6 & 14);
                        cVarH.U(false);
                    } else if (d4fVar instanceof sx8) {
                        cVarH.L(900300966);
                        sx8 sx8Var = (sx8) d4fVar;
                        String str2 = sx8Var.i;
                        Object obj2 = map3.get(RumEventDeserializer.EVENT_TYPE_ACTION);
                        n3f n3fVar2 = obj2 instanceof n3f ? (n3f) obj2 : null;
                        if (n3fVar2 == null) {
                            n3fVar2 = sx8Var.l;
                        }
                        tg2Var2 = tg2Var;
                        d5f.a(tg2Var2, str2, n3fVar2, sx8Var.m, sx8Var.n, d4fVar.e, d4fVar.f, cVarH, i6 & 14);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else if (d4fVar instanceof k77) {
                        cVarH.L(900314952);
                        v4f.a(tg2Var, ((k77) d4fVar).i, d4fVar.e, bh2.c(-1283072535, new ie4(0, map3, tg2Var), cVarH), cVarH, (i6 & 14) | 3072);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else if (d4fVar instanceof oq6) {
                        cVarH.L(900329499);
                        oq6 oq6Var = (oq6) d4fVar;
                        tq6.c cVar2 = oq6Var.n;
                        Object obj3 = map3.get(RumEventDeserializer.EVENT_TYPE_ACTION);
                        n3f n3fVar3 = obj3 instanceof n3f ? (n3f) obj3 : null;
                        if (n3fVar3 == null) {
                            n3fVar3 = oq6Var.m;
                        }
                        tg2Var2 = tg2Var;
                        s4f.a(tg2Var2, cVar2, n3fVar3, oq6Var.j, oq6Var.o, oq6Var.p, d4fVar.e, d4fVar.f, cVarH, i6 & 14);
                        cVarH = cVarH;
                        cVarH.U(false);
                    } else {
                        tg2Var2 = tg2Var;
                        if (!(d4fVar instanceof kd6)) {
                            cVarH.L(900179610);
                            cVarH.U(false);
                            l.g();
                            return;
                        }
                        cVarH.L(900344307);
                        String str3 = d4fVar.e;
                        cVarH.L(900348946);
                        List<tg2> list = tg2Var2.c;
                        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(bh2.c(1076803178, new uv((tg2) it.next(), 3), cVarH));
                        }
                        cVarH.U(false);
                        m4f.a(tg2Var2, str3, arrayList, cVarH, i6 & 14);
                        cVarH.U(false);
                    }
                }
            }
            tg2Var2 = tg2Var;
        } else {
            cVarH.D();
            map3 = map2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new je4(tg2Var2, map3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.tg2 c(defpackage.d4f r3, defpackage.tg2 r4) {
        /*
            tg2 r0 = new tg2
            r0.<init>(r3, r4)
            boolean r4 = r3 instanceof defpackage.vx1
            if (r4 == 0) goto Le
            vx1 r3 = (defpackage.vx1) r3
            java.util.List<d4f> r3 = r3.i
            goto L53
        Le:
            boolean r4 = r3 instanceof defpackage.cy1
            if (r4 == 0) goto L17
            cy1 r3 = (defpackage.cy1) r3
            java.util.List<d4f> r3 = r3.i
            goto L53
        L17:
            boolean r4 = r3 instanceof defpackage.fl1
            if (r4 == 0) goto L20
            fl1 r3 = (defpackage.fl1) r3
            java.util.List<d4f> r3 = r3.k
            goto L53
        L20:
            boolean r4 = r3 instanceof defpackage.kd6
            if (r4 == 0) goto L29
            kd6 r3 = (defpackage.kd6) r3
            java.util.List<d4f> r3 = r3.i
            goto L53
        L29:
            boolean r4 = r3 instanceof defpackage.y74
            r1 = 0
            zr4 r2 = defpackage.zr4.a
            if (r4 == 0) goto L40
            y74 r3 = (defpackage.y74) r3
            d4f r3 = r3.k
            if (r3 == 0) goto L3b
            java.util.List r3 = defpackage.u63.Z(r3)
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 != 0) goto L53
        L3e:
            r3 = r2
            goto L53
        L40:
            boolean r4 = r3 instanceof defpackage.k77
            if (r4 == 0) goto L3e
            k77 r3 = (defpackage.k77) r3
            d4f r3 = r3.j
            if (r3 == 0) goto L4f
            java.util.List r3 = defpackage.u63.Z(r3)
            goto L50
        L4f:
            r3 = r1
        L50:
            if (r3 != 0) goto L53
            goto L3e
        L53:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r3, r1)
            r4.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L64:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r3.next()
            d4f r1 = (defpackage.d4f) r1
            tg2 r1 = c(r1, r0)
            r4.add(r1)
            goto L64
        L78:
            java.util.List<tg2> r3 = r0.c
            r3.addAll(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.c(d4f, tg2):tg2");
    }
}
