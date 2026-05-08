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
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m8g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function1 function1, String str, b bVar, int i) {
        c cVar;
        function1.getClass();
        c cVarH = bVar.h(-1398299582);
        int i2 = (cVarH.x(function1) ? 32 : 16) | i | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str2 = str == null ? "" : str;
                int length = str != null ? str.length() : 0;
                objV = r.f(new jhf(str2, cr8.c(length, length), 4));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(lcf.c);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            h2h h2hVar = h2h.Description;
            String strI = ak2.I(h2hVar.a(), cVarH);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.FALSE);
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            e eVarH = f.h(e.a.b, 12.0f, 0.0f, 2);
            boolean zK = cVarH.K(strI);
            Object objV4 = cVarH.v();
            if (zK || objV4 == c0020a) {
                objV4 = new kw6(strI, 2);
                cVarH.p(objV4);
            }
            e eVarB = b5e.b(eVarH, false, (Function1) objV4);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
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
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            ue7.a(ak2.I(h2hVar.a(), cVarH), false, null, 0L, 0.0f, null, cVarH, 48, 60);
            jhf jhfVar = (jhf) g4aVar.getValue();
            boolean z = (i2 & 112) == 32;
            Object objV5 = cVarH.v();
            if (z || objV5 == c0020a) {
                objV5 = new qtd(function1, g4aVar, 1);
                cVarH.p(objV5);
            }
            Function1 function12 = (Function1) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = new sy(4, g4aVar2);
                cVarH.p(objV6);
            }
            Function1 function13 = (Function1) objV6;
            lcf lcfVar = (lcf) g4aVar2.getValue();
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = new sg4(3, g4aVar3);
                cVarH.p(objV7);
            }
            pcf.a(jhfVar, function12, function13, lcfVar, (Function1) objV7, ((Boolean) g4aVar3.getValue()).booleanValue(), null, null, cVarH, 24960);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new tt2(function1, i, 3, str);
        }
    }

    public static final void b(final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final Function1 function1, final String str, boolean z2, final b5g b5gVar, b bVar, final int i) {
        c cVar;
        final boolean z3;
        int i2;
        int i3;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        function1.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(1818458209);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(str) ? 131072 : 65536) | 1572864 | (cVarH.d(b5gVar.ordinal()) ? 8388608 : 4194304);
        if (cVarH.o(i4 & 1, (4793491 & i4) != 4793490)) {
            if (z) {
                i2 = 1266389760;
                i3 = R.string.label_edit_work_exp;
            } else {
                i2 = 1266480993;
                i3 = R.string.label_add_work_exp;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Float fValueOf = Float.valueOf(i3c.b(h2h.Description.c(), 6));
            boolean z4 = (i4 & 112) == 32;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z4 || objV == c0020a) {
                objV = new ni(8, gu5Var);
                cVarH.p(objV);
            }
            gu5 gu5Var4 = (gu5) objV;
            boolean z5 = (i4 & 7168) == 2048;
            Object objV2 = cVarH.v();
            if (z5 || objV2 == c0020a) {
                objV2 = new xa(10, gu5Var3);
                cVarH.p(objV2);
            }
            gu5 gu5Var5 = (gu5) objV2;
            boolean z6 = (i4 & 896) == 256;
            Object objV3 = cVarH.v();
            if (z6 || objV3 == c0020a) {
                objV3 = new oi(6, gu5Var2);
                cVarH.p(objV3);
            }
            cVar = cVarH;
            sb1.a(strK, gu5Var4, gu5Var5, R.string.done_button_label, null, 0, (gu5) objV3, fValueOf, b5gVar, false, false, false, false, null, 0, bh2.c(-1928591649, new es2(b5gVar, gu5Var3, function1, str), cVarH), cVar, (i4 << 3) & 234881024, 196608, 32304);
            z3 = true;
        } else {
            cVar = cVarH;
            cVar.D();
            z3 = z2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, gu5Var2, gu5Var3, function1, str, z3, b5gVar, i) { // from class: l8g
                public final /* synthetic */ boolean V;
                public final /* synthetic */ b5g W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(24577);
                    m8g.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
