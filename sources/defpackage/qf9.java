package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class qf9 {
    public static final List<Integer> a = u63.a0(0, 15, 25, 35, 45, 60, 90);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, gu5<j6g> gu5Var, Function1<? super Integer, j6g> function1, b5g b5gVar, b bVar, int i2) {
        c cVar;
        gu5Var.getClass();
        function1.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(812669123);
        int i3 = i2 | (cVarH.d(i) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(function1) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i3 & 1, (i3 & 1171) != 1170)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Integer.valueOf(i));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            boolean z = ((Number) g4aVar.getValue()).intValue() != i;
            String strI = ak2.I(R.string.commute_time_preference_section_title, cVarH);
            boolean zA = ((i3 & 112) == 32) | cVarH.a(z);
            Object objV3 = cVarH.v();
            if (zA || objV3 == c0020a) {
                objV3 = new kg4(z, gu5Var, g4aVar2, 1);
                cVarH.p(objV3);
            }
            gu5 gu5Var2 = (gu5) objV3;
            boolean z2 = (i3 & 896) == 256;
            Object objV4 = cVarH.v();
            if (z2 || objV4 == c0020a) {
                objV4 = new za(9, function1, g4aVar);
                cVarH.p(objV4);
            }
            cVar = cVarH;
            sb1.a(strI, gu5Var2, (gu5) objV4, 0, null, 0, null, null, b5gVar, false, false, false, false, null, 0, bh2.c(1159493953, new l81(gu5Var, b5gVar, function1, g4aVar, g4aVar2), cVarH), cVar, (i3 << 15) & 234881024, 196608, 32504);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new of9(i, gu5Var, function1, b5gVar, i2);
        }
    }
}
