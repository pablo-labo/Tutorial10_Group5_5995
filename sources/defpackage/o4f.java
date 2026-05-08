package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.fl1;
import defpackage.zg6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o4f {
    public static final void a(tg2 tg2Var, zg6.c cVar, String str, zg6.d dVar, String str2, b bVar, int i) {
        int i2;
        tg2Var.getClass();
        cVar.getClass();
        str.getClass();
        c cVarH = bVar.h(1698998916);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str2) ? 16384 : 8192;
        }
        boolean z = false;
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            ie7.e(str2, null, null, cVarH, (i2 >> 12) & 14);
            zg6.d dVar2 = dVar == null ? zg6.d.b : dVar;
            tg2 tg2Var2 = tg2Var.b;
            while (true) {
                if (tg2Var2 == null) {
                    break;
                }
                d4f d4fVar = tg2Var2.a;
                if (fl1.class.isInstance(d4fVar)) {
                    d4fVar.getClass();
                    if (((fl1) d4fVar).l == fl1.d.c) {
                        z = true;
                        break;
                    }
                }
                tg2Var2 = tg2Var2.b;
            }
            b(cVar, str, dVar2, !z, !tg2Var.a(), cVarH, (i2 >> 3) & 126);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ni3(tg2Var, cVar, str, dVar, str2, i, 1);
        }
    }

    public static final void b(final zg6.c cVar, final String str, final zg6.d dVar, final boolean z, final boolean z2, b bVar, final int i) {
        int i2;
        af1.a aVar;
        bv6 bv6Var;
        c cVarH = bVar.h(1843304634);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.a(z2) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            e eVarF = e.a.b;
            if (z) {
                eVarF = g.f(eVarF, 1.0f);
            }
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                aVar = c20.a.m;
            } else if (iOrdinal == 1) {
                aVar = c20.a.n;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                aVar = c20.a.o;
            }
            switch (cVar.ordinal()) {
                case 0:
                    bv6Var = bv6.a;
                    break;
                case 1:
                    bv6Var = bv6.b;
                    break;
                case 2:
                    bv6Var = bv6.c;
                    break;
                case 3:
                    bv6Var = bv6.d;
                    break;
                case 4:
                    bv6Var = bv6.e;
                    break;
                case 5:
                    bv6Var = bv6.f;
                    break;
                case 6:
                    bv6Var = bv6.V;
                    break;
                case 7:
                    bv6Var = bv6.W;
                    break;
                default:
                    l.g();
                    return;
            }
            ((o97) cVarH.M(p97.a)).getClass();
            switch (bv6Var.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    e eVarW = g.w(eVarF, aVar, 2);
                    if (z2) {
                        eVarW = f.j(eVarW, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    }
                    av6.a(str, eVarW, bv6Var, cVarH, (i2 >> 3) & 14);
                    break;
                default:
                    l.g();
                    return;
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: n4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o4f.b(cVar, str, dVar, z, z2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
