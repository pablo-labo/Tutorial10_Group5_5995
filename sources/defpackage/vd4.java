package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vd4 implements ah1 {
    public final Set<Bitmap> a;

    public vd4() {
        Set<Bitmap> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.a = setNewSetFromMap;
    }

    @Override // defpackage.a6d
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        this.a.remove(bitmap);
        bitmap.recycle();
    }

    @Override // defpackage.sfb
    public final Bitmap get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        this.a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
