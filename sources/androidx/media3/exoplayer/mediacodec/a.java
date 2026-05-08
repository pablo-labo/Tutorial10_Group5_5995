package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.video.c;
import defpackage.b83;
import defpackage.cw0;
import defpackage.dw0;
import defpackage.ew0;
import defpackage.fw0;
import defpackage.h50;
import defpackage.ka2;
import defpackage.pg9;
import defpackage.u79;
import defpackage.vjg;
import defpackage.x42;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public final MediaCodec a;
    public final fw0 b;
    public final pg9 c;
    public final u79 d;
    public boolean e;
    public int f = 0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.a$a, reason: collision with other inner class name */
    public static final class C0049a implements c.b {
        public final cw0 a;
        public final dw0 b;

        public C0049a(cw0 cw0Var, dw0 dw0Var) {
            this.a = cw0Var;
            this.b = dw0Var;
        }

        @Override // androidx.media3.exoplayer.mediacodec.c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(c.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            a aVar2;
            String str = aVar.a.a;
            a aVar3 = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    aVar2 = new a(mediaCodecCreateByCodecName, (HandlerThread) this.a.get(), new ew0(mediaCodecCreateByCodecName, (HandlerThread) this.b.get()), aVar.f);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                Trace.endSection();
                Surface surface = aVar.d;
                a.l(aVar2, aVar.b, surface, aVar.e, (surface == null && aVar.a.h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                return aVar2;
            } catch (Exception e3) {
                e = e3;
                aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, pg9 pg9Var, u79 u79Var) {
        this.a = mediaCodec;
        this.b = new fw0(handlerThread);
        this.c = pg9Var;
        this.d = u79Var;
    }

    public static void l(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        u79 u79Var;
        fw0 fw0Var = aVar.b;
        MediaCodec mediaCodec = aVar.a;
        HandlerThread handlerThread = fw0Var.b;
        ka2.q(fw0Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fw0Var, handler);
        fw0Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        aVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (u79Var = aVar.d) != null) {
            u79Var.a(mediaCodec);
        }
        aVar.f = 1;
    }

    public static String m(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i, b83 b83Var, long j, int i2) {
        this.c.a(i, b83Var, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i, int i2, int i3, long j) {
        this.c.b(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(final c.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: bw0
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
        this.c.flush();
        this.a.flush();
        fw0 fw0Var = this.b;
        synchronized (fw0Var.a) {
            fw0Var.l++;
            Handler handler = fw0Var.c;
            String str = vjg.a;
            handler.post(new h50(fw0Var, 1));
        }
        this.a.start();
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
        MediaFormat mediaFormat;
        fw0 fw0Var = this.b;
        synchronized (fw0Var.a) {
            try {
                mediaFormat = fw0Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int i() {
        this.c.c();
        fw0 fw0Var = this.b;
        synchronized (fw0Var.a) {
            try {
                IllegalStateException illegalStateException = fw0Var.n;
                if (illegalStateException != null) {
                    fw0Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fw0Var.j;
                if (codecException != null) {
                    fw0Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fw0Var.k;
                if (cryptoException != null) {
                    fw0Var.k = null;
                    throw cryptoException;
                }
                boolean z = true;
                int iB = -1;
                if (fw0Var.l > 0 || fw0Var.m) {
                    return -1;
                }
                x42 x42Var = fw0Var.d;
                if (x42Var.b != x42Var.c) {
                    z = false;
                }
                if (!z) {
                    iB = x42Var.b();
                }
                return iB;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        fw0 fw0Var = this.b;
        synchronized (fw0Var.a) {
            try {
                IllegalStateException illegalStateException = fw0Var.n;
                if (illegalStateException != null) {
                    fw0Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fw0Var.j;
                if (codecException != null) {
                    fw0Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = fw0Var.k;
                if (cryptoException != null) {
                    fw0Var.k = null;
                    throw cryptoException;
                }
                boolean z = true;
                if (fw0Var.l > 0 || fw0Var.m) {
                    return -1;
                }
                x42 x42Var = fw0Var.e;
                if (x42Var.b != x42Var.c) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                int iB = x42Var.b();
                if (iB >= 0) {
                    ka2.r(fw0Var.h);
                    MediaCodec.BufferInfo bufferInfoRemove = fw0Var.f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iB == -2) {
                    fw0Var.h = fw0Var.g.remove();
                }
                return iB;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final boolean k(MediaCodecRenderer.b bVar) {
        fw0 fw0Var = this.b;
        synchronized (fw0Var.a) {
            fw0Var.o = bVar;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        u79 u79Var;
        u79 u79Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                fw0 fw0Var = this.b;
                synchronized (fw0Var.a) {
                    fw0Var.m = true;
                    fw0Var.b.quit();
                    fw0Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (u79Var2 = this.d) != null) {
                    u79Var2.c(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (u79Var = this.d) != null) {
                        u79Var.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
