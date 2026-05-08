package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class oz9 {
    public static long a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
