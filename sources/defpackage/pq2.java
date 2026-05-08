package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pq2 {
    public final Map<Type, gg7<?>> a;
    public final List<gwc> b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements hna<T> {
        public final /* synthetic */ gg7 a;

        public a(gg7 gg7Var, Type type) {
            this.a = gg7Var;
        }

        @Override // defpackage.hna
        public final T b() {
            return (T) this.a.createInstance();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements hna<T> {
        public final /* synthetic */ gg7 a;

        public b(gg7 gg7Var, Type type) {
            this.a = gg7Var;
        }

        @Override // defpackage.hna
        public final T b() {
            return (T) this.a.createInstance();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements hna<T> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // defpackage.hna
        public final T b() {
            throw new JsonIOException(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements hna<T> {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // defpackage.hna
        public final T b() {
            throw new JsonIOException(this.a);
        }
    }

    public pq2() {
        Map<Type, gg7<?>> map = Collections.EMPTY_MAP;
        List<gwc> list = Collections.EMPTY_LIST;
        this.a = map;
        this.b = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> defpackage.hna<T> b(defpackage.iyf<T> r8) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq2.b(iyf):hna");
    }

    public final String toString() {
        return this.a.toString();
    }
}
