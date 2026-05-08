package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class eki implements Closeable {
    public final URL a;
    public Task<Bitmap> b;
    public volatile InputStream c;

    public eki(URL url) {
        this.a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            InputStream inputStream = this.c;
            Logger logger = bdi.a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    try {
                        bdi.a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                }
            }
        } catch (NullPointerException e3) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e3);
        }
    }
}
