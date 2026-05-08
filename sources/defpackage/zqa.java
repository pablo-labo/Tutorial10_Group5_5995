package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class zqa implements Comparator {
    public static final zqa b = new zqa(0);
    public static final zqa c = new zqa(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zqa(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pm8 pm8Var = (pm8) obj;
                pm8 pm8Var2 = (pm8) obj2;
                int iC = wl7.c(pm8Var2.d0, pm8Var.d0);
                return iC != 0 ? iC : wl7.c(pm8Var.hashCode(), pm8Var2.hashCode());
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    return str2 == null ? 0 : -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
        }
    }
}
