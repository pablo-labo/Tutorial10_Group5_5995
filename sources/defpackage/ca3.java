package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ca3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void a(final mde mdeVar, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final ah2 ah2Var, b bVar, final int i) {
        ?? r1;
        Object w93Var;
        int i2;
        boolean z;
        ?? r15;
        yxd yxdVar;
        b.a.C0020a c0020a;
        mdeVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(480278338);
        int i3 = i | (cVarH.x(mdeVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, (i3 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            Object objB = objV;
            if (objV == c0020a2) {
                m74 m74Var = to4.a;
                objB = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objB;
            iy3 iy3Var = (iy3) cVarH.M(um2.h);
            Object objV2 = cVarH.v();
            Object obj = objV2;
            if (objV2 == c0020a2) {
                hee heeVar = new hee(iy3Var, 8);
                cVarH.p(heeVar);
                obj = heeVar;
            }
            hee heeVar2 = (hee) obj;
            fw9 fw9Var = xu9.a;
            yxd yxdVar2 = yxd.a;
            fw9 fw9Var2 = new fw9(yxdVar2, true);
            boolean z2 = ((jee) heeVar2.c.h.getValue()) != jee.a;
            int i4 = i3 & 7168;
            boolean zK = ((i3 & 112) == 32) | cVarH.K(fw9Var2) | cVarH.x(e13Var) | (i4 == 2048);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a2) {
                i2 = i4;
                z = z2;
                r15 = 0;
                w93Var = new w93(gu5Var, fw9Var2, e13Var, heeVar2, gu5Var3);
                cVarH.p(w93Var);
            } else {
                z = z2;
                i2 = i4;
                w93Var = objV3;
                r15 = 0;
            }
            g71.a(z, (gu5) w93Var, cVarH, r15, r15);
            j6g j6gVar = j6g.a;
            int i5 = (cVarH.x(mdeVar) ? 1 : 0) | (cVarH.x(e13Var) ? 1 : 0) | (i2 == 2048 ? 1 : r15);
            Object objV4 = cVarH.v();
            if (i5 != 0 || objV4 == c0020a2) {
                yxdVar = yxdVar2;
                c0020a = c0020a2;
                aa3 aa3Var = new aa3(mdeVar, e13Var, heeVar2, gu5Var3, null);
                cVarH.p(aa3Var);
                objV4 = aa3Var;
            } else {
                yxdVar = yxdVar2;
                c0020a = c0020a2;
            }
            to4.d(cVarH, j6gVar, (Function2) objV4);
            hqa hqaVarA = s09.a(cVarH);
            cVarH.A(1986047563, Integer.valueOf(((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).orientation));
            boolean zX = cVarH.x(hqaVarA);
            Object objV5 = cVarH.v();
            Object obj2 = objV5;
            if (zX || objV5 == c0020a) {
                ba3 ba3Var = new ba3(hqaVarA, r15);
                cVarH.p(ba3Var);
                obj2 = ba3Var;
            }
            e eVarA = androidx.compose.ui.c.a(a.b(e.a.b, (Function1) obj2), tf7.a, new b0h());
            fw9 fw9Var3 = new fw9(yxdVar, r15);
            long j = eu6.u;
            hv9.a(gu5Var2, eVarA, heeVar2, 0.0f, null, j, j, 0.0f, 0L, jh2.d, null, fw9Var3, bh2.c(-1466191176, new kv(ah2Var, 1), cVarH), cVarH, ((i3 >> 6) & 14) | 805306752, 384, 1432);
            ?? r12 = cVarH;
            r12.U(r15);
            r1 = r12;
        } else {
            c cVar = cVarH;
            cVar.D();
            r1 = cVar;
        }
        i iVarW = r1.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, gu5Var2, gu5Var3, ah2Var, i) { // from class: x93
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ ah2 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = ka2.L(24577);
                    ca3.a(this.a, this.b, this.c, this.d, this.e, (b) obj3, iL);
                    return j6g.a;
                }
            };
        }
    }
}
