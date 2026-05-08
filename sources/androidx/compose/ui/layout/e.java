package androidx.compose.ui.layout;

import defpackage.sl8;

/* JADX INFO: loaded from: classes.dex */
public final class e extends z {
    @Override // androidx.compose.ui.layout.z
    public final float a(float f, sl8 sl8Var, sl8 sl8Var2) {
        return Float.intBitsToFloat((int) (sl8Var2.G(sl8Var, (((long) Float.floatToRawIntBits(((int) (sl8Var.a() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)) & 4294967295L));
    }
}
