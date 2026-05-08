package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class fg1<DataType> implements j5d<DataType, BitmapDrawable> {
    public final j5d<DataType, Bitmap> a;
    public final Resources b;

    public fg1(Resources resources, j5d<DataType, Bitmap> j5dVar) {
        this.b = resources;
        this.a = j5dVar;
    }

    @Override // defpackage.j5d
    public final boolean a(DataType datatype, ova ovaVar) {
        return this.a.a(datatype, ovaVar);
    }

    @Override // defpackage.j5d
    public final f5d<BitmapDrawable> b(DataType datatype, int i, int i2, ova ovaVar) {
        f5d<Bitmap> f5dVarB = this.a.b(datatype, i, i2, ovaVar);
        if (f5dVarB == null) {
            return null;
        }
        return new dn8(this.b, f5dVarB);
    }
}
