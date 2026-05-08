package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.Route;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExchangeFinder {
    public final RealConnectionPool a;
    public final Address b;
    public final RealCall c;
    public final EventListener d;
    public RouteSelector.Selection e;
    public RouteSelector f;
    public int g;
    public int h;
    public int i;
    public Route j;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        realConnectionPool.getClass();
        eventListener.getClass();
        this.a = realConnectionPool;
        this.b = address;
        this.c = realCall;
        this.d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection a(int r15, int r16, int r17, boolean r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.a(int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
