package defpackage;

import androidx.compose.foundation.layout.f;
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
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hb3 {
    public static final void a(final kk1 kk1Var, hw9 hw9Var, final Function2 function2, final ah2 ah2Var, b bVar, final int i) {
        final hw9 hw9Var2 = hw9Var;
        hw9Var2.getClass();
        function2.getClass();
        c cVarH = bVar.h(-463239243);
        int i2 = i | (cVarH.x(kk1Var) ? 4 : 2) | (cVarH.x(hw9Var2) ? 32 : 16) | (cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            int i4 = i2 & 112;
            boolean zX = cVarH.x(e13Var) | (i4 == 32 || cVarH.x(hw9Var2));
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new ua3(e13Var, hw9Var2, i3);
                cVarH.p(objV2);
            }
            o97 o97Var = (o97) cVarH.M(p97.a);
            hw9Var2 = hw9Var;
            a.a(bh2.c(1256704327, new wa3(kk1Var, e13Var, hw9Var, function2, o97Var), cVarH), null, hw9Var2, false, ggd.b(20.0f, 20.0f, 0.0f, 0.0f), 0.0f, o97Var.c.b.a, 0L, 0L, bh2.c(-1653191954, new xa3(ah2Var, i3), cVarH), cVarH, ((i2 << 3) & 896) | 805306886, 426);
            boolean zC = hw9Var2.c();
            boolean zX2 = cVarH.x(e13Var) | (i4 == 32 || cVarH.x(hw9Var2));
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new yi(2, e13Var, hw9Var2);
                cVarH.p(objV3);
            }
            g71.a(zC, (gu5) objV3, cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(hw9Var2, function2, ah2Var, i) { // from class: ya3
                public final /* synthetic */ hw9 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ ah2 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(3137);
                    hb3.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(fo7 fo7Var, String str, Function2<? super fo7, ? super String, j6g> function2, b bVar, int i) {
        e.a aVar;
        Function2<? super fo7, ? super String, j6g> function22 = function2;
        fo7Var.getClass();
        str.getClass();
        function22.getClass();
        c cVarH = bVar.h(709423978);
        int i2 = i | (cVarH.K(fo7Var) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.x(function22) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar2 = e.a.b;
            e eVarF = f.f(g.f(aVar2, 1.0f), bkf.c(o97Var.e.f));
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            boolean z = (i4 == 256) | (i5 == 4) | (i6 == 32);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new vv2(i3, function22, fo7Var, str);
                cVarH.p(objV);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarF, false, null, null, (gu5) objV, 15);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            f17.a(z2b.a(fo7Var.c, 0, cVarH), null, g.n(aVar2, bkf.c(o97Var.e.e)), null, null, 0.0f, null, cVarH, 48, 120);
            jh2.f(cVarH, g.r(aVar2, 8.0f));
            String str2 = fo7Var.b;
            tjf tjfVar = o97Var.j.g;
            to5 to5Var = o97Var.f.c;
            long j = o97Var.c.a.c;
            boolean z2 = (i6 == 32) | (i5 == 4) | (i4 == 256);
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                aVar = aVar2;
                function22 = function2;
                objV2 = new va3(0, function22, fo7Var, str);
                cVarH.p(objV2);
            } else {
                aVar = aVar2;
                function22 = function2;
            }
            fif.b(str2, androidx.compose.foundation.b.d(aVar, false, null, null, (gu5) objV2, 15), j, 0L, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65496);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kt(fo7Var, str, function22, i, 2);
        }
    }
}
