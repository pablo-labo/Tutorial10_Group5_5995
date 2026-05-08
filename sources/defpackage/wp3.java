package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class wp3 {
    public final Context a;
    public final q81 b;
    public final int c;

    public wp3(Context context, int i) {
        this.a = context;
        this.c = i;
        q81 q81Var = new q81();
        this.b = q81Var;
        q81Var.a(context.getApplicationInfo().sourceDir);
    }

    public final am2 a() {
        Context context = this.a;
        q81 q81Var = this.b;
        x14 x14Var = new x14(context, q81Var);
        c32 c32Var = new c32(context, q81Var);
        hwf hwfVar = new hwf();
        g32 g32Var = new g32(context);
        k37 k37Var = new k37();
        k37Var.b = this.c;
        return new am2(x14Var, c32Var, hwfVar, g32Var, k37Var, new h32(), new ewa(22), new hwf());
    }
}
