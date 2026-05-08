package com.facebook.react.fabric;

import android.view.View;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import defpackage.zkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0086 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "Lcom/facebook/jni/HybridClassBase;", "", "surfaceId", "", "moduleName", "Lj6g;", "initHybrid", "(ILjava/lang/String;)V", "_getSurfaceId", "()I", "_getModuleName", "()Ljava/lang/String;", "", "_isRunning", "()Z", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "doLeftAndRightSwapInRTL", "isRTL", "pixelDensity", "fontScale", "setLayoutConstraintsNative", "(FFFFFFZZFF)V", "mode", "setDisplayMode", "(I)V", "Lcom/facebook/react/bridge/NativeMap;", "props", "setProps", "(Lcom/facebook/react/bridge/NativeMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SurfaceHandlerBinding extends HybridClassBase {
    static {
        zkd.M();
    }

    public SurfaceHandlerBinding(String str) {
        str.getClass();
        initHybrid(0, str);
    }

    private final native String _getModuleName();

    private final native int _getSurfaceId();

    private final native boolean _isRunning();

    private final native void initHybrid(int surfaceId, String moduleName);

    private final native void setDisplayMode(int mode);

    private final native void setLayoutConstraintsNative(float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean doLeftAndRightSwapInRTL, boolean isRTL, float pixelDensity, float fontScale);

    public final String b() {
        return _getModuleName();
    }

    public final int d() {
        return _getSurfaceId();
    }

    public final boolean f() {
        return _isRunning();
    }

    public final void g(int i, int i2, int i3, int i4, boolean z, boolean z2, float f, float f2) {
        setLayoutConstraintsNative((View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : 0.0f) / f, (View.MeasureSpec.getMode(i) == 0 ? Float.POSITIVE_INFINITY : View.MeasureSpec.getSize(i)) / f, (View.MeasureSpec.getMode(i2) == 1073741824 ? View.MeasureSpec.getSize(i2) : 0.0f) / f, (View.MeasureSpec.getMode(i2) != 0 ? View.MeasureSpec.getSize(i2) : Float.POSITIVE_INFINITY) / f, i3 / f, i4 / f, z, z2, f, f2);
    }

    public final void i() {
        setDisplayMode(0);
    }

    public final native void setProps(NativeMap props);
}
