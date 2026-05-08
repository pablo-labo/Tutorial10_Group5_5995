package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static pj0 c;
    public w5d a;

    public class a {
        public final int[] a = {2131230990, 2131230988, 2131230914};
        public final int[] b = {2131230938, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {2131230987, 2131230989, 2131230931, R.drawable.abc_text_cursor_material, 2131230984, 2131230985, 2131230986};
        public final int[] d = {2131230963, R.drawable.abc_cab_background_internal_bg, 2131230962};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = lkf.c(context, R.attr.colorControlHighlight);
            int iB = lkf.b(context, R.attr.colorButtonNormal);
            int[] iArr = lkf.b;
            int[] iArr2 = lkf.d;
            int iC2 = eb2.c(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, lkf.c, lkf.f}, new int[]{iB, iC2, eb2.c(iC, i), i});
        }

        public static LayerDrawable c(w5d w5dVar, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableC = w5dVar.c(context, R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = w5dVar.c(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableC;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableC2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = pj0.b;
            }
            drawableMutate.setColorFilter(pj0.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return pnb.z(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230980) {
                return pnb.z(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, lkf.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, lkf.c(context, R.attr.colorAccent));
                }
                if (i == 2131230975 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return pnb.z(context, R.color.abc_tint_spinner);
                }
                if (a(i, this.b)) {
                    return lkf.d(context, R.attr.colorControlNormal);
                }
                if (a(i, this.e)) {
                    return pnb.z(context, R.color.abc_tint_default);
                }
                if (a(i, this.f)) {
                    return pnb.z(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return pnb.z(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = lkf.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = lkf.b;
                iArr2[0] = lkf.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = lkf.e;
                iArr2[1] = lkf.c(context, R.attr.colorControlActivated);
                iArr[2] = lkf.f;
                iArr2[2] = lkf.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = lkf.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = lkf.e;
                iArr2[1] = lkf.c(context, R.attr.colorControlActivated);
                iArr[2] = lkf.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized pj0 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return w5d.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            pj0 pj0Var = new pj0();
            c = pj0Var;
            pj0Var.a = w5d.b();
            w5d w5dVar = c.a;
            a aVar = new a();
            synchronized (w5dVar) {
                w5dVar.e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, smf smfVar, int[] iArr) {
        PorterDuff.Mode mode = w5d.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = smfVar.d;
        if (!z && !smfVar.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z ? smfVar.a : null;
        PorterDuff.Mode mode2 = smfVar.c ? smfVar.b : w5d.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = w5d.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
