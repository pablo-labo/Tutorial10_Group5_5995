package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.m60;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y50 implements ViewTranslationCallback {
    public static final y50 a = new y50();

    public final boolean onClearTranslation(View view) {
        r5 r5Var;
        gu5 gu5Var;
        view.getClass();
        m60 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = m60.a.a;
        jh7<i5e> jh7VarD = contentCaptureManager$ui_release.d();
        Object[] objArr = jh7VarD.c;
        long[] jArr = jh7VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w4e w4eVar = ((i5e) objArr[(i << 3) + i3]).a.d;
                        if (x4e.a(w4eVar, k5e.C) != null && (r5Var = (r5) x4e.a(w4eVar, v4e.m)) != null && (gu5Var = (gu5) r5Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        r5 r5Var;
        Function1 function1;
        view.getClass();
        m60 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = m60.a.a;
        jh7<i5e> jh7VarD = contentCaptureManager$ui_release.d();
        Object[] objArr = jh7VarD.c;
        long[] jArr = jh7VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w4e w4eVar = ((i5e) objArr[(i << 3) + i3]).a.d;
                        if (wl7.b(x4e.a(w4eVar, k5e.C), Boolean.TRUE) && (r5Var = (r5) x4e.a(w4eVar, v4e.l)) != null && (function1 = (Function1) r5Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        r5 r5Var;
        Function1 function1;
        view.getClass();
        m60 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = m60.a.b;
        jh7<i5e> jh7VarD = contentCaptureManager$ui_release.d();
        Object[] objArr = jh7VarD.c;
        long[] jArr = jh7VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w4e w4eVar = ((i5e) objArr[(i << 3) + i3]).a.d;
                        if (wl7.b(x4e.a(w4eVar, k5e.C), Boolean.FALSE) && (r5Var = (r5) x4e.a(w4eVar, v4e.l)) != null && (function1 = (Function1) r5Var.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
