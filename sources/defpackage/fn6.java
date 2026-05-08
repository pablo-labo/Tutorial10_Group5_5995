package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public interface fn6 extends IInterface {

    public static abstract class a extends w7h implements fn6 {
        public static final /* synthetic */ int b = 0;

        /* JADX INFO: renamed from: fn6$a$a, reason: collision with other inner class name */
        public static class C0235a extends d7h implements fn6 {
            @Override // defpackage.fn6
            public final Bundle c(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = a8h.a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain = Parcel.obtain();
                try {
                    this.a.transact(1, parcelObtain, parcelObtain, 0);
                    parcelObtain.readException();
                    parcelObtain.recycle();
                    return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
                } catch (RuntimeException e) {
                    throw e;
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    Bundle c(Bundle bundle);
}
