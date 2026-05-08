package expo.modules.kotlin.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/exception/PromiseAlreadySettledException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromiseAlreadySettledException extends CodedException {
    public PromiseAlreadySettledException() {
        super("Promise passed to 'unknown' was already settled. It will lead to a crash in the production environment!", null);
    }
}
