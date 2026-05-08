package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.material.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wja {
    public static final void a(hw9 hw9Var, final String str, final ArrayList arrayList, ah2 ah2Var, b bVar, int i) {
        final hw9 hw9Var2 = hw9Var;
        hw9Var2.getClass();
        c cVarH = bVar.h(-1828775909);
        int i2 = i | (cVarH.x(hw9Var2) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(arrayList) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            a.a(bh2.c(1598162221, new wu5() { // from class: sja
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    e.a aVar;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar2 = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar2);
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
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        boolean zO = i6a.o();
                        String str2 = str;
                        e13 e13Var2 = e13Var;
                        hw9 hw9Var3 = hw9Var2;
                        if (zO) {
                            bVar2.L(-1079115406);
                            aVar = aVar2;
                            nx6.c(str2, null, false, false, false, null, null, bh2.c(-1104608409, new a88(2, e13Var2, hw9Var3), bVar2), null, null, bVar2, 12583296, 890);
                            bVar2.F();
                        } else {
                            bVar2.L(-1697388111);
                            boolean zX = bVar2.x(e13Var2) | bVar2.x(hw9Var3);
                            Object objV2 = bVar2.v();
                            if (zX || objV2 == b.a.a) {
                                objV2 = new np0(4, e13Var2, hw9Var3);
                                bVar2.p(objV2);
                            }
                            ra3.a(0, (gu5) objV2, bVar2, str2);
                            bVar2.F();
                            aVar = aVar2;
                        }
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        sx1.a(new tx1(arrayList, da2.h, h4.f), bVar2, 0);
                        jh2.f(bVar2, g.h(aVar, 12.0f));
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, hw9Var, false, ggd.b(20.0f, 20.0f, 0.0f, 0.0f), 0.0f, eu6.u, 0L, 0L, bh2.c(-1366813420, new fr2(ah2Var, 5), cVarH), cVarH, 805306886 | ((i2 << 6) & 896), 426);
            hw9Var2 = hw9Var;
            boolean zC = hw9Var2.c();
            boolean zX = cVarH.x(e13Var) | ((i2 & 14) == 4 || cVarH.x(hw9Var2));
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new pi(7, e13Var, hw9Var2);
                cVarH.p(objV2);
            }
            g71.a(zC, (gu5) objV2, cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new nt9(hw9Var2, str, arrayList, ah2Var, i);
        }
    }
}
