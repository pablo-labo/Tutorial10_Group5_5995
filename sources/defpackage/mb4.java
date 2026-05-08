package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class mb4 {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = g6d.a;
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            fu2 fu2Var = new fu2(context);
            fu2Var.b = theme;
            fu2Var.a(theme.getResources().getConfiguration());
            context = fu2Var;
        }
        return pnb.A(context, i);
    }
}
