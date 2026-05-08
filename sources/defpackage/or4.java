package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class or4 {
    public static final void a(final String str, final long j, final long j2, final x2b x2bVar, final gu5 gu5Var, b bVar, final int i) {
        boolean z;
        c cVarF = q6.f(214234191, gu5Var, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.e(j) ? 32 : 16) | (cVarF.e(j2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarF.x(x2bVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarF.x(gu5Var) ? 16384 : 8192);
        if (cVarF.o(i2 & 1, (i2 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            o97.g gVar = o97Var.i;
            fgd fgdVarA = ggd.a(4.0f);
            e.a aVar = e.a.b;
            e eVarG = f.g(a.b(ygg.h(aVar, fgdVarA), j, ytc.a), 8.0f, 6.0f);
            boolean z2 = (57344 & i2) == 16384;
            Object objV = cVarF.v();
            if (z2 || objV == b.a.a) {
                objV = new sd(4, gu5Var);
                cVarF.p(objV);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarG, false, null, null, (gu5) objV, 15);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarF, 48);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e eVarC = androidx.compose.ui.c.c(cVarF, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ehdVarA, gl2.a.g);
            ygg.y(cVarF, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            ygg.y(cVarF, eVarC, gl2.a.d);
            cif.b(str, null, j2, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 1, 0, null, o97Var.j.h, cVarF, i2 & 910, 3072, 57306);
            cVarF = cVarF;
            if (x2bVar == null) {
                cVarF.L(1573172977);
                z = false;
            } else {
                z = false;
                cVarF.L(1573172978);
                jh2.f(cVarF, g.r(aVar, 4.0f));
                vq6.b(x2bVar, null, g.n(aVar, 20.0f), j2, cVarF, ((i2 << 3) & 7168) | 432, 0);
            }
            cVarF.U(z);
            cVarF.U(true);
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, j, j2, x2bVar, gu5Var, i) { // from class: nr4
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ x2b d;
                public final /* synthetic */ gu5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    or4.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
