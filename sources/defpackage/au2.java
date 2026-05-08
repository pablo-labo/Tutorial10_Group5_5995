package defpackage;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class au2 {
    public static final st2 a;

    public static final class a implements wu5<pb2, b, Integer, j6g> {
        public final /* synthetic */ Function1<vt2, j6g> a;
        public final /* synthetic */ st2 b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super vt2, j6g> function1, st2 st2Var) {
            this.a = function1;
            this.b = st2Var;
        }

        @Override // defpackage.wu5
        public final j6g q(pb2 pb2Var, b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                Object objV = bVar2.v();
                if (objV == b.a.a) {
                    objV = new vt2();
                    bVar2.p(objV);
                }
                vt2 vt2Var = (vt2) objV;
                vt2Var.a.clear();
                this.a.invoke(vt2Var);
                vt2Var.a(this.b, bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    static {
        ne4 ne4Var = x80.a;
        long j = da2.e;
        long j2 = da2.b;
        a = new st2(j, j2, j2, da2.b(j2, 0.38f), da2.b(j2, 0.38f));
    }

    public static final void a(st2 st2Var, e eVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(621449936);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(st2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            af1.b bVar2 = wt2.a;
            e eVarM = pnb.M(f.h(d.c(androidx.compose.foundation.a.b(ojd.i(eVar, 3.0f, ggd.a(4.0f), false, 28), st2Var.a, ytc.a)), 0.0f, wt2.d, 1), pnb.L(0, 1, cVarH), true);
            int i3 = (i2 << 3) & 7168;
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.q(qb2.a, cVarH, Integer.valueOf(((i3 >> 6) & 112) | 6));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yt2(st2Var, eVar, ah2Var, i, 0);
        }
    }

    public static final void b(e eVar, st2 st2Var, final Function1<? super vt2, j6g> function1, b bVar, final int i, final int i2) {
        int i3;
        int i4;
        c cVarH = bVar.h(-1430784946);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (cVarH.K(st2Var) ? 32 : 16);
        }
        int i7 = i4 | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                eVar = e.a.b;
            }
            if (i6 != 0) {
                st2Var = a;
            }
            a(st2Var, eVar, bh2.c(860259975, new a(function1, st2Var), cVarH), cVarH, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            cVarH.D();
        }
        final e eVar2 = eVar;
        final st2 st2Var2 = st2Var;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(st2Var2, function1, i, i2) { // from class: xt2
                public final /* synthetic */ st2 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ int d;

                {
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    au2.b(this.a, this.b, this.c, (b) obj, iL, this.d);
                    return j6g.a;
                }
            };
        }
    }

    @SuppressLint({"ComposableLambdaParameterPosition"})
    public static final void c(final String str, final st2 st2Var, final e eVar, final wu5 wu5Var, final gu5 gu5Var, b bVar, final int i) {
        int i2;
        e eVar2;
        c cVarH = bVar.h(-1027365588);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(st2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            eVar2 = eVar;
            i2 |= cVarH.K(eVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            eVar2 = eVar;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(wu5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(gu5Var) ? 131072 : 65536;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            af1.b bVar2 = wt2.a;
            float f = wt2.c;
            vs0.i iVar = new vs0.i(f, true, new us0(i3));
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new sg(3, gu5Var);
                cVarH.p(objV);
            }
            e eVarH = f.h(g.p(g.f(androidx.compose.foundation.b.d(eVar2, true, str, null, (gu5) objV, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            ehd ehdVarA = chd.a(iVar, bVar2, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar3 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar3);
            if (wu5Var == null) {
                cVarH.L(-1483499797);
                cVarH.U(false);
            } else {
                cVarH.L(-1483499796);
                float f2 = wt2.e;
                e eVarM = g.m(e.a.b, f2, 0.0f, f2, f2, 2);
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iHashCode2 = Long.hashCode(cVarH.T);
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarM);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                    ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar3);
                wu5Var.q(new da2(st2Var.c), cVarH, 0);
                cVarH.U(true);
                j6g j6gVar = j6g.a;
                cVarH.U(false);
            }
            nd1.c(str, new LayoutWeightElement(1.0f, true), new tjf(st2Var.b, wt2.h, wt2.i, null, wt2.k, wt2.b, wt2.j, 16613240), null, 0, false, 1, 0, null, cVarH, (i2 & 14) | 1572864, 952);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zt2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    au2.c(str, st2Var, eVar, wu5Var, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
