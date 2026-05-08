package defpackage;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes.dex */
public interface mn6 extends IInterface {
    public static final String h = "android$support$v4$app$INotificationSideChannel".replace('$', JwtParser.SEPARATOR_CHAR);

    public static abstract class a extends Binder implements mn6 {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: mn6$a$a, reason: collision with other inner class name */
        public static class C0323a implements mn6 {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.mn6
            public final void e1(String str, int i, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(mn6.h);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    void e1(String str, int i, String str2, Notification notification);
}
