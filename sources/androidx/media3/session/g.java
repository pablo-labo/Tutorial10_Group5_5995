package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.session.f;
import defpackage.akb;
import defpackage.bg;
import defpackage.c97;
import defpackage.g7;
import defpackage.ij9;
import defpackage.k20;
import defpackage.kj9;
import defpackage.l35;
import defpackage.n6;
import defpackage.qic;
import defpackage.sk3;
import defpackage.uw8;
import defpackage.vh6;
import defpackage.w20;
import defpackage.w40;
import defpackage.yk3;
import defpackage.z3;
import defpackage.zkd;

/* JADX INFO: loaded from: classes.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        public static final /* synthetic */ int a = 0;

        /* JADX INFO: renamed from: androidx.media3.session.g$a$a, reason: collision with other inner class name */
        public static class C0059a implements g {
            public IBinder a;

            @Override // androidx.media3.session.g
            public final void A0(f fVar, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3033, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void B(f fVar, int i, Bundle bundle, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3057, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void C0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3026, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void D(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void F(f fVar, int i, IBinder iBinder, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(1);
                    this.a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void G(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3042, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void I(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3047, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void I0(f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    this.a.transact(3045, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void J0(f fVar, int i, int i2, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3020, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void O0(f fVar, int i, Bundle bundle, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    parcelObtain.writeInt(1);
                    this.a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void P(f fVar, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void P0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3034, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void R0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3041, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void S0(f fVar, int i, int i2, int i3, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3056, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void T0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3024, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void U(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3046, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void U0(f fVar, int i, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void W(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3036, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void W0(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3052, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void X0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3040, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void Z(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3053, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.g
            public final void b0(f fVar, int i, Bundle bundle, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    parcelObtain.writeLong(j);
                    this.a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void c0(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3019, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void c1(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void d0(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3043, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void e0(f fVar, int i, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.a.transact(3038, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void f0(f fVar, int i, float f) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.a.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void f1(f fVar, int i, boolean z, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3054, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void g0(f fVar, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void g1(f fVar, int i, Bundle bundle, Bundle bundle2) {
                Bundle bundle3 = Bundle.EMPTY;
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    b.b(parcelObtain, bundle3);
                    this.a.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void h0(f fVar, int i, int i2, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3022, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void h1(f fVar, int i, IBinder iBinder, int i2, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void i0(f fVar, int i, float f) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.a.transact(3028, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void j0(f fVar, int i, int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3055, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void j1(f fVar, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3048, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void l(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void l0(f fVar, int i, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3031, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void m0(f fVar, int i, int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3030, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void n(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3025, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void n0(f fVar, int i, int i2, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3051, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void o0(f fVar, int i, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void p0(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3037, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void q0(f fVar, int i, int i2, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.a.transact(3039, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void r(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3021, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void r0(f fVar, int i, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void t(f fVar, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3035, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void u0(f fVar, int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, bundle);
                    this.a.transact(3027, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void v(f fVar, int i, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void v0(f fVar, int i, int i2, int i3, int i4) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    this.a.transact(3023, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void x0(f fVar, int i, Surface surface) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    b.b(parcelObtain, surface);
                    this.a.transact(3044, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.g
            public final void z0(f fVar, int i, int i2, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(fVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3032, parcelObtain, null, 1);
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
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSession");
                return true;
            }
            int i3 = 13;
            int i4 = 7;
            int i5 = 8;
            switch (i) {
                case 3002:
                    ((x) this).f0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    ((x) this).D(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    ((x) this).l(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3005:
                    ((x) this).c1(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3006:
                    ((x) this).o0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    ((x) this).O0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR), true);
                    return true;
                case 3008:
                    ((x) this).b0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    ((x) this).O0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3010:
                    ((x) this).F(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                    return true;
                case 3011:
                    ((x) this).F(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    ((x) this).h1(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    ((x) this).U0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    ((x) this).g0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3015:
                    ((x) this).P(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3016:
                    f fVarC = f.a.c(parcel.readStrongBinder());
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    ((x) this).g1(fVarC, i6, (Bundle) b.a(parcel, creator), (Bundle) b.a(parcel, creator));
                    return true;
                case 3017:
                    ((x) this).r0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    ((x) this).v(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3019:
                    ((x) this).c0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3020:
                    ((x) this).J0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    ((x) this).r(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3022:
                    ((x) this).h0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3023:
                    ((x) this).v0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3024:
                    ((x) this).T0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3025:
                    ((x) this).n(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3026:
                    ((x) this).C0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3027:
                    ((x) this).u0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3028:
                    ((x) this).i0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3029:
                    f fVarC2 = f.a.c(parcel.readStrongBinder());
                    int i7 = parcel.readInt();
                    Bundle bundle = (Bundle) b.a(parcel, Bundle.CREATOR);
                    x xVar = (x) this;
                    if (fVarC2 != null && bundle != null) {
                        try {
                            xVar.l1(fVarC2, i7, 20, new vh6(new uw8(new l35(ij9.a(bundle), i5), new akb()), i4));
                        } catch (RuntimeException e) {
                            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                        }
                    }
                    return true;
                case 3030:
                    ((x) this).m0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3031:
                    ((x) this).l0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3032:
                    ((x) this).z0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3033:
                    ((x) this).A0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3034:
                    ((x) this).P0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3035:
                    ((x) this).t(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3036:
                    ((x) this).W(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3037:
                    ((x) this).p0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3038:
                    ((x) this).e0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case 3039:
                    ((x) this).q0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3040:
                    ((x) this).X0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3041:
                    ((x) this).R0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3042:
                    ((x) this).G(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3043:
                    ((x) this).d0(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3044:
                    ((x) this).x0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Surface) b.a(parcel, Surface.CREATOR));
                    return true;
                case 3045:
                    ((x) this).I0(f.a.c(parcel.readStrongBinder()));
                    return true;
                case 3046:
                    ((x) this).U(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3047:
                    ((x) this).I(f.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3048:
                    ((x) this).j1(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3049:
                    f fVarC3 = f.a.c(parcel.readStrongBinder());
                    int i8 = parcel.readInt();
                    String string = parcel.readString();
                    Bundle bundle2 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    x xVar2 = (x) this;
                    if (fVarC3 != null && string != null && bundle2 != null) {
                        if (TextUtils.isEmpty(string)) {
                            zkd.T("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                        } else {
                            try {
                                xVar2.c(fVarC3, i8, null, 40010, new vh6(new z3(14, string, qic.a(bundle2)), i4));
                            } catch (RuntimeException e2) {
                                zkd.U("MediaSessionStub", "Ignoring malformed Bundle for Rating", e2);
                            }
                        }
                    }
                    return true;
                case 3050:
                    f fVarC4 = f.a.c(parcel.readStrongBinder());
                    int i9 = parcel.readInt();
                    Bundle bundle3 = (Bundle) b.a(parcel, Bundle.CREATOR);
                    x xVar3 = (x) this;
                    if (fVarC4 != null && bundle3 != null) {
                        try {
                            xVar3.c(fVarC4, i9, null, 40010, new vh6(new k20(qic.a(bundle3), i3), i4));
                        } catch (RuntimeException e3) {
                            zkd.U("MediaSessionStub", "Ignoring malformed Bundle for Rating", e3);
                        }
                    }
                    return true;
                case 3051:
                    ((x) this).n0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3052:
                    ((x) this).W0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3053:
                    ((x) this).Z(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3054:
                    ((x) this).f1(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 3055:
                    ((x) this).j0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3056:
                    ((x) this).S0(f.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3057:
                    ((x) this).B(f.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                default:
                    kj9 kj9VarA = null;
                    switch (i) {
                        case 4001:
                            f fVarC5 = f.a.c(parcel.readStrongBinder());
                            int i10 = parcel.readInt();
                            Bundle bundle4 = (Bundle) b.a(parcel, Bundle.CREATOR);
                            x xVar4 = (x) this;
                            if (fVarC5 != null) {
                                if (bundle4 == null) {
                                    xVar4.c(fVarC5, i10, null, 50000, new sk3(new yk3(kj9VarA, 6), i5));
                                } else {
                                    try {
                                        kj9VarA = kj9.a(bundle4);
                                        xVar4.c(fVarC5, i10, null, 50000, new sk3(new yk3(kj9VarA, 6), i5));
                                    } catch (RuntimeException e4) {
                                        zkd.U("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e4);
                                    }
                                }
                            }
                            return true;
                        case 4002:
                            f fVarC6 = f.a.c(parcel.readStrongBinder());
                            int i11 = parcel.readInt();
                            String string2 = parcel.readString();
                            x xVar5 = (x) this;
                            if (fVarC6 != null) {
                                if (TextUtils.isEmpty(string2)) {
                                    zkd.T("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                    return true;
                                }
                                xVar5.c(fVarC6, i11, null, 50004, new sk3(new bg(13), i5));
                                return true;
                            }
                            return true;
                        case 4003:
                            f fVarC7 = f.a.c(parcel.readStrongBinder());
                            int i12 = parcel.readInt();
                            String string3 = parcel.readString();
                            int i13 = parcel.readInt();
                            int i14 = parcel.readInt();
                            Bundle bundle5 = (Bundle) b.a(parcel, Bundle.CREATOR);
                            x xVar6 = (x) this;
                            if (fVarC7 != null) {
                                if (TextUtils.isEmpty(string3)) {
                                    zkd.T("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                                } else if (i13 < 0) {
                                    zkd.T("MediaSessionStub", "getChildren(): Ignoring negative page");
                                } else if (i14 < 1) {
                                    zkd.T("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                                } else if (bundle5 == null) {
                                    xVar6.c(fVarC7, i12, null, 50003, new sk3(new c97(string3, i13, i14, kj9VarA), i5));
                                } else {
                                    try {
                                        kj9VarA = kj9.a(bundle5);
                                        xVar6.c(fVarC7, i12, null, 50003, new sk3(new c97(string3, i13, i14, kj9VarA), i5));
                                    } catch (RuntimeException e5) {
                                        zkd.U("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                            }
                            return true;
                        case 4004:
                            f fVarC8 = f.a.c(parcel.readStrongBinder());
                            int i15 = parcel.readInt();
                            String string4 = parcel.readString();
                            Bundle bundle6 = (Bundle) b.a(parcel, Bundle.CREATOR);
                            x xVar7 = (x) this;
                            if (fVarC8 != null) {
                                if (TextUtils.isEmpty(string4)) {
                                    zkd.T("MediaSessionStub", "search(): Ignoring empty query");
                                } else if (bundle6 == null) {
                                    xVar7.c(fVarC8, i15, null, 50005, new sk3(new w40(12), i5));
                                } else {
                                    try {
                                        kj9.a(bundle6);
                                        xVar7.c(fVarC8, i15, null, 50005, new sk3(new w40(12), i5));
                                    } catch (RuntimeException e6) {
                                        zkd.U("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                            }
                            return true;
                        case 4005:
                            f fVarC9 = f.a.c(parcel.readStrongBinder());
                            int i16 = parcel.readInt();
                            String string5 = parcel.readString();
                            int i17 = parcel.readInt();
                            int i18 = parcel.readInt();
                            Bundle bundle7 = (Bundle) b.a(parcel, Bundle.CREATOR);
                            x xVar8 = (x) this;
                            if (fVarC9 != null) {
                                if (TextUtils.isEmpty(string5)) {
                                    zkd.T("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                                } else if (i17 < 0) {
                                    zkd.T("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                                } else if (i18 < 1) {
                                    zkd.T("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                                } else if (bundle7 == null) {
                                    xVar8.c(fVarC9, i16, null, 50006, new sk3(new n6(i5), i5));
                                } else {
                                    try {
                                        kj9.a(bundle7);
                                        xVar8.c(fVarC9, i16, null, 50006, new sk3(new n6(i5), i5));
                                    } catch (RuntimeException e7) {
                                        zkd.U("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                            }
                            return true;
                        case 4006:
                            f fVarC10 = f.a.c(parcel.readStrongBinder());
                            int i19 = parcel.readInt();
                            String string6 = parcel.readString();
                            Bundle bundle8 = (Bundle) b.a(parcel, Bundle.CREATOR);
                            x xVar9 = (x) this;
                            if (fVarC10 != null) {
                                if (TextUtils.isEmpty(string6)) {
                                    zkd.T("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                                } else if (bundle8 == null) {
                                    xVar9.c(fVarC10, i19, null, 50001, new sk3(new g7(18, string6, kj9VarA), i5));
                                } else {
                                    try {
                                        kj9VarA = kj9.a(bundle8);
                                        xVar9.c(fVarC10, i19, null, 50001, new sk3(new g7(18, string6, kj9VarA), i5));
                                    } catch (RuntimeException e8) {
                                        zkd.U("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e8);
                                    }
                                }
                            }
                            return true;
                        case 4007:
                            f fVarC11 = f.a.c(parcel.readStrongBinder());
                            int i20 = parcel.readInt();
                            String string7 = parcel.readString();
                            x xVar10 = (x) this;
                            if (fVarC11 != null) {
                                if (TextUtils.isEmpty(string7)) {
                                    zkd.T("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                    return true;
                                }
                                xVar10.c(fVarC11, i20, null, 50002, new sk3(new w20(15), i5));
                                return true;
                            }
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
            }
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

    void A0(f fVar, int i, Bundle bundle);

    void B(f fVar, int i, Bundle bundle, boolean z);

    void C0(f fVar, int i);

    void D(f fVar, int i, int i2);

    void F(f fVar, int i, IBinder iBinder, boolean z);

    void G(f fVar, int i);

    void I(f fVar, int i);

    void I0(f fVar);

    void J0(f fVar, int i, int i2, int i3);

    void O0(f fVar, int i, Bundle bundle, boolean z);

    void P(f fVar, int i, Bundle bundle);

    void P0(f fVar, int i);

    void R0(f fVar, int i);

    void S0(f fVar, int i, int i2, int i3, IBinder iBinder);

    void T0(f fVar, int i);

    void U(f fVar, int i);

    void U0(f fVar, int i, boolean z);

    void W(f fVar, int i);

    void W0(f fVar, int i, int i2);

    void X0(f fVar, int i);

    void Z(f fVar, int i, int i2);

    void b0(f fVar, int i, Bundle bundle, long j);

    void c0(f fVar, int i, int i2);

    void c1(f fVar, int i);

    void d0(f fVar, int i);

    void e0(f fVar, int i, long j);

    void f0(f fVar, int i, float f);

    void f1(f fVar, int i, boolean z, int i2);

    void g0(f fVar, int i, Bundle bundle);

    void g1(f fVar, int i, Bundle bundle, Bundle bundle2);

    void h0(f fVar, int i, int i2, int i3);

    void h1(f fVar, int i, IBinder iBinder, int i2, long j);

    void i0(f fVar, int i, float f);

    void j0(f fVar, int i, int i2, Bundle bundle);

    void j1(f fVar, int i, Bundle bundle);

    void l(f fVar, int i);

    void l0(f fVar, int i, IBinder iBinder);

    void m0(f fVar, int i, int i2, Bundle bundle);

    void n(f fVar, int i);

    void n0(f fVar, int i, int i2, int i3);

    void o0(f fVar, int i, boolean z);

    void p0(f fVar, int i, int i2);

    void q0(f fVar, int i, int i2, long j);

    void r(f fVar, int i);

    void r0(f fVar, int i, int i2);

    void t(f fVar, int i);

    void u0(f fVar, int i, Bundle bundle);

    void v(f fVar, int i, boolean z);

    void v0(f fVar, int i, int i2, int i3, int i4);

    void x0(f fVar, int i, Surface surface);

    void z0(f fVar, int i, int i2, IBinder iBinder);
}
