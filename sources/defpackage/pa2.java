package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class pa2 {
    public static final long a(int i, b bVar) {
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) bVar.M(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g6d.a;
        return pnb.d(resources.getColor(i, theme));
    }
}
