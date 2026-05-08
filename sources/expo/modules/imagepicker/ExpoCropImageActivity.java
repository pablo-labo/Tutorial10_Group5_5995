package expo.modules.imagepicker;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.a;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageOptions;
import com.indeed.android.jobsearch.R;
import defpackage.ine;
import defpackage.o7d;
import defpackage.uzg;
import defpackage.y35;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageActivity;", "Lcom/canhub/cropper/CropImageActivity;", "<init>", "()V", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoCropImageActivity extends CropImageActivity {
    public int y0 = -16777216;

    public final void F(Menu menu) {
        Drawable icon;
        Drawable drawableMutate;
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (item != null && (icon = item.getIcon()) != null && (drawableMutate = icon.mutate()) != null) {
                drawableMutate.setTint(this.y0);
            }
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        Object aVar;
        super.onCreate(bundle);
        try {
            Field declaredField = CropImageActivity.class.getDeclaredField("r0");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            aVar = obj instanceof CropImageOptions ? (CropImageOptions) obj : null;
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        if (aVar instanceof o7d.a) {
            aVar = null;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) aVar;
        if (cropImageOptions != null) {
            boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
            y35 y35Var = y35.a;
            Resources.Theme theme = getTheme();
            theme.getClass();
            Resources resources = getResources();
            resources.getClass();
            y35Var.getClass();
            Integer numB = y35.b(theme, R.attr.expoCropToolbarColor);
            if (numB == null) {
                numB = y35.a(resources, R.color.expoCropToolbarColor);
            }
            Integer numB2 = y35.b(theme, R.attr.expoCropToolbarIconColor);
            if (numB2 == null) {
                numB2 = y35.a(resources, R.color.expoCropToolbarIconColor);
            }
            Integer numB3 = y35.b(theme, R.attr.expoCropToolbarActionTextColor);
            if (numB3 == null) {
                numB3 = y35.a(resources, R.color.expoCropToolbarActionTextColor);
            }
            Integer numB4 = y35.b(theme, R.attr.expoCropBackButtonIconColor);
            if (numB4 == null) {
                numB4 = y35.a(resources, R.color.expoCropBackButtonIconColor);
            }
            Integer numB5 = y35.b(theme, R.attr.expoCropBackgroundColor);
            if (numB5 == null) {
                numB5 = y35.a(resources, R.color.expoCropBackgroundColor);
            }
            int i = z ? -16777216 : -1;
            int iIntValue = numB2 != null ? numB2.intValue() : z ? -1 : -16777216;
            cropImageOptions.c1 = numB5 != null ? numB5.intValue() : i;
            if (numB == null) {
                numB = Integer.valueOf(i);
            }
            cropImageOptions.d1 = numB;
            cropImageOptions.e1 = Integer.valueOf(iIntValue);
            if (numB4 == null) {
                numB4 = Integer.valueOf(iIntValue);
            }
            cropImageOptions.f1 = numB4;
            cropImageOptions.C0 = iIntValue;
            if (numB3 == null) {
                numB3 = Integer.valueOf(z ? -1 : -16777216);
            }
            cropImageOptions.D0 = numB3;
            this.y0 = iIntValue;
            int iIntValue2 = z ? -16777216 : -1;
            Integer num = cropImageOptions.d1;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            Window window = getWindow();
            window.getClass();
            window.setStatusBarColor(iIntValue2);
            ine ineVar = new ine(window.getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            (i2 >= 35 ? new uzg.f(window, ineVar) : i2 >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar)).d(!z);
            a aVarY = y();
            if (aVarY != null) {
                aVarY.p(0.0f);
            }
            try {
                Method declaredMethod = CropImageActivity.class.getDeclaredMethod("B", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, null);
            } catch (Throwable unused) {
            }
            invalidateOptionsMenu();
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        super.onCreateOptionsMenu(menu);
        F(menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        F(menu);
        return zOnPrepareOptionsMenu;
    }
}
