package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ft2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yq3 {
    public static final ahb a = new ahb(14);

    public static final class a implements Function2<androidx.compose.runtime.b, Integer, String> {
        public final /* synthetic */ edf a;

        public a(edf edfVar) {
            this.a = edfVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(666084174);
            String str = this.a.b;
            bVar2.F();
            return str;
        }
    }

    public static final class b implements wu5<da2, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ edf a;

        public b(edf edfVar) {
            this.a = edfVar;
        }

        @Override // defpackage.wu5
        public final j6g q(da2 da2Var, androidx.compose.runtime.b bVar, Integer num) {
            long j = da2Var.a;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.e(j) ? 4 : 2;
            }
            if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                yq3.b(this.a.c, j, bVar2, (iIntValue << 3) & 112);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ zcf a;
        public final /* synthetic */ kdf b;

        public c(zcf zcfVar, kdf kdfVar) {
            this.a = zcfVar;
            this.b = kdfVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                zcf zcfVar = this.a;
                boolean zK = bVar2.K(zcfVar);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = r.c(new zq3(0, zcfVar, zcf.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                    bVar2.p(objV);
                }
                yq3.a(this.b, (ycf) ((ese) objV).getValue(), bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final void a(kdf kdfVar, ycf ycfVar, androidx.compose.runtime.b bVar, int i) {
        Context context;
        androidx.compose.runtime.c cVarH = bVar.h(1904307118);
        int i2 = 2;
        int i3 = (cVarH.K(kdfVar) ? 4 : 2) | i | (cVarH.x(ycfVar) ? 32 : 16);
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                cVarH.L(-1009462744);
                context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
                cVarH.U(false);
            } else {
                cVarH.L(-1009413640);
                cVarH.U(false);
                context = null;
            }
            boolean zX = cVarH.x(ycfVar) | ((i3 & 14) == 4) | cVarH.x(context);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new tq3(i4, ycfVar, context, kdfVar);
                cVarH.p(objV);
            }
            au2.b(null, null, (Function1) objV, cVarH, 0, 3);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new n91(kdfVar, i, i2, ycfVar);
        }
    }

    public static final void b(final int i, final long j, androidx.compose.runtime.b bVar, final int i2) {
        int i3;
        i iVarW;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2;
        androidx.compose.runtime.c cVarH = bVar.h(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.e(j) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            boolean zK = ((i3 & 14) == 4) | cVarH.K(context);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                cVarH.p(objV);
            }
            int iIntValue = ((Number) objV).intValue();
            if (iIntValue == -1) {
                iVarW = cVarH.W();
                if (iVarW != null) {
                    function2 = new Function2() { // from class: uq3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iL = ka2.L(i2 | 1);
                            yq3.b(i, j, (b) obj, iL);
                            return j6g.a;
                        }
                    };
                    iVarW.d = function2;
                }
                return;
            }
            x2b x2bVarA = z2b.a(iIntValue, 0, cVarH);
            boolean z = (i3 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = j == 16 ? null : new ih1(j, 5);
                cVarH.p(objV2);
            }
            hl1.a(androidx.compose.ui.draw.b.a(g.n(e.a.b, wt2.e), x2bVarA, null, ft2.a.b, 0.0f, (ga2) objV2, 22), cVarH, 0);
        } else {
            cVarH.D();
        }
        iVarW = cVarH.W();
        if (iVarW != null) {
            function2 = new Function2() { // from class: vq3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i2 | 1);
                    yq3.b(i, j, (b) obj, iL);
                    return j6g.a;
                }
            };
            iVarW.d = function2;
        }
    }

    public static final void c(kdf kdfVar, zcf zcfVar, gu5<? extends sl8> gu5Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-2040393164);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(kdfVar) : cVarH.x(kdfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? cVarH.K(zcfVar) : cVarH.x(zcfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        boolean z = false;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && cVarH.K(zcfVar));
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z2 || objV == c0020a) {
                objV = new n99(new h00(new ej(i3, zcfVar, gu5Var)));
                cVarH.p(objV);
            }
            n99 n99Var = (n99) objV;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && cVarH.x(kdfVar))) {
                z = true;
            }
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = new z0(kdfVar, 7);
                cVarH.p(objV2);
            }
            x80.a(n99Var, (gu5) objV2, a, bh2.c(1315155414, new c(zcfVar, kdfVar), cVarH), cVarH, 3456, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xq3(kdfVar, zcfVar, gu5Var, i, 0);
        }
    }

    public static final void d(e eVar, ah2 ah2Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(1392105195);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            ne4 ne4Var = idf.a;
            ah2 ah2Var2 = ei2.a;
            xc1.a(eVar, ne4Var, ah2Var, cVarH, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wq3(eVar, i, i3, ah2Var);
        }
    }
}
