package defpackage;

import android.graphics.Bitmap;
import defpackage.t27;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fr1 implements j5d<ByteBuffer, Bitmap> {
    public final h94 a;

    public fr1(h94 h94Var) {
        this.a = h94Var;
    }

    @Override // defpackage.j5d
    public final boolean a(ByteBuffer byteBuffer, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, ova ovaVar) {
        h94 h94Var = this.a;
        return h94Var.a(new t27.a(byteBuffer, h94Var.d, h94Var.c), i, i2, ovaVar, h94.k);
    }
}
