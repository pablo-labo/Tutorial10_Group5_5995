package androidx.media3.session.legacy;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.a;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.b0;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: androidx.media3.session.legacy.b$a$a, reason: collision with other inner class name */
        public static class C0065a implements b {
            public IBinder a;

            @Override // androidx.media3.session.legacy.b
            public final void L0(androidx.media3.session.legacy.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder((a.AbstractBinderC0063a) aVar);
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.media3.session.legacy.b
            public final int M() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(47, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    int i2 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.media3.session.legacy.b
            public final boolean O() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(45, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.legacy.b
            public final PlaybackStateCompat b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(28, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    PlaybackStateCompat playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return playbackStateCompatCreateFromParcel;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.media3.session.legacy.b
            public final int i() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(37, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    int i2 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.media3.session.legacy.b
            public final void i1(androidx.media3.session.legacy.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder((a.AbstractBinderC0063a) aVar);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.a;
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public static b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                return (b) iInterfaceQueryLocalInterface;
            }
            C0065a c0065a = new C0065a();
            c0065a.a = iBinder;
            return c0065a;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 1598968902) {
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            androidx.media3.session.legacy.a aVar = null;
            bundle = null;
            Bundle bundle2 = null;
            androidx.media3.session.legacy.a aVar2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                        MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.media3.session.legacy.a)) {
                            a.AbstractBinderC0063a.C0064a c0064a = new a.AbstractBinderC0063a.C0064a();
                            c0064a.a = strongBinder;
                            aVar = c0064a;
                        } else {
                            aVar = (androidx.media3.session.legacy.a) iInterfaceQueryLocalInterface;
                        }
                    }
                    ((MediaSessionCompat.d.a) this).i1(aVar);
                    parcel2.getClass();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof androidx.media3.session.legacy.a)) {
                            a.AbstractBinderC0063a.C0064a c0064a2 = new a.AbstractBinderC0063a.C0064a();
                            c0064a2.a = strongBinder2;
                            aVar2 = c0064a2;
                        } else {
                            aVar2 = (androidx.media3.session.legacy.a) iInterfaceQueryLocalInterface2;
                        }
                    }
                    ((MediaSessionCompat.d.a) this).L0(aVar2);
                    parcel2.getClass();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case DatadogLogGenerator.CRASH /* 9 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    b0.t();
                    return false;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    b0.t();
                    return false;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readLong();
                    b0.t();
                    return false;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readLong();
                    b0.t();
                    return false;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackStateCompatB = ((MediaSessionCompat.d.a) this).b();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    if (playbackStateCompatB == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    playbackStateCompatB.writeToParcel(parcel2, 1);
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case RendererMetrics.SAMPLES /* 30 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ((MediaSessionCompat.d.a) this).b.get();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0.t();
                    return false;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int i3 = ((MediaSessionCompat.d.a) this).i();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    b0.t();
                    return false;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    b0.t();
                    return false;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    b0.t();
                    return false;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ((MediaSessionCompat.d.a) this).O();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    b0.t();
                    return false;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iM = ((MediaSessionCompat.d.a) this).M();
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    b0.t();
                    return false;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readFloat();
                    b0.t();
                    return false;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaSessionCompat.d dVar = ((MediaSessionCompat.d.a) this).b.get();
                    if (dVar != null && (bundle = dVar.e) != null) {
                        bundle2 = new Bundle(bundle);
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    if (bundle2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void L0(androidx.media3.session.legacy.a aVar);

    int M();

    boolean O();

    PlaybackStateCompat b();

    int i();

    void i1(androidx.media3.session.legacy.a aVar);
}
