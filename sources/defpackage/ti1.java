package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class ti1 {
    public static final e a(e eVar, float f, long j, dce dceVar) {
        return b(eVar, f, new kne(j), dceVar);
    }

    public static final e b(e eVar, float f, kne kneVar, dce dceVar) {
        return eVar.o(new BorderModifierNodeElement(f, kneVar, dceVar));
    }

    public static final long c(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
