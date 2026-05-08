package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class it7 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final it7 b;
    public static final it7 c;
    public static final /* synthetic */ it7[] d;

    public static final class a {
        public final KSerializer<it7> serializer() {
            return (KSerializer) it7.a.getValue();
        }
    }

    static {
        it7 it7Var = new it7("WHAT_MODE", 0);
        b = it7Var;
        it7 it7Var2 = new it7("WHERE_MODE", 1);
        c = it7Var2;
        d = new it7[]{it7Var, it7Var2};
        Companion = new a();
        a = boa.E(qt8.b, new pd1(15));
    }

    public it7() {
        throw null;
    }

    public static it7 valueOf(String str) {
        return (it7) Enum.valueOf(it7.class, str);
    }

    public static it7[] values() {
        return (it7[]) d.clone();
    }
}
