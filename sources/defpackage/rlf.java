package defpackage;

import android.content.ContentResolver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rlf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public rlf(g62 g62Var, rs9 rs9Var, yl2 yl2Var) {
        this.a = g62Var;
        this.b = rs9Var;
        this.c = yl2Var;
        this.d = new ConcurrentHashMap();
    }

    public ms9 a(String str) {
        if (!((ConcurrentHashMap) this.d).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.d).containsKey(str)) {
                        try {
                            ((g62) this.a).getClass();
                            for (z9b z9bVar : ((rs9) this.b).a(g62.a(str))) {
                                yl2 yl2Var = (yl2) this.c;
                                fb9<String> fb9Var = yl2Var.b;
                                if (fb9Var.b.a(z9bVar).equals("001")) {
                                    yl2Var.a.a(z9bVar);
                                } else {
                                    fb9Var.a(z9bVar);
                                }
                            }
                            ((ConcurrentHashMap) this.d).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (yl2) this.c;
    }

    public rlf(ArrayList arrayList, plf plfVar, kt0 kt0Var, ContentResolver contentResolver) {
        this.a = plfVar;
        this.b = kt0Var;
        this.c = contentResolver;
        this.d = arrayList;
    }
}
