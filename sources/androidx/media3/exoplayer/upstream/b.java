package androidx.media3.exoplayer.upstream;

import defpackage.ka2;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean a(int i) {
            if (i == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
            } else if (this.c - this.d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    public static final class C0051b {
        public final int a;
        public final long b;

        public C0051b(int i, long j) {
            ka2.l(j >= 0);
            this.a = i;
            this.b = j;
        }
    }

    public static final class c {
        public final IOException a;
        public final int b;

        public c(IOException iOException, int i) {
            this.a = iOException;
            this.b = i;
        }
    }

    long a(c cVar);

    int b(int i);

    C0051b c(a aVar, c cVar);
}
