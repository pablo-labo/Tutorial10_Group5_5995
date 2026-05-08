package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.video.c;
import defpackage.b83;
import defpackage.u79;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public static final class a {
        public final d a;
        public final MediaFormat b;
        public final androidx.media3.common.a c;
        public final Surface d;
        public final MediaCrypto e;
        public final u79 f;

        public a(d dVar, MediaFormat mediaFormat, androidx.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto, u79 u79Var) {
            this.a = dVar;
            this.b = mediaFormat;
            this.c = aVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = u79Var;
        }
    }

    public interface b {
        c a(a aVar);
    }

    void a(int i, b83 b83Var, long j, int i2);

    void b(int i, int i2, int i3, long j);

    void c(c.e eVar, Handler handler);

    void d();

    void e(int i);

    void f(Surface surface);

    void flush();

    void g(int i);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i, long j);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    default boolean k(MediaCodecRenderer.b bVar) {
        return false;
    }

    void release();

    void setParameters(Bundle bundle);
}
