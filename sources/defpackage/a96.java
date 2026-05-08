package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class a96 implements j5d<u86, Bitmap> {
    public final bh1 a;

    public a96(bh1 bh1Var) {
        this.a = bh1Var;
    }

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ boolean a(u86 u86Var, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(u86 u86Var, int i, int i2, ova ovaVar) {
        Bitmap nextFrame = u86Var.getNextFrame();
        if (nextFrame == null) {
            return null;
        }
        return new dh1(this.a, nextFrame);
    }
}
