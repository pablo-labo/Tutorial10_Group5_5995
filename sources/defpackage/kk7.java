package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class kk7 {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final kk7 b;
    public static final kk7 c;
    public static final /* synthetic */ kk7[] d;

    public static final class a {
        public final KSerializer<kk7> serializer() {
            return (KSerializer) kk7.a.getValue();
        }
    }

    static {
        kk7 kk7Var = new kk7("SUCCESS", 0);
        b = kk7Var;
        kk7 kk7Var2 = new kk7("CANCEL", 1);
        c = kk7Var2;
        d = new kk7[]{kk7Var, kk7Var2};
        Companion = new a();
        a = boa.E(qt8.b, new jr(13));
    }

    public kk7() {
        throw null;
    }

    public static kk7 valueOf(String str) {
        return (kk7) Enum.valueOf(kk7.class, str);
    }

    public static kk7[] values() {
        return (kk7[]) d.clone();
    }
}
