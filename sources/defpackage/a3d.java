package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class a3d {
    public static final a3d INSTANCE = new a3d();
    public static final /* synthetic */ Lazy<KSerializer<Object>> a = boa.E(qt8.b, new j7(14));

    public final KSerializer<a3d> serializer() {
        return (KSerializer) a.getValue();
    }
}
