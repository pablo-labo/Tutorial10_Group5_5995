package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import defpackage.ll3;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public final a a;
    public final int b;
    public final ll3.j c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }
    }

    public uy0(AudioTrack audioTrack, ll3.j jVar) {
        this.a = new a(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = jVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            bg.h();
        }
    }
}
