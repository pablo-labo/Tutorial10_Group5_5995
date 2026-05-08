package expo.modules.kotlin.exception;

import com.facebook.react.bridge.ReadableType;
import defpackage.yd8;
import defpackage.zf8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/exception/CollectionElementCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CollectionElementCastException extends DecoratedException {
    public CollectionElementCastException(zf8 zf8Var, zf8 zf8Var2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + zf8Var2 + "' required by the collection of type: '" + zf8Var + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(zf8 zf8Var, zf8 zf8Var2, ReadableType readableType, CodedException codedException) {
        this(zf8Var, zf8Var2, readableType.name(), codedException);
        zf8Var.getClass();
        zf8Var2.getClass();
        readableType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(zf8 zf8Var, zf8 zf8Var2, yd8<?> yd8Var, CodedException codedException) {
        this(zf8Var, zf8Var2, yd8Var.toString(), codedException);
        zf8Var.getClass();
        zf8Var2.getClass();
        yd8Var.getClass();
    }
}
