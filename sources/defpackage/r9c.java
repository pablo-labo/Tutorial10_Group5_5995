package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class r9c implements Closeable {
    public static final Logger V = Logger.getLogger(r9c.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public b d;
    public b e;
    public final byte[] f;

    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // r9c.d
        public final void a(c cVar, int i) {
            boolean z = this.a;
            StringBuilder sb = this.b;
            if (z) {
                this.a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return w20.k(sb, this.b, "]");
        }
    }

    public interface d {
        void a(c cVar, int i);
    }

    public r9c(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    f0(i, bArr2, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    r40.h("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iG = G(0, bArr);
        this.b = iG;
        if (iG <= randomAccessFile2.length()) {
            this.c = G(4, bArr);
            int iG2 = G(8, bArr);
            int iG3 = G(12, bArr);
            this.d = v(iG2);
            this.e = v(iG3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int G(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void f0(int i, byte[] bArr, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void N() {
        if (s()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                d0(4096, 0, 0, 0);
                this.c = 0;
                b bVar = b.c;
                this.d = bVar;
                this.e = bVar;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            b bVar2 = this.d;
            int iB0 = b0(bVar2.a + 4 + bVar2.b);
            P(iB0, 0, 4, this.f);
            int iG = G(0, this.f);
            d0(this.b, this.c - 1, iB0, this.e.a);
            this.c--;
            this.d = new b(iB0, iG);
        }
    }

    public final void P(int i, int i2, int i3, byte[] bArr) throws IOException {
        int iB0 = b0(i);
        int i4 = iB0 + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iB0);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iB0;
        randomAccessFile.seek(iB0);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void Q(int i, byte[] bArr, int i2) throws IOException {
        int iB0 = b0(i);
        int i3 = iB0 + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(iB0);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iB0;
        randomAccessFile.seek(iB0);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int W() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i = bVar.a;
        int i2 = this.d.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.b) - i2;
    }

    public final void a(byte[] bArr) {
        int iB0;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    h(length);
                    boolean zS = s();
                    if (zS) {
                        iB0 = 16;
                    } else {
                        b bVar = this.e;
                        iB0 = b0(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(iB0, length);
                    f0(0, this.f, length);
                    Q(iB0, this.f, 4);
                    Q(iB0 + 4, bArr, length);
                    d0(this.b, this.c + 1, zS ? iB0 : this.d.a, iB0);
                    this.e = bVar2;
                    this.c++;
                    if (zS) {
                        this.d = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final int b0(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final void d0(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                f0(i6, bArr, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final void h(int i) throws IOException {
        int i2 = i + 4;
        int iW = this.b - W();
        if (iW >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iW += i3;
            i3 <<= 1;
        } while (iW < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        b bVar = this.e;
        int iB0 = b0(bVar.a + 4 + bVar.b);
        if (iB0 < this.d.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iB0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                g7.l("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.a;
        int i5 = this.d.a;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            d0(i3, this.c, i5, i6);
            this.e = new b(i6, this.e.b);
        } else {
            d0(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    public final synchronized void p(d dVar) {
        int iB0 = this.d.a;
        for (int i = 0; i < this.c; i++) {
            b bVarV = v(iB0);
            dVar.a(new c(bVarV), bVarV.b);
            iB0 = b0(bVarV.a + 4 + bVarV.b);
        }
    }

    public final synchronized boolean s() {
        return this.c == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r9c.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            p(new a(sb));
        } catch (IOException e) {
            V.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final b v(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new b(i, randomAccessFile.readInt());
    }

    public final class c extends InputStream {
        public int a;
        public int b;

        public c(b bVar) {
            this.a = r9c.this.b0(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                ja.k("buffer");
                return 0;
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.a;
            r9c r9cVar = r9c.this;
            r9cVar.P(i4, i, i2, bArr);
            this.a = r9cVar.b0(this.a + i2);
            this.b -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            r9c r9cVar = r9c.this;
            RandomAccessFile randomAccessFile = r9cVar.a;
            if (this.b == 0) {
                return -1;
            }
            randomAccessFile.seek(this.a);
            int i = randomAccessFile.read();
            this.a = r9cVar.b0(this.a + 1);
            this.b--;
            return i;
        }
    }
}
