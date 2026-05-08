package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class cs0 {

    /* JADX INFO: Fake field, exist only in values array */
    cs0 EF5;
    public static final /* synthetic */ cs0[] b = {new cs0("conversationMenu", 0), new cs0("conversationListSwipe", 1)};
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new zr0(0));

    public static final class a {
        public final KSerializer<cs0> serializer() {
            return (KSerializer) cs0.a.getValue();
        }
    }

    public cs0() {
        throw null;
    }

    public static cs0 valueOf(String str) {
        return (cs0) Enum.valueOf(cs0.class, str);
    }

    public static cs0[] values() {
        return (cs0[]) b.clone();
    }
}
