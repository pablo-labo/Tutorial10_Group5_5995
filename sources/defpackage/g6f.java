package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g6f implements ag9 {
    public final /* synthetic */ Function2<b, Integer, j6g> a;
    public final /* synthetic */ Function2<b, Integer, j6g> b;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ Integer $firstBaseline;
        final /* synthetic */ w $iconPlaceable;
        final /* synthetic */ Integer $lastBaseline;
        final /* synthetic */ int $tabHeight;
        final /* synthetic */ int $tabWidth;
        final /* synthetic */ w $textPlaceable;
        final /* synthetic */ q $this_Layout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, w wVar2, q qVar, int i, int i2, Integer num, Integer num2) {
            super(1);
            this.$textPlaceable = wVar;
            this.$iconPlaceable = wVar2;
            this.$this_Layout = qVar;
            this.$tabWidth = i;
            this.$tabHeight = i2;
            this.$firstBaseline = num;
            this.$lastBaseline = num2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w wVar;
            w.a aVar2 = aVar;
            w wVar2 = this.$textPlaceable;
            if (wVar2 != null && (wVar = this.$iconPlaceable) != null) {
                q qVar = this.$this_Layout;
                int i = this.$tabWidth;
                int i2 = this.$tabHeight;
                Integer num = this.$firstBaseline;
                num.getClass();
                int iIntValue = num.intValue();
                Integer num2 = this.$lastBaseline;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                int iX0 = qVar.x0(iIntValue == iIntValue2 ? f6f.d : f6f.e);
                ra2 ra2Var = tmb.a;
                int iX02 = qVar.x0(3.0f) + iX0;
                int iX1 = (qVar.x1(f6f.f) + wVar.b) - iIntValue;
                int i3 = (i2 - iIntValue2) - iX02;
                w.a.y(aVar2, wVar2, (i - wVar2.a) / 2, i3);
                w.a.y(aVar2, wVar, (i - wVar.a) / 2, i3 - iX1);
            } else if (wVar2 != null) {
                int i4 = this.$tabHeight;
                float f = f6f.a;
                w.a.y(aVar2, wVar2, 0, (i4 - wVar2.b) / 2);
            } else {
                w wVar3 = this.$iconPlaceable;
                if (wVar3 != null) {
                    int i5 = this.$tabHeight;
                    float f2 = f6f.a;
                    w.a.y(aVar2, wVar3, 0, (i5 - wVar3.b) / 2);
                }
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g6f(Function2<? super b, ? super Integer, j6g> function2, Function2<? super b, ? super Integer, j6g> function22) {
        this.a = function2;
        this.b = function22;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        w wVarR;
        w wVarR2;
        if (this.a != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                vf9 vf9Var = list.get(i);
                if (wl7.b(h.a(vf9Var), "text")) {
                    wVarR = vf9Var.R(iq2.a(0, 0, 0, 0, 11, j));
                }
            }
            s6.j("Collection contains no element matching the predicate.");
            return null;
        }
        wVarR = null;
        if (this.b != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                vf9 vf9Var2 = list.get(i2);
                if (wl7.b(h.a(vf9Var2), "icon")) {
                    wVarR2 = vf9Var2.R(j);
                }
            }
            s6.j("Collection contains no element matching the predicate.");
            return null;
        }
        wVarR2 = null;
        int iMax = Math.max(wVarR != null ? wVarR.a : 0, wVarR2 != null ? wVarR2.a : 0);
        int iMax2 = Math.max(qVar.x0((wVarR == null || wVarR2 == null) ? f6f.a : f6f.b), qVar.x1(f6f.f) + (wVarR2 != null ? wVarR2.b : 0) + (wVarR != null ? wVarR.b : 0));
        return qVar.Y0(iMax, iMax2, bs4.a, new a(wVarR, wVarR2, qVar, iMax, iMax2, wVarR != null ? Integer.valueOf(wVarR.V(e20.a)) : null, wVarR != null ? Integer.valueOf(wVarR.V(e20.b)) : null));
    }
}
