package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class q7 {

    /* JADX INFO: Fake field, exist only in values array */
    q7 EF5;
    public static final /* synthetic */ q7[] b = {new q7("SELECT", 0), new q7("ARCHIVE", 1), new q7("UNARCHIVE", 2)};
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new n7(0));

    public static final class a {
        public final KSerializer<q7> serializer() {
            return (KSerializer) q7.a.getValue();
        }
    }

    public q7() {
        throw null;
    }

    public static q7 valueOf(String str) {
        return (q7) Enum.valueOf(q7.class, str);
    }

    public static q7[] values() {
        return (q7[]) b.clone();
    }
}
