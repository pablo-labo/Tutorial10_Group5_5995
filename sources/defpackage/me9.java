package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes2.dex */
public final class me9 {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int b(Context context, String str, int i) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA != null) {
            return typedValueA.data;
        }
        t40.q("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return 0;
    }
}
