package expo.modules.kotlin.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/exception/UnexpectedException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnexpectedException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnexpectedException(Throwable th) {
        super(th.toString(), th);
        th.getClass();
    }
}
