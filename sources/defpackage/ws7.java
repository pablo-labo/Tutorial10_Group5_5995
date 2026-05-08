package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ws7 {
    public final Set<a> a;
    public final Set<c> b;
    public final Set<b> c;

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
            a aVar = new a("MONDAY_TO_FRIDAY", 0);
            a = aVar;
            a aVar2 = new a("WEEKENDS_AS_NEEDED", 1);
            b = aVar2;
            a aVar3 = new a("WEEKENDS_ONLY", 2);
            c = aVar3;
            a aVar4 = new a("NO_WEEKENDS", 3);
            d = aVar4;
            a aVar5 = new a("HOLIDAYS", 4);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("ON_CALL", 0);
            a = bVar;
            b bVar2 = new b("CHOOSE_YOUR_OWN_HOURS", 1);
            b = bVar2;
            b bVar3 = new b("OVERTIME", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c V;
        public static final c W;
        public static final c X;
        public static final c Y;
        public static final /* synthetic */ c[] Z;
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;

        static {
            c cVar = new c("FOUR_HOUR_SHIFT", 0);
            a = cVar;
            c cVar2 = new c("EIGHT_HOUR_SHIFT", 1);
            b = cVar2;
            c cVar3 = new c("TEN_HOUR_SHIFT", 2);
            c = cVar3;
            c cVar4 = new c("TWELVE_HOUR_SHIFT", 3);
            d = cVar4;
            c cVar5 = new c("DAY_SHIFT", 4);
            e = cVar5;
            c cVar6 = new c("NIGHT_SHIFT", 5);
            f = cVar6;
            c cVar7 = new c("EVENING_SHIFT", 6);
            V = cVar7;
            c cVar8 = new c("NO_NIGHTS", 7);
            W = cVar8;
            c cVar9 = new c("OVERNIGHT_SHIFT", 8);
            X = cVar9;
            c cVar10 = new c("AFTER_SCHOOL", 9);
            Y = cVar10;
            Z = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) Z.clone();
        }
    }

    public ws7(Set set, LinkedHashSet linkedHashSet, Set set2) {
        this.a = set;
        this.b = linkedHashSet;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws7)) {
            return false;
        }
        ws7 ws7Var = (ws7) obj;
        return wl7.b(this.a, ws7Var.a) && wl7.b(this.b, ws7Var.b) && wl7.b(this.c, ws7Var.c);
    }

    public final int hashCode() {
        Set<a> set = this.a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<c> set2 = this.b;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set<b> set3 = this.c;
        return iHashCode2 + (set3 != null ? set3.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileWorkSchedule(days=" + this.a + ", shifts=" + this.b + ", schedules=" + this.c + ")";
    }

    public ws7() {
        this(null, null, null);
    }
}
