package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.video.c;
import defpackage.gie;
import defpackage.rng;
import defpackage.tog;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {
        public final androidx.media3.common.a format;

        public VideoSinkException(Exception exc, androidx.media3.common.a aVar) {
            super(exc);
            this.format = aVar;
        }
    }

    public interface a {
        public static final C0052a a = new C0052a();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        public class C0052a implements a {
        }

        default void a(tog togVar) {
        }

        default void b() {
        }

        default void f() {
        }

        default void onFirstFrameRendered() {
        }
    }

    public interface b {
        void a(long j);

        void b();
    }

    void b();

    boolean c();

    boolean d();

    Surface e();

    void g(long j);

    void h(float f);

    void i(long j, long j2);

    void j();

    void k(androidx.media3.common.a aVar, long j, int i, List list);

    void l(List<Object> list);

    boolean m(boolean z);

    void n(Surface surface, gie gieVar);

    boolean o(androidx.media3.common.a aVar);

    void p();

    boolean q(long j, c.a aVar);

    void r();

    void release();

    void s(androidx.media3.exoplayer.video.b bVar);

    void t();

    void u(int i);

    void v();

    void w(boolean z);

    void x(boolean z);

    void y(rng rngVar);
}
