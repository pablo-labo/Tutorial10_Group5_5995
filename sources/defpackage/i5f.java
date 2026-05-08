package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import defpackage.tq6;
import defpackage.z7f;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i5f {
    public static final void a(final tg2 tg2Var, final tq6.c cVar, final tq6.c cVar2, final z7f.c cVar3, final z7f.d dVar, final String str, final String str2, b bVar, final int i) {
        int i2;
        tg2Var.getClass();
        c cVarH = bVar.h(-609575217);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(cVar2 == null ? -1 : cVar2.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(cVar3 == null ? -1 : cVar3.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.d(dVar != null ? dVar.ordinal() : -1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(str2) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            ie7.e(str2, null, null, cVarH, (i2 >> 18) & 14);
            b(cVar, cVar2, cVar3, dVar, str, !tg2Var.a(), cVarH, (i2 >> 3) & 65534);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: g5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i5f.a(tg2Var, cVar, cVar2, cVar3, dVar, str, str2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final tq6.c cVar, final tq6.c cVar2, final z7f.c cVar3, final z7f.d dVar, final String str, final boolean z, b bVar, final int i) {
        int i2;
        Pair pair;
        c cVar4;
        b8f b8fVar;
        c cVarH = bVar.h(947789269);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar == null ? -1 : cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar2 == null ? -1 : cVar2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(cVar3 == null ? -1 : cVar3.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(dVar != null ? dVar.ordinal() : -1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.a aVar = o97Var.c;
            o97.a.e eVar = aVar.a;
            o97.a.C0340a c0340a = aVar.b;
            z7f.c cVar5 = cVar3 == null ? z7f.c.c : cVar3;
            z7f.d dVar2 = dVar == null ? z7f.d.c : dVar;
            int iOrdinal = cVar5.ordinal();
            if (iOrdinal == 0) {
                pair = new Pair(c0340a.i.d, eVar.h.d);
            } else if (iOrdinal == 1) {
                pair = new Pair(c0340a.i.c, eVar.h.c);
            } else if (iOrdinal == 2) {
                pair = new Pair(c0340a.i.e, eVar.h.e);
            } else if (iOrdinal == 3) {
                pair = new Pair(c0340a.i.a, eVar.h.a);
            } else {
                if (iOrdinal != 4) {
                    l.g();
                    return;
                }
                pair = new Pair(c0340a.i.b, eVar.h.b);
            }
            o97.a.C0340a.e.d dVar3 = (o97.a.C0340a.e.d) pair.a();
            o97.a.e.b.d dVar4 = (o97.a.e.b.d) pair.b();
            int iOrdinal2 = dVar2.ordinal();
            if (iOrdinal2 == 0) {
                cVar4 = cVarH;
                b8fVar = new b8f(c0340a.a, dVar4.a(), aVar.c.b);
            } else if (iOrdinal2 == 1) {
                b8fVar = new b8f(dVar3.a(), eVar.f, dVar3.a());
                cVar4 = cVarH;
            } else if (iOrdinal2 != 2) {
                l.g();
                return;
            } else {
                cVar4 = cVarH;
                b8fVar = new b8f(dVar3.b(), dVar4.b(), dVar3.b());
            }
            ux1 ux1VarA = wx1.a(b8fVar.a, 0L, 0L, 0L, cVar4, 14);
            cVarH = cVar4;
            fgd fgdVarA = ggd.a(4.0f);
            e eVarA = d.a(e.a.b, sl7.a);
            if (z) {
                eVarA = f.j(eVarA, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            }
            ay1.b(eVarA, fgdVarA, ux1VarA, null, ee3.f(b8fVar.c, 1.0f), bh2.c(2000411683, new wa3(o97Var, cVar2, str, cVar, b8fVar), cVarH), cVarH, 196608, 8);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: h5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i5f.b(cVar, cVar2, cVar3, dVar, str, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
