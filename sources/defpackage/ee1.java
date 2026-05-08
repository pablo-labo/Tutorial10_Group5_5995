package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ee1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final v vVar, final ah2 ah2Var, final fe1 fe1Var, final e eVar, boolean z, boolean z2, final ah2 ah2Var2, b bVar, final int i) {
        v vVar2;
        int i2;
        ah2 ah2Var3;
        final boolean z3;
        final boolean z4;
        boolean z5;
        int i3;
        c cVarH = bVar.h(196062260);
        if ((i & 6) == 0) {
            vVar2 = vVar;
            i2 = (cVarH.K(vVar2) ? 4 : 2) | i;
        } else {
            vVar2 = vVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ah2Var3 = ah2Var;
            i2 |= cVarH.x(ah2Var3) ? 32 : 16;
        } else {
            ah2Var3 = ah2Var;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(fe1Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= cVarH.x(ah2Var2) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (cVarH.o(i5 & 1, (599187 & i5) != 599186)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
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
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (fe1Var.isVisible()) {
                cVarH.L(1833353604);
                int i6 = i5 >> 3;
                b(vVar2, fe1Var, e13Var, ah2Var3, cVarH, (i5 & 14) | (i6 & 112) | (i6 & 7168) | ((i5 << 9) & 57344));
                z5 = false;
                cVarH.U(false);
            } else {
                z5 = false;
                cVarH.L(1833584244);
                cVarH.U(false);
            }
            int i7 = i5 >> 3;
            c(fe1Var, eVar, ah2Var2, cVarH, ((i5 >> 15) & 14) | (i7 & 112) | (i7 & 896) | ((i5 >> 9) & 7168));
            cVarH.U(true);
            boolean z6 = (i5 & 896) == 256 ? true : z5;
            Object objV2 = cVarH.v();
            if (z6 || objV2 == c0020a) {
                i3 = 1;
                objV2 = new pq(fe1Var, i3);
                cVarH.p(objV2);
            } else {
                i3 = 1;
            }
            to4.b(fe1Var, (Function1) objV2, cVarH);
            int i8 = i3;
            z4 = i8 == true ? 1 : 0;
            z3 = i8;
        } else {
            cVarH.D();
            z3 = z;
            z4 = z2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ud1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ee1.a(vVar, ah2Var, fe1Var, eVar, z3, z4, ah2Var2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(v vVar, final fe1 fe1Var, final e13 e13Var, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        v vVar2;
        c cVarH = bVar.h(-1882542163);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(fe1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(e13Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i3 = 1;
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(true) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(ah2Var) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            String strI = ak2.I(R.string.tooltip_description, cVarH);
            boolean zX = cVarH.x(e13Var) | ((i2 & 112) == 32);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new gq0(i3, fe1Var, e13Var);
                cVarH.p(objV);
            }
            vVar2 = vVar;
            x80.a(vVar2, (gu5) objV, new ahb(14), bh2.c(916917707, new ae1(strI, ah2Var), cVarH), cVarH, (i2 & 14) | 3072, 0);
        } else {
            vVar2 = vVar;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final v vVar3 = vVar2;
            iVarW.d = new Function2() { // from class: vd1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ee1.b(vVar3, fe1Var, e13Var, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final fe1 fe1Var, final e eVar, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1381511093);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(fe1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            final String strI = ak2.I(R.string.tooltip_label, cVarH);
            e eVarB = b5e.b(f1f.b(f1f.b(eVar, fe1Var, new ce1(fe1Var)), fe1Var, new de1(fe1Var)), true, new Function1() { // from class: td1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jp0 jp0Var = new jp0(1, e13Var, fe1Var);
                    qf8<Object>[] qf8VarArr = o5e.a;
                    ((s5e) obj).a(v4e.c, new r5(strI, jp0Var));
                    return j6g.a;
                }
            });
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ah2Var.invoke(cVarH, Integer.valueOf((i2 >> 9) & 14));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: wd1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    ee1.c(fe1Var, eVar, ah2Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final ie1 d(boolean z, b bVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        y4a y4aVar = sd1.a;
        boolean zK = bVar.K(y4aVar);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new ie1(z, y4aVar);
            bVar.p(objV);
        }
        return (ie1) objV;
    }
}
