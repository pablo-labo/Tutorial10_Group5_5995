package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import defpackage.nmc;
import defpackage.q6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "Vibration")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/vibration/VibrationModule;", "Lcom/facebook/fbreact/specs/NativeVibrationSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "", "durationDouble", "Lj6g;", "vibrate", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "pattern", "repeatDouble", "vibrateByPattern", "(Lcom/facebook/react/bridge/ReadableArray;D)V", "cancel", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class VibrationModule extends NativeVibrationSpec {
    public static final String NAME = "Vibration";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        }
        VibratorManager vibratorManagerE = q6.e(getReactApplicationContext().getSystemService("vibrator_manager"));
        if (vibratorManagerE != null) {
            return vibratorManagerE.getDefaultVibrator();
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = getVibrator();
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double durationDouble) {
        int i = (int) durationDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createOneShot(i, -1));
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray pattern, double repeatDouble) {
        pattern.getClass();
        int i = (int) repeatDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[pattern.size()];
        int size = pattern.size();
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = pattern.getInt(i2);
        }
        vibrator.vibrate(VibrationEffect.createWaveform(jArr, i));
    }
}
