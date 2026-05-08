package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class mj {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ vi b;

        public a(iba ibaVar, vi viVar) {
            this.a = ibaVar;
            this.b = viVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    public static final class b implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.b);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.c);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.d);
        }
    }

    public static final class e implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.e);
        }
    }

    public static final class f implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.f);
        }
    }

    public static final class g implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            mj.c(io4.V);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, go4 go4Var, final Function1<? super go4, j6g> function1, final gu5<j6g> gu5Var, final t41 t41Var, final List<Locale> list, final b5g b5gVar, final hw9 hw9Var, androidx.compose.runtime.b bVar, int i) {
        function1.getClass();
        gu5Var.getClass();
        t41Var.getClass();
        list.getClass();
        b5gVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1012881019);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(go4Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(t41Var) ? 16384 : 8192) | (cVarH.x(list) ? 131072 : 65536) | (cVarH.d(b5gVar.ordinal()) ? 1048576 : 524288) | (cVarH.x(hw9Var) ? 8388608 : 4194304);
        int i3 = 1;
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new q2(ibaVarB, i3);
                cVarH.p(objV);
            }
            to4.b(ibaVarB, (Function1) objV, cVarH);
            final luc lucVar = new luc();
            String str = go4Var != null ? go4Var.c : null;
            T t = str;
            if (str == null) {
                t = "";
            }
            lucVar.element = t;
            final luc lucVar2 = new luc();
            lucVar2.element = go4Var != null ? go4Var.d : 0;
            final luc lucVar3 = new luc();
            lucVar3.element = go4Var != null ? go4Var.e : 0;
            final luc lucVar4 = new luc();
            lucVar4.element = go4Var != null ? go4Var.f : 0;
            final luc lucVar5 = new luc();
            lucVar5.element = go4Var != null ? go4Var.g : 0;
            final luc lucVar6 = new luc();
            lucVar6.element = (go4Var != null ? go4Var.h : null) == null ? 0 : new Locale("", go4Var.h);
            final luc lucVar7 = new luc();
            lucVar7.element = go4Var != null ? go4Var.i : 0;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(null);
                cVarH.p(objV2);
            }
            final g4a g4aVar = (g4a) objV2;
            g4aVar.setValue(go4Var != null ? go4Var.j : null);
            nba.c(ibaVarB, "EDUCATION_LEVEL", null, null, null, null, null, null, null, null, new Function1() { // from class: ii
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gba gbaVar = (gba) obj;
                    gbaVar.getClass();
                    final t41 t41Var2 = t41Var;
                    final luc lucVar8 = lucVar;
                    final boolean z2 = z;
                    final gu5 gu5Var2 = gu5Var;
                    final iba ibaVar = ibaVarB;
                    final hw9 hw9Var2 = hw9Var;
                    final luc lucVar9 = lucVar2;
                    hba.a(gbaVar, "EDUCATION_LEVEL", new ah2(-1793862626, new xu5() { // from class: dj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            d dVar = (d) obj3;
                            b bVar2 = (b) obj4;
                            ((Integer) obj5).intValue();
                            ((bd0) obj2).getClass();
                            dVar.getClass();
                            t41 t41Var3 = t41Var2;
                            boolean zX2 = bVar2.x(t41Var3);
                            Object objV3 = bVar2.v();
                            b.a.C0020a c0020a2 = b.a.a;
                            if (zX2 || objV3 == c0020a2) {
                                objV3 = new gi(t41Var3, 0);
                                bVar2.p(objV3);
                            }
                            iwc iwcVar = fwc.a;
                            f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV3), dVar.getDefaultViewModelCreationExtras(), bVar2);
                            luc lucVar10 = lucVar8;
                            String str2 = (String) lucVar10.element;
                            List list2 = (List) ((gme) f51Var.n0).getValue();
                            boolean zX3 = bVar2.x(f51Var);
                            Object objV4 = bVar2.v();
                            if (zX3 || objV4 == c0020a2) {
                                objV4 = new hi(f51Var, 0);
                                bVar2.p(objV4);
                            }
                            Function1 function12 = (Function1) objV4;
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var3);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new hh(1, gu5Var3);
                                bVar2.p(objV5);
                            }
                            gu5 gu5Var4 = (gu5) objV5;
                            iba ibaVar2 = ibaVar;
                            boolean zX4 = bVar2.x(ibaVar2);
                            Object objV6 = bVar2.v();
                            if (zX4 || objV6 == c0020a2) {
                                objV6 = new ih(ibaVar2, 1);
                                bVar2.p(objV6);
                            }
                            ji jiVar = new ji(lucVar10, 0);
                            ki kiVar = new ki(lucVar9, 0);
                            u8g.b(z2, list2, function12, gu5Var4, (gu5) objV6, jiVar, null, false, str2, kiVar, hw9Var2, bVar2, 0, 192);
                            return j6g.a;
                        }
                    }, true));
                    final luc lucVar10 = lucVar3;
                    final luc lucVar11 = lucVar4;
                    hba.a(gbaVar, "FIELD_OF_STUDY", new ah2(342640149, new xu5() { // from class: hj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            d dVar = (d) obj3;
                            b bVar2 = (b) obj4;
                            ((Integer) obj5).intValue();
                            ((bd0) obj2).getClass();
                            dVar.getClass();
                            j6g j6gVar = j6g.a;
                            Object objV3 = bVar2.v();
                            int i4 = 1;
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV3 == c0020a2) {
                                objV3 = new kd(i4);
                                bVar2.p(objV3);
                            }
                            to4.b(j6gVar, (Function1) objV3, bVar2);
                            t41 t41Var3 = t41Var2;
                            boolean zX2 = bVar2.x(t41Var3);
                            Object objV4 = bVar2.v();
                            int i5 = 0;
                            if (zX2 || objV4 == c0020a2) {
                                objV4 = new si(t41Var3, 0);
                                bVar2.p(objV4);
                            }
                            iwc iwcVar = fwc.a;
                            f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV4), dVar.getDefaultViewModelCreationExtras(), bVar2);
                            luc lucVar12 = lucVar10;
                            String str2 = (String) lucVar12.element;
                            List list2 = (List) ((gme) f51Var.q0).getValue();
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var3);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new u9(2, gu5Var3);
                                bVar2.p(objV5);
                            }
                            gu5 gu5Var4 = (gu5) objV5;
                            iba ibaVar2 = ibaVar;
                            boolean zX3 = bVar2.x(ibaVar2);
                            Object objV6 = bVar2.v();
                            if (zX3 || objV6 == c0020a2) {
                                objV6 = new nd(ibaVar2, 1);
                                bVar2.p(objV6);
                            }
                            gu5 gu5Var5 = (gu5) objV6;
                            ti tiVar = new ti(i5, ibaVar2, lucVar12);
                            ui uiVar = new ui(lucVar12, i5);
                            boolean zX4 = bVar2.x(ibaVar2);
                            Object objV7 = bVar2.v();
                            if (zX4 || objV7 == c0020a2) {
                                objV7 = new kb(ibaVar2, 2);
                                bVar2.p(objV7);
                            }
                            gu5 gu5Var6 = (gu5) objV7;
                            boolean zX5 = bVar2.x(f51Var);
                            Object objV8 = bVar2.v();
                            if (zX5 || objV8 == c0020a2) {
                                objV8 = new a3(f51Var, i4);
                                bVar2.p(objV8);
                            }
                            wi wiVar = new wi(lucVar11, 0);
                            r8g.b(z2, gu5Var4, gu5Var5, tiVar, uiVar, gu5Var6, false, str2, (Function1) objV8, list2, wiVar, hw9Var2, bVar2, 100663296, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 64);
                            return j6gVar;
                        }
                    }, true));
                    final luc lucVar12 = lucVar5;
                    hba.a(gbaVar, "SCHOOL_NAME", new ah2(790755734, new xu5() { // from class: ij
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            d dVar = (d) obj3;
                            b bVar2 = (b) obj4;
                            ((Integer) obj5).intValue();
                            ((bd0) obj2).getClass();
                            dVar.getClass();
                            j6g j6gVar = j6g.a;
                            Object objV3 = bVar2.v();
                            int i4 = 0;
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV3 == c0020a2) {
                                objV3 = new bj(i4);
                                bVar2.p(objV3);
                            }
                            to4.b(j6gVar, (Function1) objV3, bVar2);
                            t41 t41Var3 = t41Var2;
                            boolean zX2 = bVar2.x(t41Var3);
                            Object objV4 = bVar2.v();
                            if (zX2 || objV4 == c0020a2) {
                                objV4 = new cj(t41Var3, i4);
                                bVar2.p(objV4);
                            }
                            iwc iwcVar = fwc.a;
                            f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV4), dVar.getDefaultViewModelCreationExtras(), bVar2);
                            luc lucVar13 = lucVar12;
                            String str2 = (String) lucVar13.element;
                            List list2 = (List) ((gme) f51Var.s0).getValue();
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var3);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new zb(1, gu5Var3);
                                bVar2.p(objV5);
                            }
                            gu5 gu5Var4 = (gu5) objV5;
                            iba ibaVar2 = ibaVar;
                            boolean zX3 = bVar2.x(ibaVar2);
                            Object objV6 = bVar2.v();
                            if (zX3 || objV6 == c0020a2) {
                                objV6 = new ac(ibaVar2, 2);
                                bVar2.p(objV6);
                            }
                            gu5 gu5Var5 = (gu5) objV6;
                            ej ejVar = new ej(i4, ibaVar2, lucVar13);
                            fj fjVar = new fj(lucVar13, i4);
                            boolean zX4 = bVar2.x(ibaVar2);
                            Object objV7 = bVar2.v();
                            if (zX4 || objV7 == c0020a2) {
                                objV7 = new ie(ibaVar2, 2);
                                bVar2.p(objV7);
                            }
                            gu5 gu5Var6 = (gu5) objV7;
                            boolean zX5 = bVar2.x(f51Var);
                            Object objV8 = bVar2.v();
                            if (zX5 || objV8 == c0020a2) {
                                objV8 = new gj(f51Var, 0);
                                bVar2.p(objV8);
                            }
                            b9g.b(z2, gu5Var4, gu5Var5, ejVar, fjVar, gu5Var6, false, str2, (Function1) objV8, list2, hw9Var2, bVar2, 100663296, 64);
                            return j6gVar;
                        }
                    }, true));
                    final luc lucVar13 = lucVar6;
                    hba.a(gbaVar, "SCHOOL_COUNTRY", new ah2(1238871319, new jj(lucVar13, z2, gu5Var2, ibaVar), true));
                    final List list2 = list;
                    hba.a(gbaVar, "SCHOOL_COUNTRY_SELECTOR", new ah2(1686986904, new xu5() { // from class: kj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            b bVar2 = (b) obj4;
                            s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                            j6g j6gVar = j6g.a;
                            Object objV3 = bVar2.v();
                            int i4 = 0;
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV3 == c0020a2) {
                                objV3 = new li(0);
                                bVar2.p(objV3);
                            }
                            to4.b(j6gVar, (Function1) objV3, bVar2);
                            luc lucVar14 = lucVar13;
                            Locale locale = (Locale) lucVar14.element;
                            iba ibaVar2 = ibaVar;
                            mi miVar = new mi(i4, lucVar14, ibaVar2);
                            boolean zX2 = bVar2.x(ibaVar2);
                            Object objV4 = bVar2.v();
                            if (zX2 || objV4 == c0020a2) {
                                objV4 = new pg(ibaVar2, 1);
                                bVar2.p(objV4);
                            }
                            gu5 gu5Var3 = (gu5) objV4;
                            gu5 gu5Var4 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var4);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new ni(0, gu5Var4);
                                bVar2.p(objV5);
                            }
                            m23.a(list2, locale, miVar, gu5Var3, (gu5) objV5, bVar2, 0);
                            return j6gVar;
                        }
                    }, true));
                    final luc lucVar14 = lucVar7;
                    hba.a(gbaVar, "SCHOOL_LOCATION", new ah2(2135102489, new xu5() { // from class: lj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            d dVar = (d) obj3;
                            b bVar2 = (b) obj4;
                            ((Integer) obj5).intValue();
                            ((bd0) obj2).getClass();
                            dVar.getClass();
                            j6g j6gVar = j6g.a;
                            Object objV3 = bVar2.v();
                            int i4 = 0;
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV3 == c0020a2) {
                                objV3 = new xi(i4);
                                bVar2.p(objV3);
                            }
                            to4.b(j6gVar, (Function1) objV3, bVar2);
                            t41 t41Var3 = t41Var2;
                            boolean zX2 = bVar2.x(t41Var3);
                            Object objV4 = bVar2.v();
                            if (zX2 || objV4 == c0020a2) {
                                objV4 = new gi(t41Var3, 1);
                                bVar2.p(objV4);
                            }
                            iwc iwcVar = fwc.a;
                            f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV4), dVar.getDefaultViewModelCreationExtras(), bVar2);
                            luc lucVar15 = lucVar14;
                            String str2 = (String) lucVar15.element;
                            List<g51> listS = f51Var.s();
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var3);
                            Object objV5 = bVar2.v();
                            if (zK || objV5 == c0020a2) {
                                objV5 = new af(1, gu5Var3);
                                bVar2.p(objV5);
                            }
                            gu5 gu5Var4 = (gu5) objV5;
                            iba ibaVar2 = ibaVar;
                            yi yiVar = new yi(i4, ibaVar2, lucVar15);
                            zi ziVar = new zi(i4, lucVar15, ibaVar2);
                            boolean zX3 = bVar2.x(ibaVar2);
                            Object objV6 = bVar2.v();
                            if (zX3 || objV6 == c0020a2) {
                                objV6 = new vc(ibaVar2, 1);
                                bVar2.p(objV6);
                            }
                            y8g.b(1572864, 32, gu5Var4, yiVar, (gu5) objV6, hw9Var2, bVar2, str2, listS, ziVar, new aj(i4, f51Var, lucVar13), z2, false);
                            return j6gVar;
                        }
                    }, true));
                    final b5g b5gVar2 = b5gVar;
                    final g4a g4aVar2 = g4aVar;
                    final Function1 function12 = function1;
                    hba.a(gbaVar, "SCHOOL_TIME_PERIOD", new ah2(-1711749222, new xu5() { // from class: ci
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.xu5
                        public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                            b bVar2 = (b) obj4;
                            s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                            j6g j6gVar = j6g.a;
                            Object objV3 = bVar2.v();
                            int i4 = 1;
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV3 == c0020a2) {
                                objV3 = new ue(i4);
                                bVar2.p(objV3);
                            }
                            to4.b(j6gVar, (Function1) objV3, bVar2);
                            g4a g4aVar3 = g4aVar2;
                            ig3 ig3Var = (ig3) g4aVar3.getValue();
                            gu5 gu5Var3 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var3);
                            Object objV4 = bVar2.v();
                            if (zK || objV4 == c0020a2) {
                                objV4 = new di(0, gu5Var3);
                                bVar2.p(objV4);
                            }
                            gu5 gu5Var4 = (gu5) objV4;
                            iba ibaVar2 = ibaVar;
                            boolean zX2 = bVar2.x(ibaVar2);
                            Object objV5 = bVar2.v();
                            if (zX2 || objV5 == c0020a2) {
                                objV5 = new we(ibaVar2, 1);
                                bVar2.p(objV5);
                            }
                            gu5 gu5Var5 = (gu5) objV5;
                            ei eiVar = new ei(function12, lucVar8, lucVar9, lucVar10, lucVar11, lucVar12, lucVar13, lucVar14, g4aVar3);
                            Object objV6 = bVar2.v();
                            if (objV6 == c0020a2) {
                                objV6 = new fi(0, g4aVar3);
                                bVar2.p(objV6);
                            }
                            e9g.b(z2, gu5Var4, gu5Var5, eiVar, (Function1) objV6, ig3Var, false, b5gVar2, bVar2, 196608);
                            return j6gVar;
                        }
                    }, true));
                    return j6g.a;
                }
            }, cVarH, 0, 0, 1020);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qi(z, go4Var, function1, gu5Var, t41Var, list, b5gVar, hw9Var, i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final io4 b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1427510488:
                if (str.equals("SCHOOL_TIME_PERIOD")) {
                    return io4.V;
                }
                return null;
            case -784964490:
                if (str.equals("SCHOOL_NAME")) {
                    return io4.c;
                }
                return null;
            case -778660832:
                if (str.equals("SCHOOL_LOCATION")) {
                    return io4.f;
                }
                return null;
            case 428810227:
                if (str.equals("SCHOOL_COUNTRY_SELECTOR")) {
                    return io4.e;
                }
                return null;
            case 455746987:
                if (str.equals("SCHOOL_COUNTRY")) {
                    return io4.d;
                }
                return null;
            case 569795334:
                if (str.equals("FIELD_OF_STUDY")) {
                    return io4.b;
                }
                return null;
            case 2093594605:
                if (str.equals("EDUCATION_LEVEL")) {
                    return io4.a;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(io4 io4Var) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-education", io4Var, null, 8));
    }
}
