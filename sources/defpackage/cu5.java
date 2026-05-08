package defpackage;

import expo.modules.video.FullscreenPlayerActivity;
import expo.modules.video.enums.FullscreenOrientation;
import expo.modules.video.records.FullscreenOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class cu5 {
    public final FullscreenPlayerActivity a;
    public final FullscreenOptions b;
    public final dd c;
    public final qq d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public final d2f h;

    public cu5(FullscreenPlayerActivity fullscreenPlayerActivity, FullscreenOptions fullscreenOptions, dd ddVar, qq qqVar) {
        fullscreenOptions.getClass();
        this.a = fullscreenPlayerActivity;
        this.b = fullscreenOptions;
        this.c = ddVar;
        this.d = qqVar;
        boolean z = true;
        this.f = fullscreenOptions.getOrientation() == FullscreenOrientation.LANDSCAPE || fullscreenOptions.getOrientation() == FullscreenOrientation.LANDSCAPE_LEFT || fullscreenOptions.getOrientation() == FullscreenOrientation.LANDSCAPE_RIGHT;
        if (fullscreenOptions.getOrientation() != FullscreenOrientation.PORTRAIT && fullscreenOptions.getOrientation() != FullscreenOrientation.PORTRAIT_UP && fullscreenOptions.getOrientation() != FullscreenOrientation.PORTRAIT_DOWN) {
            z = false;
        }
        this.g = z;
        this.h = new d2f(new oq(this, 9));
    }
}
