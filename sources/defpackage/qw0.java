package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class qw0 {
    public static final qw0 INSTANCE = new qw0();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new n7(1));

    public final KSerializer<qw0> serializer() {
        return (KSerializer) a.getValue();
    }
}
