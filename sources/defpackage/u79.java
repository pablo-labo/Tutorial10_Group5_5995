package defpackage;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u79 {
    public final HashSet<MediaCodec> a = new HashSet<>();
    public final q6 b = b.o;
    public LoudnessCodecController c;

    public class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public a() {
        }

        public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            u79.this.b.getClass();
            return bundle;
        }
    }

    public interface b {
        public static final q6 o = new q6(10);
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            ka2.q(this.a.add(mediaCodec));
        }
    }

    public final void b() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, h54.a, new a());
        this.c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }
}
