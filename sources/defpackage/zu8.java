package defpackage;

import android.content.Context;
import defpackage.uf2;

/* JADX INFO: loaded from: classes2.dex */
public final class zu8 {

    public interface a<T> {
        String d(Context context);
    }

    public static uf2<?> a(String str, String str2) {
        e31 e31Var = new e31(str, str2);
        uf2.a aVarB = uf2.b(xu8.class);
        aVarB.e = 1;
        aVarB.f = new u91(e31Var, 2);
        return aVarB.b();
    }

    public static uf2<?> b(String str, a<Context> aVar) {
        uf2.a aVarB = uf2.b(xu8.class);
        aVarB.e = 1;
        aVarB.a(my3.b(Context.class));
        aVarB.f = new rk3(str, aVar);
        return aVarB.b();
    }
}
