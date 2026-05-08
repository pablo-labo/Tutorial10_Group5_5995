package okhttp3;

import defpackage.kmf;
import defpackage.pne;
import defpackage.pva;
import defpackage.r6;
import defpackage.vr1;
import defpackage.zn1;
import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lpne;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PartSource implements pne {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // defpackage.pne
        public final long f1(zn1 zn1Var, long j) {
            zn1Var.getClass();
            if (j >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(r6.c(j, "byteCount < 0: ").toString());
        }

        @Override // defpackage.pne
        public final kmf g() {
            return null;
        }
    }

    static {
        new Companion(0);
        vr1 vr1Var = vr1.c;
        pva.a.b(vr1.a.c("\r\n"), vr1.a.c("--"), vr1.a.c(" "), vr1.a.c("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
