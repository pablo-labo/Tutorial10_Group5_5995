package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ikd;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gt8 implements ikd, ekd {
    public final jkd a;
    public final ekd b;
    public final a4a<Object> c;

    public static final class a implements l74 {
        public final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // defpackage.l74
        public final void dispose() {
            gt8.this.c.k(this.b);
        }
    }

    public gt8(ikd ikdVar, Map<String, ? extends List<? extends Object>> map, ekd ekdVar) {
        cu cuVar = new cu(ikdVar, 6);
        jte jteVar = kkd.a;
        this.a = new jkd(map, cuVar);
        this.b = ekdVar;
        this.c = nnd.a();
    }

    @Override // defpackage.ikd
    public final boolean a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.ikd
    public final ikd.a b(String str, gu5<? extends Object> gu5Var) {
        return this.a.b(str, gu5Var);
    }

    @Override // defpackage.ekd
    public final void c(Object obj) {
        this.b.c(obj);
    }

    @Override // defpackage.ekd
    public final void d(Object obj, Function2<? super b, ? super Integer, j6g> function2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-858296452);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            this.b.d(obj, function2, cVarH, i2 & 126);
            boolean zX = cVarH.x(this) | cVarH.x(obj);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new vi1(3, this, obj);
                cVarH.p(objV);
            }
            to4.b(obj, (Function1) objV, cVarH);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ke7(this, obj, function2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // defpackage.ikd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> e() {
        /*
            r14 = this;
            a4a<java.lang.Object> r0 = r14.c
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            ekd r11 = r14.b
            r11.c(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            jkd r14 = r14.a
            java.util.Map r14 = r14.e()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt8.e():java.util.Map");
    }

    @Override // defpackage.ikd
    public final Object f(String str) {
        return this.a.f(str);
    }
}
