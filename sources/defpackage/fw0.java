package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public MediaCodecRenderer.b o;
    public final Object a = new Object();
    public final x42 d = new x42();
    public final x42 e = new x42();
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();
    public final ArrayDeque<MediaFormat> g = new ArrayDeque<>();

    public fw0(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = arrayDeque.getLast();
        }
        x42 x42Var = this.d;
        x42Var.c = x42Var.b;
        x42 x42Var2 = this.e;
        x42Var2.c = x42Var2.b;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        k.a aVar;
        synchronized (this.a) {
            this.d.a(i);
            MediaCodecRenderer.b bVar = this.o;
            if (bVar != null && (aVar = MediaCodecRenderer.this.w0) != null) {
                aVar.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        k.a aVar;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                MediaCodecRenderer.b bVar = this.o;
                if (bVar != null && (aVar = MediaCodecRenderer.this.w0) != null) {
                    aVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
