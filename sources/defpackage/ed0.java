package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 implements ag9 {
    public final rd0 a;
    public boolean b;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ List<w> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.$placeables = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            List<w> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aVar2.r(list.get(i), 0, 0, 0.0f);
            }
            return j6g.a;
        }
    }

    public ed0(rd0 rd0Var) {
        this.a = rd0Var;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = list.get(0).P(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iP2 = list.get(i2).P(i);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iP;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            w wVarR = list.get(i).R(j);
            iMax = Math.max(iMax, wVarR.a);
            iMax2 = Math.max(iMax2, wVarR.b);
            arrayList.add(wVarR);
        }
        boolean zM0 = qVar.m0();
        rd0 rd0Var = this.a;
        if (zM0) {
            this.b = true;
            ((gme) rd0Var.a).setValue(new th7((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ((gme) rd0Var.a).setValue(new th7((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return qVar.Y0(iMax, iMax2, bs4.a, new a(arrayList));
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = list.get(0).O(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = list.get(i2).O(i);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iO;
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = list.get(0).w(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iW2 = list.get(i2).w(i);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iW;
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iK = list.get(0).K(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iK2 = list.get(i2).K(i);
                if (iK2 > iK) {
                    iK = iK2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iK;
    }
}
