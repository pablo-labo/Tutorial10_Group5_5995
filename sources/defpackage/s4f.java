package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gq1;
import defpackage.oq6;
import defpackage.tq6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s4f {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[oq6.c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                oq6.c.a aVar = oq6.c.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                oq6.c.a aVar2 = oq6.c.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[gq1.d.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                gq1.d.a aVar3 = gq1.d.a;
                iArr2[8] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                gq1.d.a aVar4 = gq1.d.a;
                iArr2[9] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.tg2 r20, final tq6.c r21, final defpackage.n3f r22, final java.lang.Boolean r23, final gq1.c r24, final oq6.c r25, final java.lang.String r26, final java.lang.String r27, androidx.compose.runtime.b r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4f.a(tg2, tq6$c, n3f, java.lang.Boolean, gq1$c, oq6$c, java.lang.String, java.lang.String, androidx.compose.runtime.b, int):void");
    }

    public static final void b(final tq6.c cVar, final gq1.c cVar2, final gq1.d dVar, final gu5 gu5Var, final Boolean bool, final boolean z, b bVar, final int i) {
        int i2;
        c cVar3;
        i iVarW;
        Function2<? super b, ? super Integer, j6g> function2;
        c cVarH = bVar.h(128477825);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (66707 & i2) != 66706)) {
            e eVarJ = e.a.b;
            if (z) {
                eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            }
            int i3 = i2;
            e eVar = eVarJ;
            fv6 fv6VarC = u4f.c(cVar);
            if (fv6VarC == null) {
                cVarH.L(667538905);
                cVarH.U(false);
                cVar3 = cVarH;
            } else {
                cVarH.L(667538906);
                int iOrdinal = dVar.ordinal();
                if (iOrdinal == 2) {
                    cVarH.L(-547232006);
                    gt6.i(fv6VarC, gu5Var, eVar, null, u3f.c(cVar2), cVarH, (i3 >> 6) & 112, 232);
                    cVar3 = cVarH;
                    cVar3.U(false);
                } else if (iOrdinal == 8) {
                    cVar3 = cVarH;
                    cVar3.L(-547223494);
                    gt6.g(fv6VarC, gu5Var, eVar, null, u3f.c(cVar2), null, cVar3, (i3 >> 6) & 112, 232);
                    cVar3.U(false);
                } else {
                    if (iOrdinal != 9) {
                        cVarH.L(216419915);
                        cVarH.U(false);
                        cVarH.U(false);
                        iVarW = cVarH.W();
                        if (iVarW != null) {
                            function2 = new Function2() { // from class: q4f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    s4f.b(cVar, cVar2, dVar, gu5Var, bool, z, (b) obj, ka2.L(i | 1));
                                    return j6g.a;
                                }
                            };
                            iVarW.d = function2;
                        }
                        return;
                    }
                    cVarH.L(-547214982);
                    cVar3 = cVarH;
                    gt6.o(fv6VarC, gu5Var, eVar, null, u3f.c(cVar2), null, cVar3, (i3 >> 6) & 112, 232);
                    cVar3.U(false);
                }
                cVar3.U(false);
            }
        } else {
            cVar3 = cVarH;
            cVar3.D();
        }
        iVarW = cVar3.W();
        if (iVarW != null) {
            function2 = new Function2() { // from class: r4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s4f.b(cVar, cVar2, dVar, gu5Var, bool, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
            iVarW.d = function2;
        }
    }
}
