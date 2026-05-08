package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeRuntimeError extends IllegalStateException {
    private final String message;

    public ComposeRuntimeError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
