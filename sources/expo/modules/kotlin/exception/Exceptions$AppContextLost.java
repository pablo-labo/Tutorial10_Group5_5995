package expo.modules.kotlin.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"expo/modules/kotlin/exception/Exceptions$AppContextLost", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Exceptions$AppContextLost extends CodedException {
    public Exceptions$AppContextLost() {
        super("The app context has been lost", null);
    }
}
