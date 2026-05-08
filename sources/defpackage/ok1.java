package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ok1 {
    public static final void a(final hee heeVar, final String str, final List<ax6> list, final String str2, final gu5<j6g> gu5Var, b bVar, final int i) {
        int i2;
        heeVar.getClass();
        str.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-2120069200);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(heeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(list) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            nx6.a(gu5Var, null, heeVar, null, false, null, bh2.c(-1114054570, new wu5() { // from class: lk1
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    int i3 = 1;
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        nx6.c(str, null, false, false, false, null, null, bh2.c(-642708542, new nq0(gu5Var, i3), bVar2), null, null, bVar2, 12582912, 894);
                        o97.g gVar = o97Var.i;
                        e eVarJ = f.j(e.a.b, 0.0f, 0.0f, 0.0f, 80.0f, 7);
                        String str3 = str2;
                        e eVarA = androidx.compose.ui.platform.f.a(eVarJ, str3);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        fx6.a(list, null, false, str3.concat("_Items"), bVar2, 0, 6);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i2 >> 12) & 14) | 1572864 | ((i2 << 6) & 896), 58);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: mk1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ok1.a(heeVar, str, list, str2, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
