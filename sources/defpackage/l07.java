package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l07 {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map<String, n79> c;

    public l07(Drawable.Callback callback, Map map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.b = null;
        this.c = map;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }
}
