package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y4f {
    public static final void a(final tg2 tg2Var, String str, String str2, String str3, final String str4, b bVar, final int i) {
        int i2;
        String str5;
        final String str6;
        final String str7;
        tg2Var.getClass();
        str.getClass();
        str2.getClass();
        c cVarH = bVar.h(-813322702);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(str3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str4) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            ie7.e(str4, null, null, cVarH, (i2 >> 12) & 14);
            str5 = str3;
            b(str, str2, str5, !tg2Var.a(), cVarH, (i2 >> 3) & 1022);
            str7 = str;
            str6 = str2;
        } else {
            str5 = str3;
            str6 = str2;
            str7 = str;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final String str8 = str5;
            iVarW.d = new Function2() { // from class: w4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y4f.a(tg2Var, str7, str6, str8, str4, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final boolean z, b bVar, final int i) {
        int i2;
        e.a aVar;
        e eVarJ;
        boolean z2;
        str.getClass();
        str2.getClass();
        c cVarH = bVar.h(869657404);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar2 = e.a.b;
            if (z) {
                o97.g gVar = o97Var.i;
                eVarJ = f.j(aVar2, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                aVar = aVar2;
            } else {
                aVar = aVar2;
                eVarJ = aVar;
            }
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            fz6.a(str2, gz6.c, null, null, to5.d0, null, null, 2, 2, null, cVarH, ((i2 >> 3) & 14) | 113270832, 620);
            o97.g gVar2 = o97Var.i;
            gz6 gz6Var = gz6.b;
            fz6.a(str, gz6Var, null, f.j(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), null, null, null, 1, 2, null, cVarH, (i2 & 14) | 113246256, 628);
            if (str3 == null) {
                cVarH.L(1050847463);
                cVarH.U(false);
                z2 = true;
            } else {
                cVarH.L(1050847464);
                z2 = true;
                fz6.a(str3, gz6Var, null, f.j(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), null, null, null, 1, 2, null, cVarH, 113246256, 628);
                cVarH.U(false);
            }
            cVarH.U(z2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: x4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y4f.b(str, str2, str3, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
