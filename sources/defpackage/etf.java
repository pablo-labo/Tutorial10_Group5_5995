package defpackage;

import android.content.Context;
import defpackage.cd3;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class etf {
    public static volatile cd3 e;
    public final b82 a;
    public final b82 b;
    public final fod c;
    public final ihg d;

    public etf(b82 b82Var, b82 b82Var2, fod fodVar, ihg ihgVar, t2h t2hVar) {
        this.a = b82Var;
        this.b = b82Var2;
        this.c = fodVar;
        this.d = ihgVar;
        t2hVar.a.execute(new hy1(t2hVar, 5));
    }

    public static etf a() {
        cd3 cd3Var = e;
        if (cd3Var != null) {
            return cd3Var.V.get();
        }
        r6.g("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (etf.class) {
                try {
                    if (e == null) {
                        cd3.a aVar = new cd3.a();
                        context.getClass();
                        aVar.a = context;
                        e = aVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final ctf c(as1 as1Var) {
        byte[] bytes;
        Set setUnmodifiableSet = as1Var != null ? Collections.unmodifiableSet(as1.d) : Collections.singleton(new dt4("proto"));
        as1Var.getClass();
        String str = as1Var.a;
        String str2 = as1Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = t40.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        return new ctf(setUnmodifiableSet, new v31("cct", bytes, jnb.a), this);
    }
}
