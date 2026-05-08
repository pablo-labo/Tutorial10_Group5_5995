package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import defpackage.j6g;
import defpackage.kn6;
import defpackage.ln6;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String j = "androidx$room$IMultiInstanceInvalidationService".replace('$', JwtParser.SEPARATOR_CHAR);

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0076a extends Binder implements a {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            MultiInstanceInvalidationService.b bVar;
            String str = a.j;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            int i3 = 0;
            ln6 ln6Var = null;
            ln6 ln6Var2 = null;
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ln6.g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ln6)) {
                        kn6 kn6Var = new kn6();
                        kn6Var.a = strongBinder;
                        ln6Var = kn6Var;
                    } else {
                        ln6Var = (ln6) iInterfaceQueryLocalInterface;
                    }
                }
                String string = parcel.readString();
                MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
                ln6Var.getClass();
                if (string != null) {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    synchronized (multiInstanceInvalidationService.c) {
                        try {
                            int i4 = multiInstanceInvalidationService.a + 1;
                            multiInstanceInvalidationService.a = i4;
                            if (multiInstanceInvalidationService.c.register(ln6Var, Integer.valueOf(i4))) {
                                multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                                i3 = i4;
                            } else {
                                multiInstanceInvalidationService.a--;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            }
            if (i == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(ln6.g);
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof ln6)) {
                        kn6 kn6Var2 = new kn6();
                        kn6Var2.a = strongBinder2;
                        ln6Var2 = kn6Var2;
                    } else {
                        ln6Var2 = (ln6) iInterfaceQueryLocalInterface2;
                    }
                }
                int i5 = parcel.readInt();
                ln6Var2.getClass();
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService2.c) {
                    multiInstanceInvalidationService2.c.unregister(ln6Var2);
                }
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i6 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService3.c) {
                String str2 = (String) multiInstanceInvalidationService3.b.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                    while (true) {
                        bVar = multiInstanceInvalidationService3.c;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = bVar.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    multiInstanceInvalidationService3.c.getBroadcastItem(i3).q(strArrCreateStringArray);
                                    j6g j6gVar = j6g.a;
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.c.finishBroadcast();
                            throw th2;
                        }
                    }
                    bVar.finishBroadcast();
                    j6g j6gVar2 = j6g.a;
                }
            }
            return true;
        }
    }
}
