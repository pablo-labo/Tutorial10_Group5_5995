package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, ig3 ig3Var, Function1<? super ig3, j6g> function1, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, gu5<j6g> gu5Var3, gu5<j6g> gu5Var4, b bVar, int i) {
        Function1<? super ig3, j6g> function12;
        c cVar;
        gu5 gu5Var5;
        str.getClass();
        function1.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        c cVarH = bVar.h(1703587497);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(ig3Var) ? 32 : 16) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var2) ? 16384 : 8192) | (cVarH.x(gu5Var3) ? 131072 : 65536) | (cVarH.x(gu5Var4) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(-2052839211);
                boolean z = (458752 & i2) == 131072;
                Object objV2 = cVarH.v();
                if (z || objV2 == c0020a) {
                    objV2 = new ld(1, gu5Var3);
                    cVarH.p(objV2);
                }
                gu5Var5 = (gu5) objV2;
                cVarH.U(false);
            } else {
                cVarH.L(-2052798540);
                cVarH.U(false);
                gu5Var5 = null;
            }
            float fB = i3c.b(rz1.b.c(), wh.c);
            boolean z2 = (i2 & 3670016) == 1048576;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new u9(1, gu5Var4);
                cVarH.p(objV3);
            }
            function12 = function1;
            cVar = cVarH;
            sb1.a(str, gu5Var, gu5Var5, 0, (gu5) objV3, 0, gu5Var2, Float.valueOf(fB), null, true, false, false, false, null, 0, bh2.c(34691307, new uf(0, function12, ig3Var, g4aVar), cVarH), cVar, (i2 & 14) | 805306368 | ((i2 >> 6) & 112) | ((i2 << 6) & 3670016), 196608, 32040);
        } else {
            function12 = function1;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new vf(str, ig3Var, function12, gu5Var, gu5Var2, gu5Var3, gu5Var4, i);
        }
    }

    public static final void b(Function1<? super ig3, j6g> function1, ig3 ig3Var, Function1<? super Boolean, j6g> function12, b bVar, int i) {
        int i2;
        function1.getClass();
        function12.getClass();
        c cVarH = bVar.h(-289130454);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.K(ig3Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = f.f(e.a.b, 12.0f);
            o97.g gVar = o97Var.i;
            ob2 ob2VarA = mb2.a(new vs0.i(12.0f, true, new us0(0)), c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            gz9.c(function1, ig3Var, ak2.I(R.string.does_not_expire, cVarH), false, true, function12, true, R.string.issued_label, R.string.expires_label, new zv5(), cVarH, (i3 & 112) | (i3 & 14) | 102260736 | 12582912, 40);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wf(function1, ig3Var, function12, i);
        }
    }
}
