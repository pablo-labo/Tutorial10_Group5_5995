package defpackage;

import android.annotation.SuppressLint;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class anc extends RiveAnimationView {
    @Override // app.rive.runtime.kotlin.RiveAnimationView, app.rive.runtime.kotlin.RiveTextureView
    @SuppressLint({"VisibleForTests"})
    public final yv8 createObserver() {
        return new bnc(new ArrayList(ut0.i0(new RefCount[]{getController(), getRendererAttributes().getAssetLoader()})));
    }
}
