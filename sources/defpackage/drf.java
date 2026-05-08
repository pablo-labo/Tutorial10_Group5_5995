package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface drf extends dgb {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("DEFERRED", 0);
            a = aVar;
            a aVar2 = new a("IMMEDIATE", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2, new a("EXCLUSIVE", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    Object a(a aVar, Function2 function2, c1f c1fVar);

    Object c(c1f c1fVar);
}
