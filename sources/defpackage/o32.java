package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o32 {
    public static final void a(final boolean z, final Function1 function1, final String str, final e eVar, au6 au6Var, d3a d3aVar, b bVar, final int i) {
        final au6 au6Var2;
        final d3a d3aVar2;
        function1.getClass();
        str.getClass();
        c cVarH = bVar.h(945809436);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 14376960;
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar3 = (d3a) objV;
            boolean z2 = (i2 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new s5(function1, 5);
                cVarH.p(objV2);
            }
            au6 au6Var3 = au6.a;
            b(z, (Function2) objV2, str, "", eVar, au6Var3, d3aVar3, cVarH, ((i2 << 3) & 57344) | (i2 & 14) | 3072 | (i2 & 896) | 115015680, 0);
            au6Var2 = au6Var3;
            d3aVar2 = d3aVar3;
        } else {
            cVarH.D();
            au6Var2 = au6Var;
            d3aVar2 = d3aVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, str, eVar, au6Var2, d3aVar2, i) { // from class: m32
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ e d;
                public final /* synthetic */ au6 e;
                public final /* synthetic */ d3a f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    o32.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f A[PHI: r13
  0x007f: PHI (r13v24 int) = (r13v0 int), (r13v5 int), (r13v6 int) binds: [B:43:0x007d, B:53:0x0095, B:52:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r21, kotlin.jvm.functions.Function2 r22, java.lang.String r23, java.lang.String r24, androidx.compose.ui.e r25, defpackage.au6 r26, defpackage.d3a r27, androidx.compose.runtime.b r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o32.b(boolean, kotlin.jvm.functions.Function2, java.lang.String, java.lang.String, androidx.compose.ui.e, au6, d3a, androidx.compose.runtime.b, int, int):void");
    }
}
