package expo.modules.kotlin.exception;

import defpackage.l6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/exception/FunctionCallException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FunctionCallException extends DecoratedException {
    public FunctionCallException(String str, String str2, CodedException codedException) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("Call to function '");
        sb.append(str2);
        sb.append(".");
        super(l6.i(sb, str, "' has been rejected."), codedException);
    }
}
