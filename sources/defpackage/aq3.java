package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class aq3 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final aq3 b;
    public static final /* synthetic */ aq3[] c;

    public static final class a {
        public final KSerializer<aq3> serializer() {
            return (KSerializer) aq3.a.getValue();
        }
    }

    static {
        aq3 aq3Var = new aq3("CLOSED", 0);
        b = aq3Var;
        c = new aq3[]{aq3Var};
        Companion = new a();
        a = boa.E(qt8.b, new vz0(2));
    }

    public aq3() {
        throw null;
    }

    public static aq3 valueOf(String str) {
        return (aq3) Enum.valueOf(aq3.class, str);
    }

    public static aq3[] values() {
        return (aq3[]) c.clone();
    }
}
