package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionPool;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionPool {
    public final RealConnectionPool a;

    public ConnectionPool() {
        TimeUnit.MINUTES.getClass();
        this.a = new RealConnectionPool(TaskRunner.i);
    }
}
