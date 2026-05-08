package defpackage;

import android.R;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public enum fdf {
    a(R.attr.actionModeCutDrawable, boa.Z, "Cut"),
    b(R.attr.actionModeCopyDrawable, boa.a0, "Copy"),
    c(R.attr.actionModePasteDrawable, boa.b0, "Paste"),
    d(R.attr.actionModeSelectAllDrawable, boa.c0, "SelectAll"),
    e(0, boa.d0, "Autofill");

    private final int drawableId;
    private final Object key;
    private final int stringId;

    fdf(int i, Object obj, String str) {
        this.key = obj;
        this.stringId = i;
        this.drawableId = i;
    }

    public final int a() {
        return this.drawableId;
    }

    public final Object c() {
        return this.key;
    }

    public final String e(Resources resources) {
        return resources.getString(this.stringId);
    }
}
