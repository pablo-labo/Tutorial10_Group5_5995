package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c4f {
    public static final void a(tg2 tg2Var, String str, ah2 ah2Var, b bVar, int i) {
        int i2;
        tg2Var.getClass();
        c cVarH = bVar.h(-1007194742);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        boolean z = false;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            ie7.e(str, null, null, cVarH, (i2 >> 3) & 14);
            if (tg2Var.b(vx1.class)) {
                tg2 tg2Var2 = tg2Var.b;
                if (tg2Var2 == null ? true : wl7.b(z92.Z0(tg2Var2.c), tg2Var)) {
                    z = true;
                }
            }
            b(!z, bh2.c(-1532648006, new po0(ah2Var, 1), cVarH), cVarH, 48);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ke7(tg2Var, str, ah2Var, i, 2);
        }
    }

    public static final void b(final boolean z, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(253515100);
        if ((i & 6) == 0) {
            i2 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = g.f(e.a.b, 1.0f);
            boolean zX = ((i2 & 14) == 4) | cVarH.x(o97Var);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new Function1() { // from class: a4f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gb4 gb4Var = (gb4) obj;
                        gb4Var.getClass();
                        if (z) {
                            gb4Var.W(o97Var.c.c.b, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L))))), gb4Var.t1(1.0f), (496 & 16) != 0 ? 0 : 0);
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            e eVarA = a.a(eVarF, (Function1) objV);
            o97.g gVar = o97Var.i;
            e eVarF2 = f.f(eVarA, 16.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF2);
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
            iVarW.d = new Function2() { // from class: b4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    c4f.b(z, ah2Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
