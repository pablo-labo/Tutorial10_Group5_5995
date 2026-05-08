package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.s38;
import defpackage.sp7;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ah4 {
    static {
        s38.a aVar = s38.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final svb svbVar, final Function1<? super m61, j6g> function1, final gu5<j6g> gu5Var, final Function1<? super String, j6g> function12, final b5g b5gVar, b bVar, final int i) {
        c cVar;
        Object next;
        final m61 m61Var;
        b.a.C0020a c0020a;
        g4a g4aVar;
        g4a g4aVar2;
        g4a g4aVar3;
        gu5 gu5Var2;
        Object zu0Var;
        String str2;
        str.getClass();
        svbVar.getClass();
        function1.getClass();
        gu5Var.getClass();
        function12.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1976822944);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(svbVar) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.d(b5gVar.ordinal()) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            Iterator<T> it = svbVar.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (wl7.b(((m61) next).a, str)) {
                        break;
                    }
                }
            }
            m61 m61Var2 = (m61) next;
            final String strI = ak2.I(R.string.edit_award, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (objV == c0020a2) {
                if (m61Var2 == null || (str2 = m61Var2.d) == null) {
                    str2 = "";
                }
                objV = r.f(str2);
                cVarH.p(objV);
            }
            g4a g4aVar4 = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a2) {
                objV2 = r.f(m61Var2 != null ? m61Var2.b : null);
                cVarH.p(objV2);
            }
            g4a g4aVar5 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a2) {
                objV3 = r.f(m61Var2 != null ? m61Var2.c : null);
                cVarH.p(objV3);
            }
            g4a g4aVar6 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a2) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar7 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a2) {
                objV5 = r.f(Boolean.FALSE);
                cVarH.p(objV5);
            }
            final g4a g4aVar8 = (g4a) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a2) {
                objV6 = r.f(Boolean.FALSE);
                cVarH.p(objV6);
            }
            final g4a g4aVar9 = (g4a) objV6;
            final boolean z = (wl7.b((String) g4aVar4.getValue(), m61Var2 != null ? m61Var2.d : null) && wl7.b((String) g4aVar6.getValue(), m61Var2.c) && wl7.b((tg3) g4aVar5.getValue(), m61Var2.b)) ? false : true;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            if (!((Boolean) g4aVar8.getValue()).booleanValue() || zve.U((String) g4aVar4.getValue())) {
                m61Var = m61Var2;
                c0020a = c0020a2;
                g4aVar = g4aVar4;
                g4aVar2 = g4aVar6;
                g4aVar3 = g4aVar5;
                cVarH.L(1061152486);
                cVarH.U(false);
                gu5Var2 = null;
            } else {
                cVarH.L(1060669010);
                boolean zK = ((i2 & 896) == 256) | cVarH.K(m61Var2);
                Object objV7 = cVarH.v();
                if (zK || objV7 == c0020a2) {
                    m61Var = m61Var2;
                    g4aVar = g4aVar4;
                    c0020a = c0020a2;
                    g4aVar2 = g4aVar6;
                    g4aVar3 = g4aVar5;
                    zu0Var = new zu0(function1, m61Var, g4aVar, g4aVar3, g4aVar2, 1);
                    cVarH.p(zu0Var);
                } else {
                    g4aVar = g4aVar4;
                    zu0Var = objV7;
                    m61Var = m61Var2;
                    c0020a = c0020a2;
                    g4aVar2 = g4aVar6;
                    g4aVar3 = g4aVar5;
                }
                cVarH.U(false);
                gu5Var2 = (gu5) zu0Var;
            }
            boolean zA = cVarH.a(z) | ((i2 & 7168) == 2048);
            Object objV8 = cVarH.v();
            if (zA || objV8 == c0020a) {
                objV8 = new gu5() { // from class: tg4
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        if (z) {
                            g4aVar9.setValue(Boolean.TRUE);
                        } else {
                            gu5Var.invoke();
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV8);
            }
            gu5 gu5Var3 = (gu5) objV8;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                objV9 = new vg4(0, g4aVar7);
                cVarH.p(objV9);
            }
            final g4a g4aVar10 = g4aVar3;
            final g4a g4aVar11 = g4aVar;
            final g4a g4aVar12 = g4aVar2;
            cVar = cVarH;
            sb1.a(strI, gu5Var3, gu5Var2, 0, null, 0, null, null, b5gVar, true, false, false, false, (gu5) objV9, R.string.delete_award, bh2.c(1950226910, new Function2() { // from class: wg4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        af1 af1Var = c20.a.a;
                        ag9 ag9VarD = hl1.d(af1Var, false);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ag9VarD, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        e eVarB = nub.b(f.h(g.d(aVar, 1.0f), v1c.e, 0.0f, 2));
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        e eVarA = nub.a(eVarB, b5gVar2 == b5gVar3, "Edit award failed", oub.SAVE);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, bVar2, 48);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarA);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        Object objV10 = bVar2.v();
                        b.a.C0020a c0020a3 = b.a.a;
                        if (objV10 == c0020a3) {
                            objV10 = new as0(6);
                            bVar2.p(objV10);
                        }
                        String strI2 = ak2.I(R.string.title, bVar2);
                        String str3 = strI;
                        g4a g4aVar13 = g4aVar11;
                        v1c.a((gu5) objV10, null, false, null, 0L, null, null, strI2, null, bh2.c(-1929095508, new yg4(0, str3, g4aVar13), bVar2), bVar2, 6, 766);
                        Object objV11 = bVar2.v();
                        if (objV11 == c0020a3) {
                            objV11 = new ag3(1);
                            bVar2.p(objV11);
                        }
                        String strI3 = ak2.I(w61.b.a(), bVar2);
                        g4a g4aVar14 = g4aVar10;
                        v1c.a((gu5) objV11, null, false, null, 0L, null, null, strI3, null, bh2.c(1176344355, new zg4(0, g4aVar14, g4aVar8), bVar2), bVar2, 6, 766);
                        String strI4 = ak2.I(R.string.description, bVar2);
                        e eVarH = f.h(aVar, 0.0f, 24.0f, 1);
                        Object objV12 = bVar2.v();
                        if (objV12 == c0020a3) {
                            objV12 = new cp0(1);
                            bVar2.p(objV12);
                        }
                        o97 o97Var2 = o97Var;
                        g4a g4aVar15 = g4aVar12;
                        v1c.a((gu5) objV12, eVarH, false, null, 0L, null, null, strI4, null, bh2.c(-1566968412, new zq2(o97Var2, g4aVar15), bVar2), bVar2, 54, 764);
                        bVar2.q();
                        m61 m61Var3 = m61Var;
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(-1189994154);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-award", "error-toast", sp7.c.a.c, null, null, 24));
                            Function1 function13 = function1;
                            boolean zK2 = bVar2.K(function13) | bVar2.K(m61Var3);
                            Object objV13 = bVar2.v();
                            if (zK2 || objV13 == c0020a3) {
                                objV13 = new cw(function13, m61Var3, g4aVar13, g4aVar14, g4aVar15, 1);
                                bVar2.p(objV13);
                            }
                            z2 = false;
                            rg0.a((gu5) objV13, bVar2, 0);
                        } else {
                            z2 = false;
                            bVar2.L(-1199601922);
                        }
                        bVar2.F();
                        bVar2.q();
                        ag9 ag9VarD2 = hl1.d(af1Var, z2);
                        int iHashCode3 = Long.hashCode(bVar2.k());
                        t8b t8bVarM3 = bVar2.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar2, aVar);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ag9VarD2, dVar);
                        ygg.y(bVar2, t8bVarM3, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                            uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                        }
                        ygg.y(bVar2, eVarC3, eVar);
                        g4a g4aVar16 = g4aVar9;
                        boolean zBooleanValue = ((Boolean) g4aVar16.getValue()).booleanValue();
                        sp7.c.a aVar3 = sp7.c.a.a;
                        if (zBooleanValue) {
                            bVar2.L(851286601);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", aVar3, null, null, 24));
                            Object objV14 = bVar2.v();
                            if (objV14 == c0020a3) {
                                objV14 = new qg4(0, g4aVar16);
                                bVar2.p(objV14);
                            }
                            gu5 gu5Var4 = (gu5) objV14;
                            gu5 gu5Var5 = gu5Var;
                            boolean zK3 = bVar2.K(gu5Var5);
                            Object objV15 = bVar2.v();
                            if (zK3 || objV15 == c0020a3) {
                                objV15 = new mg0(gu5Var5, g4aVar16, 1);
                                bVar2.p(objV15);
                            }
                            r03.e(gu5Var4, (gu5) objV15, bVar2, 6);
                        } else {
                            bVar2.L(840820071);
                        }
                        bVar2.F();
                        g4a g4aVar17 = g4aVar7;
                        if (((Boolean) g4aVar17.getValue()).booleanValue()) {
                            bVar2.L(851918908);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-award", "confirmation-alert", aVar3, null, null, 24));
                            String strI5 = ak2.I(R.string.confirm_delete_award, bVar2);
                            Function1 function14 = function12;
                            boolean zK4 = bVar2.K(function14) | bVar2.K(m61Var3);
                            Object objV16 = bVar2.v();
                            if (zK4 || objV16 == c0020a3) {
                                objV16 = new rg4(0, function14, m61Var3, g4aVar17);
                                bVar2.p(objV16);
                            }
                            gu5 gu5Var6 = (gu5) objV16;
                            Object objV17 = bVar2.v();
                            if (objV17 == c0020a3) {
                                objV17 = new rr2(1, g4aVar17);
                                bVar2.p(objV17);
                            }
                            hh2.d(null, strI5, gu5Var6, (gu5) objV17, ak2.I(R.string.delete, bVar2), ak2.I(R.string.cancel, bVar2), true, false, 0, bVar2, 1575942, 384);
                        } else {
                            bVar2.L(840820071);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, ((i2 << 9) & 234881024) | 805306368, 199680, 7416);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, svbVar, function1, gu5Var, function12, b5gVar, i) { // from class: xg4
                public final /* synthetic */ String a;
                public final /* synthetic */ svb b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ b5g f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    ah4.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
