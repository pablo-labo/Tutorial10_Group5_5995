package defpackage;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tb6 extends tbe {
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ List<Float> e;

    public tb6(long j, long j2, List<Float> list) {
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    @Override // defpackage.tbe
    public final Shader b(long j) {
        float fAtan2 = ((float) Math.atan2(-Float.intBitsToFloat(r3), Float.intBitsToFloat(r6))) + 1.5707964f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        double d = fAtan2;
        float fAbs = Math.abs(fIntBitsToFloat2 * ((float) Math.sin(d))) + Math.abs(fIntBitsToFloat * ((float) Math.cos(d)));
        int i = (int) (jFloatToRawIntBits >> 32);
        int i2 = (int) (jFloatToRawIntBits & 4294967295L);
        return pg8.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - (((float) Math.cos(d)) * fAbs))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) - (((float) Math.sin(d)) * fAbs))) & 4294967295L), (((long) Float.floatToRawIntBits((((float) Math.cos(d)) * fAbs) + Float.intBitsToFloat(i))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fAbs * ((float) Math.sin(d))) + Float.intBitsToFloat(i2)))), u63.a0(new da2(this.c), new da2(this.d)), this.e);
    }
}
