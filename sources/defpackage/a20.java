package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a20 {
    public static final e a;
    public static final e b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        e.a aVar = e.a.b;
        a = f.j(aVar, 24.0f, 0.0f, 24.0f, 0.0f, 10);
        b = f.j(aVar, 24.0f, 0.0f, 24.0f, 28.0f, 2);
        c = hh2.t(40);
        d = hh2.t(36);
        e = hh2.t(38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void a(Function2 function2, Function2 function22, b bVar, int i) {
        ?? r2;
        boolean z;
        boolean z2;
        c cVarH = bVar.h(1213983107);
        int i2 = i | (cVarH.x(function2) ? 32 : 16) | (cVarH.x(function22) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = o10.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, layoutWeightElement);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9Var, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            af1 af1Var = c20.a.a;
            af1.a aVar2 = c20.a.m;
            if (function2 == null) {
                cVarH.L(1809237538);
                cVarH.U(false);
                z = false;
            } else {
                cVarH.L(1809237539);
                e eVarO = h.b(a, "title").o(new HorizontalAlignElement(aVar2));
                ag9 ag9VarD = hl1.d(af1Var, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarO);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar);
                function2.invoke(cVarH, 0);
                cVarH.U(true);
                z = false;
                cVarH.U(false);
            }
            if (function22 == null) {
                cVarH.L(1809370342);
                cVarH.U(z);
                z2 = true;
            } else {
                cVarH.L(1809370343);
                e eVarO2 = h.b(b, "text").o(new HorizontalAlignElement(aVar2));
                ag9 ag9VarD2 = hl1.d(af1Var, z);
                int iG3 = cVarH.G();
                t8b t8bVarP3 = cVarH.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarO2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD2, dVar);
                ygg.y(cVarH, t8bVarP3, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                    ja.h(iG3, cVarH, iG3, c0251a);
                }
                ygg.y(cVarH, eVarC3, eVar);
                function22.invoke(cVarH, 0);
                z2 = true;
                cVarH.U(true);
                cVarH.U(false);
            }
            cVarH.U(z2);
            r2 = z2;
        } else {
            r2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jh(function2, i, r2, function22);
        }
    }

    public static final void b(final ah2 ah2Var, final e eVar, final Function2 function2, final Function2 function22, final dce dceVar, final long j, final long j2, b bVar, final int i) {
        c cVarH = bVar.h(1945098332);
        int i2 = i | (cVarH.x(ah2Var) ? 4 : 2) | (cVarH.K(eVar) ? 32 : 16) | (cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(dceVar) ? 16384 : 8192) | (cVarH.e(j) ? 131072 : 65536) | (cVarH.e(j2) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            int i3 = ((i2 >> 3) & 14) | 1572864;
            int i4 = i2 >> 9;
            m0f.a(eVar, dceVar, j, j2, null, 0.0f, bh2.c(802957984, new t10(function2, function22, ah2Var), cVarH), cVarH, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 48);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(eVar, function2, function22, dceVar, j, j2, i) { // from class: l10
                public final /* synthetic */ long V;
                public final /* synthetic */ e b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ dce e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    a20.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(1271829505);
        if (cVarH.o(i & 1, (i & 147) != 146)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new v10();
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.invoke(cVarH, 6);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(ah2Var, i, 2);
        }
    }
}
