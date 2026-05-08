package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yha {
    public static final void a(int i, boolean z, gu5 gu5Var, final gu5 gu5Var2, e eVar, b bVar, int i2) {
        char c;
        String strK;
        long j;
        boolean z2;
        boolean z3;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 1215905955);
        int i3 = i2 | (cVarC.d(i) ? 4 : 2) | (cVarC.a(z) ? 32 : 16) | (cVarC.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarC.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarC.o(i3 & 1, (i3 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarC.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            final iy3 iy3Var = (iy3) cVarC.M(um2.h);
            Configuration configuration = (Configuration) cVarC.M(AndroidCompositionLocals_androidKt.a);
            final float fT1 = iy3Var.t1(configuration.screenHeightDp);
            final float fT12 = iy3Var.t1(configuration.screenWidthDp);
            if (i > 0) {
                c = ' ';
                cVarC.L(-699295960);
                strK = ak2.J(R.string.recommended_next_steps_with_count, new Object[]{Integer.valueOf(i)}, cVarC);
                cVarC.U(false);
            } else {
                c = ' ';
                strK = z3.k(cVarC, -699204448, R.string.recommended_next_steps, cVarC, false);
            }
            String str = strK;
            e eVarG = f.g(androidx.compose.foundation.b.d(a.a(ygg.h(g.f(eVar, 1.0f), ggd.a(o97Var.h.b)), new kx8((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << c), u63.a0(new da2(o97Var.c.b.f.a), new da2(pnb.b(0.24705882f, 0.4509804f, 0.827451f, 1.0f, ya2.e)))), null, 6), !z, null, null, gu5Var, 14), 16.0f, 12.0f);
            boolean zK = cVarC.K(str);
            Object objV2 = cVarC.v();
            if (zK || objV2 == c0020a) {
                objV2 = new a23(str, 3);
                cVarC.p(objV2);
            }
            e eVarB = b5e.b(eVarG, false, (Function1) objV2);
            boolean zK2 = cVarC.K(iy3Var) | cVarC.c(fT1) | cVarC.c(fT12) | ((i3 & 7168) == 2048);
            Object objV3 = cVarC.v();
            if (zK2 || objV3 == c0020a) {
                Function1 function1 = new Function1() { // from class: wha
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        sl8 sl8Var = (sl8) obj;
                        sl8Var.getClass();
                        g4a g4aVar2 = g4aVar;
                        if (!((Boolean) g4aVar2.getValue()).booleanValue()) {
                            qtc qtcVarH = ojh.h(sl8Var);
                            iy3 iy3Var2 = iy3Var;
                            float fT13 = iy3Var2.t1(50.0f);
                            float fT14 = iy3Var2.t1(70.0f);
                            if (qtcVarH.b >= fT13 && qtcVarH.d <= fT1 - fT14 && qtcVarH.a >= 0.0f && qtcVarH.c <= fT12) {
                                g4aVar2.setValue(Boolean.TRUE);
                                gu5Var2.invoke();
                            }
                        }
                        return j6g.a;
                    }
                };
                cVarC.p(function1);
                objV3 = function1;
            }
            e eVarA = s.a(eVarB, (Function1) objV3);
            vs0.g gVar = vs0.g;
            af1.b bVar2 = c20.a.k;
            ehd ehdVarA = chd.a(gVar, bVar2, cVarC, 54);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarA);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar);
            } else {
                cVarC.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarC, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarC, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarC, eVarC, eVar2);
            ehd ehdVarA2 = chd.a(new vs0.i(8.0f, true, new us0(0)), bVar2, cVarC, 48);
            int iHashCode2 = Long.hashCode(cVarC.T);
            t8b t8bVarP2 = cVarC.P();
            e.a aVar2 = e.a.b;
            e eVarC2 = androidx.compose.ui.c.c(cVarC, aVar2);
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ehdVarA2, dVar);
            ygg.y(cVarC, t8bVarP2, fVar);
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarC, iHashCode2, c0251a);
            }
            ygg.y(cVarC, eVarC2, eVar2);
            String strI = ak2.I(R.string.recommended_next_steps, cVarC);
            tjf tjfVar = hz6.c;
            long j2 = da2.e;
            cif.b(strI, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarC, 384, 0, 65530);
            cVarC = cVarC;
            if (i > 0) {
                cVarC.L(-1135409252);
                e eVarB2 = a.b(ygg.h(g.n(aVar2, 20.0f), ggd.a), j2, ytc.a);
                ag9 ag9VarD = hl1.d(c20.a.e, false);
                int iHashCode3 = Long.hashCode(cVarC.T);
                t8b t8bVarP3 = cVarC.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarC, eVarB2);
                cVarC.B();
                if (cVarC.S) {
                    cVarC.y(aVar);
                } else {
                    cVarC.n();
                }
                ygg.y(cVarC, ag9VarD, dVar);
                ygg.y(cVarC, t8bVarP3, fVar);
                if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode3))) {
                    ja.h(iHashCode3, cVarC, iHashCode3, c0251a);
                }
                ygg.y(cVarC, eVarC3, eVar2);
                j = j2;
                cif.b(String.valueOf(i), null, eu6.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarC, 0, 0, 65530);
                cVarC = cVarC;
                z2 = true;
                cVarC.U(true);
                z3 = false;
            } else {
                j = j2;
                z2 = true;
                z3 = false;
                cVarC.L(-1139874089);
            }
            cVarC.U(z3);
            cVarC.U(z2);
            if (z) {
                cVarC.L(-980670715);
                tx6.a(null, "", false, null, cVarC, 48, 13);
                cVarC.U(false);
            } else {
                cVarC.L(-980578056);
                c cVar = cVarC;
                ev6.b(fv6.I1, null, null, null, j, null, cVar, 24582, 46);
                cVarC = cVar;
                cVarC.U(false);
            }
            cVarC.U(z2);
        } else {
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new xha(i, z, gu5Var, gu5Var2, eVar, i2);
        }
    }
}
