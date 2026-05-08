package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s74 {
    public static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof fme) {
            fme fmeVar = (fme) obj;
            if (fmeVar.d() == zkd.f || fmeVar.d() == wab.a0 || fmeVar.d() == wg2.Z) {
                T value = fmeVar.getValue();
                if (value == 0) {
                    return true;
                }
                return a(value);
            }
        } else if (!(obj instanceof vu5) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
