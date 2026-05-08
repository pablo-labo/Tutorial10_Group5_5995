package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class xp4 implements Closeable {
    public final FileChannel a;

    public xp4(File file) {
        if (file.exists()) {
            this.a = new FileInputStream(file).getChannel();
        } else {
            l5.q("File is null or does not exist");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp4.a():java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void h(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.a.read(byteBuffer, j + j2);
            if (i2 == -1) {
                k20.n();
                return;
            }
            j2 += (long) i2;
        }
        byteBuffer.position(0);
    }

    public final int p(long j, ByteBuffer byteBuffer) throws IOException {
        h(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    public final long s(long j, ByteBuffer byteBuffer) throws IOException {
        h(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
