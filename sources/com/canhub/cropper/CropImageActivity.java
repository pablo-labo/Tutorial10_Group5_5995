package com.canhub.cropper;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.canhub.cropper.CropImageView;
import com.indeed.android.jobsearch.R;
import defpackage.a73;
import defpackage.d73;
import defpackage.e9;
import defpackage.j6g;
import defpackage.jh1;
import defpackage.k66;
import defpackage.l;
import defpackage.mh1;
import defpackage.oh1;
import defpackage.q8;
import defpackage.qv5;
import defpackage.r20;
import defpackage.sy3;
import defpackage.u63;
import defpackage.wi0;
import defpackage.wl7;
import defpackage.y8;
import defpackage.zve;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Lwi0;", "Lcom/canhub/cropper/CropImageView$i;", "Lcom/canhub/cropper/CropImageView$e;", "<init>", "()V", "Lj6g;", "B", "Lcom/canhub/cropper/CropImageOptions;", "r0", "Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "a", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@sy3
public class CropImageActivity extends wi0 implements CropImageView.i, CropImageView.e {
    public static final /* synthetic */ int x0 = 0;
    public Uri q0;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public CropImageOptions cropImageOptions;
    public CropImageView s0;
    public d73 t0;
    public Uri u0;
    public final e9 v0 = (e9) t(new q8(), new r20(this, 1));
    public final e9 w0 = (e9) t(new y8(), new a73(this, 0));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("CAMERA", 0);
            a = aVar;
            a aVar2 = new a("GALLERY", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public /* synthetic */ class b extends qv5 implements Function1<a, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(a aVar) throws IOException {
            a aVar2 = aVar;
            aVar2.getClass();
            CropImageActivity cropImageActivity = (CropImageActivity) this.receiver;
            int i = CropImageActivity.x0;
            cropImageActivity.getClass();
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", cropImageActivity.getCacheDir());
                fileCreateTempFile.createNewFile();
                fileCreateTempFile.deleteOnExit();
                Uri uriA = k66.a(cropImageActivity, fileCreateTempFile);
                cropImageActivity.u0 = uriA;
                cropImageActivity.w0.a(uriA);
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return null;
                }
                cropImageActivity.v0.a("image/*");
            }
            return j6g.a;
        }
    }

    public static void E(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            mh1 mh1Var = mh1.a;
            ColorFilter porterDuffColorFilter = null;
            if (Build.VERSION.SDK_INT >= 29) {
                Object objA = oh1.a.a(mh1Var);
                if (objA != null) {
                    porterDuffColorFilter = jh1.a(i2, objA);
                }
            } else {
                PorterDuff.Mode modeA = oh1.a(mh1Var);
                if (modeA != null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i2, modeA);
                }
            }
            icon.setColorFilter(porterDuffColorFilter);
            menuItemFindItem.setIcon(icon);
        } catch (Exception e) {
            Log.w("AIC", "Failed to update menu item color", e);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void A() {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.A():void");
    }

    public final void B() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        if (cropImageOptions == null) {
            wl7.g("cropImageOptions");
            throw null;
        }
        int i = cropImageOptions.c1;
        d73 d73Var = this.t0;
        if (d73Var == null) {
            wl7.g("binding");
            throw null;
        }
        ((CropImageView) d73Var.a).setBackgroundColor(i);
        androidx.appcompat.app.a aVarY = y();
        if (aVarY != null) {
            CropImageOptions cropImageOptions2 = this.cropImageOptions;
            if (cropImageOptions2 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            CharSequence charSequence = cropImageOptions2.B0;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            aVarY.n(true);
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            Integer num = cropImageOptions3.d1;
            if (num != null) {
                aVarY.l(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            Integer num2 = cropImageOptions4.e1;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            Integer num3 = cropImageOptions5.f1;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                try {
                    Drawable drawable = getDrawable(R.drawable.ic_arrow_back_24);
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    aVarY.q(drawable);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void C(Uri uri, Exception exc, int i) {
        int i2 = exc != null ? 204 : -1;
        CropImageView cropImageView = this.s0;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.s0;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.s0;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.s0;
        int c0 = cropImageView4 != null ? cropImageView4.getC0() : 0;
        CropImageView cropImageView5 = this.s0;
        Rect wholeImageRect = cropImageView5 != null ? cropImageView5.getWholeImageRect() : null;
        cropPoints.getClass();
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, exc, cropPoints, cropRect, wholeImageRect, c0, i);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        setResult(i2, intent);
        finish();
    }

    public final void D() {
        setResult(0);
        finish();
    }

    @Override // com.canhub.cropper.CropImageView.e
    public final void h(CropImageView cropImageView, CropImageView.b bVar) {
        C(bVar.b, bVar.c, bVar.W);
    }

    @Override // com.canhub.cropper.CropImageView.i
    public final void l(CropImageView cropImageView, Uri uri, Exception exc) {
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        if (exc != null) {
            C(null, exc, 1);
            return;
        }
        CropImageOptions cropImageOptions = this.cropImageOptions;
        if (cropImageOptions == null) {
            wl7.g("cropImageOptions");
            throw null;
        }
        Rect rect = cropImageOptions.L0;
        if (rect != null && (cropImageView3 = this.s0) != null) {
            cropImageView3.setCropRect(rect);
        }
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        if (cropImageOptions2 == null) {
            wl7.g("cropImageOptions");
            throw null;
        }
        int i = cropImageOptions2.M0;
        if (i > 0 && (cropImageView2 = this.s0) != null) {
            cropImageView2.setRotatedDegrees(i);
        }
        CropImageOptions cropImageOptions3 = this.cropImageOptions;
        if (cropImageOptions3 == null) {
            wl7.g("cropImageOptions");
            throw null;
        }
        if (cropImageOptions3.V0) {
            A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r53) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        CharSequence title;
        CropImageOptions cropImageOptions;
        menu.getClass();
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        if (cropImageOptions2 == null) {
            wl7.g("cropImageOptions");
            throw null;
        }
        if (!cropImageOptions2.V0) {
            getMenuInflater().inflate(R.menu.crop_image_menu, menu);
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            if (!cropImageOptions3.N0) {
                menu.removeItem(R.id.ic_rotate_left_24);
                menu.removeItem(R.id.ic_rotate_right_24);
            } else if (cropImageOptions3.P0) {
                menu.findItem(R.id.ic_rotate_left_24).setVisible(true);
            }
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            if (!cropImageOptions4.O0) {
                menu.removeItem(R.id.ic_flip_24);
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            if (cropImageOptions5.T0 != null) {
                MenuItem menuItemFindItem = menu.findItem(R.id.crop_image_menu_crop);
                CropImageOptions cropImageOptions6 = this.cropImageOptions;
                if (cropImageOptions6 == null) {
                    wl7.g("cropImageOptions");
                    throw null;
                }
                menuItemFindItem.setTitle(cropImageOptions6.T0);
            }
            try {
                cropImageOptions = this.cropImageOptions;
            } catch (Exception e) {
                e = e;
                drawable = null;
            }
            if (cropImageOptions == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            int i = cropImageOptions.U0;
            if (i != 0) {
                drawable = getDrawable(i);
                try {
                    menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
                } catch (Exception e2) {
                    e = e2;
                    Log.w("AIC", "Failed to read menu crop drawable", e);
                }
            } else {
                drawable = null;
            }
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            int i2 = cropImageOptions7.C0;
            if (i2 != 0) {
                E(menu, R.id.ic_rotate_left_24, i2);
                CropImageOptions cropImageOptions8 = this.cropImageOptions;
                if (cropImageOptions8 == null) {
                    wl7.g("cropImageOptions");
                    throw null;
                }
                E(menu, R.id.ic_rotate_right_24, cropImageOptions8.C0);
                CropImageOptions cropImageOptions9 = this.cropImageOptions;
                if (cropImageOptions9 == null) {
                    wl7.g("cropImageOptions");
                    throw null;
                }
                E(menu, R.id.ic_flip_24, cropImageOptions9.C0);
                if (drawable != null) {
                    CropImageOptions cropImageOptions10 = this.cropImageOptions;
                    if (cropImageOptions10 == null) {
                        wl7.g("cropImageOptions");
                        throw null;
                    }
                    E(menu, R.id.crop_image_menu_crop, cropImageOptions10.C0);
                }
            }
            CropImageOptions cropImageOptions11 = this.cropImageOptions;
            if (cropImageOptions11 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            Integer num = cropImageOptions11.D0;
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it = u63.a0(Integer.valueOf(R.id.ic_rotate_left_24), Integer.valueOf(R.id.ic_rotate_right_24), Integer.valueOf(R.id.ic_flip_24), Integer.valueOf(R.id.ic_flip_24_horizontally), Integer.valueOf(R.id.ic_flip_24_vertically), Integer.valueOf(R.id.crop_image_menu_crop)).iterator();
                while (it.hasNext()) {
                    MenuItem menuItemFindItem2 = menu.findItem(((Number) it.next()).intValue());
                    if (menuItemFindItem2 != null && (title = menuItemFindItem2.getTitle()) != null && (!zve.U(title))) {
                        try {
                            SpannableString spannableString = new SpannableString(title);
                            spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                            menuItemFindItem2.setTitle(spannableString);
                        } catch (Exception e3) {
                            Log.w("AIC", "Failed to update menu item color", e3);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crop_image_menu_crop) {
            A();
            return true;
        }
        if (itemId == R.id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions = this.cropImageOptions;
            if (cropImageOptions == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            int i = -cropImageOptions.Q0;
            CropImageView cropImageView = this.s0;
            if (cropImageView != null) {
                cropImageView.f(i);
                return true;
            }
        } else if (itemId == R.id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions2 = this.cropImageOptions;
            if (cropImageOptions2 == null) {
                wl7.g("cropImageOptions");
                throw null;
            }
            int i2 = cropImageOptions2.Q0;
            CropImageView cropImageView2 = this.s0;
            if (cropImageView2 != null) {
                cropImageView2.f(i2);
                return true;
            }
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView3 = this.s0;
            if (cropImageView3 != null) {
                cropImageView3.d0 = !cropImageView3.d0;
                cropImageView3.b(cropImageView3.getWidth(), cropImageView3.getHeight(), true, false);
                return true;
            }
        } else {
            if (itemId != R.id.ic_flip_24_vertically) {
                if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                }
                D();
                return true;
            }
            CropImageView cropImageView4 = this.s0;
            if (cropImageView4 != null) {
                cropImageView4.e0 = !cropImageView4.e0;
                cropImageView4.b(cropImageView4.getWidth(), cropImageView4.getHeight(), true, false);
            }
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putString("bundle_key_tmp_uri", String.valueOf(this.u0));
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.s0;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.s0;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.s0;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.s0;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }
}
