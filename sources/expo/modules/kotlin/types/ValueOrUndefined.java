package expo.modules.kotlin.types;

import defpackage.v40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/types/ValueOrUndefined;", "T", "", "c", "b", "a", "Lexpo/modules/kotlin/types/ValueOrUndefined$b;", "Lexpo/modules/kotlin/types/ValueOrUndefined$c;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ValueOrUndefined<T> {

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final Object getUndefined() {
            return b.a;
        }
    }

    public static final class b implements ValueOrUndefined {
        public static final b a = new b();
    }

    public static final class c<T> implements ValueOrUndefined<T> {
        public final T a;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return v40.e(this.a, "Value(value=", ")");
        }
    }

    static Object getUndefined() {
        return a.a.getUndefined();
    }
}
