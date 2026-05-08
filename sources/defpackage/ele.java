package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ele implements ag9 {
    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        int iX0;
        int iMax;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            vf9 vf9Var = list.get(i2);
            if (wl7.b(h.a(vf9Var), RumEventDeserializer.EVENT_TYPE_ACTION)) {
                long j2 = j;
                final w wVarR = vf9Var.R(j2);
                int iH = (iq2.h(j2) - wVarR.a) - qVar.x0(8.0f);
                int iJ = iq2.j(j2);
                int i3 = iH < iJ ? iJ : iH;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    vf9 vf9Var2 = list.get(i4);
                    if (wl7.b(h.a(vf9Var2), "text")) {
                        final w wVarR2 = vf9Var2.R(iq2.a(0, i3, 0, 0, 9, j2));
                        tj6 tj6Var = e20.a;
                        int iV = wVarR2.V(tj6Var);
                        int iV2 = wVarR2.V(e20.b);
                        boolean z = true;
                        boolean z2 = (iV == Integer.MIN_VALUE || iV2 == Integer.MIN_VALUE) ? false : true;
                        if (iV != iV2 && z2) {
                            z = false;
                        }
                        final int iH2 = iq2.h(j) - wVarR.a;
                        if (z) {
                            iMax = Math.max(qVar.x0(48.0f), wVarR.b);
                            iX0 = (iMax - wVarR2.b) / 2;
                            int iV3 = wVarR.V(tj6Var);
                            if (iV3 != Integer.MIN_VALUE) {
                                i = (iV + iX0) - iV3;
                            }
                        } else {
                            iX0 = qVar.x0(30.0f) - iV;
                            iMax = Math.max(qVar.x0(68.0f), wVarR2.b + iX0);
                            i = (iMax - wVarR.b) / 2;
                        }
                        final int i5 = i;
                        final int i6 = iX0;
                        return qVar.Y0(iq2.h(j), iMax, bs4.a, new Function1() { // from class: dle
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                w.a aVar = (w.a) obj;
                                w.a.y(aVar, wVarR2, 0, i6);
                                w.a.y(aVar, wVarR, iH2, i5);
                                return j6g.a;
                            }
                        });
                    }
                    i4++;
                    j2 = j;
                }
                fz8.c("Collection contains no element matching the predicate.");
                r40.e();
                return null;
            }
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return null;
    }
}
