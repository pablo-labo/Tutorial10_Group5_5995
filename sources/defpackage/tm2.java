package defpackage;

import androidx.compose.runtime.h;
import defpackage.s8b;

/* JADX INFO: loaded from: classes.dex */
public final class tm2 {
    public static final <T> T a(t8b t8bVar, h hVar) {
        hVar.getClass();
        Object objB = t8bVar.get(hVar);
        if (objB == null) {
            objB = hVar.b();
        }
        return (T) ((olg) objB).a(t8bVar);
    }

    public static final t8b b(i6c<?>[] i6cVarArr, t8b t8bVar, t8b t8bVar2) {
        s8b s8bVar = s8b.d;
        s8b.a aVar = new s8b.a(s8bVar);
        aVar.V = s8bVar;
        for (i6c<?> i6cVar : i6cVarArr) {
            h hVar = i6cVar.a;
            if (i6cVar.f || !t8bVar.containsKey(hVar)) {
                aVar.put(hVar, hVar.c(i6cVar, (olg) t8bVar2.get(hVar)));
            }
        }
        return aVar.a();
    }
}
