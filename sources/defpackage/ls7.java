package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ls7 {
    public final List<String> a;
    public final a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NOT_WILLING_TO_RELOCATE", 0);
            a = aVar;
            a aVar2 = new a("WILLING_TO_RELOCATE_ANYWHERE", 1);
            b = aVar2;
            a aVar3 = new a("WILLING_TO_RELOCATE_TO_SPECIFIC_LOCATIONS", 2);
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

    public ls7(List<String> list, a aVar) {
        this.a = list;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls7)) {
            return false;
        }
        ls7 ls7Var = (ls7) obj;
        return wl7.b(this.a, ls7Var.a) && this.b == ls7Var.b;
    }

    public final int hashCode() {
        List<String> list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        a aVar = this.b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileRelocation(locations=" + this.a + ", option=" + this.b + ")";
    }

    public ls7() {
        this(null, null);
    }
}
