package defpackage;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import defpackage.e25;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i25 {

    public static class a {
        public static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long j, int i) {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    public static class b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void c(e25.b bVar, e25.c cVar, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = bVar.read(bArr, 0, iMin);
            if (i2 != iMin) {
                r40.h("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= i2;
                cVar.write(bArr, 0, i2);
            }
        }
    }

    public static void d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
