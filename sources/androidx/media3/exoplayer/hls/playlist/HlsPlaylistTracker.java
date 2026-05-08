package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.b;
import defpackage.wi6;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
        boolean a(Uri uri, b.c cVar, boolean z);

        void b();
    }

    default void a(Uri uri) {
    }

    void b(Uri uri);

    void c(wi6 wi6Var);

    long d();

    c e();

    void f(Uri uri);

    b h(boolean z, Uri uri);

    boolean i(Uri uri);

    void j(wi6 wi6Var);

    boolean k();

    boolean l(Uri uri, long j);
}
