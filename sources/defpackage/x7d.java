package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface x7d {

    public static final class a implements x7d {
        public final Uri a;
        public final String b;

        public a(Uri uri, String str) {
            this.a = uri;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Image(uri=" + this.a + ", fileName=" + this.b + ")";
        }
    }

    public static final class b implements x7d {
        public final Uri a;
        public final String b;

        public b(Uri uri, String str) {
            this.a = uri;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Other(uri=" + this.a + ", fileName=" + this.b + ")";
        }
    }

    public static final class c implements x7d {
        public final Uri a;
        public final String b;

        public c(Uri uri, String str) {
            this.a = uri;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Pdf(uri=" + this.a + ", fileName=" + this.b + ")";
        }
    }
}
