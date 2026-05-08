package defpackage;

import androidx.media3.exoplayer.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x25 implements fze {
    public final /* synthetic */ int a;

    public /* synthetic */ x25(int i) {
        this.a = i;
    }

    @Override // defpackage.fze
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c();
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    z3.q(e);
                    return null;
                }
        }
    }
}
