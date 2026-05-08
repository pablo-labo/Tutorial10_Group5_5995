package androidx.media3.session.legacy;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.b0;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: androidx.media3.session.legacy.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0063a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: androidx.media3.session.legacy.a$a$a, reason: collision with other inner class name */
        public static class C0064a implements a {
            public IBinder a;

            @Override // androidx.media3.session.legacy.a
            public final void Q(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(1);
                    playbackStateCompat.writeToParcel(parcelObtain, 0);
                    if (!this.a.transact(3, parcelObtain, null, 1)) {
                        int i = AbstractBinderC0063a.a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.a
            public final void R(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    if (!this.a.transact(12, parcelObtain, null, 1)) {
                        int i2 = AbstractBinderC0063a.a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.legacy.a
            public final void m(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    if (!this.a.transact(9, parcelObtain, null, 1)) {
                        int i2 = AbstractBinderC0063a.a;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String string = parcel.readString();
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    MediaControllerCompat.a aVar = ((MediaControllerCompat.a.c) this).b.get();
                    if (aVar != null) {
                        aVar.m(1, string, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    b0.t();
                    return false;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.a.c) this).Q(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    b0.t();
                    return false;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    b0.t();
                    return false;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    b0.t();
                    return false;
                case DatadogLogGenerator.CRASH /* 9 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.a.c) this).m(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    boolean z = parcel.readInt() != 0;
                    MediaControllerCompat.a aVar2 = ((MediaControllerCompat.a.c) this).b.get();
                    if (aVar2 != null) {
                        aVar2.m(11, Boolean.valueOf(z), null);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.a.c) this).R(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaControllerCompat.a aVar3 = ((MediaControllerCompat.a.c) this).b.get();
                    if (aVar3 != null) {
                        aVar3.m(13, null, null);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void Q(PlaybackStateCompat playbackStateCompat);

    void R(int i);

    void m(int i);
}
