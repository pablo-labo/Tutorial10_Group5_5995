package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g3e {

    public static final class a implements toa, ev5 {
        public final /* synthetic */ gu5 a;

        public a(gu5 gu5Var) {
            this.a = gu5Var;
        }

        @Override // defpackage.toa
        public final /* synthetic */ long a() {
            return ((ooa) this.a.invoke()).a;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof toa) || !(obj instanceof ev5)) {
                return false;
            }
            return wl7.b(this.a, ((ev5) obj).c());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e eVar, ah2 ah2Var, b bVar, int i) {
        ah2 ah2Var2;
        c cVarH = bVar.h(1949207773);
        int i2 = i | 6;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(null);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            p2e p2eVar = (p2e) g4aVar.getValue();
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new zv2(4, g4aVar);
                cVarH.p(objV2);
            }
            Function1 function1 = (Function1) objV2;
            e.a aVar = e.a.b;
            ah2Var2 = ah2Var;
            b(aVar, p2eVar, function1, ah2Var2, cVarH, 3462);
            eVar = aVar;
        } else {
            ah2Var2 = ah2Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ug(eVar, i, 4, ah2Var2);
        }
    }

    public static final void b(e eVar, p2e p2eVar, Function1 function1, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-917932944);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(p2eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new as0(15);
                cVarH.p(objV);
            }
            p4e p4eVar = (p4e) ypd.N(objArr, p4e.l, (gu5) objV, cVarH, 384);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new j4e(p4eVar);
                cVarH.p(objV2);
            }
            j4e j4eVar = (j4e) objV2;
            y72 y72Var = (y72) cVarH.M(um2.f);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                m74 m74Var = to4.a;
                objV3 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV3;
            j4eVar.e = (yf6) cVarH.M(um2.l);
            boolean zK = cVarH.K(e13Var) | cVarH.K(y72Var);
            Object objV4 = cVarH.v();
            if (zK || objV4 == c0020a) {
                objV4 = new wi1(5, e13Var, y72Var);
                cVarH.p(objV4);
            }
            j4eVar.f = (Function1) objV4;
            j4eVar.g = (ujf) cVarH.M(um2.q);
            j4eVar.d = new o72(7, j4eVar, function1);
            j4eVar.m(p2eVar);
            cVarH.L(-82306500);
            j4eVar.x = kcb.b(o2e.b, null, cVarH, 54);
            j4eVar.w = e13Var;
            cVarH.U(false);
            qq qqVar = new qq(j4eVar, 24);
            j6g j6gVar = j6g.a;
            h4e h4eVar = new h4e(j4eVar, qqVar);
            e eVarA = e.a.b;
            e eVarA2 = androidx.compose.ui.input.key.a.a(f1f.b(androidx.compose.foundation.c.b(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.c.a(s.a(f1f.b(eVarA, j6gVar, h4eVar), new me(j4eVar, 19)), j4eVar.i), new ne(j4eVar, 17)), false, 3), 8675309, new p3e(new yh(j4eVar, 16))), new pp8(j4eVar, 2));
            if (j4eVar.f() != null && j4eVar.h()) {
                p2e p2eVarG = j4eVar.g();
                if (!(p2eVarG == null ? true : wl7.b(p2eVarG.a, p2eVarG.b)) && i89.a()) {
                    eVarA = androidx.compose.ui.c.a(eVarA, tf7.a, new m4e(j4eVar));
                }
            }
            yfe.a(eVar.o(androidx.compose.foundation.text.contextmenu.modifier.b.a(eVarA2.o(eVarA), new he4(j4eVar, 10))), bh2.c(-1799563674, new e3e(ah2Var, j4eVar, p4eVar), cVarH), cVarH, 48);
            boolean zX = cVarH.x(j4eVar);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new y2e(j4eVar, 0);
                cVarH.p(objV5);
            }
            to4.b(j4eVar, (Function1) objV5, cVarH);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new z2e(eVar, p2eVar, function1, ah2Var, i);
        }
    }
}
