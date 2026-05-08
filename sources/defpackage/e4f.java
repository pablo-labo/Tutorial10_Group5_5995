package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class e4f extends l3f {
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> g = boa.E(qt8.b, new k7(19));
    public final String e;
    public final String f;

    public static final class a {
        public final KSerializer<e4f> serializer() {
            return (KSerializer) e4f.g.getValue();
        }
    }

    public /* synthetic */ e4f(int i, String str, Boolean bool, String str2, String str3, String str4) {
        super(i, bool, str, str2);
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public e4f() {
    }
}
