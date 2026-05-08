package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface bn6 extends IInterface {

    public static abstract class a extends pkh implements bn6 {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: bn6$a$a, reason: collision with other inner class name */
        public static class C0095a extends jfh implements bn6 {
            @Override // defpackage.bn6
            public final void w(String str, Bundle bundle, twh twhVar) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                parcelObtain.writeString(str);
                int i = poh.a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain.writeStrongBinder(twhVar);
                try {
                    this.a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    void w(String str, Bundle bundle, twh twhVar);
}
