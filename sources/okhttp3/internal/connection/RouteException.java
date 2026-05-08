package okhttp3.internal.connection;

import defpackage.boa;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "Ljava/io/IOException;", "b", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void a(IOException iOException) {
        boa.h(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
