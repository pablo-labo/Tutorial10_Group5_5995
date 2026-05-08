package defpackage;

import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw0 implements fze {
    public final /* synthetic */ int a;

    public /* synthetic */ cw0(int i) {
        this.a = i;
    }

    @Override // defpackage.fze
    public final Object get() {
        return new HandlerThread(a.m(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
