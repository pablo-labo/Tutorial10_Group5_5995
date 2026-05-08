package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class p7 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final p7 b;
    public static final p7 c;
    public static final p7 d;
    public static final /* synthetic */ p7[] e;

    public static final class a {
        public final KSerializer<p7> serializer() {
            return (KSerializer) p7.a.getValue();
        }
    }

    static {
        p7 p7Var = new p7("SELECT", 0);
        b = p7Var;
        p7 p7Var2 = new p7("ARCHIVE", 1);
        c = p7Var2;
        p7 p7Var3 = new p7("UNARCHIVE", 2);
        d = p7Var3;
        e = new p7[]{p7Var, p7Var2, p7Var3};
        Companion = new a();
        a = boa.E(qt8.b, new o7(0));
    }

    public p7() {
        throw null;
    }

    public static p7 valueOf(String str) {
        return (p7) Enum.valueOf(p7.class, str);
    }

    public static p7[] values() {
        return (p7[]) e.clone();
    }
}
