package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.d79;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.ytc;
import java.io.FileNotFoundException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ni6 {
    public static final void a(final boolean z, final String str, final String str2, final String str3, final Long l, final gu5 gu5Var, b bVar, final int i) {
        int i2;
        c cVar;
        boolean z2;
        gu5Var.getClass();
        c cVarH = bVar.h(-135055026);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.a(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(l) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i3 |= cVarH.x(gu5Var) ? 131072 : 65536;
        }
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            if (z) {
                cVarH.L(960547213);
                final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
                final String strI = ak2.I(R.string.share_hired_dialog_title, cVarH);
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    objV = r.f(Boolean.FALSE);
                    cVarH.p(objV);
                }
                final g4a g4aVar = (g4a) objV;
                j6g j6gVar = j6g.a;
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new mi6(2, null);
                    cVarH.p(objV2);
                }
                to4.d(cVarH, j6gVar, (Function2) objV2);
                Object objV3 = cVarH.v();
                if (objV3 == c0020a) {
                    objV3 = new ag3(3);
                    cVarH.p(objV3);
                }
                g24.b((gu5) objV3, cVarH, 6);
                boolean zX = cVarH.x(context) | ((i3 & 458752) == 131072);
                Object objV4 = cVarH.v();
                if (zX || objV4 == c0020a) {
                    z2 = false;
                    objV4 = new x9(7, context, gu5Var, false);
                    cVarH.p(objV4);
                } else {
                    z2 = false;
                }
                cVar = cVarH;
                z60.a((gu5) objV4, new o44(z2), bh2.c(-1953241892, new Function2() { // from class: ki6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                        af1 af1Var;
                        b bVar2 = (b) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e.a aVar = e.a.b;
                            e eVarD = g.d(aVar, 1.0f);
                            long jB = da2.b(da2.b, 0.65f);
                            ytc.a aVar2 = ytc.a;
                            e eVarB = a.b(eVarD, jB, aVar2);
                            Object objV5 = bVar2.v();
                            b.a.C0020a c0020a2 = b.a.a;
                            if (objV5 == c0020a2) {
                                objV5 = new e3a();
                                bVar2.p(objV5);
                            }
                            d3a d3aVar = (d3a) objV5;
                            Context context2 = context;
                            boolean zX2 = bVar2.x(context2);
                            gu5 gu5Var2 = gu5Var;
                            boolean zK = zX2 | bVar2.K(gu5Var2);
                            Object objV6 = bVar2.v();
                            int i4 = 4;
                            if (zK || objV6 == c0020a2) {
                                objV6 = new qv(i4, context2, gu5Var2);
                                bVar2.p(objV6);
                            }
                            e eVarB2 = androidx.compose.foundation.b.b(eVarB, d3aVar, null, false, null, null, (gu5) objV6, 28);
                            af1 af1Var2 = c20.a.a;
                            ag9 ag9VarD = hl1.d(af1Var2, false);
                            int iHashCode = Long.hashCode(bVar2.k());
                            t8b t8bVarM = bVar2.m();
                            e eVarC = androidx.compose.ui.c.c(bVar2, eVarB2);
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
                            ygg.y(bVar2, ag9VarD, dVar);
                            gl2.a.f fVar = gl2.a.f;
                            ygg.y(bVar2, t8bVarM, fVar);
                            gl2.a.C0251a c0251a = gl2.a.j;
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                                uz.g(iHashCode, bVar2, iHashCode, c0251a);
                            }
                            gl2.a.e eVar = gl2.a.d;
                            ygg.y(bVar2, eVarC, eVar);
                            d79.e eVar2 = new d79.e();
                            bVar2.u(-1248473602);
                            h0d h0dVar = new h0d(3, null);
                            Context context3 = (Context) bVar2.M(AndroidCompositionLocals_androidKt.b);
                            bVar2.u(1388713953);
                            boolean zK2 = bVar2.K(eVar2);
                            Object objV7 = bVar2.v();
                            if (zK2 || objV7 == c0020a2) {
                                objV7 = r.f(new c79());
                                bVar2.p(objV7);
                            }
                            g4a g4aVar2 = (g4a) objV7;
                            bVar2.J();
                            bVar2.u(1388714244);
                            boolean zK3 = bVar2.K(eVar2) | bVar2.K("__LottieInternalDefaultCacheKey__");
                            Object objV8 = bVar2.v();
                            if (zK3 || objV8 == c0020a2) {
                                af1Var = af1Var2;
                                q79<s69> q79VarB = j0d.b(context3, eVar2, "__LottieInternalDefaultCacheKey__", true);
                                bVar2.p(q79VarB);
                                objV8 = q79VarB;
                            } else {
                                af1Var = af1Var2;
                            }
                            bVar2.J();
                            to4.f(eVar2, "__LottieInternalDefaultCacheKey__", new i0d(h0dVar, context3, eVar2, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", g4aVar2, null), bVar2);
                            c79 c79Var = (c79) g4aVar2.getValue();
                            bVar2.J();
                            af1 af1Var3 = af1Var;
                            rl1.a(g.d(aVar, 1.0f).o(new ZIndexElement(2.0f)), null, false, bh2.c(-1738205568, new sw0(c79Var, 1), bVar2), bVar2, 3078, 6);
                            e eVarF = g.f(aVar, 1.0f);
                            af1 af1Var4 = c20.a.h;
                            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                            e eVarB3 = a.b(ygg.h(bVar3.h(eVarF, af1Var4), ggd.b(20.0f, 20.0f, 0.0f, 0.0f)), pnb.g(4279971665L), aVar2);
                            Object objV9 = bVar2.v();
                            if (objV9 == c0020a2) {
                                objV9 = new xi(7);
                                bVar2.p(objV9);
                            }
                            e eVarB4 = b5e.b(eVarB3, false, (Function1) objV9);
                            Object objV10 = bVar2.v();
                            if (objV10 == c0020a2) {
                                objV10 = new e3a();
                                bVar2.p(objV10);
                            }
                            d3a d3aVar2 = (d3a) objV10;
                            Object objV11 = bVar2.v();
                            if (objV11 == c0020a2) {
                                objV11 = new cp0(5);
                                bVar2.p(objV11);
                            }
                            e eVarB5 = androidx.compose.foundation.b.b(eVarB4, d3aVar2, null, false, null, null, (gu5) objV11, 28);
                            ag9 ag9VarD2 = hl1.d(af1Var3, false);
                            int iHashCode2 = Long.hashCode(bVar2.k());
                            t8b t8bVarM2 = bVar2.m();
                            e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarB5);
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
                            ygg.y(bVar2, ag9VarD2, dVar);
                            ygg.y(bVar2, t8bVarM2, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                                uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                            }
                            ygg.y(bVar2, eVarC2, eVar);
                            e eVarF2 = f.f(pnb.M(g.f(aVar, 1.0f), pnb.L(0, 1, bVar2), true), 16.0f);
                            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                            int iHashCode3 = Long.hashCode(bVar2.k());
                            t8b t8bVarM3 = bVar2.m();
                            e eVarC3 = androidx.compose.ui.c.c(bVar2, eVarF2);
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
                            ygg.y(bVar2, ob2VarA, dVar);
                            ygg.y(bVar2, t8bVarM3, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                                uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                            }
                            ygg.y(bVar2, eVarC3, eVar);
                            e eVarJ = f.j(g.f(aVar, 1.0f), 0.0f, 16.0f, 16.0f, 0.0f, 9);
                            ag9 ag9VarD3 = hl1.d(af1Var3, false);
                            int iHashCode4 = Long.hashCode(bVar2.k());
                            t8b t8bVarM4 = bVar2.m();
                            e eVarC4 = androidx.compose.ui.c.c(bVar2, eVarJ);
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
                            ygg.y(bVar2, ag9VarD3, dVar);
                            ygg.y(bVar2, t8bVarM4, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode4))) {
                                uz.g(iHashCode4, bVar2, iHashCode4, c0251a);
                            }
                            ygg.y(bVar2, eVarC4, eVar);
                            x2b x2bVarA = z2b.a(R.drawable.cross_icon, 0, bVar2);
                            String strI2 = ak2.I(R.string.share_hired_close_button, bVar2);
                            e eVarH = bVar3.h(aVar, c20.a.c);
                            g4a g4aVar3 = g4aVar;
                            e eVarA = n.a(eVarH, ((Boolean) g4aVar3.getValue()).booleanValue());
                            Object objV12 = bVar2.v();
                            if (objV12 == c0020a2) {
                                objV12 = new tu(2, g4aVar3);
                                bVar2.p(objV12);
                            }
                            e eVarA2 = androidx.compose.ui.focus.a.a(eVarA, (Function1) objV12);
                            boolean zX3 = bVar2.x(context2) | bVar2.K(gu5Var2);
                            Object objV13 = bVar2.v();
                            if (zX3 || objV13 == c0020a2) {
                                objV13 = new yi(4, context2, gu5Var2);
                                bVar2.p(objV13);
                            }
                            e eVarD2 = androidx.compose.foundation.b.d(eVarA2, false, null, null, (gu5) objV13, 15);
                            Object objV14 = bVar2.v();
                            if (objV14 == c0020a2) {
                                objV14 = new zg(5);
                                bVar2.p(objV14);
                            }
                            e eVarB6 = b5e.b(eVarD2, false, (Function1) objV14);
                            long j = da2.e;
                            f17.a(x2bVarA, strI2, eVarB6, null, null, 0.0f, new ih1(j, 5), bVar2, 1572864, 56);
                            bVar2.q();
                            e eVarF3 = g.f(aVar, 1.0f);
                            ag9 ag9VarD4 = hl1.d(c20.a.b, false);
                            int iHashCode5 = Long.hashCode(bVar2.k());
                            t8b t8bVarM5 = bVar2.m();
                            e eVarC5 = androidx.compose.ui.c.c(bVar2, eVarF3);
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
                            ygg.y(bVar2, ag9VarD4, dVar);
                            ygg.y(bVar2, t8bVarM5, fVar);
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode5))) {
                                uz.g(iHashCode5, bVar2, iHashCode5, c0251a);
                            }
                            ygg.y(bVar2, eVarC5, eVar);
                            String strI3 = ak2.I(R.string.share_hired_dialog_title, bVar2);
                            long jT = hh2.t(20);
                            to5 to5Var = to5.d0;
                            e eVarA3 = androidx.compose.ui.platform.f.a(f.h(g.f(aVar, 1.0f), 8.0f, 0.0f, 2), "share_hired_dialog_title");
                            String str4 = strI;
                            boolean zK4 = bVar2.K(str4);
                            Object objV15 = bVar2.v();
                            if (zK4 || objV15 == c0020a2) {
                                objV15 = new q2(str4, 12);
                                bVar2.p(objV15);
                            }
                            fif.b(strI3, b5e.b(eVarA3, true, (Function1) objV15), j, jT, to5Var, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, null, bVar2, 200064, 0, 130512);
                            bVar2.q();
                            jh2.f(bVar2, g.h(aVar, 16.0f));
                            ji6.a(str, str2, l, str3, bVar2, 0);
                            jh2.f(bVar2, g.h(aVar, Build.VERSION.SDK_INT >= 35 ? 48.0f : 24.0f));
                            bVar2.q();
                            bVar2.q();
                            bVar2.q();
                        } else {
                            bVar2.D();
                        }
                        return j6g.a;
                    }
                }, cVarH), cVar, 432, 0);
            } else {
                cVar = cVarH;
                z2 = false;
                cVar.L(957066068);
            }
            cVar.U(z2);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: li6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ni6.a(z, str, str2, str3, l, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
