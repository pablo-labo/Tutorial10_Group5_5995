package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import defpackage.ll3;

/* JADX INFO: loaded from: classes.dex */
public final class pl3 implements ll3.c {
    public final AudioTrack a(sy0 sy0Var, ox0 ox0Var, int i, Context context) {
        int i2 = sy0Var.b;
        int i3 = sy0Var.c;
        int i4 = sy0Var.a;
        String str = vjg.a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(sy0Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ox0Var.b().a).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build()).setTransferMode(1).setBufferSizeInBytes(sy0Var.f).setSessionId(i);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(sy0Var.e);
        }
        if (i5 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
