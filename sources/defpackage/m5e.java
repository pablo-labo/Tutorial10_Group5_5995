package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m5e extends mj8 implements Function2<r5<vu5<? extends Boolean>>, r5<vu5<? extends Boolean>>, r5<vu5<? extends Boolean>>> {
    public static final m5e a = new m5e(2);

    @Override // kotlin.jvm.functions.Function2
    public final r5<vu5<? extends Boolean>> invoke(r5<vu5<? extends Boolean>> r5Var, r5<vu5<? extends Boolean>> r5Var2) {
        String str;
        vu5 vu5Var;
        r5<vu5<? extends Boolean>> r5Var3 = r5Var;
        r5<vu5<? extends Boolean>> r5Var4 = r5Var2;
        if (r5Var3 == null || (str = r5Var3.a) == null) {
            str = r5Var4.a;
        }
        if (r5Var3 == null || (vu5Var = r5Var3.b) == null) {
            vu5Var = r5Var4.b;
        }
        return new r5<>(str, vu5Var);
    }
}
