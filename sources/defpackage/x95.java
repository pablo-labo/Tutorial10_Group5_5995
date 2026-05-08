package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public final class x95 implements Closeable {
    public final FileOutputStream a;
    public final FileLock b;

    public x95(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.a = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.b = fileLockLock;
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.a;
        try {
            FileLock fileLock = this.b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            fileOutputStream.close();
        }
    }
}
