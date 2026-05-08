package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cs6 {
    public static final void a(final e eVar, final boolean z, final Integer num, final long j, final String str, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVar;
        c cVarH = bVar.h(1654237829);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(num) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.e(j) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 131072 : 65536;
        }
        if ((i2 & 74899) == 74898 && cVarH.i()) {
            cVarH.D();
            cVar = cVarH;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String str2 = str == null ? "IdlBadge" : str;
            e eVarA = f.a(eVar, str2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(2.2f)) << 32) | (((long) Float.floatToRawIntBits(-3.3f)) & 4294967295L);
            float f = num == null ? 12.0f : 18.0f;
            tjf tjfVar = o97Var.j.h;
            pn5 pn5Var = o97Var.d.a;
            to5 to5Var = o97Var.f.c;
            long jT = hh2.t(12);
            cVarH.L(136231492);
            float fP1 = ((iy3) cVarH.M(um2.h)).p1();
            long jY = fP1 > 1.0f ? hh2.y(4294967296L, bkf.c(jT) / (((fP1 - 1.0f) / 2.0f) + 1.0f)) : hh2.y(4294967296L, bkf.c(jT) / fP1);
            cVarH.U(false);
            tjf tjfVarA = tjf.a(tjfVar, 0L, jY, to5Var, null, pn5Var, 0L, 0, 0L, null, null, 0, 16777177);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cVar = cVarH;
            i81.b(bh2.c(-754496381, new as6(z, j, jFloatToRawIntBits, f, o97Var, str2, num, tjfVarA), cVarH), null, bh2.c(-1227732031, new bs6(ah2Var), cVarH), cVar, 390, 2);
            cVar.U(true);
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: yr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cs6.a(eVar, z, num, j, str, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e eVar, final int i, long j, final String str, final ah2 ah2Var, b bVar, final int i2, final int i3) {
        int i4;
        final e eVar2;
        final long j2;
        c cVarH = bVar.h(1569104169);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = i2 | (cVarH.K(eVar) ? 4 : 2);
        }
        int i6 = i4 | (cVarH.d(i) ? 32 : 16) | 384 | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if ((i6 & 9363) == 9362 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
            j2 = j;
        } else {
            e eVar3 = i5 != 0 ? e.a.b : eVar;
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(0.0f))) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            int i7 = i6 & 14;
            int i8 = i6 << 3;
            int i9 = i7 | (i8 & 896) | 3072 | (i8 & 57344) | 196608;
            e eVar4 = eVar3;
            a(eVar4, i > 0, Integer.valueOf(i), jFloatToRawIntBits, str, ah2Var, cVarH, i9);
            eVar2 = eVar4;
            j2 = jFloatToRawIntBits;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, j2, str, ah2Var, i2, i3) { // from class: xr6
                public final /* synthetic */ int b;
                public final /* synthetic */ long c;
                public final /* synthetic */ String d;
                public final /* synthetic */ ah2 e;
                public final /* synthetic */ int f;

                {
                    this.f = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(24577);
                    cs6.b(this.a, this.b, this.c, this.d, this.e, (b) obj, iL, this.f);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(e eVar, final boolean z, final long j, String str, final ah2 ah2Var, b bVar, final int i, final int i2) {
        String str2;
        int i3;
        final e eVar2;
        final String str3;
        c cVarH = bVar.h(-1900363550);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= cVarH.a(z) ? 32 : 16;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        if ((i3 & 9363) == 9362 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
            str3 = str2;
        } else {
            String str4 = i5 != 0 ? null : str2;
            int i6 = ((i3 << 3) & 57344) | (i3 & 112) | 3462 | 196608;
            e.a aVar = e.a.b;
            a(aVar, z, null, j, str4, ah2Var, cVarH, i6);
            eVar2 = aVar;
            str3 = str4;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: wr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cs6.c(eVar2, z, j, str3, ah2Var, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
