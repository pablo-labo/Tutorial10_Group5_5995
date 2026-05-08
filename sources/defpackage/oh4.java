package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class oh4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, List list, final List list2, final Function1 function1, final Function1 function12, final gu5 gu5Var, final Function1 function13, final b5g b5gVar, final hw9 hw9Var, hz1 hz1Var, b bVar, int i) {
        c cVar;
        hz1 hz1Var2;
        iba ibaVar;
        String str2;
        Object next;
        str.getClass();
        list.getClass();
        list2.getClass();
        function1.getClass();
        function12.getClass();
        gu5Var.getClass();
        function13.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1323981902);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(list2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.x(gu5Var) ? 131072 : 65536) | (cVarH.x(function13) ? 1048576 : 524288) | (cVarH.d(b5gVar.ordinal()) ? 8388608 : 4194304) | (cVarH.x(hw9Var) ? 67108864 : 33554432) | (cVarH.K(hz1Var) ? 536870912 : 268435456);
        boolean z = true;
        if (cVarH.o(i2 & 1, (306783379 & i2) != 306783378)) {
            if (hz1Var == null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (wl7.b(((hz1) next).a, str)) {
                            break;
                        }
                    }
                }
                hz1Var2 = (hz1) next;
            } else {
                hz1Var2 = hz1Var;
            }
            final String strI = ak2.I(R.string.edit_certification, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                if (hz1Var2 == null || (str2 = hz1Var2.b) == null) {
                    str2 = "";
                }
                objV = r.f(str2);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(hz1Var2 != null ? hz1Var2.c : null);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(hz1Var2 != null ? hz1Var2.d : null);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(Boolean.FALSE);
                cVarH.p(objV5);
            }
            final g4a g4aVar5 = (g4a) objV5;
            boolean z2 = (wl7.b((String) g4aVar.getValue(), hz1Var2 != null ? hz1Var2.b : null) && wl7.b((ig3) g4aVar2.getValue(), hz1Var2.c) && wl7.b((String) g4aVar3.getValue(), hz1Var2.d)) ? false : true;
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV6 = cVarH.v();
            if (zX || objV6 == c0020a) {
                objV6 = new bh4(ibaVarB, 0);
                cVarH.p(objV6);
            }
            to4.b(ibaVarB, (Function1) objV6, cVarH);
            final boolean z3 = z2;
            boolean zK = ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | cVarH.K(hz1Var2) | cVarH.K(strI) | cVarH.a(z2) | ((29360128 & i2) == 8388608) | cVarH.x(ibaVarB) | ((3670016 & i2) == 1048576) | cVarH.x(list2) | ((i2 & 7168) == 2048);
            if ((234881024 & i2) != 67108864 && !cVarH.x(hw9Var)) {
                z = false;
            }
            boolean z4 = zK | z;
            Object objV7 = cVarH.v();
            if (z4 || objV7 == c0020a) {
                cVar = cVarH;
                final hz1 hz1Var3 = hz1Var2;
                Function1 function14 = new Function1() { // from class: dh4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final Function1 function15 = function12;
                        final hz1 hz1Var4 = hz1Var3;
                        final String str3 = strI;
                        final boolean z5 = z3;
                        final gu5 gu5Var2 = gu5Var;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar6 = g4aVar;
                        final g4a g4aVar7 = g4aVar2;
                        final g4a g4aVar8 = g4aVar3;
                        final g4a g4aVar9 = g4aVar5;
                        final g4a g4aVar10 = g4aVar4;
                        final iba ibaVar2 = ibaVarB;
                        final Function1 function16 = function13;
                        hba.a(gbaVar, "HOME", new ah2(408946709, new xu5() { // from class: hh4
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                Function1 function17;
                                gu5 gu5Var3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                final g4a g4aVar11 = g4aVar6;
                                boolean zU = zve.U((String) g4aVar11.getValue());
                                final Function1 function18 = function15;
                                final hz1 hz1Var5 = hz1Var4;
                                final g4a g4aVar12 = g4aVar7;
                                final g4a g4aVar13 = g4aVar8;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zU) {
                                    function17 = function18;
                                    bVar2.L(-1889743167);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(-1890365523);
                                    boolean zK2 = bVar2.K(function18) | bVar2.K(hz1Var5);
                                    Object objV8 = bVar2.v();
                                    if (zK2 || objV8 == c0020a2) {
                                        gu5 gu5Var4 = new gu5() { // from class: jh4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-certification", "save", null, null, 12));
                                                hz1 hz1Var6 = hz1Var5;
                                                function18.invoke(new hz1(hz1Var6 != null ? hz1Var6.a : null, (String) g4aVar11.getValue(), (ig3) g4aVar12.getValue(), (String) g4aVar13.getValue(), 4));
                                                return j6g.a;
                                            }
                                        };
                                        function17 = function18;
                                        bVar2.p(gu5Var4);
                                        objV8 = gu5Var4;
                                    } else {
                                        function17 = function18;
                                    }
                                    gu5Var3 = (gu5) objV8;
                                    bVar2.F();
                                }
                                boolean z6 = z5;
                                boolean zA = bVar2.a(z6);
                                final gu5 gu5Var5 = gu5Var2;
                                boolean zK3 = zA | bVar2.K(gu5Var5);
                                Object objV9 = bVar2.v();
                                final g4a g4aVar14 = g4aVar9;
                                if (zK3 || objV9 == c0020a2) {
                                    objV9 = new kh4(z6, gu5Var5, g4aVar14, 0);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                Object objV10 = bVar2.v();
                                final g4a g4aVar15 = g4aVar10;
                                if (objV10 == c0020a2) {
                                    objV10 = new qu(1, g4aVar15);
                                    bVar2.p(objV10);
                                }
                                final b5g b5gVar3 = b5gVar2;
                                final iba ibaVar3 = ibaVar2;
                                final Function1 function19 = function16;
                                sb1.a(str3, gu5Var6, gu5Var3, 0, null, 0, null, null, b5gVar3, true, false, false, false, (gu5) objV10, R.string.delete_certification, bh2.c(-25857645, new Function2() { // from class: lh4
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        gl2.a.e eVar;
                                        int i3;
                                        pm8.a aVar;
                                        gl2.a.C0251a c0251a;
                                        b bVar3 = (b) obj6;
                                        int iIntValue = ((Integer) obj7).intValue();
                                        if (bVar3.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            e.a aVar2 = e.a.b;
                                            e eVarA = nub.a(nub.b(g.d(aVar2, 1.0f)), b5gVar3 == b5g.c, "Edit certification failed", oub.SAVE);
                                            vs0.k kVar = vs0.c;
                                            ob2 ob2VarA = mb2.a(kVar, c20.a.n, bVar3, 48);
                                            int iHashCode = Long.hashCode(bVar3.k());
                                            t8b t8bVarM = bVar3.m();
                                            e eVarC = androidx.compose.ui.c.c(bVar3, eVarA);
                                            gl2.j.getClass();
                                            pm8.a aVar3 = gl2.a.b;
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar3);
                                            } else {
                                                bVar3.n();
                                            }
                                            gl2.a.d dVar = gl2.a.g;
                                            ygg.y(bVar3, ob2VarA, dVar);
                                            gl2.a.f fVar = gl2.a.f;
                                            ygg.y(bVar3, t8bVarM, fVar);
                                            gl2.a.C0251a c0251a2 = gl2.a.j;
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                                uz.g(iHashCode, bVar3, iHashCode, c0251a2);
                                            }
                                            gl2.a.e eVar2 = gl2.a.d;
                                            ygg.y(bVar3, eVarC, eVar2);
                                            float f = v1c.e;
                                            e eVarH = f.h(aVar2, f, 0.0f, 2);
                                            af1 af1Var = c20.a.a;
                                            ag9 ag9VarD = hl1.d(af1Var, false);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarH);
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar3);
                                            } else {
                                                bVar3.n();
                                            }
                                            ygg.y(bVar3, ag9VarD, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a2);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar2);
                                            g4a g4aVar16 = g4aVar11;
                                            String str4 = (String) g4aVar16.getValue();
                                            String strI2 = ak2.I(R.string.label_certification_title, bVar3);
                                            String strI3 = ak2.I(R.string.label_certification_title, bVar3);
                                            String strI4 = ak2.I(R.string.subtext_certification_title, bVar3);
                                            iba ibaVar4 = ibaVar3;
                                            boolean zX2 = bVar3.x(ibaVar4);
                                            Object objV11 = bVar3.v();
                                            b.a.C0020a c0020a3 = b.a.a;
                                            if (zX2 || objV11 == c0020a3) {
                                                eVar = eVar2;
                                                i3 = 1;
                                                objV11 = new ua(ibaVar4, 1);
                                                bVar3.p(objV11);
                                            } else {
                                                eVar = eVar2;
                                                i3 = 1;
                                            }
                                            gu5 gu5Var7 = (gu5) objV11;
                                            Object objV12 = bVar3.v();
                                            if (objV12 == c0020a3) {
                                                objV12 = new jg4(i3, g4aVar16);
                                                bVar3.p(objV12);
                                            }
                                            gl2.a.e eVar3 = eVar;
                                            y31.a(str4, strI2, strI3, gu5Var7, strI4, null, (Function1) objV12, bVar3, 12583296, 64);
                                            bVar3.q();
                                            g4a g4aVar17 = g4aVar12;
                                            ig3 ig3Var = (ig3) g4aVar17.getValue();
                                            Object objV13 = bVar3.v();
                                            if (objV13 == c0020a3) {
                                                objV13 = new ch4(0, g4aVar17);
                                                bVar3.p(objV13);
                                            }
                                            Function1 function110 = (Function1) objV13;
                                            Object objV14 = bVar3.v();
                                            if (objV14 == c0020a3) {
                                                objV14 = new nf(10);
                                                bVar3.p(objV14);
                                            }
                                            xf.b(function110, ig3Var, (Function1) objV14, bVar3, 390);
                                            g4a g4aVar18 = g4aVar13;
                                            String strC = v1c.c((String) g4aVar18.getValue());
                                            Object objV15 = bVar3.v();
                                            if (objV15 == c0020a3) {
                                                int length = strC.length();
                                                objV15 = r.f(new jhf(strC, cr8.c(length, length), 4));
                                                bVar3.p(objV15);
                                            }
                                            g4a g4aVar19 = (g4a) objV15;
                                            Object objV16 = bVar3.v();
                                            if (objV16 == c0020a3) {
                                                objV16 = r.f(lcf.c);
                                                bVar3.p(objV16);
                                            }
                                            g4a g4aVar20 = (g4a) objV16;
                                            Object objV17 = bVar3.v();
                                            if (objV17 == c0020a3) {
                                                objV17 = r.f(Boolean.FALSE);
                                                bVar3.p(objV17);
                                            }
                                            g4a g4aVar21 = (g4a) objV17;
                                            e eVarH2 = f.h(aVar2, f, 0.0f, 2);
                                            ob2 ob2VarA2 = mb2.a(kVar, c20.a.m, bVar3, 0);
                                            int iHashCode3 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM3 = bVar3.m();
                                            e eVarC3 = androidx.compose.ui.c.c(bVar3, eVarH2);
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                aVar = aVar3;
                                                bVar3.y(aVar);
                                            } else {
                                                aVar = aVar3;
                                                bVar3.n();
                                            }
                                            ygg.y(bVar3, ob2VarA2, dVar);
                                            ygg.y(bVar3, t8bVarM3, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                                                c0251a = c0251a2;
                                                uz.g(iHashCode3, bVar3, iHashCode3, c0251a);
                                            } else {
                                                c0251a = c0251a2;
                                            }
                                            ygg.y(bVar3, eVarC3, eVar3);
                                            gl2.a.C0251a c0251a3 = c0251a;
                                            ue7.a(ak2.I(R.string.description, bVar3), false, null, 0L, 0.0f, null, bVar3, 48, 60);
                                            jhf jhfVar = (jhf) g4aVar19.getValue();
                                            Object objV18 = bVar3.v();
                                            if (objV18 == c0020a3) {
                                                objV18 = new o72(2, g4aVar19, g4aVar18);
                                                bVar3.p(objV18);
                                            }
                                            Function1 function111 = (Function1) objV18;
                                            Object objV19 = bVar3.v();
                                            if (objV19 == c0020a3) {
                                                objV19 = new zv2(1, g4aVar20);
                                                bVar3.p(objV19);
                                            }
                                            Function1 function112 = (Function1) objV19;
                                            lcf lcfVar = (lcf) g4aVar20.getValue();
                                            Object objV20 = bVar3.v();
                                            if (objV20 == c0020a3) {
                                                objV20 = new uf4(2, g4aVar21);
                                                bVar3.p(objV20);
                                            }
                                            pcf.a(jhfVar, function111, function112, lcfVar, (Function1) objV20, ((Boolean) g4aVar21.getValue()).booleanValue(), null, null, bVar3, 25008);
                                            b bVar4 = bVar3;
                                            bVar4.q();
                                            jh2.f(bVar4, g.h(aVar2, v1c.d));
                                            bVar4.q();
                                            ag9 ag9VarD2 = hl1.d(af1Var, false);
                                            int iHashCode4 = Long.hashCode(bVar4.k());
                                            t8b t8bVarM4 = bVar4.m();
                                            e eVarC4 = androidx.compose.ui.c.c(bVar4, aVar2);
                                            if (bVar4.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar4.B();
                                            if (bVar4.f()) {
                                                bVar4.y(aVar);
                                            } else {
                                                bVar4.n();
                                            }
                                            ygg.y(bVar4, ag9VarD2, dVar);
                                            ygg.y(bVar4, t8bVarM4, fVar);
                                            if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode4))) {
                                                uz.g(iHashCode4, bVar4, iHashCode4, c0251a3);
                                            }
                                            ygg.y(bVar4, eVarC4, eVar3);
                                            g4a g4aVar22 = g4aVar14;
                                            boolean zBooleanValue = ((Boolean) g4aVar22.getValue()).booleanValue();
                                            sp7.c.a aVar4 = sp7.c.a.a;
                                            if (zBooleanValue) {
                                                bVar4.L(-1898567804);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", aVar4, null, null, 24));
                                                Object objV21 = bVar4.v();
                                                if (objV21 == c0020a3) {
                                                    objV21 = new op0(2, g4aVar22);
                                                    bVar4.p(objV21);
                                                }
                                                gu5 gu5Var8 = (gu5) objV21;
                                                gu5 gu5Var9 = gu5Var5;
                                                boolean zK4 = bVar4.K(gu5Var9);
                                                Object objV22 = bVar4.v();
                                                if (zK4 || objV22 == c0020a3) {
                                                    objV22 = new eh4(gu5Var9, g4aVar22, 0);
                                                    bVar4.p(objV22);
                                                }
                                                r03.e(gu5Var8, (gu5) objV22, bVar4, 6);
                                            } else {
                                                bVar4.L(-1910386647);
                                            }
                                            bVar4.F();
                                            g4a g4aVar23 = g4aVar15;
                                            if (((Boolean) g4aVar23.getValue()).booleanValue()) {
                                                bVar4.L(-1897823308);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-certification", "confirmation-alert", aVar4, null, null, 24));
                                                String strI5 = ak2.I(R.string.confirm_delete_certification, bVar4);
                                                Function1 function113 = function19;
                                                boolean zK5 = bVar4.K(function113);
                                                hz1 hz1Var6 = hz1Var5;
                                                boolean zK6 = zK5 | bVar4.K(hz1Var6);
                                                Object objV23 = bVar4.v();
                                                if (zK6 || objV23 == c0020a3) {
                                                    objV23 = new sr2(function113, hz1Var6, g4aVar23);
                                                    bVar4.p(objV23);
                                                }
                                                gu5 gu5Var10 = (gu5) objV23;
                                                Object objV24 = bVar4.v();
                                                if (objV24 == c0020a3) {
                                                    objV24 = new pg0(3, g4aVar23);
                                                    bVar4.p(objV24);
                                                }
                                                hh2.d(null, strI5, gu5Var10, (gu5) objV24, ak2.I(R.string.delete, bVar4), ak2.I(R.string.cancel, bVar4), true, false, 0, bVar4, 1575942, 384);
                                                bVar4 = bVar4;
                                            } else {
                                                bVar4.L(-1910386647);
                                            }
                                            bVar4.F();
                                            bVar4.q();
                                        } else {
                                            bVar3.D();
                                        }
                                        return j6g.a;
                                    }
                                }, bVar2), bVar2, 805306368, 199680, 7416);
                                if (b5gVar3 == b5g.c) {
                                    bVar2.L(-1884119147);
                                    ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-certification", "error-toast", sp7.c.a.c, null, null, 24));
                                    boolean zK4 = bVar2.K(function17) | bVar2.K(hz1Var5);
                                    Object objV11 = bVar2.v();
                                    if (zK4 || objV11 == c0020a2) {
                                        objV11 = new cw(function17, hz1Var5, g4aVar11, g4aVar12, g4aVar13, 2);
                                        bVar2.p(objV11);
                                    }
                                    rg0.a((gu5) objV11, bVar2, 0);
                                    bVar2.F();
                                } else {
                                    bVar2.L(-1883279915);
                                    jh2.f(bVar2, g.h(e.a.b, v1c.d));
                                    bVar2.F();
                                }
                                return j6g.a;
                            }
                        }, true));
                        hba.a(gbaVar, "TITLE", new ah2(1783774668, new ih4(str3, list2, function1, gu5Var2, ibaVar2, hw9Var, g4aVar6), true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
                cVar.p(function14);
                objV7 = function14;
            } else {
                ibaVar = ibaVarB;
                cVar = cVarH;
            }
            nba.c(ibaVar, "HOME", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fh4(str, list, list2, function1, function12, gu5Var, function13, b5gVar, hw9Var, hz1Var, i);
        }
    }
}
