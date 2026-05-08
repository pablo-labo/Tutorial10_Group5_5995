package okhttp3;

import defpackage.a32;
import defpackage.j6g;
import defpackage.r40;
import defpackage.r6;
import defpackage.to1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "BomAwareReader", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {
    public static final Companion b = new Companion(0);
    public BomAwareReader a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        public final to1 a;
        public final Charset b;
        public boolean c;
        public InputStreamReader d;

        public BomAwareReader(to1 to1Var, Charset charset) {
            to1Var.getClass();
            charset.getClass();
            this.a = to1Var;
            this.b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            j6g j6gVar;
            this.c = true;
            InputStreamReader inputStreamReader = this.d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                j6gVar = j6g.a;
            } else {
                j6gVar = null;
            }
            if (j6gVar == null) {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            cArr.getClass();
            if (this.c) {
                r40.h("Stream closed");
                return 0;
            }
            InputStreamReader inputStreamReader = this.d;
            if (inputStreamReader == null) {
                to1 to1Var = this.a;
                inputStreamReader = new InputStreamReader(to1Var.x(), Util.r(to1Var, this.b));
                this.d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public abstract to1 getE();

    public final InputStream a() {
        return getE().x();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.c(getE());
    }

    public final byte[] h() throws IOException {
        long jP = getD();
        if (jP > 2147483647L) {
            r40.h(r6.c(jP, "Cannot buffer entire body for content length: "));
            return null;
        }
        to1 to1VarK1 = getE();
        try {
            byte[] bArrS0 = to1VarK1.S0();
            to1VarK1.close();
            int length = bArrS0.length;
            if (jP == -1 || jP == length) {
                return bArrS0;
            }
            throw new IOException("Content-Length (" + jP + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract long getD();

    /* JADX INFO: renamed from: s */
    public abstract MediaType getC();

    public final String v() throws IOException {
        Charset charsetA;
        to1 to1VarK1 = getE();
        try {
            MediaType mediaTypeS = getC();
            if (mediaTypeS == null || (charsetA = mediaTypeS.a(a32.b)) == null) {
                charsetA = a32.b;
            }
            String strM1 = to1VarK1.m1(Util.r(to1VarK1, charsetA));
            to1VarK1.close();
            return strM1;
        } finally {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
