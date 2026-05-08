package okhttp3.internal.http2;

import defpackage.k20;
import defpackage.kmf;
import defpackage.p6;
import defpackage.pne;
import defpackage.pyd;
import defpackage.r40;
import defpackage.to1;
import defpackage.uqc;
import defpackage.vr1;
import defpackage.z92;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Reader implements Closeable {
    public static final Companion d = new Companion(0);
    public static final Logger e;
    public final to1 a;
    public final ContinuationSource b;
    public final Hpack.Reader c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lpne;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContinuationSource implements pne {
        public final to1 a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public ContinuationSource(to1 to1Var) {
            to1Var.getClass();
            this.a = to1Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // defpackage.pne
        public final long f1(zn1 zn1Var, long j) throws IOException {
            int i;
            int i2;
            zn1Var.getClass();
            do {
                int i3 = this.e;
                to1 to1Var = this.a;
                if (i3 == 0) {
                    to1Var.skip(this.f);
                    this.f = 0;
                    if ((this.c & 4) == 0) {
                        i = this.d;
                        int iS = Util.s(to1Var);
                        this.e = iS;
                        this.b = iS;
                        int i4 = to1Var.readByte() & 255;
                        this.c = to1Var.readByte() & 255;
                        Http2Reader.d.getClass();
                        Logger logger = Http2Reader.e;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.a;
                            int i5 = this.d;
                            int i6 = this.b;
                            int i7 = this.c;
                            http2.getClass();
                            logger.fine(Http2.a(i5, i6, i4, true, i7));
                        }
                        i2 = to1Var.readInt() & Integer.MAX_VALUE;
                        this.d = i2;
                        if (i4 != 9) {
                            throw new IOException(i4 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long jF1 = to1Var.f1(zn1Var, Math.min(j, i3));
                    if (jF1 != -1) {
                        this.e -= (int) jF1;
                        return jF1;
                    }
                }
                return -1L;
            } while (i2 == i);
            r40.h("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // defpackage.pne
        public final kmf g() {
            return this.a.g();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        logger.getClass();
        e = logger;
    }

    public Http2Reader(uqc uqcVar) {
        uqcVar.getClass();
        this.a = uqcVar;
        ContinuationSource continuationSource = new ContinuationSource(uqcVar);
        this.b = continuationSource;
        this.c = new Hpack.Reader(continuationSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0215, code lost:
    
        defpackage.r40.h(defpackage.p6.c(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r19, final okhttp3.internal.http2.Http2Connection.ReaderRunnable r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.a(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final List<Header> h(int i, int i2, int i3, int i4) throws IOException {
        ContinuationSource continuationSource = this.b;
        continuationSource.e = i;
        continuationSource.b = i;
        continuationSource.f = i2;
        continuationSource.c = i3;
        continuationSource.d = i4;
        Hpack.Reader reader = this.c;
        uqc uqcVar = reader.c;
        ArrayList arrayList = reader.b;
        while (!uqcVar.W0()) {
            byte b = uqcVar.readByte();
            byte[] bArr = Util.a;
            int i5 = b & 255;
            if (i5 == 128) {
                r40.h("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = reader.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    Hpack hpack = Hpack.a;
                    hpack.getClass();
                    Header[] headerArr = Hpack.b;
                    if (i6 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i6]);
                    }
                }
                Hpack.a.getClass();
                int length = reader.e + 1 + (i6 - Hpack.b.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.d;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        header.getClass();
                        arrayList.add(header);
                    }
                }
                r40.h(p6.c(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                Hpack hpack2 = Hpack.a;
                vr1 vr1VarD = reader.d();
                hpack2.getClass();
                Hpack.a(vr1VarD);
                reader.c(new Header(vr1VarD, reader.d()));
            } else if ((b & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i5, 63) - 1), reader.d()));
            } else if ((b & 32) == 32) {
                int iE2 = reader.e(i5, 31);
                reader.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.a);
                }
                int i7 = reader.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        Header[] headerArr3 = reader.d;
                        pyd.q(null, 0, headerArr3, headerArr3.length);
                        reader.e = reader.d.length - 1;
                        reader.f = 0;
                        reader.g = 0;
                    } else {
                        reader.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Hpack hpack3 = Hpack.a;
                vr1 vr1VarD2 = reader.d();
                hpack3.getClass();
                Hpack.a(vr1VarD2);
                arrayList.add(new Header(vr1VarD2, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i5, 15) - 1), reader.d()));
            }
        }
        List<Header> listZ1 = z92.z1(arrayList);
        arrayList.clear();
        return listZ1;
    }

    public final void p(Http2Connection.ReaderRunnable readerRunnable, int i) {
        to1 to1Var = this.a;
        to1Var.readInt();
        to1Var.readByte();
        byte[] bArr = Util.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            r40.h(k20.l("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
            return 0;
        }

        private Companion() {
        }
    }
}
