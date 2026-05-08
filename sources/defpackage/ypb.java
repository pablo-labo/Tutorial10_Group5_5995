package defpackage;

import com.indeed.android.jobsearch.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ypb {
    public static final List<ypb> c = u63.a0(a.d, d.d, b.d, c.d, e.d);
    public final int a;
    public final String b;

    public static final class a extends ypb {
        public static final a d = new a(R.string.language_proficiency_option_beginner, "5VATV");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1087578403;
        }

        public final String toString() {
            return "Beginner";
        }
    }

    public static final class b extends ypb {
        public static final b d = new b(R.string.language_proficiency_option_expert, "CMXKE");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -158856389;
        }

        public final String toString() {
            return "Expert";
        }
    }

    public static final class c extends ypb {
        public static final c d = new c(R.string.language_proficiency_option_fluent, "3MBZ6");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -141160659;
        }

        public final String toString() {
            return "Fluent";
        }
    }

    public static final class d extends ypb {
        public static final d d = new d(R.string.language_proficiency_option_intermediate, "NAUAG");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1692470602;
        }

        public final String toString() {
            return "Intermediate";
        }
    }

    public static final class e extends ypb {
        public static final e d = new e(R.string.not_applicable, null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 382151841;
        }

        public final String toString() {
            return "NotApplicable";
        }
    }

    public ypb(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
