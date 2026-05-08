package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bh6 {
    public static final void a(final String str, e eVar, tjf tjfVar, dcf dcfVar, b bVar, final int i, final int i2) {
        e eVar2;
        int i3;
        tjf tjfVar2;
        int i4;
        dcf dcfVar2;
        int i5;
        c cVar;
        final e eVar3;
        final tjf tjfVar3;
        final dcf dcfVar3;
        str.getClass();
        c cVarH = bVar.h(-348264612);
        int i6 = i | (cVarH.K(str) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i3 = i6 | (cVarH.K(eVar2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            tjfVar2 = tjfVar;
        } else {
            tjfVar2 = tjfVar;
            i4 = i3 | (cVarH.K(tjfVar2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            dcfVar2 = dcfVar;
        } else {
            dcfVar2 = dcfVar;
            i5 = i4 | (cVarH.K(dcfVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        if (cVarH.o(i5 & 1, (i5 & 1171) != 1170)) {
            e eVar4 = i7 != 0 ? e.a.b : eVar2;
            tjf tjfVar4 = i8 != 0 ? null : tjfVar2;
            dcf dcfVar4 = i9 != 0 ? null : dcfVar2;
            o97 o97Var = (o97) cVarH.M(p97.a);
            tjf tjfVarA = tjf.a(tjfVar4 == null ? o97Var.j.e : tjfVar4, o97Var.c.a.c, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new vg(11);
                cVarH.p(objV);
            }
            cVar = cVarH;
            fif.b(str, b5e.b(eVar4, false, (Function1) objV), 0L, 0L, null, null, 0L, null, dcfVar4, 0L, 0, false, 0, 0, null, tjfVarA, cVar, (i5 & 14) | ((i5 << 18) & 1879048192), 0, 65020);
            eVar3 = eVar4;
            dcfVar3 = dcfVar4;
            tjfVar3 = tjfVar4;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar3 = eVar2;
            tjfVar3 = tjfVar2;
            dcfVar3 = dcfVar2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, eVar3, tjfVar3, dcfVar3, i, i2) { // from class: ah6
                public final /* synthetic */ String a;
                public final /* synthetic */ e b;
                public final /* synthetic */ tjf c;
                public final /* synthetic */ dcf d;
                public final /* synthetic */ int e;

                {
                    this.e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    bh6.a(this.a, this.b, this.c, this.d, (b) obj, iL, this.e);
                    return j6g.a;
                }
            };
        }
    }
}
