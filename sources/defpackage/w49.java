package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class w49 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final w49 b;
    public static final w49 c;
    public static final /* synthetic */ w49[] d;

    public static final class a {
        public final KSerializer<w49> serializer() {
            return (KSerializer) w49.a.getValue();
        }
    }

    static {
        w49 w49Var = new w49("SUCCESS", 0);
        b = w49Var;
        w49 w49Var2 = new w49("CANCEL", 1);
        c = w49Var2;
        d = new w49[]{w49Var, w49Var2};
        Companion = new a();
        a = boa.E(qt8.b, new fc2(7));
    }

    public w49() {
        throw null;
    }

    public static w49 valueOf(String str) {
        return (w49) Enum.valueOf(w49.class, str);
    }

    public static w49[] values() {
        return (w49[]) d.clone();
    }
}
