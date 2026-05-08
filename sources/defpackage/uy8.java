package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.fx8;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uy8 {

    public static final class a implements ag9 {
        public final /* synthetic */ float a;

        public a(float f) {
            this.a = f;
        }

        @Override // defpackage.ag9
        public final bg9 c(q qVar, List<? extends vf9> list, long j) {
            int iMax;
            final int iRound;
            final w wVarR = list.get(0).R(iq2.a(0, 0, 0, 0, 11, j));
            int iV = wVarR.V(e20.a);
            if (iV != Integer.MIN_VALUE) {
                iRound = qVar.x0(this.a) - iV;
                iMax = Math.max(iq2.i(j), wVarR.b + iRound);
            } else {
                iMax = Math.max(iq2.i(j), wVarR.b);
                long j2 = iMax - wVarR.b;
                float f = ((int) ((j2 & 4294967295L) >> 32)) / 2.0f;
                iRound = (int) (((((long) Math.round(1.0f * (((int) (j2 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(((qVar.getLayoutDirection() == vl8.a ? 0.0f : -0.0f) + 1.0f) * f)) << 32)) & 4294967295L);
            }
            return qVar.Y0(wVarR.a, iMax, bs4.a, new Function1() { // from class: ty8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    w.a.y((w.a) obj, wVarR, 0, iRound);
                    return j6g.a;
                }
            });
        }
    }

    public static final void a(List list, e eVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(872528548);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.K(eVar) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            boolean zX = cVarH.x(list);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new sy8(list);
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
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
            iVarW.d = new q90(i, 2, list, eVar, ah2Var);
        }
    }

    public static final void b(e eVar, Function2 function2, Function2 function22, boolean z, ah2 ah2Var, b bVar, int i) {
        Function2 function23;
        ah2 ah2Var2;
        boolean z2;
        c cVarH = bVar.h(1618131318);
        int i2 = i | (cVarH.K(eVar) ? 4 : 2) | 224256;
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            nzf nzfVar = (nzf) cVarH.M(rzf.b);
            ah2Var2 = ah2Var;
            ah2 ah2VarD = d(nzfVar.g, ygg.l(cVarH), ah2Var2);
            ah2VarD.getClass();
            function23 = function22;
            ah2 ah2VarD2 = d(nzfVar.j, ygg.j(0.74f, 0.6f, cVarH), function23);
            ygg.l(cVarH);
            ygg.l(cVarH);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new hu(10);
                cVarH.p(objV);
            }
            e eVarB = b5e.b(eVar, true, (Function1) objV);
            if (ah2VarD2 == null) {
                cVarH.L(-961912553);
                dsa.a.a(eVarB, function2, ah2VarD, null, cVarH, 24624);
                cVarH.U(false);
            } else {
                cVarH.L(-961713285);
                kvf.a.a(eVarB, function2, ah2VarD, ah2VarD2, null, null, cVarH, 1572912);
                cVarH.U(false);
            }
            z2 = true;
        } else {
            function23 = function22;
            ah2Var2 = ah2Var;
            cVarH.D();
            z2 = z;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qj1(eVar, function2, function23, z2, ah2Var2, i);
        }
    }

    public static final void c(final float f, e eVar, final Function2<? super b, ? super Integer, j6g> function2, b bVar, final int i, final int i2) {
        int i3;
        c cVarH = bVar.h(953221030);
        if ((i & 6) == 0) {
            i3 = (cVarH.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            boolean z = (i3 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new a(f);
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
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
            function2.invoke(cVarH, Integer.valueOf((i5 >> 6) & 14));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        final e eVar2 = eVar;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ry8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uy8.c(f, eVar2, function2, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final ah2 d(tjf tjfVar, float f, Function2 function2) {
        if (function2 == null) {
            return null;
        }
        return new ah2(-1000595778, new wy8(f, tjfVar, new fx8(fx8.a.c, 17), function2), true);
    }
}
