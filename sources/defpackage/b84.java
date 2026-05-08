package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b84 {
    public static final void a(float f, final int i, final int i2, long j, b bVar, e eVar) {
        e eVar2;
        int i3;
        long j2;
        final float f2;
        final long jB;
        float f3;
        float density;
        c cVarH = bVar.h(-1249392198);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            eVar2 = eVar;
        } else if ((i & 6) == 0) {
            eVar2 = eVar;
            i3 = (cVarH.K(eVar2) ? 4 : 2) | i;
        } else {
            eVar2 = eVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i5 = cVarH.e(j2) ? 32 : 16;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.c(f) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i7 = i3 | 3072;
        if (cVarH.o(i7 & 1, (i7 & 1171) != 1170)) {
            cVarH.v0();
            int i8 = i & 1;
            e.a aVar = e.a.b;
            if (i8 == 0 || cVarH.c0()) {
                if (i4 != 0) {
                    eVar2 = aVar;
                }
                jB = (i2 & 2) != 0 ? da2.b(((kb2) cVarH.M(lb2.a)).c(), 0.12f) : j2;
                f3 = i6 != 0 ? 1.0f : f;
            } else {
                cVarH.D();
                f3 = f;
                jB = j2;
            }
            cVarH.V();
            if (j94.c(f3, 0.0f)) {
                cVarH.L(-455967894);
                density = 1.0f / ((iy3) cVarH.M(um2.h)).getDensity();
                cVarH.U(false);
            } else {
                cVarH.L(-455901337);
                cVarH.U(false);
                density = f3;
            }
            hl1.a(a.b(g.h(g.f(eVar2.o(aVar), 1.0f), density), jB, ytc.a), cVarH, 0);
            f2 = f3;
        } else {
            cVarH.D();
            f2 = f;
            jB = j2;
        }
        final e eVar3 = eVar2;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: z74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    b84.a(f2, iL, i2, jB, (b) obj, eVar3);
                    return j6g.a;
                }
            };
        }
    }
}
