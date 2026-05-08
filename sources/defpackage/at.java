package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.sp7;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class at {
    public static final void a(final boolean z, final mt9 mt9Var, final List list, final List list2, final List list3, final Function1 function1, final Function2 function2, final gu5 gu5Var, final Function1 function12, final b5g b5gVar, final hw9 hw9Var, b bVar, final int i) {
        c cVar;
        int i2;
        int i3;
        int i4;
        int i5;
        final iba ibaVar;
        String str;
        String str2;
        String str3;
        String str4;
        list.getClass();
        list2.getClass();
        list3.getClass();
        function1.getClass();
        function2.getClass();
        gu5Var.getClass();
        function12.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(1117745061);
        int i6 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.K(mt9Var) ? 32 : 16) | (cVarH.x(list) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(list2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(list3) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536) | (cVarH.x(function2) ? 1048576 : 524288) | (cVarH.x(gu5Var) ? 8388608 : 4194304) | (cVarH.x(function12) ? 67108864 : 33554432) | (cVarH.d(b5gVar.ordinal()) ? 536870912 : 268435456);
        int i7 = '\b' | (cVarH.x(hw9Var) ? (char) 4 : (char) 2);
        if (cVarH.o(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            if (z) {
                i2 = -137747425;
                i3 = R.string.edit_military_service;
            } else {
                i2 = -137680000;
                i3 = R.string.add_military_service;
            }
            final String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            String str5 = "";
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                i4 = i6;
                if (mt9Var == null || (str4 = mt9Var.b) == null) {
                    str4 = "";
                }
                objV = r.f(new Locale("", str4));
                cVarH.p(objV);
            } else {
                i4 = i6;
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                if (mt9Var == null || (str3 = mt9Var.c) == null) {
                    str3 = "";
                }
                objV2 = r.f(str3);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                if (mt9Var == null || (str2 = mt9Var.d) == null) {
                    str2 = "";
                }
                objV3 = r.f(str2);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                if (mt9Var != null && (str = mt9Var.e) != null) {
                    str5 = str;
                }
                objV4 = r.f(str5);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(mt9Var != null ? mt9Var.f : null);
                cVarH.p(objV5);
            }
            final g4a g4aVar5 = (g4a) objV5;
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV6 = cVarH.v();
            if (zX || objV6 == c0020a) {
                i5 = i7;
                objV6 = new yh(ibaVarB, 1);
                cVarH.p(objV6);
            } else {
                i5 = i7;
            }
            to4.b(ibaVarB, (Function1) objV6, cVarH);
            boolean zX2 = cVarH.x(ibaVarB) | cVarH.K(strK) | ((i4 & 29360128) == 8388608) | cVarH.x(list) | cVarH.x(list2) | ((i4 & 458752) == 131072) | ((i5 & 14) == 4 || cVarH.x(hw9Var)) | cVarH.x(list3) | ((i4 & 3670016) == 1048576) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912);
            Object objV7 = cVarH.v();
            if (zX2 || objV7 == c0020a) {
                ibaVar = ibaVarB;
                Function1 function13 = new Function1() { // from class: yr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final iba ibaVar2 = ibaVar;
                        final String str6 = strK;
                        final gu5 gu5Var2 = gu5Var;
                        final g4a g4aVar6 = g4aVar;
                        hba.a(gbaVar, "COUNTRY_OF_SERVICE", new ah2(-1486782622, new xu5() { // from class: os
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                gu5 gu5Var3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                float fB = i3c.b(qt9.MilitaryService.c(), 5);
                                g4a g4aVar7 = g4aVar6;
                                String country = ((Locale) g4aVar7.getValue()).getCountry();
                                country.getClass();
                                boolean zU = zve.U(country);
                                int i8 = 0;
                                iba ibaVar3 = ibaVar2;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zU) {
                                    bVar2.L(1257121076);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(1257004206);
                                    boolean zX3 = bVar2.x(ibaVar3);
                                    Object objV8 = bVar2.v();
                                    if (zX3 || objV8 == c0020a2) {
                                        objV8 = new bs(ibaVar3, i8);
                                        bVar2.p(objV8);
                                    }
                                    gu5Var3 = (gu5) objV8;
                                    bVar2.F();
                                }
                                gu5 gu5Var4 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var4);
                                Object objV9 = bVar2.v();
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new mg(1, gu5Var4);
                                    bVar2.p(objV9);
                                }
                                sb1.a(str6, (gu5) objV9, gu5Var3, R.string.next_button_label, null, 0, null, Float.valueOf(fB), null, false, false, false, false, null, 0, bh2.c(946854692, new cs(ibaVar3, g4aVar7, i8), bVar2), bVar2, 0, 196608, 32624);
                                return j6g.a;
                            }
                        }, true));
                        final List list4 = list;
                        final g4a g4aVar7 = g4aVar2;
                        final g4a g4aVar8 = g4aVar3;
                        hba.a(gbaVar, "COUNTRY_SELECTOR", new ah2(1365860683, new xu5() { // from class: ps
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i8 = 2;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new ue(i8);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                final g4a g4aVar9 = g4aVar6;
                                Locale locale = (Locale) g4aVar9.getValue();
                                final iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX3 || objV9 == c0020a2) {
                                    final g4a g4aVar10 = g4aVar7;
                                    final g4a g4aVar11 = g4aVar8;
                                    objV9 = new Function1() { // from class: wr
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            Locale locale2 = (Locale) obj6;
                                            locale2.getClass();
                                            g4aVar9.setValue(locale2);
                                            g4aVar10.setValue("");
                                            g4aVar11.setValue("");
                                            ibaVar3.r();
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(objV9);
                                }
                                Function1 function14 = (Function1) objV9;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX4 || objV10 == c0020a2) {
                                    objV10 = new we(ibaVar3, i8);
                                    bVar2.p(objV10);
                                }
                                m23.a(list4, locale, function14, (gu5) objV10, gu5Var2, bVar2, 0);
                                return j6gVar;
                            }
                        }, true));
                        final List list5 = list2;
                        final Function1 function14 = function1;
                        final hw9 hw9Var2 = hw9Var;
                        hba.a(gbaVar, "BRANCH", new ah2(536211690, new xu5() { // from class: qs
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i8 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new hs(i8);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                qt9 qt9Var = qt9.MilitaryBranch;
                                float fB = i3c.b(qt9Var.c(), 5);
                                String strI = ak2.I(qt9Var.a(), bVar2);
                                g4a g4aVar9 = g4aVar7;
                                String str7 = (String) g4aVar9.getValue();
                                g4a g4aVar10 = g4aVar6;
                                int i9 = 1;
                                List list6 = wve.E(((Locale) g4aVar10.getValue()).getCountry(), "US", true) ? list5 : zr4.a;
                                Function1 function15 = function14;
                                boolean zK = bVar2.K(function15);
                                Object objV9 = bVar2.v();
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new is(function15, g4aVar10, i8);
                                    bVar2.p(objV9);
                                }
                                Function1 function16 = (Function1) objV9;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV10 = bVar2.v();
                                if (zK2 || objV10 == c0020a2) {
                                    objV10 = new js(0, gu5Var3);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var4 = (gu5) objV10;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zX3 || objV11 == c0020a2) {
                                    objV11 = new wg(ibaVar3, g4aVar9, i9);
                                    bVar2.p(objV11);
                                }
                                Function1 function17 = (Function1) objV11;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX4 || objV12 == c0020a2) {
                                    objV12 = new xg(ibaVar3, i9);
                                    bVar2.p(objV12);
                                }
                                e51.b(str6, strI, null, null, true, false, str7, list6, function16, gu5Var4, function17, (gu5) objV12, null, Float.valueOf(fB), null, hw9Var2, R.string.next_button_label, null, null, false, false, bVar2, 221184, 262528, 1982476);
                                return j6gVar;
                            }
                        }, true));
                        final List list6 = list3;
                        final Function2 function22 = function2;
                        hba.a(gbaVar, "RANK", new ah2(-293437303, new xu5() { // from class: rs
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i8 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new tr(i8);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                qt9 qt9Var = qt9.MilitaryRank;
                                float fB = i3c.b(qt9Var.c(), 5);
                                String strI = ak2.I(qt9Var.a(), bVar2);
                                g4a g4aVar9 = g4aVar8;
                                String str7 = (String) g4aVar9.getValue();
                                g4a g4aVar10 = g4aVar6;
                                int i9 = 1;
                                List list7 = wve.E(((Locale) g4aVar10.getValue()).getCountry(), "US", true) ? list6 : zr4.a;
                                Function2 function23 = function22;
                                boolean zK = bVar2.K(function23);
                                Object objV9 = bVar2.v();
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new ur(i8, function23, g4aVar10, g4aVar7);
                                    bVar2.p(objV9);
                                }
                                Function1 function15 = (Function1) objV9;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV10 = bVar2.v();
                                if (zK2 || objV10 == c0020a2) {
                                    objV10 = new vr(0, gu5Var3);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var4 = (gu5) objV10;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zX3 || objV11 == c0020a2) {
                                    objV11 = new ah(ibaVar3, g4aVar9, i9);
                                    bVar2.p(objV11);
                                }
                                Function1 function16 = (Function1) objV11;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX4 || objV12 == c0020a2) {
                                    objV12 = new jb(ibaVar3, 2);
                                    bVar2.p(objV12);
                                }
                                e51.b(str6, strI, null, null, true, false, str7, list7, function15, gu5Var4, function16, (gu5) objV12, null, Float.valueOf(fB), null, hw9Var2, 0, null, null, false, false, bVar2, 221184, 262528, 2048012);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar9 = g4aVar5;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(-1123086296, new xu5() { // from class: ss
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i8 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new xr(i8);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                g4a g4aVar10 = g4aVar9;
                                ig3 ig3Var = (ig3) g4aVar10.getValue();
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var3);
                                Object objV9 = bVar2.v();
                                int i9 = 1;
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new eh(i9, gu5Var3);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var4 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new zr(ibaVar3, i8);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var5 = (gu5) objV10;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zX4 || objV11 == c0020a2) {
                                    objV11 = new er(ibaVar3, i9);
                                    bVar2.p(objV11);
                                }
                                gu5 gu5Var6 = (gu5) objV11;
                                boolean zX5 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX5 || objV12 == c0020a2) {
                                    objV12 = new as(i8, ibaVar3, g4aVar10);
                                    bVar2.p(objV12);
                                }
                                gu5 gu5Var7 = (gu5) objV12;
                                Object objV13 = bVar2.v();
                                if (objV13 == c0020a2) {
                                    objV13 = new zd(1, g4aVar10);
                                    bVar2.p(objV13);
                                }
                                ngg.b(gu5Var4, gu5Var5, gu5Var6, gu5Var7, (Function1) objV13, ig3Var, bVar2, 1597440);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar10 = g4aVar4;
                        final b5g b5gVar2 = b5gVar;
                        final Function1 function15 = function12;
                        hba.a(gbaVar, "DESCRIPTION", new ah2(-1952735289, new xu5() { // from class: ts
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                g4a g4aVar11;
                                g4a g4aVar12;
                                g4a g4aVar13;
                                g4a g4aVar14;
                                g4a g4aVar15;
                                gu5 gu5Var3;
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV8 = bVar2.v();
                                int i8 = 1;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV8 == c0020a2) {
                                    objV8 = new yb(i8);
                                    bVar2.p(objV8);
                                }
                                to4.b(j6gVar, (Function1) objV8, bVar2);
                                float fB = i3c.b(qt9.MilitaryDescription.c(), 5);
                                final g4a g4aVar16 = g4aVar6;
                                String country = ((Locale) g4aVar16.getValue()).getCountry();
                                country.getClass();
                                boolean zU = zve.U(country);
                                final Function1 function16 = function15;
                                final g4a g4aVar17 = g4aVar7;
                                final g4a g4aVar18 = g4aVar8;
                                final g4a g4aVar19 = g4aVar9;
                                final g4a g4aVar20 = g4aVar10;
                                if (zU || zve.U((String) g4aVar17.getValue()) || zve.U((String) g4aVar18.getValue())) {
                                    g4aVar11 = g4aVar19;
                                    g4aVar12 = g4aVar16;
                                    g4aVar13 = g4aVar17;
                                    g4aVar14 = g4aVar18;
                                    g4aVar15 = g4aVar20;
                                    bVar2.L(1396612335);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(1395836219);
                                    boolean zK = bVar2.K(function16);
                                    Object objV9 = bVar2.v();
                                    if (zK || objV9 == c0020a2) {
                                        gu5 gu5Var4 = new gu5() { // from class: ds
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-military-experience", "save", null, null, 12));
                                                function16.invoke(new mt9("", ((Locale) g4aVar16.getValue()).getCountry(), (String) g4aVar17.getValue(), (String) g4aVar18.getValue(), (String) g4aVar20.getValue(), (ig3) g4aVar19.getValue()));
                                                return j6g.a;
                                            }
                                        };
                                        g4aVar11 = g4aVar19;
                                        g4aVar12 = g4aVar16;
                                        g4aVar13 = g4aVar17;
                                        g4aVar14 = g4aVar18;
                                        g4aVar15 = g4aVar20;
                                        bVar2.p(gu5Var4);
                                        objV9 = gu5Var4;
                                    } else {
                                        g4aVar11 = g4aVar19;
                                        g4aVar12 = g4aVar16;
                                        g4aVar13 = g4aVar17;
                                        g4aVar14 = g4aVar18;
                                        g4aVar15 = g4aVar20;
                                    }
                                    gu5Var3 = (gu5) objV9;
                                    bVar2.F();
                                }
                                gu5 gu5Var5 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var5);
                                Object objV10 = bVar2.v();
                                if (zK2 || objV10 == c0020a2) {
                                    objV10 = new ni(1, gu5Var5);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var6 = (gu5) objV10;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zX3 || objV11 == c0020a2) {
                                    objV11 = new ya(ibaVar3, 3);
                                    bVar2.p(objV11);
                                }
                                gu5 gu5Var7 = (gu5) objV11;
                                Float fValueOf = Float.valueOf(fB);
                                b5g b5gVar3 = b5gVar2;
                                final g4a g4aVar21 = g4aVar15;
                                sb1.a(str6, gu5Var6, gu5Var3, R.string.finish_button_label, null, 0, gu5Var7, fValueOf, b5gVar3, false, false, false, false, null, 0, bh2.c(310514441, new fs(0, b5gVar3, g4aVar15), bVar2), bVar2, 0, 196608, 32304);
                                if (b5gVar3 == b5g.c) {
                                    bVar2.L(1398647082);
                                    ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-military-experience", "error-toast", sp7.c.a.c, null, null, 24));
                                    boolean zK3 = bVar2.K(function16);
                                    Object objV12 = bVar2.v();
                                    if (zK3 || objV12 == c0020a2) {
                                        final g4a g4aVar22 = g4aVar12;
                                        final g4a g4aVar23 = g4aVar13;
                                        final g4a g4aVar24 = g4aVar14;
                                        final g4a g4aVar25 = g4aVar11;
                                        gu5 gu5Var8 = new gu5() { // from class: gs
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-military-experience", "refresh", null, null, 12));
                                                function16.invoke(new mt9("", ((Locale) g4aVar22.getValue()).getCountry(), (String) g4aVar23.getValue(), (String) g4aVar24.getValue(), (String) g4aVar21.getValue(), (ig3) g4aVar25.getValue()));
                                                return j6g.a;
                                            }
                                        };
                                        bVar2.p(gu5Var8);
                                        objV12 = gu5Var8;
                                    }
                                    rg0.a((gu5) objV12, bVar2, 0);
                                } else {
                                    bVar2.L(1381769659);
                                }
                                bVar2.F();
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVarH.p(function13);
                objV7 = function13;
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "COUNTRY_OF_SERVICE", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, mt9Var, list, list2, list3, function1, function2, gu5Var, function12, b5gVar, hw9Var, i) { // from class: es
                public final /* synthetic */ Function2 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ Function1 X;
                public final /* synthetic */ b5g Y;
                public final /* synthetic */ hw9 Z;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ mt9 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ List d;
                public final /* synthetic */ List e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    at.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final pt9 b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 2507820:
                if (str.equals("RANK")) {
                    return pt9.d;
                }
                return null;
            case 244823688:
                if (str.equals("COUNTRY_SELECTOR")) {
                    return pt9.b;
                }
                return null;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    return pt9.f;
                }
                return null;
            case 675350678:
                if (str.equals("COUNTRY_OF_SERVICE")) {
                    return pt9.a;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return pt9.e;
                }
                return null;
            case 1967266210:
                if (str.equals("BRANCH")) {
                    return pt9.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(pt9 pt9Var) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-military-experience", pt9Var, null, 8));
    }
}
