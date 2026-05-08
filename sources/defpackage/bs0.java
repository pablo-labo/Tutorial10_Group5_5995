package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class bs0 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final bs0 b;
    public static final bs0 c;
    public static final /* synthetic */ bs0[] d;

    public static final class a {
        public final KSerializer<bs0> serializer() {
            return (KSerializer) bs0.a.getValue();
        }
    }

    static {
        bs0 bs0Var = new bs0("conversationMenu", 0);
        b = bs0Var;
        bs0 bs0Var2 = new bs0("conversationListSwipe", 1);
        c = bs0Var2;
        d = new bs0[]{bs0Var, bs0Var2};
        Companion = new a();
        a = boa.E(qt8.b, new as0(0));
    }

    public bs0() {
        throw null;
    }

    public static bs0 valueOf(String str) {
        return (bs0) Enum.valueOf(bs0.class, str);
    }

    public static bs0[] values() {
        return (bs0[]) d.clone();
    }
}
