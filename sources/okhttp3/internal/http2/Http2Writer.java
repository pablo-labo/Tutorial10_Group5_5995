package okhttp3.internal.http2;

import defpackage.h5;
import defpackage.p6;
import defpackage.pyd;
import defpackage.ro1;
import defpackage.tqc;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Writer implements Closeable {
    public static final Logger f;
    public final ro1 a;
    public final zn1 b;
    public int c;
    public boolean d;
    public final Hpack.Writer e;

    static {
        new Companion(0);
        f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(tqc tqcVar) {
        tqcVar.getClass();
        this.a = tqcVar;
        zn1 zn1Var = new zn1();
        this.b = zn1Var;
        this.c = 16384;
        this.e = new Hpack.Writer(zn1Var);
    }

    public final synchronized void G(int i, int i2, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        p(0, 8, 6, z ? 1 : 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public final synchronized void N(int i, ErrorCode errorCode) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(i, 4, 3, 0);
        this.a.writeInt(errorCode.getHttpCode());
        this.a.flush();
    }

    public final synchronized void P(int i, long j) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        p(i, 4, 8, 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }

    public final synchronized void a(Settings settings) {
        try {
            settings.getClass();
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.c;
            int i2 = settings.a;
            if ((i2 & 32) != 0) {
                i = settings.b[5];
            }
            this.c = i;
            if (((i2 & 2) != 0 ? settings.b[1] : -1) != -1) {
                Hpack.Writer writer = this.e;
                int i3 = (i2 & 2) != 0 ? settings.b[1] : -1;
                writer.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = writer.d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        writer.b = Math.min(writer.b, iMin);
                    }
                    writer.c = true;
                    writer.d = iMin;
                    int i5 = writer.h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            Header[] headerArr = writer.e;
                            pyd.q(null, 0, headerArr, headerArr.length);
                            writer.f = writer.e.length - 1;
                            writer.g = 0;
                            writer.h = 0;
                        } else {
                            writer.a(i5 - iMin);
                        }
                    }
                }
            }
            p(0, 0, 4, 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void h(boolean z, int i, zn1 zn1Var, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        p(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            ro1 ro1Var = this.a;
            zn1Var.getClass();
            ro1Var.I1(zn1Var, i2);
        }
    }

    public final void p(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f;
        if (logger.isLoggable(level)) {
            Http2.a.getClass();
            logger.fine(Http2.a(i, i2, i3, false, i4));
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            h5.k(p6.c(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = Util.a;
        ro1 ro1Var = this.a;
        ro1Var.getClass();
        ro1Var.writeByte((i2 >>> 16) & 255);
        ro1Var.writeByte((i2 >>> 8) & 255);
        ro1Var.writeByte(i2 & 255);
        ro1Var.writeByte(i3 & 255);
        ro1Var.writeByte(i4 & 255);
        ro1Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void s(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        p(0, bArr.length + 8, 7, 0);
        this.a.writeInt(i);
        this.a.writeInt(errorCode.getHttpCode());
        if (bArr.length != 0) {
            this.a.write(bArr);
        }
        this.a.flush();
    }

    public final synchronized void v(int i, ArrayList arrayList, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j = this.b.b;
        long jMin = Math.min(this.c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        p(i, (int) jMin, 1, i2);
        this.a.I1(this.b, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.c, j2);
                j2 -= jMin2;
                p(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.a.I1(this.b, jMin2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
