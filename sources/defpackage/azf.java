package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import defpackage.ho5;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class azf extends bzf {
    public static Font e(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : DataOkHttpUploader.HTTP_BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iG = g(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iG2 = g(fontStyle, font2.getStyle());
            if (iG2 < iG) {
                font = font2;
                iG = iG2;
            }
        }
        return font;
    }

    public static FontFamily f(xo5[] xo5VarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (xo5 xo5Var : xo5VarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(xo5Var.a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(xo5Var.c).setSlant(xo5Var.d ? 1 : 0).setTtcIndex(xo5Var.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.bzf
    public final Typeface a(Context context, ho5.b bVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (ho5.c cVar : bVar.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.f).setWeight(cVar.b).setSlant(cVar.c ? 1 : 0).setTtcIndex(cVar.e).setFontVariationSettings(cVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(e(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bzf
    public final Typeface b(Context context, xo5[] xo5VarArr, int i) {
        try {
            FontFamily fontFamilyF = f(xo5VarArr, context.getContentResolver());
            if (fontFamilyF == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyF).setStyle(e(fontFamilyF, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bzf
    public final Typeface c(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyF = f((xo5[]) list.get(0), contentResolver);
            if (fontFamilyF == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyF);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyF2 = f((xo5[]) list.get(i2), contentResolver);
                if (fontFamilyF2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyF2);
                }
            }
            return customFallbackBuilder.setStyle(e(fontFamilyF, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.bzf
    public final Typeface d(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
