package defpackage;

import defpackage.cke;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om8 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ om8(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pm8 pm8Var = (pm8) obj;
                pm8 pm8Var2 = (pm8) obj2;
                float f = pm8Var.u0.p.u0;
                float f2 = pm8Var2.u0.p.u0;
                return f == f2 ? wl7.c(pm8Var.L(), pm8Var2.L()) : Float.compare(f, f2);
            default:
                return Float.compare(((cke.a) obj).c, ((cke.a) obj2).c);
        }
    }
}
