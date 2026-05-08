package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ho7 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final ho7 b;
    public static final /* synthetic */ ho7[] c;

    public static final class a {
        public final KSerializer<ho7> serializer() {
            return (KSerializer) ho7.a.getValue();
        }
    }

    static {
        ho7 ho7Var = new ho7("CONVERSATIONS", 0);
        b = ho7Var;
        c = new ho7[]{ho7Var, new ho7("MESSAGES", 1)};
        Companion = new a();
        a = boa.E(qt8.b, new zw(9));
    }

    public ho7() {
        throw null;
    }

    public static ho7 valueOf(String str) {
        return (ho7) Enum.valueOf(ho7.class, str);
    }

    public static ho7[] values() {
        return (ho7[]) c.clone();
    }
}
