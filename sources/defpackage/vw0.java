package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class vw0 {
    public static final vw0 INSTANCE = new vw0();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new dp0(1));

    public final KSerializer<vw0> serializer() {
        return (KSerializer) a.getValue();
    }
}
