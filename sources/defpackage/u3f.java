package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gq1;
import defpackage.o97;
import defpackage.tq6;

/* JADX INFO: loaded from: classes3.dex */
public final class u3f {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[gq1.c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gq1.c.a aVar = gq1.c.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                gq1.c.a aVar2 = gq1.c.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[gq1.d.values().length];
            try {
                iArr2[5] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                gq1.d.a aVar3 = gq1.d.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                gq1.d.a aVar4 = gq1.d.a;
                iArr2[6] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                gq1.d.a aVar5 = gq1.d.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                gq1.d.a aVar6 = gq1.d.a;
                iArr2[7] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                gq1.d.a aVar7 = gq1.d.a;
                iArr2[0] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                gq1.d.a aVar8 = gq1.d.a;
                iArr2[4] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                gq1.d.a aVar9 = gq1.d.a;
                iArr2[2] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                gq1.d.a aVar10 = gq1.d.a;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                gq1.d.a aVar11 = gq1.d.a;
                iArr2[9] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.tg2 r23, final java.lang.String r24, final defpackage.n3f r25, final java.lang.Boolean r26, final tq6.c r27, final tq6.c r28, final gq1.c r29, final gq1.d r30, final java.lang.String r31, final java.lang.String r32, androidx.compose.runtime.b r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3f.a(tg2, java.lang.String, n3f, java.lang.Boolean, tq6$c, tq6$c, gq1$c, gq1$d, java.lang.String, java.lang.String, androidx.compose.runtime.b, int):void");
    }

    public static final void b(String str, gq1.c cVar, gq1.d dVar, gu5 gu5Var, Boolean bool, tq6.c cVar2, tq6.c cVar3, boolean z, boolean z2, b bVar, int i) {
        int i2;
        c cVarF = q6.f(-1492083134, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i2 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarF.d(cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarF.d(dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarF.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarF.K(bool) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarF.d(cVar2 == null ? -1 : cVar2.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarF.d(cVar3 != null ? cVar3.ordinal() : -1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarF.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= cVarF.a(z2) ? 67108864 : 33554432;
        }
        if (cVarF.o(i2 & 1, (38347923 & i2) != 38347922)) {
            cVarF.L(627206291);
            cVarF.L(627202169);
            boolean zB = wl7.b(bool, Boolean.TRUE);
            e eVarF = e.a.b;
            if (zB) {
                eVarF = g.f(eVarF, 1.0f);
            }
            e eVarJ = eVarF;
            if (z2) {
                cVarF.L(-1303508989);
                o97.g gVar = ((o97) cVarF.M(p97.a)).i;
                eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            } else {
                cVarF.L(-1303507214);
            }
            cVarF.U(false);
            e eVarJ2 = eVarJ;
            cVarF.U(false);
            if (z) {
                cVarF.L(568234546);
                o97.g gVar2 = ((o97) cVarF.M(p97.a)).i;
                eVarJ2 = f.j(eVarJ2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            } else {
                cVarF.L(568236228);
            }
            cVarF.U(false);
            cVarF.U(false);
            switch (dVar.ordinal()) {
                case 0:
                    int i3 = i2;
                    e eVar = eVarJ2;
                    cVarF.L(627222693);
                    gt6.m(str, gu5Var, eVar, c(cVar), false, cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i3 & 14) | ((i3 >> 6) & 112), 304);
                    cVarF = cVarF;
                    cVarF.U(false);
                    break;
                case 1:
                    int i4 = i2;
                    e eVar2 = eVarJ2;
                    cVarF.L(627233386);
                    gt6.j(str, gu5Var, eVar2, c(cVar), false, false, cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, null, cVarF, (i4 & 14) | ((i4 >> 6) & 112), 304);
                    cVarF = cVarF;
                    cVarF.U(false);
                    break;
                case 2:
                    int i5 = i2;
                    e eVar3 = eVarJ2;
                    cVarF.L(627212072);
                    gt6.h(str, gu5Var, eVar3, c(cVar), false, false, cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, null, cVarF, ((i5 >> 6) & 112) | (i5 & 14), 304);
                    cVarF = cVarF;
                    cVarF.U(false);
                    break;
                case 3:
                    int i6 = i2;
                    e eVar4 = eVarJ2;
                    cVarF.L(627244201);
                    gt6.k(str, gu5Var, eVar4, c(cVar), false, cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i6 & 14) | ((i6 >> 6) & 112), 304);
                    cVarF = cVarF;
                    cVarF.U(false);
                    break;
                case 4:
                    int i7 = i2;
                    e eVar5 = eVarJ2;
                    cVarF.L(627255315);
                    gt6.b(str, gu5Var, eVar5, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i7 & 14) | ((i7 >> 6) & 112));
                    cVarF.U(false);
                    break;
                case 5:
                    int i8 = i2;
                    e eVar6 = eVarJ2;
                    cVarF.L(627266805);
                    gt6.c(str, gu5Var, eVar6, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i8 & 14) | ((i8 >> 6) & 112), 304);
                    cVarF.U(false);
                    break;
                case 6:
                    int i9 = i2;
                    e eVar7 = eVarJ2;
                    cVarF.L(627278324);
                    gt6.d(str, gu5Var, eVar7, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i9 & 14) | ((i9 >> 6) & 112));
                    cVarF.U(false);
                    break;
                case 7:
                    int i10 = i2;
                    e eVar8 = eVarJ2;
                    cVarF.L(627289680);
                    gt6.e(str, gu5Var, eVar8, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i10 & 14) | ((i10 >> 6) & 112), 304);
                    cVarF.U(false);
                    break;
                case 8:
                    int i11 = i2;
                    e eVar9 = eVarJ2;
                    cVarF.L(627300648);
                    gt6.f(str, gu5Var, eVar9, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i11 & 14) | ((i11 >> 6) & 112));
                    cVarF.U(false);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    cVarF.L(627311368);
                    gt6.n(str, gu5Var, eVarJ2, c(cVar), cVar3 != null ? u4f.c(cVar3) : null, cVar2 != null ? u4f.c(cVar2) : null, cVarF, (i2 & 14) | ((i2 >> 6) & 112), 304);
                    cVarF.U(false);
                    break;
                default:
                    cVarF.L(627213445);
                    cVarF.U(false);
                    l.g();
                    return;
            }
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new t3f(str, cVar, dVar, gu5Var, bool, cVar2, cVar3, z, z2, i);
        }
    }

    public static final vt6 c(gq1.c cVar) {
        int iOrdinal = cVar.ordinal();
        vt6 vt6Var = vt6.Md;
        if (iOrdinal == 0 || iOrdinal == 1) {
            return vt6Var;
        }
        if (iOrdinal == 2) {
            return vt6.Lg;
        }
        l.g();
        return null;
    }
}
