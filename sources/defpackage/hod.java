package defpackage;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class hod {

    @AutoValue
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            a = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            b = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
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

    public abstract b82 a();

    public final long b(jnb jnbVar, long j, int i) {
        long time = j - a().getTime();
        a aVar = c().get(jnbVar);
        long jA = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) r12)))), time), aVar.c());
    }

    public abstract Map<jnb, a> c();
}
