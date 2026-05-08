package kotlinx.serialization.json;

import defpackage.ib8;
import defpackage.o7e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = ib8.class)
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitive$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JsonPrimitive> serializer() {
            return ib8.a;
        }
    }

    public abstract String a();

    public abstract boolean b();

    public String toString() {
        return a();
    }
}
