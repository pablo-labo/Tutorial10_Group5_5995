package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p83 {
    public static byte[] a(e47 e47Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e47Var.size());
        Iterator<E> it = e47Var.iterator();
        while (it.hasNext()) {
            n83 n83Var = (n83) it.next();
            Bundle bundleC = n83Var.c();
            Bitmap bitmap = n83Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ka2.q(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(n83.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
