package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    @Override // androidx.media3.exoplayer.upstream.b
    public final long a(b.c cVar) {
        Throwable cause = cVar.a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((cVar.b - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final int b(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final b.C0051b c(b.a aVar, b.c cVar) {
        IOException iOException = cVar.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (aVar.a(1)) {
            return new b.C0051b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new b.C0051b(2, 60000L);
        }
        return null;
    }
}
