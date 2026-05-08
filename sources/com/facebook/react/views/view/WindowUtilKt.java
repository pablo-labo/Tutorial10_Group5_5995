package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.epg;
import defpackage.ine;
import defpackage.izg;
import defpackage.p0h;
import defpackage.prg;
import defpackage.uzg;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000b\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lj6g;", "setEdgeToEdgeFeatureFlagOn", "()V", "Landroid/view/Window;", "", "isTranslucent", "setStatusBarTranslucency", "(Landroid/view/Window;Z)V", "isHidden", "setStatusBarVisibility", "statusBarHide", "(Landroid/view/Window;)V", "statusBarShow", "enableEdgeToEdge", "disableEdgeToEdge", "", "LightNavigationBarColor", "I", "getLightNavigationBarColor", "()I", "DarkNavigationBarColor", "getDarkNavigationBarColor", "value", "isEdgeToEdgeFeatureFlagOn", "Z", "()Z", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowUtilKt {
    private static boolean isEdgeToEdgeFeatureFlagOn;
    private static final int LightNavigationBarColor = Color.argb(230, 255, 255, 255);
    private static final int DarkNavigationBarColor = Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 27, 27, 27);

    public static final void disableEdgeToEdge(Window window) {
        window.getClass();
        izg.a(window, true);
    }

    public static final void enableEdgeToEdge(Window window) {
        window.getClass();
        izg.a(window, false);
        Context context = window.getContext();
        context.getClass();
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(i < 29 ? !z ? LightNavigationBarColor : DarkNavigationBarColor : 0);
        ine ineVar = new ine(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new uzg.f(window, ineVar) : i2 >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar)).c(!z);
        if (i >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
        }
    }

    public static final int getDarkNavigationBarColor() {
        return DarkNavigationBarColor;
    }

    public static final int getLightNavigationBarColor() {
        return LightNavigationBarColor;
    }

    public static final boolean isEdgeToEdgeFeatureFlagOn() {
        return isEdgeToEdgeFeatureFlagOn;
    }

    public static final void setEdgeToEdgeFeatureFlagOn() {
        isEdgeToEdgeFeatureFlagOn = true;
    }

    public static final void setStatusBarTranslucency(Window window, boolean z) {
        window.getClass();
        if (z) {
            window.getDecorView().setOnApplyWindowInsetsListener(new p0h());
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        View decorView = window.getDecorView();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.c.c(decorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setStatusBarTranslucency$lambda$0(View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void setStatusBarVisibility(Window window, boolean z) {
        window.getClass();
        if (z) {
            statusBarHide(window);
        } else {
            statusBarShow(window);
        }
    }

    private static final void statusBarHide(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            ine ineVar = new ine(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            uzg.g fVar = i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar);
            fVar.e();
            fVar.a(1);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            window.setDecorFitsSystemWindows(false);
        }
        window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        window.clearFlags(2048);
    }

    private static final void statusBarShow(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            ine ineVar = new ine(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            uzg.g fVar = i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar);
            fVar.e();
            fVar.f(1);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            window.getAttributes().layoutInDisplayCutoutMode = 0;
            window.setDecorFitsSystemWindows(true);
        }
        window.addFlags(2048);
        window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    }
}
