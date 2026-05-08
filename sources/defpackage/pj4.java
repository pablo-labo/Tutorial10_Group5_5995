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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pj4 {
    public static final void a(final String str, final gu5 gu5Var, final gu5 gu5Var2, final Function1 function1, final Function1 function12, final wj8 wj8Var, final String str2, final String str3, final String str4, final String str5, final Function1 function13, final gu5 gu5Var3, final Function2 function2, final b5g b5gVar, b bVar, final int i) {
        c cVar;
        int i2;
        final boolean z;
        final g4a g4aVar;
        boolean z2;
        gu5 gu5Var4;
        str.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        function1.getClass();
        function12.getClass();
        str2.getClass();
        function13.getClass();
        gu5Var3.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(631216044);
        int i3 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.K(wj8Var) ? 131072 : 65536) | (cVarH.K(str2) ? 1048576 : 524288) | (cVarH.K(str3) ? 8388608 : 4194304) | (cVarH.K(str4) ? 67108864 : 33554432) | (cVarH.K(str5) ? 536870912 : 268435456);
        int i4 = 390 | (cVarH.x(gu5Var3) ? 32 : 16) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar2 = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            final g4a g4aVar3 = (g4a) objV2;
            boolean z3 = (wl7.b(wj8Var.b, str2) && wl7.b(wj8Var.d, str4)) ? false : true;
            if (zve.U(str2)) {
                i2 = i3;
                z = z3;
                g4aVar = g4aVar2;
                z2 = false;
                cVarH.L(1192058970);
                cVarH.U(false);
                gu5Var4 = null;
            } else {
                boolean z4 = z3;
                cVarH.L(1191638920);
                boolean z5 = ((i3 & 7168) == 2048) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912);
                Object objV3 = cVarH.v();
                if (z5 || objV3 == c0020a) {
                    g4aVar = g4aVar2;
                    z = z4;
                    i2 = i3;
                    gu5 gu5Var5 = new gu5() { // from class: ij4
                        @Override // defpackage.gu5
                        public final Object invoke() {
                            function1.invoke(new wj8(32, wj8Var.a, str2, str3, str4, str5));
                            return j6g.a;
                        }
                    };
                    cVarH.p(gu5Var5);
                    objV3 = gu5Var5;
                } else {
                    g4aVar = g4aVar2;
                    z = z4;
                    i2 = i3;
                }
                gu5Var4 = (gu5) objV3;
                z2 = false;
                cVarH.U(false);
            }
            gu5 gu5Var6 = gu5Var4;
            boolean zA = cVarH.a(z) | ((i2 & 896) == 256 ? true : z2);
            Object objV4 = cVarH.v();
            if (zA || objV4 == c0020a) {
                objV4 = new gu5() { // from class: jj4
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        if (z) {
                            g4aVar3.setValue(Boolean.TRUE);
                        } else {
                            gu5Var2.invoke();
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV4);
            }
            gu5 gu5Var7 = (gu5) objV4;
            boolean zA2 = cVarH.a(z);
            if ((i2 & 112) == 32) {
                z2 = true;
            }
            boolean z6 = z2 | zA2;
            Object objV5 = cVarH.v();
            if (z6 || objV5 == c0020a) {
                objV5 = new di4(z, gu5Var, g4aVar3, 1);
                cVarH.p(objV5);
            }
            gu5 gu5Var8 = (gu5) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = new uc1(3, g4aVar);
                cVarH.p(objV6);
            }
            cVar = cVarH;
            sb1.a(str, gu5Var7, gu5Var6, 0, null, 0, gu5Var8, null, b5gVar, false, false, false, false, (gu5) objV6, R.string.delete_language, bh2.c(826990890, new Function2() { // from class: kj4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b.a.C0020a c0020a2;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zrd zrdVarL = pnb.L(0, 1, bVar2);
                        e.a aVar = e.a.b;
                        e eVarB = nub.b(f.h(pnb.M(g.d(aVar, 1.0f), zrdVarL, true), v1c.e, 0.0f, 2));
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        e eVarA = nub.a(eVarB, b5gVar2 == b5gVar3, "Edit language failed", oub.SAVE);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
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
                        ygg.y(bVar2, ob2VarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        String strI = ak2.I(R.string.language_label, bVar2);
                        String strI2 = ak2.I(R.string.language_label, bVar2);
                        String str6 = str2;
                        y31.a(str6, strI, strI2, gu5Var3, null, null, function13, bVar2, 384, 96);
                        String str7 = str4;
                        ygg.e(str7, function2, bVar2, 0);
                        b.a.C0020a c0020a3 = b.a.a;
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(-229727956);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "error-toast", sp7.c.a.c, null, null, 24));
                            Function1 function14 = function1;
                            boolean zK = bVar2.K(function14) | bVar2.K(str6);
                            String str8 = str3;
                            boolean zK2 = zK | bVar2.K(str8) | bVar2.K(str7);
                            String str9 = str5;
                            boolean zK3 = zK2 | bVar2.K(str9);
                            Object objV7 = bVar2.v();
                            if (zK3 || objV7 == c0020a3) {
                                objV7 = new mj4(function14, str6, str8, str7, str9);
                                bVar2.p(objV7);
                            }
                            rg0.a((gu5) objV7, bVar2, 0);
                            bVar2.F();
                        } else {
                            bVar2.L(-228859894);
                            jh2.f(bVar2, g.h(aVar, v1c.d));
                            bVar2.F();
                        }
                        bVar2.q();
                        ag9 ag9VarD = hl1.d(c20.a.a, false);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, aVar);
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
                        ygg.y(bVar2, ag9VarD, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        g4a g4aVar4 = g4aVar;
                        boolean zBooleanValue = ((Boolean) g4aVar4.getValue()).booleanValue();
                        sp7.c.a aVar3 = sp7.c.a.a;
                        if (zBooleanValue) {
                            bVar2.L(1786300484);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", aVar3, null, null, 24));
                            String strI3 = ak2.I(R.string.confirm_delete_language, bVar2);
                            Function1 function15 = function12;
                            boolean zK4 = bVar2.K(function15) | bVar2.K(str6);
                            Object objV8 = bVar2.v();
                            if (zK4 || objV8 == c0020a3) {
                                objV8 = new nj4(function15, str6, g4aVar4, 0);
                                bVar2.p(objV8);
                            }
                            gu5 gu5Var9 = (gu5) objV8;
                            Object objV9 = bVar2.v();
                            if (objV9 == c0020a3) {
                                objV9 = new oj4(0, g4aVar4);
                                bVar2.p(objV9);
                            }
                            c0020a2 = c0020a3;
                            hh2.d(null, strI3, gu5Var9, (gu5) objV9, ak2.I(R.string.delete, bVar2), ak2.I(R.string.cancel, bVar2), true, false, 0, bVar2, 1575942, 384);
                            bVar2 = bVar2;
                        } else {
                            c0020a2 = c0020a3;
                            bVar2.L(1778744978);
                        }
                        bVar2.F();
                        g4a g4aVar5 = g4aVar3;
                        if (((Boolean) g4aVar5.getValue()).booleanValue()) {
                            bVar2.L(1787233088);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", aVar3, null, null, 24));
                            Object objV10 = bVar2.v();
                            if (objV10 == c0020a2) {
                                objV10 = new lg4(1, g4aVar5);
                                bVar2.p(objV10);
                            }
                            gu5 gu5Var10 = (gu5) objV10;
                            gu5 gu5Var11 = gu5Var2;
                            boolean zK5 = bVar2.K(gu5Var11);
                            Object objV11 = bVar2.v();
                            if (zK5 || objV11 == c0020a2) {
                                objV11 = new mg0(gu5Var11, g4aVar5, 2);
                                bVar2.p(objV11);
                            }
                            r03.e(gu5Var10, (gu5) objV11, bVar2, 6);
                        } else {
                            bVar2.L(1778744978);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, ((i4 << 15) & 234881024) | (i2 & 14), 199680, 7864);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, gu5Var, gu5Var2, function1, function12, wj8Var, str2, str3, str4, str5, function13, gu5Var3, function2, b5gVar, i) { // from class: lj4
                public final /* synthetic */ String V;
                public final /* synthetic */ String W;
                public final /* synthetic */ String X;
                public final /* synthetic */ String Y;
                public final /* synthetic */ Function1 Z;
                public final /* synthetic */ String a;
                public final /* synthetic */ gu5 a0;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ Function2 b0;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ b5g c0;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ wj8 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    pj4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
