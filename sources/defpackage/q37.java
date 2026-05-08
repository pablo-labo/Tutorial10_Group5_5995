package defpackage;

import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q37 {
    public final HashMap<b, WeakReference<a>> a = new HashMap<>();

    public static final class a {
        public final p37 a;
        public final int b;

        public a(p37 p37Var, int i) {
            this.a = p37Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.a);
            sb.append(", configFlags=");
            return k6.h(sb, this.b, ')');
        }
    }

    public static final class b {
        public final Resources.Theme a;
        public final int b;

        public b(Resources.Theme theme, int i) {
            this.a = theme;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.a);
            sb.append(", id=");
            return k6.h(sb, this.b, ')');
        }
    }
}
