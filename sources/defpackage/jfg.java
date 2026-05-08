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
import defpackage.sp7;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jfg {
    public static final void a(boolean z, final gu5<j6g> gu5Var, final Function1<? super String, j6g> function1, final String str, final Function1<? super String, j6g> function12, final gu5<j6g> gu5Var2, boolean z2, final b5g b5gVar, gu5<Boolean> gu5Var3, b bVar, int i) {
        int i2;
        c cVar;
        String strI;
        gu5 gu5Var4;
        gu5Var.getClass();
        function1.getClass();
        str.getClass();
        function12.getClass();
        gu5Var2.getClass();
        b5gVar.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-1850012006);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.a(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i3 |= cVarH.x(gu5Var2) ? 131072 : 65536;
        }
        int i4 = i3 | (cVarH.d(b5gVar.ordinal()) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            i4 |= cVarH.x(gu5Var3) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if (cVarH.o(i5 & 1, (38347923 & i5) != 38347922)) {
            int i6 = R.string.link_edit;
            if (z) {
                strI = z3.k(cVarH, -686967663, R.string.link_edit, cVarH, false);
            } else {
                cVarH.L(-686906066);
                if (!z2) {
                    i6 = R.string.link_add;
                }
                strI = ak2.I(i6, cVarH);
                cVarH.U(false);
            }
            String str2 = z2 ? "edit-link" : "add-link";
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.FALSE);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            if (z2) {
                cVarH.L(-685718301);
                Object objV4 = cVarH.v();
                if (objV4 == c0020a) {
                    objV4 = new su(3, g4aVar2);
                    cVarH.p(objV4);
                }
                gu5Var4 = (gu5) objV4;
                cVarH.U(false);
            } else {
                cVarH.L(-685645917);
                cVarH.U(false);
                gu5Var4 = null;
            }
            gu5 gu5Var5 = gu5Var4;
            boolean z3 = ((i5 & 234881024) == 67108864) | ((i5 & 112) == 32);
            Object objV5 = cVarH.v();
            if (z3 || objV5 == c0020a) {
                objV5 = new fk7(2, gu5Var3, gu5Var, g4aVar);
                cVarH.p(objV5);
            }
            gu5 gu5Var6 = (gu5) objV5;
            boolean zK = ((i5 & 7168) == 2048) | cVarH.K(str2) | ((i5 & 896) == 256);
            Object objV6 = cVarH.v();
            if (zK || objV6 == c0020a) {
                objV6 = new jw6(str2, str, function1, g4aVar3);
                cVarH.p(objV6);
            }
            final String str3 = strI;
            final String str4 = str2;
            cVar = cVarH;
            sb1.a(str3, gu5Var6, (gu5) objV6, 0, null, 0, null, null, b5gVar, false, false, false, false, gu5Var5, R.string.link_delete, bh2.c(1192676188, new Function2() { // from class: ifg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String strE;
                    b.a.C0020a c0020a2;
                    boolean z4;
                    e.a aVar;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar2 = e.a.b;
                        e eVarB = nub.b(f.f(aVar2, 19.0f));
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        boolean z5 = b5gVar2 == b5gVar3;
                        String str5 = str3;
                        e eVarA = nub.a(eVarB, z5, t40.k(str5, " failed"), oub.SAVE);
                        ob2 ob2VarA = mb2.a(new vs0.i(10.0f, true, new us0(0)), c20.a.n, bVar2, 54);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                        gl2.j.getClass();
                        pm8.a aVar3 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar3);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ob2VarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        String strI2 = ak2.I(R.string.url_field_label, bVar2);
                        if (((Boolean) g4aVar3.getValue()).booleanValue()) {
                            strE = l.e(bVar2, -1693594720, R.string.invalid_url_alert_text, bVar2);
                        } else {
                            bVar2.L(-1693500233);
                            bVar2.F();
                            strE = null;
                        }
                        Function1 function13 = function12;
                        boolean zK2 = bVar2.K(function13);
                        Object objV7 = bVar2.v();
                        b.a.C0020a c0020a3 = b.a.a;
                        if (zK2 || objV7 == c0020a3) {
                            objV7 = new bz6(function13, 1);
                            bVar2.p(objV7);
                        }
                        String str6 = str;
                        jyb.a(str6, function13, strI2, true, str5, false, null, null, (gu5) objV7, true, null, "UpdateLinkUrl", null, null, strE, bVar2, 805309440, 48, 13536);
                        bVar2.q();
                        g4a g4aVar4 = g4aVar;
                        if (((Boolean) g4aVar4.getValue()).booleanValue()) {
                            bVar2.L(-1246950616);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", sp7.c.a.a, null, null, 24));
                            Object objV8 = bVar2.v();
                            c0020a2 = c0020a3;
                            if (objV8 == c0020a2) {
                                objV8 = new uc1(5, g4aVar4);
                                bVar2.p(objV8);
                            }
                            gu5 gu5Var7 = (gu5) objV8;
                            gu5 gu5Var8 = gu5Var;
                            boolean zK3 = bVar2.K(gu5Var8);
                            Object objV9 = bVar2.v();
                            if (zK3 || objV9 == c0020a2) {
                                objV9 = new og0(gu5Var8, g4aVar4, 2);
                                bVar2.p(objV9);
                            }
                            r03.e(gu5Var7, (gu5) objV9, bVar2, 6);
                        } else {
                            c0020a2 = c0020a3;
                            bVar2.L(-1252244858);
                        }
                        bVar2.F();
                        int i7 = 3;
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(-1246392647);
                            String str7 = str4;
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-".concat(str7), "error-toast", sp7.c.a.c, null, null, 24));
                            boolean zK4 = bVar2.K(str7);
                            Function1 function14 = function1;
                            boolean zK5 = zK4 | bVar2.K(function14) | bVar2.K(str6);
                            Object objV10 = bVar2.v();
                            if (zK5 || objV10 == c0020a2) {
                                objV10 = new eq0(i7, str7, function14, str6);
                                bVar2.p(objV10);
                            }
                            z4 = false;
                            rg0.a((gu5) objV10, bVar2, 0);
                            bVar2.F();
                            aVar = aVar2;
                        } else {
                            z4 = false;
                            bVar2.L(-1245903002);
                            aVar = aVar2;
                            jh2.f(bVar2, g.h(aVar, v1c.d));
                            bVar2.F();
                        }
                        ag9 ag9VarD = hl1.d(c20.a.a, z4);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, aVar);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar3);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ag9VarD, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        g4a g4aVar5 = g4aVar2;
                        if (((Boolean) g4aVar5.getValue()).booleanValue()) {
                            bVar2.L(-978555997);
                            String strI3 = ak2.I(R.string.confirm_delete_link, bVar2);
                            gu5 gu5Var9 = gu5Var2;
                            boolean zK6 = bVar2.K(gu5Var9);
                            Object objV11 = bVar2.v();
                            if (zK6 || objV11 == c0020a2) {
                                objV11 = new vm0(gu5Var9, g4aVar5, 1);
                                bVar2.p(objV11);
                            }
                            gu5 gu5Var10 = (gu5) objV11;
                            Object objV12 = bVar2.v();
                            if (objV12 == c0020a2) {
                                objV12 = new il4(3, g4aVar5);
                                bVar2.p(objV12);
                            }
                            hh2.d(null, strI3, gu5Var10, (gu5) objV12, ak2.I(R.string.delete, bVar2), ak2.I(R.string.cancel, bVar2), true, false, 0, bVar2, 1575942, 384);
                        } else {
                            bVar2.L(-985291956);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, (i5 << 3) & 234881024, 196608, 7928);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new t3f(z, gu5Var, function1, str, function12, gu5Var2, z2, b5gVar, gu5Var3, i);
        }
    }
}
