package androidx.media3.datasource;

import defpackage.gf3;
import defpackage.jh2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final gf3 dataSpec;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, gf3 gf3Var, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.dataSpec = gf3Var;
        this.type = i2;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, gf3 gf3Var, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !jh2.I(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, gf3Var, 2007) : new HttpDataSource$HttpDataSourceException(iOException, gf3Var, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, gf3 gf3Var, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.dataSpec = gf3Var;
        this.type = 1;
    }

    public HttpDataSource$HttpDataSourceException(gf3 gf3Var, int i) {
        super(i == 2000 ? 2001 : i);
        this.dataSpec = gf3Var;
        this.type = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, gf3 gf3Var, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = gf3Var;
        this.type = 1;
    }
}
