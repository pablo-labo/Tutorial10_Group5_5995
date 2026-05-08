package defpackage;

import defpackage.q55;

/* JADX INFO: loaded from: classes.dex */
public final class r55 {
    public static final <T> T a(w27 w27Var, q55.b<T> bVar) {
        T t = (T) w27Var.s.a.get(bVar);
        if (t != null) {
            return t;
        }
        T t2 = (T) w27Var.u.n.a.get(bVar);
        return t2 == null ? bVar.a : t2;
    }

    public static final <T> T b(nva nvaVar, q55.b<T> bVar) {
        T t = (T) nvaVar.j.a.get(bVar);
        return t == null ? bVar.a : t;
    }
}
