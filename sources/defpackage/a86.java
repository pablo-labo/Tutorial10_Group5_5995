package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.aod;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class a86 {
    public static final void a(final vnd vndVar, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, final Function1 function16, final Function1 function17, final Function1 function18, final Function1 function19, b bVar, final int i) {
        c cVar;
        vndVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        function16.getClass();
        c cVarH = bVar.h(2042414950);
        int i2 = i | (cVarH.x(vndVar) ? 4 : 2) | (cVarH.x(function17) ? 8388608 : 4194304) | (cVarH.x(function18) ? 67108864 : 33554432) | (cVarH.x(function19) ? 536870912 : 268435456);
        if (cVarH.o(i2 & 1, (306783251 & i2) != 306783250)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            boolean zX = cVarH.x(vndVar) | ((i2 & 234881024) == 67108864);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new as(8, function18, vndVar);
                cVarH.p(objV);
            }
            cVar = cVarH;
            ay1.d(androidx.compose.ui.c.a(e.a.b, tf7.a, new i72((gu5) objV)), null, null, null, null, bh2.c(-393999398, new wu5() { // from class: y76
                /* JADX WARN: Removed duplicated region for block: B:73:0x047f  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x049e  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x04bb  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x04d8  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x04f6  */
                @Override // defpackage.wu5
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object q(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59) {
                    /*
                        Method dump skipped, instruction units count: 1323
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.y76.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, cVarH), cVar, 196608, 30);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function1, function12, function13, function14, function15, function16, function17, function18, function19, i) { // from class: z76
                public final /* synthetic */ Function1 V;
                public final /* synthetic */ Function1 W;
                public final /* synthetic */ Function1 X;
                public final /* synthetic */ Function1 Y;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1797553);
                    a86.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(aod aodVar, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, e eVar, gu5 gu5Var6, b bVar, int i) {
        c cVarH = bVar.h(-321518563);
        int i2 = i | (cVarH.K(aodVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var5) ? 131072 : 65536) | (cVarH.K(eVar) ? 1048576 : 524288) | (cVarH.x(gu5Var6) ? 8388608 : 4194304);
        if (cVarH.o(i2 & 1, (4785299 & i2) != 4785298)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = g.f(eVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarH = f.h(eVarF, 4.0f, 0.0f, 2);
            if (wl7.b(aodVar, aod.b.c)) {
                cVarH.L(258325167);
                String strD = d(aodVar);
                gt6.h(strD != null ? strD : "", gu5Var2, eVarH, null, false, false, null, null, null, cVarH, (i2 >> 3) & 112, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH = cVarH;
                cVarH.U(false);
            } else if (wl7.b(aodVar, aod.g.c) || wl7.b(aodVar, aod.e.c)) {
                cVarH.L(258333908);
                String strD2 = d(aodVar);
                gt6.h(strD2 != null ? strD2 : "", gu5Var3, eVarH, null, false, false, null, null, null, cVarH, (i2 >> 6) & 112, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH = cVarH;
                cVarH.U(false);
            } else if (wl7.b(aodVar, aod.c.c) || wl7.b(aodVar, aod.h.c)) {
                cVarH.L(258342781);
                String strD3 = d(aodVar);
                gt6.c(strD3 != null ? strD3 : "", gu5Var5, eVarH, null, null, null, cVarH, (i2 >> 12) & 112, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH.U(false);
            } else if (wl7.b(aodVar, aod.d.c)) {
                cVarH.L(258350646);
                String strD4 = d(aodVar);
                gt6.j(strD4 != null ? strD4 : "", gu5Var, eVarH, null, false, false, null, null, null, cVarH, i2 & 112, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH = cVarH;
                cVarH.U(false);
            } else if (wl7.b(aodVar, aod.f.c)) {
                cVarH.L(258357937);
                String strD5 = d(aodVar);
                gt6.h(strD5 != null ? strD5 : "", gu5Var6, eVarH, null, false, false, null, null, null, cVarH, (i2 >> 18) & 112, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH = cVarH;
                cVarH.U(false);
            } else {
                cVarH.L(-580648606);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ir2(aodVar, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, eVar, gu5Var6, i);
        }
    }

    public static final void c(aod aodVar, b bVar, int i) {
        c8f c8fVar;
        c cVarH = bVar.h(-1126875526);
        int i2 = (cVarH.K(aodVar) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            String str = aodVar.a;
            int iOrdinal = aodVar.b.ordinal();
            if (iOrdinal == 0) {
                c8fVar = c8f.e;
            } else if (iOrdinal == 1) {
                c8fVar = c8f.c;
            } else if (iOrdinal == 2) {
                c8fVar = c8f.a;
            } else {
                if (iOrdinal != 3) {
                    l.g();
                    return;
                }
                c8fVar = c8f.d;
            }
            ny6.a(str, androidx.compose.ui.platform.f.a(e.a.b, "GhostwriterJobCardStatus"), null, c8fVar, null, null, null, cVarH, 48, 244);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kh(aodVar, i, 4);
        }
    }

    public static final String d(aod aodVar) {
        if (wl7.b(aodVar, aod.b.c)) {
            return "Update status";
        }
        if (wl7.b(aodVar, aod.c.c) || wl7.b(aodVar, aod.h.c)) {
            return "Apply manually";
        }
        if (wl7.b(aodVar, aod.d.c)) {
            return "Stop auto apply";
        }
        if (wl7.b(aodVar, aod.e.c) || wl7.b(aodVar, aod.g.c)) {
            return "Review";
        }
        if (wl7.b(aodVar, aod.f.c)) {
            return "Start Auto Apply";
        }
        return null;
    }
}
