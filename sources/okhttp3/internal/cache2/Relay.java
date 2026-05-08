package okhttp3.internal.cache2;

import defpackage.kmf;
import defpackage.pne;
import defpackage.vr1;
import defpackage.zn1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Relay {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lpne;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RelaySource implements pne {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // defpackage.pne
        public final long f1(zn1 zn1Var, long j) {
            zn1Var.getClass();
            throw new IllegalStateException("Check failed.");
        }

        @Override // defpackage.pne
        public final kmf g() {
            return null;
        }
    }

    static {
        new Companion(0);
        vr1 vr1Var = vr1.c;
        vr1.a.c("OkHttp cache v1\n");
        vr1.a.c("OkHttp DIRTY :(\n");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "<init>", "()V", "", "FILE_HEADER_SIZE", "J", "Lvr1;", "PREFIX_CLEAN", "Lvr1;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
