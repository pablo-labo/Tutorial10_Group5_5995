package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class irb {
    public static final void a(final int i, gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final jrb jrbVar, b bVar) {
        final gu5 gu5Var4;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-2019734196);
        int i2 = i | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.K(jrbVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(null) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var3) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            gu5Var4 = gu5Var;
            iv6.a(w74.f, f.a(e.a.b, "TopNavHome"), false, null, false, new da2(pnb.f(255, 255, 255, f(jrbVar))), bh2.c(-1103825207, new f1c(gu5Var2, gu5Var3, 2), cVarH), bh2.c(-96902518, new grb(0, gu5Var4), cVarH), cVarH, 113246262, 92);
        } else {
            gu5Var4 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var2, jrbVar, gu5Var3, i) { // from class: hrb
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ jrb c;
                public final /* synthetic */ gu5 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    irb.a(ka2.L(7), this.a, this.b, this.d, this.c, (b) obj);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(-1425580567);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            qi0.a(w74.Y, f.a(e.a.b, "TopNavHomeForErrorScreen"), w74.Z, bh2.c(901640697, new frb(gu5Var, 0), cVarH), 0.0f, null, null, cVarH, 3510, 240);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rw0(i, 1, gu5Var);
        }
    }

    public static final void c(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(1325352810);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavBackButton"), false, null, null, w74.X, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ww0(i, gu5Var2);
        }
    }

    public static final void d(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(562320378);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavHamburgerMenuIcon"), false, null, null, w74.W, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bx2(i, 2, gu5Var2);
        }
    }

    public static final void e(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-328443140);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavUploadResumeButton"), false, null, null, w74.V, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xw0(i, gu5Var2);
        }
    }

    public static final int f(jrb jrbVar) {
        if (!jrbVar.a) {
            return 0;
        }
        double dMax = Math.max(jrbVar.c, 1.0d);
        return gf9.a(Math.max(255.0d - Math.max((Math.max(dMax - ((double) jrbVar.b), 0.0d) / dMax) * 255.0d, 0.0d), 0.0d));
    }
}
