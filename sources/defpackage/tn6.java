package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface tn6 extends IInterface {

    public static abstract class a extends hlh implements tn6 {
        public static tn6 e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof tn6 ? (tn6) iInterfaceQueryLocalInterface : new elh(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }
}
