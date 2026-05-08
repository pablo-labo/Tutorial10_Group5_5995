package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.tq6;
import defpackage.w2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u4f {
    public static final void a(final tq6.c cVar, final da2 da2Var, final tq6.d dVar, final String str, b bVar, final int i) {
        cVar.getClass();
        c cVarH = bVar.h(-72377916);
        int i2 = (cVarH.d(cVar.ordinal()) ? 4 : 2) | i | (cVarH.K(da2Var) ? 32 : 16) | (cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            if (str == null) {
                cVarH.L(-136737038);
            } else {
                cVarH.L(-136737037);
                ie7.e(str, null, null, cVarH, 0);
            }
            cVarH.U(false);
            b(cVar, da2Var, dVar, cVarH, i2 & 1022);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(da2Var, dVar, str, i) { // from class: t4f
                public final /* synthetic */ da2 b;
                public final /* synthetic */ tq6.d c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    u4f.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(tq6.c cVar, da2 da2Var, tq6.d dVar, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-736414607);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(da2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            fv6 fv6VarC = c(cVar);
            if (fv6VarC == null) {
                cVarH.L(165556527);
            } else {
                cVarH.L(165556528);
                ar6 ar6Var = zve.L(cVar.name(), "Outline", false) ? ar6.Stroke : ar6.Filled;
                zq6 zq6Var = zq6.Md;
                if (dVar != null) {
                    int iOrdinal = dVar.ordinal();
                    if (iOrdinal == 0) {
                        zq6Var = zq6.Sm;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            l.g();
                            return;
                        }
                        zq6Var = zq6.Xs;
                    }
                }
                ev6.b(fv6VarC, null, ar6Var, zq6Var, da2Var != null ? da2Var.a : eu6.n, null, cVarH, 0, 34);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new of9(cVar, da2Var, dVar, i);
        }
    }

    public static final fv6 c(tq6.c cVar) {
        Enum r5;
        Object next;
        cVar.getClass();
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 27) {
            r5 = fv6.c1;
        } else if (iOrdinal == 49) {
            r5 = fv6.Q1;
        } else if (iOrdinal == 97) {
            r5 = fv6.c4;
        } else if (iOrdinal != 218) {
            r5 = cVar;
            if (iOrdinal == 233) {
                r5 = fv6.U9;
            }
        } else {
            r5 = fv6.o9;
        }
        wv4 wv4Var = fv6.xa;
        wv4Var.getClass();
        w2.b bVar = new w2.b();
        while (true) {
            if (!bVar.hasNext()) {
                next = null;
                break;
            }
            next = bVar.next();
            if (wve.E(((fv6) next).name(), r5.name(), true)) {
                break;
            }
        }
        return (fv6) next;
    }
}
