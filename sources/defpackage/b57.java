package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class b57 {
    public static final b57 INSTANCE = new b57();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new pl0(3));

    public final KSerializer<b57> serializer() {
        return (KSerializer) a.getValue();
    }
}
