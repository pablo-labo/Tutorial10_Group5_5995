package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class xy3 {
    public static final a a = new a();

    public static final class a implements Comparator<pm8> {
        @Override // java.util.Comparator
        public final int compare(pm8 pm8Var, pm8 pm8Var2) {
            pm8 pm8Var3 = pm8Var;
            pm8 pm8Var4 = pm8Var2;
            int iC = wl7.c(pm8Var3.d0, pm8Var4.d0);
            return iC != 0 ? iC : wl7.c(pm8Var3.hashCode(), pm8Var4.hashCode());
        }
    }
}
