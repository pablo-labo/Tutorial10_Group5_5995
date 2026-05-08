package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.akb;
import defpackage.d9e;
import defpackage.e47;
import defpackage.ei9;
import defpackage.fi9;
import defpackage.g7;
import defpackage.gdb;
import defpackage.jl3;
import defpackage.k6;
import defpackage.kj9;
import defpackage.mh9;
import defpackage.w8e;
import defpackage.z3;
import defpackage.zkd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* JADX INFO: renamed from: androidx.media3.session.f$a$a, reason: collision with other inner class name */
        public static class C0058a implements f {
            public IBinder a;

            @Override // androidx.media3.session.f
            public final void B0(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void D0(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void F0(int i, Bundle bundle, Bundle bundle2) {
                Bundle bundle3 = Bundle.EMPTY;
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    b.b(parcelObtain, bundle3);
                    this.a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void G0(int i, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    b.b(parcelObtain, bundle2);
                    this.a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void K(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void a1(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.f
            public final void d(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    this.a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void d1(int i, Bundle bundle, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void f() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(0);
                    this.a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void k0(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.f
            public final void s(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static f c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof f)) {
                return (f) iInterfaceQueryLocalInterface;
            }
            C0058a c0058a = new C0058a();
            c0058a.a = iBinder;
            return c0058a;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaController");
                return true;
            }
            if (i == 4001) {
                parcel.readInt();
                String string = parcel.readString();
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                m mVar = (m) this;
                if (TextUtils.isEmpty(string)) {
                    zkd.T("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
                } else if (i3 < 0) {
                    g7.j(i3, "onChildrenChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
                } else if (bundle == null) {
                    mVar.e(new akb());
                } else {
                    try {
                        kj9.a(bundle);
                        mVar.e(new akb());
                    } catch (RuntimeException e) {
                        zkd.U("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                    }
                }
            } else if (i != 4002) {
                switch (i) {
                    case 3001:
                        ((m) this).s(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3002:
                        ((m) this).k0(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3003:
                        ((m) this).K(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3004:
                        int i4 = parcel.readInt();
                        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                        m mVar2 = (m) this;
                        if (arrayListCreateTypedArrayList != null) {
                            try {
                                int iH = mVar2.h();
                                if (iH != -1) {
                                    e47.b bVar = e47.b;
                                    e47.a aVar = new e47.a();
                                    for (int i5 = 0; i5 < arrayListCreateTypedArrayList.size(); i5++) {
                                        Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(i5);
                                        bundle2.getClass();
                                        aVar.c(androidx.media3.session.a.d(iH, bundle2));
                                    }
                                    mVar2.e(new fi9(i4, aVar.f()));
                                }
                            } catch (RuntimeException e2) {
                                zkd.U("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e2);
                            }
                        }
                        break;
                    case 3005:
                        int i6 = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        ((m) this).F0(i6, (Bundle) b.a(parcel, creator), (Bundle) b.a(parcel, creator));
                        return true;
                    case 3006:
                        parcel.readInt();
                        ((m) this).f();
                        return true;
                    case 3007:
                        ((m) this).d1(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                        return true;
                    case 3008:
                        ((m) this).D0(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3009:
                        ((m) this).B0(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3010:
                        parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        Bundle bundle3 = (Bundle) b.a(parcel, creator2);
                        Bundle bundle4 = (Bundle) b.a(parcel, creator2);
                        m mVar3 = (m) this;
                        if (bundle3 != null && bundle4 != null) {
                            try {
                                try {
                                    mVar3.e(new mh9(w8e.a(bundle3), gdb.a.b(bundle4)));
                                } catch (RuntimeException e3) {
                                    zkd.U("MediaControllerStub", "Ignoring malformed Bundle for Commands", e3);
                                }
                            } catch (RuntimeException e4) {
                                zkd.U("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e4);
                            }
                        }
                        break;
                    case 3011:
                        ((m) this).d(parcel.readInt());
                        return true;
                    case 3012:
                        ((m) this).a1(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                        return true;
                    case 3013:
                        int i7 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        ((m) this).G0(i7, (Bundle) b.a(parcel, creator3), (Bundle) b.a(parcel, creator3));
                        return true;
                    case 3014:
                        ((m) this).e(new jl3(parcel.readInt(), (PendingIntent) b.a(parcel, PendingIntent.CREATOR)));
                        return true;
                    case 3015:
                        parcel.readInt();
                        m mVar4 = (m) this;
                        try {
                            d9e.a((Bundle) b.a(parcel, Bundle.CREATOR));
                            mVar4.e(new k6());
                        } catch (RuntimeException e5) {
                            zkd.U("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e5);
                        }
                        break;
                    case 3016:
                        int i8 = parcel.readInt();
                        ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Bundle.CREATOR);
                        m mVar5 = (m) this;
                        if (arrayListCreateTypedArrayList2 != null) {
                            try {
                                int iH2 = mVar5.h();
                                if (iH2 != -1) {
                                    e47.b bVar2 = e47.b;
                                    e47.a aVar2 = new e47.a();
                                    for (int i9 = 0; i9 < arrayListCreateTypedArrayList2.size(); i9++) {
                                        Bundle bundle5 = (Bundle) arrayListCreateTypedArrayList2.get(i9);
                                        bundle5.getClass();
                                        aVar2.c(androidx.media3.session.a.d(iH2, bundle5));
                                    }
                                    mVar5.e(new ei9(i8, aVar2.f()));
                                }
                            } catch (RuntimeException e6) {
                                zkd.U("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e6);
                            }
                        }
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel.readInt();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                Bundle bundle6 = (Bundle) b.a(parcel, Bundle.CREATOR);
                m mVar6 = (m) this;
                if (TextUtils.isEmpty(string2)) {
                    zkd.T("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
                } else if (i10 < 0) {
                    g7.j(i10, "onSearchResultChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
                } else if (bundle6 == null) {
                    mVar6.e(new z3(13));
                } else {
                    try {
                        kj9.a(bundle6);
                        mVar6.e(new z3(13));
                    } catch (RuntimeException e7) {
                        zkd.U("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e7);
                    }
                }
            }
            return true;
        }
    }

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 0);
            }
        }
    }

    void B0(int i, Bundle bundle);

    void D0(int i, Bundle bundle);

    void F0(int i, Bundle bundle, Bundle bundle2);

    void G0(int i, Bundle bundle, Bundle bundle2);

    void K(int i, Bundle bundle);

    void a1(int i, Bundle bundle);

    void d(int i);

    void d1(int i, Bundle bundle, boolean z);

    void f();

    void k0(int i, Bundle bundle);

    void s(int i, Bundle bundle);
}
