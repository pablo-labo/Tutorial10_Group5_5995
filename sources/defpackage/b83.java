package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class b83 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final a j;

    public static final class a {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
        }
    }

    public b83() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new a(cryptoInfo);
    }
}
