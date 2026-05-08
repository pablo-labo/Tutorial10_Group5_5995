package defpackage;

import defpackage.pua;

/* JADX INFO: loaded from: classes.dex */
public interface ph0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("BeforeCache", 0);
            a = aVar;
            b = new a[]{aVar, new a("BeforeAutoPersistedQueries", 1), new a("BeforeRetryOnError", 2), new a("BeforeNetwork", 3)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var);
}
