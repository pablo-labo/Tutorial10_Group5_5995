package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sb1 {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r32, final defpackage.gu5 r33, final defpackage.gu5 r34, int r35, defpackage.gu5 r36, int r37, defpackage.gu5 r38, java.lang.Float r39, defpackage.b5g r40, boolean r41, boolean r42, boolean r43, boolean r44, defpackage.gu5 r45, int r46, final defpackage.ah2 r47, androidx.compose.runtime.b r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb1.a(java.lang.String, gu5, gu5, int, gu5, int, gu5, java.lang.Float, b5g, boolean, boolean, boolean, boolean, gu5, int, ah2, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final void b(final gu5 gu5Var, final int i, final gu5 gu5Var2, final int i2, final Float f, final gu5 gu5Var3, final int i3, final b5g b5gVar, b bVar, final int i4) {
        c cVarH = bVar.h(-1566888109);
        int i5 = i4 | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.d(i) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(i2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(f) ? 16384 : 8192) | (cVarH.x(gu5Var3) ? 131072 : 65536) | (cVarH.d(i3) ? 1048576 : 524288) | (cVarH.d(b5gVar == null ? -1 : b5gVar.ordinal()) ? 8388608 : 4194304);
        if (cVarH.o(i5 & 1, (4793491 & i5) != 4793490)) {
            cVarH.v0();
            if ((i4 & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            e eVarF = g.f(e.a.b, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.i, false);
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
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            zu6.a(null, false, bh2.c(-2116096072, new Function2() { // from class: nb1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f2;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar2 = e.a.b;
                        gu5 gu5Var4 = gu5Var2;
                        if (gu5Var4 == null) {
                            bVar2.L(911929572);
                            bVar2.F();
                            f2 = 1.0f;
                        } else {
                            bVar2.L(911929573);
                            f2 = 1.0f;
                            gt6.j(ak2.I(i2, bVar2), gu5Var4, g.f(aVar2, 1.0f), null, false, false, null, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                            bVar2.F();
                        }
                        gu5 gu5Var5 = gu5Var;
                        if (gu5Var5 == null) {
                            bVar2.L(912265922);
                        } else {
                            bVar2.L(912265923);
                            Float f3 = f;
                            String strI = ak2.I(wl7.a(f2, f3) ? i : f3 == null ? R.string.done_button_label : R.string.next_button_label, bVar2);
                            e eVarF2 = g.f(aVar2, f2);
                            b5g b5gVar2 = b5gVar;
                            b5g b5gVar3 = b5g.b;
                            gt6.h(strI, gu5Var5, eVarF2, null, b5gVar2 == b5gVar3, b5gVar2 == b5gVar3, null, null, null, bVar2, 384, 456);
                        }
                        bVar2.F();
                        gu5 gu5Var6 = gu5Var3;
                        if (gu5Var6 == null) {
                            bVar2.L(912988501);
                        } else {
                            bVar2.L(912988502);
                            yt3.a(0, gu5Var6, bVar2, ak2.I(i3, bVar2));
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, cVarH, 384, 27);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var2, i2, f, gu5Var3, i3, b5gVar, i4) { // from class: ob1
                public final /* synthetic */ int V;
                public final /* synthetic */ b5g W;
                public final /* synthetic */ int b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ Float e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    sb1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
