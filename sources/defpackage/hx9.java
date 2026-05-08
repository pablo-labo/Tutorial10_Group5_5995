package defpackage;

import defpackage.f65;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hx9 {
    public final n1a a;
    public final a b;

    public static class a {
        public final HashMap a = new HashMap();

        /* JADX INFO: renamed from: hx9$a$a, reason: collision with other inner class name */
        public static class C0260a<Model> {
            public final List<fx9<Model, ?>> a;

            public C0260a(List<fx9<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public hx9(f65.c cVar) {
        n1a n1aVar = new n1a(cVar);
        this.b = new a();
        this.a = n1aVar;
    }
}
