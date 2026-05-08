package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.j2h;
import defpackage.sp7;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hz {
    public static final void a(final boolean z, final t41 t41Var, final List list, final gu5 gu5Var, final Function1 function1, final b5g b5gVar, final hw9 hw9Var, final j2h j2hVar, b bVar, final int i) {
        c cVar;
        g4a g4aVar;
        c cVar2;
        iba ibaVar;
        j2h.a aVar;
        String str;
        j2h.b bVar2;
        j2h.b bVar3;
        j2h.b bVar4;
        String str2;
        t41Var.getClass();
        list.getClass();
        gu5Var.getClass();
        function1.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1454673487);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(t41Var) ? 32 : 16) | (cVarH.x(list) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192) | (cVarH.d(b5gVar.ordinal()) ? 131072 : 65536) | (cVarH.x(hw9Var) ? 1048576 : 524288) | (cVarH.K(j2hVar) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str3 = j2hVar != null ? j2hVar.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                objV = r.f(str3);
                cVarH.p(objV);
            }
            final g4a g4aVar2 = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(j2hVar != null ? j2hVar.c : null);
                cVarH.p(objV2);
            }
            final g4a g4aVar3 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f((j2hVar == null || (bVar4 = j2hVar.d) == null || (str2 = bVar4.a) == null) ? null : new Locale("", str2));
                cVarH.p(objV3);
            }
            final g4a g4aVar4 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                if (j2hVar == null || (bVar3 = j2hVar.d) == null || (str = bVar3.b) == null) {
                    str = (j2hVar == null || (bVar2 = j2hVar.d) == null) ? null : bVar2.c;
                }
                objV4 = r.f(str);
                cVarH.p(objV4);
            }
            g4a g4aVar5 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f((j2hVar == null || (aVar = j2hVar.e) == null) ? null : aVar.b);
                cVarH.p(objV5);
            }
            final g4a g4aVar6 = (g4a) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = r.f(j2hVar != null ? j2hVar.f : null);
                cVarH.p(objV6);
            }
            final g4a g4aVar7 = (g4a) objV6;
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV7 = cVarH.v();
            if (zX || objV7 == c0020a) {
                g4aVar = g4aVar5;
                objV7 = new a3(ibaVarB, 2);
                cVarH.p(objV7);
            } else {
                g4aVar = g4aVar5;
            }
            to4.b(ibaVarB, (Function1) objV7, cVarH);
            boolean zX2 = ((i2 & 14) == 4) | cVarH.x(t41Var) | ((i2 & 7168) == 2048) | cVarH.x(ibaVarB) | ((3670016 & i2) == 1048576 || cVarH.x(hw9Var)) | cVarH.x(list) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objV8 = cVarH.v();
            if (zX2 || objV8 == c0020a) {
                final g4a g4aVar8 = g4aVar;
                cVar2 = cVarH;
                Function1 function12 = new Function1() { // from class: jy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final t41 t41Var2 = t41Var;
                        final boolean z2 = z;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVarB;
                        final hw9 hw9Var2 = hw9Var;
                        final g4a g4aVar9 = g4aVar2;
                        hba.a(gbaVar, "JOB_TITLE", new ah2(-1087713810, new xu5() { // from class: py
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                b bVar5 = (b) obj4;
                                ((Integer) obj5).intValue();
                                ((bd0) obj2).getClass();
                                dVar.getClass();
                                t41 t41Var3 = t41Var2;
                                boolean zX3 = bVar5.x(t41Var3);
                                Object objV9 = bVar5.v();
                                int i3 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new ty(t41Var3, i3);
                                    bVar5.p(objV9);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV9), dVar.getDefaultViewModelCreationExtras(), bVar5);
                                g4a g4aVar10 = g4aVar9;
                                String str4 = (String) g4aVar10.getValue();
                                List list2 = (List) ((gme) f51Var.c0).getValue();
                                boolean zX4 = bVar5.x(f51Var);
                                Object objV10 = bVar5.v();
                                if (zX4 || objV10 == c0020a2) {
                                    objV10 = new cd(f51Var, 1);
                                    bVar5.p(objV10);
                                }
                                Function1 function13 = (Function1) objV10;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var3);
                                Object objV11 = bVar5.v();
                                if (zK || objV11 == c0020a2) {
                                    objV11 = new ni(2, gu5Var3);
                                    bVar5.p(objV11);
                                }
                                gu5 gu5Var4 = (gu5) objV11;
                                iba ibaVar3 = ibaVar2;
                                boolean zX5 = bVar5.x(ibaVar3);
                                Object objV12 = bVar5.v();
                                if (zX5 || objV12 == c0020a2) {
                                    objV12 = new ya(ibaVar3, 5);
                                    bVar5.p(objV12);
                                }
                                gu5 gu5Var5 = (gu5) objV12;
                                Object objV13 = bVar5.v();
                                if (objV13 == c0020a2) {
                                    objV13 = new vy(0, g4aVar10);
                                    bVar5.p(objV13);
                                }
                                hfg.b(1073938432, 192, gu5Var4, gu5Var5, null, hw9Var2, bVar5, str4, list2, function13, (Function1) objV13, z2, false);
                                return j6g.a;
                            }
                        }, true));
                        final g4a g4aVar10 = g4aVar3;
                        hba.a(gbaVar, "COMPANY", new ah2(-727049641, new xu5() { // from class: uy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                b bVar5 = (b) obj4;
                                ((Integer) obj5).intValue();
                                ((bd0) obj2).getClass();
                                dVar.getClass();
                                j6g j6gVar = j6g.a;
                                Object objV9 = bVar5.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV9 == c0020a2) {
                                    objV9 = new xi(2);
                                    bVar5.p(objV9);
                                }
                                to4.b(j6gVar, (Function1) objV9, bVar5);
                                t41 t41Var3 = t41Var2;
                                boolean zX3 = bVar5.x(t41Var3);
                                Object objV10 = bVar5.v();
                                int i3 = 1;
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new ma(t41Var3, i3);
                                    bVar5.p(objV10);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV10), dVar.getDefaultViewModelCreationExtras(), bVar5);
                                g4a g4aVar11 = g4aVar10;
                                String str4 = (String) g4aVar11.getValue();
                                List list2 = (List) ((gme) f51Var.e0).getValue();
                                boolean zX4 = bVar5.x(f51Var);
                                Object objV11 = bVar5.v();
                                if (zX4 || objV11 == c0020a2) {
                                    objV11 = new na(f51Var, i3);
                                    bVar5.p(objV11);
                                }
                                Function1 function13 = (Function1) objV11;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var3);
                                Object objV12 = bVar5.v();
                                int i4 = 0;
                                if (zK || objV12 == c0020a2) {
                                    objV12 = new qy(0, gu5Var3);
                                    bVar5.p(objV12);
                                }
                                gu5 gu5Var4 = (gu5) objV12;
                                iba ibaVar3 = ibaVar2;
                                boolean zX5 = bVar5.x(ibaVar3);
                                Object objV13 = bVar5.v();
                                int i5 = 3;
                                if (zX5 || objV13 == c0020a2) {
                                    objV13 = new vc(ibaVar3, i5);
                                    bVar5.p(objV13);
                                }
                                gu5 gu5Var5 = (gu5) objV13;
                                boolean zX6 = bVar5.x(ibaVar3);
                                Object objV14 = bVar5.v();
                                if (zX6 || objV14 == c0020a2) {
                                    objV14 = new bs(ibaVar3, i5);
                                    bVar5.p(objV14);
                                }
                                gu5 gu5Var6 = (gu5) objV14;
                                boolean zX7 = bVar5.x(ibaVar3);
                                Object objV15 = bVar5.v();
                                if (zX7 || objV15 == c0020a2) {
                                    objV15 = new ry(i4, ibaVar3, g4aVar11);
                                    bVar5.p(objV15);
                                }
                                gu5 gu5Var7 = (gu5) objV15;
                                Object objV16 = bVar5.v();
                                if (objV16 == c0020a2) {
                                    objV16 = new sy(0, g4aVar11);
                                    bVar5.p(objV16);
                                }
                                b8g.b(z2, list2, function13, gu5Var4, gu5Var5, gu5Var6, gu5Var7, (Function1) objV16, false, str4, false, hw9Var2, bVar5, 113246208, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar11 = g4aVar4;
                        hba.a(gbaVar, "COUNTRY", new ah2(-2059848842, new xu5() { // from class: wy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar5 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV9 = bVar5.v();
                                int i3 = 2;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV9 == c0020a2) {
                                    objV9 = new vg(i3);
                                    bVar5.p(objV9);
                                }
                                to4.b(j6gVar, (Function1) objV9, bVar5);
                                g4a g4aVar12 = g4aVar11;
                                Locale locale = (Locale) g4aVar12.getValue();
                                if (locale == null) {
                                    locale = new Locale("", "");
                                }
                                Locale locale2 = locale;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var3);
                                Object objV10 = bVar5.v();
                                if (zK || objV10 == c0020a2) {
                                    objV10 = new ld(3, gu5Var3);
                                    bVar5.p(objV10);
                                }
                                gu5 gu5Var4 = (gu5) objV10;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar5.x(ibaVar3);
                                Object objV11 = bVar5.v();
                                if (zX3 || objV11 == c0020a2) {
                                    objV11 = new yg(ibaVar3, 1);
                                    bVar5.p(objV11);
                                }
                                gu5 gu5Var5 = (gu5) objV11;
                                boolean zX4 = bVar5.x(ibaVar3);
                                Object objV12 = bVar5.v();
                                if (zX4 || objV12 == c0020a2) {
                                    objV12 = new nd(ibaVar3, 4);
                                    bVar5.p(objV12);
                                }
                                gu5 gu5Var6 = (gu5) objV12;
                                boolean zX5 = bVar5.x(ibaVar3);
                                Object objV13 = bVar5.v();
                                if (zX5 || objV13 == c0020a2) {
                                    objV13 = new ib(ibaVar3, i3);
                                    bVar5.p(objV13);
                                }
                                gu5 gu5Var7 = (gu5) objV13;
                                boolean zX6 = bVar5.x(ibaVar3);
                                Object objV14 = bVar5.v();
                                if (zX6 || objV14 == c0020a2) {
                                    objV14 = new x9(i3, ibaVar3, g4aVar12);
                                    bVar5.p(objV14);
                                }
                                k8g.a(0, gu5Var4, gu5Var5, gu5Var6, gu5Var7, (gu5) objV14, bVar5, locale2, z2, false);
                                return j6gVar;
                            }
                        }, true));
                        final List list2 = list;
                        hba.a(gbaVar, "COUNTRY_SELECTOR", new ah2(902319253, new xu5() { // from class: xy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar5 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV9 = bVar5.v();
                                int i3 = 3;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV9 == c0020a2) {
                                    objV9 = new ue(i3);
                                    bVar5.p(objV9);
                                }
                                to4.b(j6gVar, (Function1) objV9, bVar5);
                                g4a g4aVar12 = g4aVar11;
                                Locale locale = (Locale) g4aVar12.getValue();
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar5.x(ibaVar3);
                                Object objV10 = bVar5.v();
                                int i4 = 0;
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new ny(ibaVar3, g4aVar12, i4);
                                    bVar5.p(objV10);
                                }
                                Function1 function13 = (Function1) objV10;
                                boolean zX4 = bVar5.x(ibaVar3);
                                Object objV11 = bVar5.v();
                                if (zX4 || objV11 == c0020a2) {
                                    objV11 = new we(ibaVar3, i3);
                                    bVar5.p(objV11);
                                }
                                gu5 gu5Var3 = (gu5) objV11;
                                gu5 gu5Var4 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var4);
                                Object objV12 = bVar5.v();
                                if (zK || objV12 == c0020a2) {
                                    objV12 = new oy(0, gu5Var4);
                                    bVar5.p(objV12);
                                }
                                m23.a(list2, locale, function13, gu5Var3, (gu5) objV12, bVar5, 0);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar12 = g4aVar8;
                        hba.a(gbaVar, "LOCATION", new ah2(-430479948, new xu5() { // from class: yy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                b bVar5 = (b) obj4;
                                ((Integer) obj5).intValue();
                                ((bd0) obj2).getClass();
                                dVar.getClass();
                                j6g j6gVar = j6g.a;
                                Object objV9 = bVar5.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV9 == c0020a2) {
                                    objV9 = new wa(2);
                                    bVar5.p(objV9);
                                }
                                to4.b(j6gVar, (Function1) objV9, bVar5);
                                t41 t41Var3 = t41Var2;
                                boolean zX3 = bVar5.x(t41Var3);
                                Object objV10 = bVar5.v();
                                int i3 = 1;
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new or(t41Var3, i3);
                                    bVar5.p(objV10);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV10), dVar.getDefaultViewModelCreationExtras(), bVar5);
                                g4a g4aVar13 = g4aVar12;
                                String str4 = (String) g4aVar13.getValue();
                                List<g51> listS = f51Var.s();
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var3);
                                Object objV11 = bVar5.v();
                                if (zK || objV11 == c0020a2) {
                                    objV11 = new oi(1, gu5Var3);
                                    bVar5.p(objV11);
                                }
                                gu5 gu5Var4 = (gu5) objV11;
                                iba ibaVar3 = ibaVar2;
                                boolean zX4 = bVar5.x(ibaVar3);
                                Object objV12 = bVar5.v();
                                if (zX4 || objV12 == c0020a2) {
                                    objV12 = new ie(ibaVar3, 3);
                                    bVar5.p(objV12);
                                }
                                gu5 gu5Var5 = (gu5) objV12;
                                boolean zX5 = bVar5.x(ibaVar3);
                                Object objV13 = bVar5.v();
                                if (zX5 || objV13 == c0020a2) {
                                    objV13 = new ft(ibaVar3, g4aVar13, i3);
                                    bVar5.p(objV13);
                                }
                                Function1 function13 = (Function1) objV13;
                                boolean zX6 = bVar5.x(ibaVar3);
                                Object objV14 = bVar5.v();
                                int i4 = 0;
                                if (zX6 || objV14 == c0020a2) {
                                    objV14 = new ky(i4, ibaVar3, g4aVar13);
                                    bVar5.p(objV14);
                                }
                                gu5 gu5Var6 = (gu5) objV14;
                                boolean zX7 = bVar5.x(f51Var);
                                Object objV15 = bVar5.v();
                                if (zX7 || objV15 == c0020a2) {
                                    objV15 = new ly(i4, f51Var, g4aVar11);
                                    bVar5.p(objV15);
                                }
                                mfg.b(1572864, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, gu5Var4, gu5Var5, gu5Var6, hw9Var2, bVar5, str4, listS, function13, (Function1) objV15, z2, false);
                                return j6gVar;
                            }
                        }, true));
                        final g4a g4aVar13 = g4aVar6;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(-1763279149, new jj(z2, gu5Var2, ibaVar2, g4aVar13), true));
                        final Function1 function13 = function1;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar14 = g4aVar7;
                        hba.a(gbaVar, "DESCRIPTION", new ah2(1198888946, new xu5() { // from class: zy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar5 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV9 = bVar5.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV9 == c0020a2) {
                                    objV9 = new xr(1);
                                    bVar5.p(objV9);
                                }
                                to4.b(j6gVar, (Function1) objV9, bVar5);
                                final g4a g4aVar15 = g4aVar14;
                                String str4 = (String) g4aVar15.getValue();
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar5.K(gu5Var3);
                                Object objV10 = bVar5.v();
                                if (zK || objV10 == c0020a2) {
                                    objV10 = new eh(3, gu5Var3);
                                    bVar5.p(objV10);
                                }
                                gu5 gu5Var4 = (gu5) objV10;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar5.x(ibaVar3);
                                Object objV11 = bVar5.v();
                                if (zX3 || objV11 == c0020a2) {
                                    objV11 = new fh(ibaVar3, 2);
                                    bVar5.p(objV11);
                                }
                                gu5 gu5Var5 = (gu5) objV11;
                                final Function1 function14 = function13;
                                boolean zK2 = bVar5.K(function14);
                                Object objV12 = bVar5.v();
                                if (zK2 || objV12 == c0020a2) {
                                    final g4a g4aVar16 = g4aVar9;
                                    final g4a g4aVar17 = g4aVar10;
                                    final g4a g4aVar18 = g4aVar12;
                                    final g4a g4aVar19 = g4aVar13;
                                    final g4a g4aVar20 = g4aVar11;
                                    gu5 gu5Var6 = new gu5() { // from class: hy
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-work-experience", "save", null, null, 12));
                                            function14.invoke(new g2h(null, (String) g4aVar16.getValue(), (String) g4aVar17.getValue(), (Locale) g4aVar20.getValue(), (String) g4aVar18.getValue(), (ig3) g4aVar19.getValue(), (String) g4aVar15.getValue(), 9));
                                            return j6g.a;
                                        }
                                    };
                                    bVar5.p(gu5Var6);
                                    objV12 = gu5Var6;
                                }
                                gu5 gu5Var7 = (gu5) objV12;
                                Object objV13 = bVar5.v();
                                if (objV13 == c0020a2) {
                                    objV13 = new iy(0, g4aVar15);
                                    bVar5.p(objV13);
                                }
                                m8g.b(z2, gu5Var4, gu5Var5, gu5Var7, (Function1) objV13, str4, false, b5gVar2, bVar5, 24576);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
                cVar2.p(function12);
                objV8 = function12;
            } else {
                cVar2 = cVarH;
                ibaVar = ibaVarB;
            }
            cVar = cVar2;
            nba.c(ibaVar, "JOB_TITLE", null, null, null, null, null, null, null, null, (Function1) objV8, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, t41Var, list, gu5Var, function1, b5gVar, hw9Var, j2hVar, i) { // from class: my
                public final /* synthetic */ hw9 V;
                public final /* synthetic */ j2h W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ t41 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ b5g f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(2097153);
                    hz.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final i2h b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    return i2h.e;
                }
                return null;
            case 244823688:
                if (str.equals("COUNTRY_SELECTOR")) {
                    return i2h.d;
                }
                return null;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    return i2h.V;
                }
                return null;
            case 880722710:
                if (str.equals("JOB_TITLE")) {
                    return i2h.a;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return i2h.f;
                }
                return null;
            case 1668466781:
                if (str.equals("COMPANY")) {
                    return i2h.b;
                }
                return null;
            case 1675813750:
                if (str.equals("COUNTRY")) {
                    return i2h.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(i2h i2hVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-work-experience", i2hVar, null, 8));
    }
}
