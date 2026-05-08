package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ln5 {
    public final AssetManager d;
    public final ws9 a = new ws9();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final String e = ".ttf";

    public ln5(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            a49.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
