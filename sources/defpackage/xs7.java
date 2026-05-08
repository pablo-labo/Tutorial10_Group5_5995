package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class xs7 {
    public final Set<a> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("REMOTE", 0);
            a = aVar;
            a aVar2 = new a("HYBRID_WORK", 1);
            b = aVar2;
            a aVar3 = new a("IN_PERSON", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xs7(Set<? extends a> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs7) && wl7.b(this.a, ((xs7) obj).a);
    }

    public final int hashCode() {
        Set<a> set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "JSTProfileWorkSetting(selected=" + this.a + ")";
    }

    public xs7() {
        this(null);
    }
}
