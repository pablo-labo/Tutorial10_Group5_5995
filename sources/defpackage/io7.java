package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class io7 {

    /* JADX INFO: Fake field, exist only in values array */
    io7 EF5;
    public static final /* synthetic */ io7[] b = {new io7("CONVERSATIONS", 0), new io7("MESSAGES", 1)};
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new o7(5));

    public static final class a {
        public final KSerializer<io7> serializer() {
            return (KSerializer) io7.a.getValue();
        }
    }

    public io7() {
        throw null;
    }

    public static io7 valueOf(String str) {
        return (io7) Enum.valueOf(io7.class, str);
    }

    public static io7[] values() {
        return (io7[]) b.clone();
    }
}
