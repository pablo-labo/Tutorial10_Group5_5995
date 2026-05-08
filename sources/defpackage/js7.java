package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class js7 {
    public final Set<a> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("TEMPORARY", 0);
            a = aVar;
            a aVar2 = new a("PART_TIME", 1);
            b = aVar2;
            a aVar3 = new a("FULL_TIME", 2);
            c = aVar3;
            a aVar4 = new a("CONTRACT", 3);
            d = aVar4;
            a aVar5 = new a("INTERNSHIP", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public js7(Set<? extends a> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js7) && this.a.equals(((js7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JSTProfilePreferredJobTypes(jobTypes=" + this.a + ")";
    }
}
