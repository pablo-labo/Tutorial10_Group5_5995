package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class qgd<T> {
    public final KSerializer<T> a;
    public final String b;
    public String c = "";
    public String d = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("PATH", 0);
            a = aVar;
            a aVar2 = new a("QUERY", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public qgd(KSerializer<T> kSerializer) {
        this.a = kSerializer;
        this.b = kSerializer.getDescriptor().i();
    }

    public final void a(String str, String str2) {
        this.d += (this.d.length() == 0 ? CoreFeature.DEFAULT_APP_VERSION : "&") + str + '=' + str2;
    }
}
