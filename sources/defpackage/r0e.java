package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class r0e {
    public static final r0e INSTANCE = new r0e();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new bo0(21));

    public final KSerializer<r0e> serializer() {
        return (KSerializer) a.getValue();
    }
}
