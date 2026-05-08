package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class wp4 implements vp4 {
    public File a;
    public FileInputStream b;
    public FileChannel c;

    @Override // defpackage.vp4
    public final int H0(long j, ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.c.write(byteBuffer);
    }
}
