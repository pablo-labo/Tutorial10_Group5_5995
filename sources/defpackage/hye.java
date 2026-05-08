package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes3.dex */
public final class hye extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ PlayerView a;
    public final /* synthetic */ Context b;

    public hye(PlayerView playerView, Context context) {
        this.a = playerView;
        this.b = context;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        iye.a(this.a, this.b);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        iye.a(this.a, this.b);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        captionStyle.getClass();
        iye.a(this.a, this.b);
    }
}
