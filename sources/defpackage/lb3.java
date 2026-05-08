package defpackage;

import defpackage.k15;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lb3 implements k15.a {
    public static final b f = new b();
    public static final lb3 g = new a().a();
    public final Set<String> a;
    public final Set<zr3> b;
    public final List<iw4> c;
    public final boolean d;
    public final Map<String, ga<?>> e;

    public static final class a {
        public final LinkedHashMap a = new LinkedHashMap();
        public boolean b;
        public Set<String> c;
        public Set<zr3> d;
        public List<iw4> e;

        public final lb3 a() {
            return new lb3(this.a, this.c, this.d, this.e, this.b);
        }
    }

    public static final class b implements k15.b<lb3> {
    }

    static {
        a aVar = new a();
        aVar.b = true;
        aVar.a();
    }

    public lb3() {
        throw null;
    }

    public lb3(LinkedHashMap linkedHashMap, Set set, Set set2, List list, boolean z) {
        this.a = set;
        this.b = set2;
        this.c = list;
        this.d = z;
        this.e = linkedHashMap;
    }

    public final <T> ga<T> e(mb3 mb3Var) {
        ga<T> pnVar;
        mb3Var.getClass();
        String str = mb3Var.e;
        String str2 = mb3Var.d;
        Map<String, ga<?>> map = this.e;
        if (map.get(str2) != null) {
            pnVar = (ga) map.get(str2);
        } else if (wl7.b(str, "com.apollographql.apollo.api.Upload")) {
            pnVar = ha.h;
        } else if (u63.a0("kotlin.String", "java.lang.String").contains(str)) {
            pnVar = ha.a;
        } else if (u63.a0("kotlin.Boolean", "java.lang.Boolean").contains(str)) {
            pnVar = ha.f;
        } else if (u63.a0("kotlin.Int", "java.lang.Int").contains(str)) {
            pnVar = ha.b;
        } else if (u63.a0("kotlin.Double", "java.lang.Double").contains(str)) {
            pnVar = ha.c;
        } else if (u63.a0("kotlin.Long", "java.lang.Long").contains(str)) {
            pnVar = ha.e;
        } else if (u63.a0("kotlin.Float", "java.lang.Float").contains(str)) {
            pnVar = ha.d;
        } else if (u63.a0("kotlin.Any", "java.lang.Object").contains(str)) {
            pnVar = ha.g;
        } else {
            if (!this.d) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + str2 + "` to: `" + str + "`. Did you forget to add a scalar Adapter?").toString());
            }
            pnVar = new pn(1);
        }
        pnVar.getClass();
        return pnVar;
    }

    @Override // k15.a
    public final k15.b<?> getKey() {
        return f;
    }
}
