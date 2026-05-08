package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class oi3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List<vnd> list, final List<ljg> list2, final Function2<? super ljg, ? super vnd, j6g> function2, final kre kreVar, final gu5<j6g> gu5Var, Function1<? super ljg, j6g> function1, Function1<? super vnd, j6g> function12, final gu5<j6g> gu5Var2, b bVar, final int i) {
        Function1<? super ljg, j6g> function13;
        Function1<? super vnd, j6g> function14;
        g4a g4aVar;
        list.getClass();
        list2.getClass();
        function2.getClass();
        kreVar.getClass();
        gu5Var.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-1340333380);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(list2) ? 32 : 16) | (cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(kreVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(null);
                cVarH.p(objV);
            }
            g4a g4aVar2 = (g4a) objV;
            String str = kreVar == kre.a ? "Select User Persona" : "Auto Apply";
            e.a aVar = e.a.b;
            uw6.b(str, g.f(aVar, 1.0f), mh2.c, true, "", cVarH, 28080, 0);
            cVarH = cVarH;
            o97.g gVar = o97Var.i;
            e eVarD = g.d(f.f(aVar, 8.0f), 1.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 54);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            int iOrdinal = kreVar.ordinal();
            if (iOrdinal == 0) {
                function14 = function12;
                cVarH.L(1879289629);
                ljg ljgVar = (ljg) g4aVar2.getValue();
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new vd(2, g4aVar2);
                    cVarH.p(objV2);
                }
                Function1 function15 = (Function1) objV2;
                Object objV3 = cVarH.v();
                if (objV3 == c0020a) {
                    function13 = function1;
                    objV3 = new na(function13, 4);
                    cVarH.p(objV3);
                } else {
                    function13 = function1;
                }
                c(((i2 >> 3) & 14) | 3456, gu5Var, ljgVar, cVarH, list2, function15, (Function1) objV3);
                cVarH.U(false);
            } else {
                if (iOrdinal != 1) {
                    cVarH.L(-1047758220);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                cVarH.L(1879827138);
                boolean z = (i2 & 896) == 256;
                Object objV4 = cVarH.v();
                if (z || objV4 == c0020a) {
                    g4aVar = g4aVar2;
                    objV4 = new zi(1, function2, g4aVar);
                    cVarH.p(objV4);
                } else {
                    g4aVar = g4aVar2;
                }
                Function1 function16 = (Function1) objV4;
                Object objV5 = cVarH.v();
                if (objV5 == c0020a) {
                    function14 = function12;
                    objV5 = new bs2(function14, 1);
                    cVarH.p(objV5);
                } else {
                    function14 = function12;
                }
                b((i2 & 14) | 24576, gu5Var2, (ljg) g4aVar.getValue(), cVarH, list, function16, (Function1) objV5);
                cVarH.U(false);
                function13 = function1;
            }
            cVarH.U(true);
        } else {
            function13 = function1;
            function14 = function12;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final Function1<? super ljg, j6g> function17 = function13;
            final Function1<? super vnd, j6g> function18 = function14;
            iVarW.d = new Function2(list, list2, function2, kreVar, gu5Var, function17, function18, gu5Var2, i) { // from class: li3
                public final /* synthetic */ Function1 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ List a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ kre d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(14376961);
                    oi3.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(int i, gu5 gu5Var, ljg ljgVar, b bVar, List list, Function1 function1, Function1 function12) {
        boolean z;
        list.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1158935459);
        int i2 = (cVarH.x(list) ? 4 : 2) | i | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(ljgVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (ljgVar != null) {
                cVarH.L(242258434);
                z = true;
                f(ljgVar, true, null, true, gu5Var, false, cVarH, ((i2 >> 9) & 14) | 199728 | (57344 & i2), 4);
                cVarH.U(false);
            } else {
                z = true;
                cVarH.L(242536721);
                Object objV = cVarH.v();
                if (objV == b.a.a) {
                    objV = new pd1(4);
                    cVarH.p(objV);
                }
                e(true, "Apply with my own Indeed Profile", null, false, (gu5) objV, bh2.c(1561768520, new mi3(gu5Var), cVarH), cVarH, 224310, 4);
                cVarH.U(false);
            }
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            f86.a(list, us8.a(cVarH), function1, function12, null, cVarH, (i4 & 7168) | i3 | (i4 & 896), 16);
            cVarH = cVarH;
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ni3(list, function1, function12, ljgVar, gu5Var, i, 0);
        }
    }

    public static final void c(final int i, gu5 gu5Var, final ljg ljgVar, b bVar, final List list, Function1 function1, final Function1 function12) {
        int i2;
        Function1 function13;
        b.a.C0020a c0020a;
        final gu5 gu5Var2 = gu5Var;
        list.getClass();
        function1.getClass();
        gu5Var2.getClass();
        function12.getClass();
        c cVarH = bVar.h(-1542600754);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ljgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function12) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarM = pnb.M(g.d(aVar, 1.0f), pnb.L(0, 1, cVarH), true);
            vs0.g gVar = vs0.g;
            af1.a aVar2 = c20.a.m;
            ob2 ob2VarA = mb2.a(gVar, aVar2, cVarH, 6);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iG2 = cVarH.G();
            t8b t8bVarP2 = cVarH.P();
            int i3 = i2;
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                ja.h(iG2, cVarH, iG2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            ob2 ob2VarA2 = mb2.a(vs0.c, aVar2, cVarH, 0);
            int iG3 = cVarH.G();
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                ja.h(iG3, cVarH, iG3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            cVarH.L(-1187112583);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c0020a = b.a.a;
                if (!zHasNext) {
                    break;
                }
                ljg ljgVar2 = (ljg) it.next();
                o97.g gVar2 = o97Var.i;
                e eVarF = f.f(aVar, 8.0f);
                ag9 ag9VarD2 = hl1.d(af1Var, false);
                int iG4 = cVarH.G();
                t8b t8bVarP4 = cVarH.P();
                e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarF);
                gl2.j.getClass();
                pm8.a aVar4 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar4);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD2, gl2.a.g);
                ygg.y(cVarH, t8bVarP4, gl2.a.f);
                gl2.a.C0251a c0251a2 = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG4))) {
                    ja.h(iG4, cVarH, iG4, c0251a2);
                }
                ygg.y(cVarH, eVarC4, gl2.a.d);
                o97 o97Var2 = o97Var;
                boolean zB = wl7.b(ljgVar2, ljgVar);
                boolean zX = ((i3 & 57344) == 16384) | cVarH.x(ljgVar2);
                Object objV = cVarH.v();
                if (zX || objV == c0020a) {
                    objV = new jp0(2, function12, ljgVar2);
                    cVarH.p(objV);
                }
                gu5 gu5Var3 = (gu5) objV;
                int i4 = i3;
                boolean zX2 = ((i4 & 896) == 256) | cVarH.x(ljgVar2);
                Object objV2 = cVarH.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new pa0(3, function1, ljgVar2);
                    cVarH.p(objV2);
                }
                i3 = i4;
                f(ljgVar2, zB, gu5Var3, false, (gu5) objV2, true, cVarH, 196608, 8);
                cVarH.U(true);
                aVar = aVar;
                o97Var = o97Var2;
                it = it;
            }
            function13 = function1;
            e.a aVar5 = aVar;
            int i5 = i3;
            cVarH.U(false);
            d(0, cVarH);
            o97.g gVar3 = o97Var.i;
            e eVarF2 = f.f(aVar5, 8.0f);
            ag9 ag9VarD3 = hl1.d(af1Var, false);
            int iG5 = cVarH.G();
            t8b t8bVarP5 = cVarH.P();
            e eVarC5 = androidx.compose.ui.c.c(cVarH, eVarF2);
            gl2.j.getClass();
            pm8.a aVar6 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar6);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD3, gl2.a.g);
            ygg.y(cVarH, t8bVarP5, gl2.a.f);
            gl2.a.C0251a c0251a3 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG5))) {
                ja.h(iG5, cVarH, iG5, c0251a3);
            }
            ygg.y(cVarH, eVarC5, gl2.a.d);
            boolean z = ljgVar == null;
            boolean z2 = (i5 & 896) == 256;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new gi3(function13, 0);
                cVarH.p(objV3);
            }
            e(z, "Apply with my own Indeed Profile", null, true, (gu5) objV3, null, cVarH, 3120, 36);
            o6.j(cVarH, true, true, true);
            boolean z3 = (i5 & 7168) == 2048;
            Object objV4 = cVarH.v();
            if (z3 || objV4 == c0020a) {
                gu5Var2 = gu5Var;
                objV4 = new vr(2, gu5Var2);
                cVarH.p(objV4);
            } else {
                gu5Var2 = gu5Var;
            }
            gt6.h("Next", (gu5) objV4, g.f(aVar5, 1.0f), null, false, false, null, null, null, cVarH, 390, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            function13 = function1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final Function1 function14 = function13;
            iVarW.d = new Function2() { // from class: hi3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    oi3.c(ka2.L(i | 1), gu5Var2, ljgVar, (b) obj, list, function14, function12);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(int i, b bVar) {
        c cVarH = bVar.h(2018288469);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarH = f.h(eVarF, 0.0f, 8.0f, 1);
            ehd ehdVarA = chd.a(vs0.e, c20.a.k, cVarH, 54);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (1.0f <= 0.0d) {
                yd7.a("invalid weight; must be greater than zero");
            }
            a84.b(0.0f, 0, 6, 0L, cVarH, f.f(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f));
            fif.b("or", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, 6, 0, 131070);
            cVarH = cVarH;
            if (1.0f <= 0.0d) {
                yd7.a("invalid weight; must be greater than zero");
            }
            a84.b(0.0f, 0, 6, 0L, cVarH, f.f(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new vb2(i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r39, final java.lang.String r40, java.lang.String r41, final boolean r42, final defpackage.gu5<defpackage.j6g> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r44, androidx.compose.runtime.b r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi3.e(boolean, java.lang.String, java.lang.String, boolean, gu5, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final defpackage.ljg r17, final boolean r18, defpackage.gu5<defpackage.j6g> r19, boolean r20, final defpackage.gu5<defpackage.j6g> r21, final boolean r22, androidx.compose.runtime.b r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi3.f(ljg, boolean, gu5, boolean, gu5, boolean, androidx.compose.runtime.b, int, int):void");
    }
}
