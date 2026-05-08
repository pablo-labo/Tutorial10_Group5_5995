package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.u31;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class lnf {

    @AutoValue.Builder
    public static abstract class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("OK", 0);
            a = bVar;
            b bVar2 = new b("BAD_CONFIG", 1);
            b = bVar2;
            b bVar3 = new b("AUTH_ERROR", 2);
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

    public static u31.a a() {
        u31.a aVar = new u31.a();
        aVar.b = 0L;
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
