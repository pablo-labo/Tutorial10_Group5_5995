package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s9d {

    public static final class a extends s9d {
        public static final a a = new a();
    }

    public static final class b extends s9d {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("ResumeCollection(resumeId=", this.a, ")");
        }
    }
}
