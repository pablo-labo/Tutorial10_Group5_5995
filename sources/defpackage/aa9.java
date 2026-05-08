package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class aa9 {
    public static final void a(final List list, final t41 t41Var, final Function1 function1, final Function1 function12, final gu5 gu5Var, final Function1 function13, final Function1 function14, final gu5 gu5Var2, final b5g b5gVar, final hw9 hw9Var, final Function1 function15, final gu5 gu5Var3, b bVar, int i) {
        c cVar;
        final iba ibaVar;
        list.getClass();
        t41Var.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        function13.getClass();
        function14.getClass();
        gu5Var2.getClass();
        b5gVar.getClass();
        function15.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(378409022);
        int i2 = i | (cVarH.x(list) ? 4 : 2) | (cVarH.x(t41Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function12) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.x(function13) ? 131072 : 65536) | (cVarH.x(function14) ? 1048576 : 524288) | (cVarH.x(gu5Var2) ? 8388608 : 4194304) | (cVarH.d(b5gVar.ordinal()) ? 67108864 : 33554432) | (cVarH.x(hw9Var) ? 536870912 : 268435456);
        int i3 = (cVarH.x(function15) ? (char) 4 : (char) 2) | (cVarH.x(gu5Var3) ? ' ' : (char) 16);
        if (cVarH.o(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            iba ibaVarB = q92.B(new s[0], cVarH);
            final String strI = ak2.I(R.string.edit_language, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f("");
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f("");
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f("");
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(null);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(null);
                cVarH.p(objV5);
            }
            final g4a g4aVar5 = (g4a) objV5;
            boolean zX = cVarH.x(ibaVarB);
            Object objV6 = cVarH.v();
            if (zX || objV6 == c0020a) {
                objV6 = new on4(ibaVarB, 1);
                cVarH.p(objV6);
            }
            to4.b(ibaVarB, (Function1) objV6, cVarH);
            boolean zX2 = ((i3 & 14) == 4) | cVarH.x(list) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((i3 & 112) == 32) | ((29360128 & i2) == 8388608) | ((57344 & i2) == 16384) | cVarH.x(t41Var) | ((i2 & 7168) == 2048) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912 || cVarH.x(hw9Var)) | cVarH.K(strI) | cVarH.x(ibaVarB) | ((i2 & 896) == 256);
            Object objV7 = cVarH.v();
            if (zX2 || objV7 == c0020a) {
                ibaVar = ibaVarB;
                Function1 function16 = new Function1() { // from class: u99
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final List list2 = list;
                        final Function1 function17 = function15;
                        final Function1 function18 = function13;
                        final Function1 function19 = function14;
                        final gu5 gu5Var4 = gu5Var3;
                        final gu5 gu5Var5 = gu5Var2;
                        final gu5 gu5Var6 = gu5Var;
                        final g4a g4aVar6 = g4aVar;
                        final g4a g4aVar7 = g4aVar2;
                        final g4a g4aVar8 = g4aVar3;
                        final g4a g4aVar9 = g4aVar4;
                        final g4a g4aVar10 = g4aVar5;
                        hba.a(gbaVar, "LANGUAGE_LIST", new ah2(951780859, new xu5() { // from class: t99
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                final Function1 function110 = function17;
                                boolean zK = bVar2.K(function110);
                                Object objV8 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK || objV8 == c0020a2) {
                                    final g4a g4aVar11 = g4aVar6;
                                    final g4a g4aVar12 = g4aVar7;
                                    final g4a g4aVar13 = g4aVar8;
                                    final g4a g4aVar14 = g4aVar9;
                                    final g4a g4aVar15 = g4aVar10;
                                    Function1 function111 = new Function1() { // from class: y99
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            wj8 wj8Var = (wj8) obj6;
                                            wj8Var.getClass();
                                            String str = wj8Var.a;
                                            if (str == null) {
                                                str = "";
                                            }
                                            g4a g4aVar16 = g4aVar11;
                                            g4aVar16.setValue(str);
                                            String str2 = wj8Var.b;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            g4aVar12.setValue(str2);
                                            String str3 = wj8Var.c;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            g4aVar13.setValue(str3);
                                            String str4 = wj8Var.d;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            g4aVar14.setValue(str4);
                                            String str5 = wj8Var.e;
                                            g4aVar15.setValue(str5 != null ? str5 : "");
                                            function110.invoke((String) g4aVar16.getValue());
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(function111);
                                    objV8 = function111;
                                }
                                Function1 function112 = (Function1) objV8;
                                gu5 gu5Var7 = gu5Var4;
                                boolean zK2 = bVar2.K(gu5Var7);
                                Object objV9 = bVar2.v();
                                if (zK2 || objV9 == c0020a2) {
                                    objV9 = new ld(8, gu5Var7);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var8 = (gu5) objV9;
                                gu5 gu5Var9 = gu5Var5;
                                boolean zK3 = bVar2.K(gu5Var9);
                                gu5 gu5Var10 = gu5Var6;
                                boolean zK4 = zK3 | bVar2.K(gu5Var10);
                                Object objV10 = bVar2.v();
                                if (zK4 || objV10 == c0020a2) {
                                    objV10 = new qe(11, gu5Var9, gu5Var10);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var11 = (gu5) objV10;
                                boolean zK5 = bVar2.K(gu5Var9) | bVar2.K(gu5Var10);
                                Object objV11 = bVar2.v();
                                if (zK5 || objV11 == c0020a2) {
                                    objV11 = new ai(6, gu5Var9, gu5Var10);
                                    bVar2.p(objV11);
                                }
                                sj8.a(list2, function112, function18, function19, gu5Var8, gu5Var11, (gu5) objV11, bVar2, 0);
                                return j6g.a;
                            }
                        }, true));
                        final t41 t41Var2 = t41Var;
                        final Function1 function110 = function12;
                        final b5g b5gVar2 = b5gVar;
                        final hw9 hw9Var2 = hw9Var;
                        hba.a(gbaVar, "ADD_NEW_LANGUAGE", new ah2(-1417939484, new xu5() { // from class: v99
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new od2(4);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                Function1 function111 = function110;
                                boolean zK = bVar2.K(function111);
                                Object objV9 = bVar2.v();
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new q99(function111, 0);
                                    bVar2.p(objV9);
                                }
                                Function1 function112 = (Function1) objV9;
                                gu5 gu5Var7 = gu5Var6;
                                boolean zK2 = bVar2.K(gu5Var7);
                                Object objV10 = bVar2.v();
                                if (zK2 || objV10 == c0020a2) {
                                    objV10 = new di(6, gu5Var7);
                                    bVar2.p(objV10);
                                }
                                fr.a(t41Var2, function112, (gu5) objV10, b5gVar2, hw9Var2, null, bVar2, 32768, 32);
                                return j6gVar;
                            }
                        }, true));
                        final iba ibaVar2 = ibaVar;
                        final String str = strI;
                        final Function1 function111 = function1;
                        hba.a(gbaVar, "LANGUAGE_EDIT_HOME", new ah2(-561289341, new xu5() { // from class: w99
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                Object next;
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new uz7(1);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                final iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                final g4a g4aVar11 = g4aVar6;
                                final g4a g4aVar12 = g4aVar7;
                                final g4a g4aVar13 = g4aVar8;
                                final g4a g4aVar14 = g4aVar9;
                                final g4a g4aVar15 = g4aVar10;
                                if (zX3 || objV9 == c0020a2) {
                                    gu5 gu5Var7 = new gu5() { // from class: r99
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            g4aVar11.setValue("");
                                            g4aVar12.setValue("");
                                            g4aVar13.setValue("");
                                            g4aVar14.setValue("");
                                            g4aVar15.setValue("");
                                            ibaVar3.r();
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(gu5Var7);
                                    objV9 = gu5Var7;
                                }
                                gu5 gu5Var8 = (gu5) objV9;
                                Function1 function112 = function111;
                                boolean zK = bVar2.K(function112);
                                Object objV10 = bVar2.v();
                                if (zK || objV10 == c0020a2) {
                                    objV10 = new s99(function112, 0);
                                    bVar2.p(objV10);
                                }
                                Function1 function113 = (Function1) objV10;
                                Function1 function114 = function18;
                                boolean zK2 = bVar2.K(function114) | bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zK2 || objV11 == c0020a2) {
                                    objV11 = new qs0(8, function114, ibaVar3);
                                    bVar2.p(objV11);
                                }
                                Function1 function115 = (Function1) objV11;
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (wl7.b(((wj8) next).b, (String) g4aVar11.getValue())) {
                                        break;
                                    }
                                }
                                wj8 wj8Var = (wj8) next;
                                if (wj8Var == null) {
                                    wj8Var = new wj8(63, (String) null, (String) null, (String) null, (String) null, (String) null);
                                }
                                String str2 = (String) g4aVar12.getValue();
                                String str3 = (String) g4aVar13.getValue();
                                String str4 = (String) g4aVar14.getValue();
                                String str5 = (String) g4aVar15.getValue();
                                Object objV12 = bVar2.v();
                                if (objV12 == c0020a2) {
                                    objV12 = new mt(g4aVar12, g4aVar13);
                                    bVar2.p(objV12);
                                }
                                Function1 function116 = (Function1) objV12;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV13 = bVar2.v();
                                int i4 = 5;
                                if (zX4 || objV13 == c0020a2) {
                                    objV13 = new er(ibaVar3, i4);
                                    bVar2.p(objV13);
                                }
                                gu5 gu5Var9 = (gu5) objV13;
                                Object objV14 = bVar2.v();
                                if (objV14 == c0020a2) {
                                    objV14 = new uc(i4, g4aVar14, g4aVar15);
                                    bVar2.p(objV14);
                                }
                                wj8 wj8Var2 = wj8Var;
                                pj4.a(str, gu5Var8, gu5Var6, function113, function115, wj8Var2, str2, str3, str4, str5, function116, gu5Var9, (Function2) objV14, b5gVar2, bVar2, 0);
                                return j6g.a;
                            }
                        }, true));
                        hba.a(gbaVar, "LANGUAGE_NAME", new ah2(295360802, new xu5() { // from class: x99
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).intValue();
                                ((bd0) obj2).getClass();
                                dVar.getClass();
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i4 = 6;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new tb(i4);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                t41 t41Var3 = t41Var2;
                                boolean zX3 = bVar2.x(t41Var3);
                                Object objV9 = bVar2.v();
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new ir(t41Var3, 8);
                                    bVar2.p(objV9);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV9), dVar.getDefaultViewModelCreationExtras(), bVar2);
                                String strI2 = ak2.I(R.string.language_label, bVar2);
                                g4a g4aVar11 = g4aVar7;
                                String str2 = (String) g4aVar11.getValue();
                                List list3 = (List) ((gme) f51Var.g0).getValue();
                                boolean zX4 = bVar2.x(f51Var);
                                Object objV10 = bVar2.v();
                                if (zX4 || objV10 == c0020a2) {
                                    objV10 = new cj(f51Var, 7);
                                    bVar2.p(objV10);
                                }
                                Function1 function112 = (Function1) objV10;
                                gu5 gu5Var7 = gu5Var6;
                                boolean zK = bVar2.K(gu5Var7);
                                Object objV11 = bVar2.v();
                                if (zK || objV11 == c0020a2) {
                                    objV11 = new yw0(3, gu5Var7);
                                    bVar2.p(objV11);
                                }
                                gu5 gu5Var8 = (gu5) objV11;
                                iba ibaVar3 = ibaVar2;
                                boolean zX5 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX5 || objV12 == c0020a2) {
                                    objV12 = new gr0(6, ibaVar3, g4aVar11);
                                    bVar2.p(objV12);
                                }
                                Function1 function113 = (Function1) objV12;
                                boolean zX6 = bVar2.x(ibaVar3);
                                Object objV13 = bVar2.v();
                                if (zX6 || objV13 == c0020a2) {
                                    objV13 = new ac(ibaVar3, 6);
                                    bVar2.p(objV13);
                                }
                                gu5 gu5Var9 = (gu5) objV13;
                                Object objV14 = bVar2.v();
                                if (objV14 == c0020a2) {
                                    objV14 = new ch4(2, g4aVar8);
                                    bVar2.p(objV14);
                                }
                                e51.b(str, strI2, null, null, true, false, str2, list3, function112, gu5Var8, function113, gu5Var9, null, null, (Function1) objV14, hw9Var2, 0, null, null, false, false, bVar2, 221184, 287104, 2039820);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVar = cVarH;
                cVar.p(function16);
                objV7 = function16;
            } else {
                cVar = cVarH;
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "LANGUAGE_LIST", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new mg4(list, t41Var, function1, function12, gu5Var, function13, function14, gu5Var2, b5gVar, hw9Var, function15, gu5Var3, i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ba9 b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1561709275:
                if (str.equals("LANGUAGE_LIST")) {
                    return ba9.a;
                }
                return null;
            case -1561657582:
                if (str.equals("LANGUAGE_NAME")) {
                    return ba9.d;
                }
                return null;
            case -126730699:
                if (str.equals("ADD_NEW_LANGUAGE")) {
                    return ba9.b;
                }
                return null;
            case 778806733:
                if (str.equals("LANGUAGE_EDIT_HOME")) {
                    return ba9.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(ba9 ba9Var) {
        dg3.i(dg3.b(rxb.a, "profile-tab-manage-language", ba9Var, null, 8));
    }
}
