package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class uv2 {
    public static final uv2 INSTANCE = new uv2();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new vm1(2));

    public final KSerializer<uv2> serializer() {
        return (KSerializer) a.getValue();
    }
}
