package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public final class ltg extends VolumeProvider {
    public final /* synthetic */ mtg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltg(mtg mtgVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = mtgVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        xk9 xk9Var = (xk9) this.a;
        vjg.T(xk9Var.f, new wk9(i, xk9Var.g));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        xk9 xk9Var = (xk9) this.a;
        vjg.T(xk9Var.f, new vk9(i, xk9Var.g));
    }
}
