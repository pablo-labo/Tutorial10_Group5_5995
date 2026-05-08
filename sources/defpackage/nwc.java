package defpackage;

import defpackage.kv8;
import defpackage.q62;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class nwc implements uv8 {
    public final Object a;
    public final q62.a b;

    public nwc(yv8 yv8Var) {
        this.a = yv8Var;
        q62 q62Var = q62.c;
        Class<?> cls = yv8Var.getClass();
        q62.a aVar = (q62.a) q62Var.a.get(cls);
        this.b = aVar == null ? q62Var.a(cls, null) : aVar;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        HashMap map = this.b.a;
        List list = (List) map.get(aVar);
        Object obj = this.a;
        q62.a.a(list, zv8Var, aVar, obj);
        q62.a.a((List) map.get(kv8.a.ON_ANY), zv8Var, aVar, obj);
    }
}
