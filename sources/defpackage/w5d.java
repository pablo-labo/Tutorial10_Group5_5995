package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.indeed.android.jobsearch.R;
import defpackage.pj0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w5d {
    public static w5d g;
    public WeakHashMap<Context, loe<ColorStateList>> a;
    public final WeakHashMap<Context, r59<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    public TypedValue c;
    public boolean d;
    public pj0.a e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a(6);

    public static class a extends a89<Integer, PorterDuffColorFilter> {
    }

    public static synchronized w5d b() {
        try {
            if (g == null) {
                g = new w5d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        a aVar = h;
        aVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilterB = aVar.b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i, mode);
            aVar.c(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    public final Drawable a(Context context, int i) {
        LayerDrawable layerDrawableC;
        WeakReference<Drawable.ConstantState> weakReferenceD;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            r59<WeakReference<Drawable.ConstantState>> r59Var = this.b.get(context);
            layerDrawableC = null;
            if (r59Var != null && (weakReferenceD = r59Var.d(j)) != null) {
                Drawable.ConstantState constantState = weakReferenceD.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    r59Var.i(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230931)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = pj0.a.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = pj0.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = pj0.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                r59<WeakReference<Drawable.ConstantState>> r59Var2 = this.b.get(context);
                if (r59Var2 == null) {
                    r59Var2 = new r59<>();
                    this.b.put(context, r59Var2);
                }
                r59Var2.h(new WeakReference(constantState2), j);
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                ac4.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateListE;
        loe<ColorStateList> loeVar;
        WeakHashMap<Context, loe<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateListE = (weakHashMap == null || (loeVar = weakHashMap.get(context)) == null) ? null : loeVar.e(i);
        if (colorStateListE == null) {
            pj0.a aVar = this.e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i);
            }
            if (colorStateListD != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                loe<ColorStateList> loeVar2 = this.a.get(context);
                if (loeVar2 == null) {
                    loeVar2 = new loe<>();
                    this.a.put(context, loeVar2);
                }
                loeVar2.c(i, colorStateListD);
            }
            colorStateListE = colorStateListD;
        }
        return colorStateListE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5d.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
