package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class yra {
    public static final c Companion = new c();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new ym0(11));

    @o7e
    public static final class a extends yra {
        public static final a INSTANCE = new a();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new cn0(15));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1713190913;
        }

        public final KSerializer<a> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "CANCELLED";
        }
    }

    @o7e
    public static final class b extends yra {
        public static final b INSTANCE = new b();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new oz0(13));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -166329093;
        }

        public final KSerializer<b> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "COMPLETED";
        }
    }

    public static final class c {
        public final KSerializer<yra> serializer() {
            return (KSerializer) yra.a.getValue();
        }
    }
}
