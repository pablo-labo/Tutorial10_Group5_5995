package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.video.c;
import defpackage.b83;
import defpackage.u79;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {
    public final MediaCodec a;
    public final u79 b;

    public static class a implements c.b {
        public static MediaCodec b(c.a aVar) throws IOException {
            String str = aVar.a.a;
            Trace.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        @Override // androidx.media3.exoplayer.mediacodec.c.b
        @android.annotation.SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.media3.exoplayer.mediacodec.c a(androidx.media3.exoplayer.mediacodec.c.a r5) throws java.lang.Throwable {
            /*
                r4 = this;
                r4 = 0
                android.media.MediaCodec r4 = b(r5)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                java.lang.String r0 = "configureCodec"
                android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.view.Surface r0 = r5.d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                if (r0 != 0) goto L21
                androidx.media3.exoplayer.mediacodec.d r1 = r5.a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                boolean r1 = r1.h     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                if (r1 == 0) goto L21
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r2 = 35
                if (r1 < r2) goto L21
                r1 = 8
                goto L22
            L1d:
                r5 = move-exception
                goto L3f
            L1f:
                r5 = move-exception
                goto L3f
            L21:
                r1 = 0
            L22:
                android.media.MediaFormat r2 = r5.b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.media.MediaCrypto r3 = r5.e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r4.configure(r2, r0, r3, r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                java.lang.String r0 = "startCodec"
                android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r4.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                androidx.media3.exoplayer.mediacodec.g r0 = new androidx.media3.exoplayer.mediacodec.g     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                u79 r5 = r5.f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r0.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                return r0
            L3f:
                if (r4 == 0) goto L44
                r4.release()
            L44:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.g.a.a(androidx.media3.exoplayer.mediacodec.c$a):androidx.media3.exoplayer.mediacodec.c");
        }
    }

    public g(MediaCodec mediaCodec, u79 u79Var) {
        this.a = mediaCodec;
        this.b = u79Var;
        if (Build.VERSION.SDK_INT < 35 || u79Var == null) {
            return;
        }
        u79Var.a(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i, b83 b83Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, b83Var.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(final c.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: h2f
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                c.e eVar2 = eVar;
                Handler handler2 = eVar2.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d() {
        this.a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void e(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void f(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void g(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int i() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        u79 u79Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && u79Var != null) {
                u79Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && u79Var != null) {
                u79Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
