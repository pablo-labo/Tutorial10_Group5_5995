package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.p;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vu6 {
    public static final void a(final String str, final boolean z, e eVar, final Integer num, final gu5 gu5Var, final String str2, b bVar, final int i) {
        o97 o97Var;
        long j;
        final e eVar2;
        c cVarF = q6.f(-1163240507, gu5Var, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.a(z) ? 32 : 16) | 384 | (cVarF.d(-1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarF.K(num) ? 16384 : 8192) | (cVarF.x(gu5Var) ? 131072 : 65536) | (cVarF.K(str2) ? 1048576 : 524288) | (cVarF.d(0) ? 8388608 : 4194304);
        if ((i2 & 4793491) == 4793490 && cVarF.i()) {
            cVarF.D();
            eVar2 = eVar;
        } else {
            cVarF.L(1849434622);
            Object objV = cVarF.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarF);
            }
            d3a d3aVar = (d3a) objV;
            cVarF.U(false);
            o97 o97Var2 = (o97) cVarF.M(p97.a);
            int i3 = o97Var2.a;
            float f = o97Var2.h.c;
            o97.a aVar = o97Var2.c;
            o97.a.b bVar2 = aVar.c;
            boolean z2 = i3 >= 7;
            String str3 = str2 == null ? "IdlFilterChip" : str2;
            e.a aVar2 = e.a.b;
            e eVarA = f.a(aVar2, str3);
            if (z && z2) {
                o97Var = o97Var2;
                j = bVar2.f.c;
            } else {
                o97Var = o97Var2;
                j = z ? bVar2.e : bVar2.b;
            }
            long j2 = j;
            String str4 = str3;
            o97 o97Var3 = o97Var;
            ese eseVarA = vhe.a(j2, null, "ColorAnimation", cVarF, 384, 10);
            o97.a.C0340a c0340a = aVar.b;
            ese eseVarA2 = vhe.a(z ? c0340a.h.a : c0340a.a, null, "ColorAnimation", cVarF, 384, 10);
            o97.a.e eVar3 = aVar.a;
            ese eseVarA3 = vhe.a(z ? eVar3.g.e.a : eVar3.g.d.a, null, "ColorAnimation", cVarF, 384, 10);
            qed qedVar = new qed(1);
            cVarF.L(5004770);
            boolean z3 = (i2 & 458752) == 131072;
            Object objV2 = cVarF.v();
            if (z3 || objV2 == c0020a) {
                objV2 = new q2(gu5Var, 14);
                cVarF.p(objV2);
            }
            cVarF.U(false);
            e eVarA2 = androidx.compose.foundation.selection.c.a(z, d3aVar, true, qedVar, (Function1) objV2);
            e eVarB = a.b(ti1.a(ygg.h(aVar2, ggd.a(f)), z ? 2.0f : 1.0f, ((da2) eseVarA.getValue()).a, ggd.a(f)), ((da2) eseVarA2.getValue()).a, ytc.a);
            hza hzaVar = new hza(16.0f, 10.0f, 16.0f, 10.0f);
            long j3 = o97Var3.e.g;
            long j4 = o97Var3.g.c;
            pn5 pn5Var = o97Var3.d.a;
            o97.c cVar = o97Var3.f;
            tjf tjfVar = new tjf(((da2) eseVarA3.getValue()).a, j3, z ? cVar.c : cVar.b, pn5Var, 0L, 0, j4, 16646104);
            e eVarI = ygg.i(androidx.compose.foundation.layout.f.e(eVarA.o(eVarA2).o(eVarB), hzaVar));
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e eVarC = androidx.compose.ui.c.c(cVarF, eVarI);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar3);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ag9VarD, gl2.a.g);
            ygg.y(cVarF, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            ygg.y(cVarF, eVarC, gl2.a.d);
            androidx.compose.animation.a.b(Boolean.valueOf(z), null, null, null, "ColorAnimation", null, bh2.c(1752299868, new qu6(o97Var3, tjfVar, str4, str, num), cVarF), cVarF, ((i2 >> 3) & 14) | 1597440, 46);
            cVarF = cVarF;
            cVarF.U(true);
            eVar2 = aVar2;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, z, eVar2, num, gu5Var, str2, i) { // from class: pu6
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ e c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    vu6.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ArrayList arrayList, e eVar, wu6 wu6Var, b bVar, int i) {
        c cVar;
        boolean z;
        wu6 wu6Var2;
        c cVarH = bVar.h(-1377934130);
        if (((i | (cVarH.x(arrayList) ? 4 : 2) | (cVarH.K(eVar) ? 32 : 16) | 3456) & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            wu6Var2 = wu6Var;
            cVar = cVarH;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarA = f.a(eVar, "IdlFilterChipCarousel");
            cVarH.L(1849434622);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = p.a(1);
                cVarH.p(objV);
            }
            c3a c3aVar = (c3a) objV;
            cVarH.U(false);
            ss8 ss8VarA = us8.a(cVarH);
            o97.g gVar = o97Var.i;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
            hza hzaVarA = androidx.compose.foundation.layout.f.a(6.0f, 0.0f, 2);
            cVarH.L(-1224400529);
            boolean zX = cVarH.x(arrayList);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new ed1(arrayList, c3aVar);
                cVarH.p(objV2);
            }
            cVarH.U(false);
            hn8.c(eVarA, ss8VarA, hzaVarA, iVar, null, null, false, null, (Function1) objV2, cVarH, 0, 488);
            cVar = cVarH;
            Integer numValueOf = Integer.valueOf(c3aVar.e());
            cVar.L(-1224400529);
            boolean zX2 = cVar.x(arrayList) | cVar.x(o97Var) | cVar.K(ss8VarA);
            Object objV3 = cVar.v();
            if (zX2 || objV3 == c0020a) {
                z = false;
                tu6 tu6Var = new tu6(arrayList, ss8VarA, c3aVar, o97Var, null);
                cVar.p(tu6Var);
                objV3 = tu6Var;
            } else {
                z = false;
            }
            cVar.U(z);
            to4.d(cVar, numValueOf, (Function2) objV3);
            wu6Var2 = wu6.a;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ax4(arrayList, eVar, wu6Var2, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (defpackage.wab.g(r11, r14 + r13, r8, r0) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (defpackage.ss8.f(r11, r12, r0) == r6) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.ss8 r11, int r12, float r13, defpackage.pu2 r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu6.c(ss8, int, float, pu2):java.lang.Object");
    }
}
