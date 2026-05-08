package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.kv8;
import defpackage.zaa;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.a = string;
        this.b = parcel.readInt();
        this.c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        bundle.getClass();
        this.d = bundle;
    }

    public final d a(Context context, k kVar, kv8.b bVar, zaa zaaVar) {
        context.getClass();
        bVar.getClass();
        Bundle bundle = this.c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.a;
        str.getClass();
        return new d(context, kVar, bundle2, bVar, zaaVar, str, this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.d);
    }

    public NavBackStackEntryState(d dVar) {
        dVar.getClass();
        this.a = dVar.f;
        this.b = dVar.b.W;
        this.c = dVar.a();
        Bundle bundle = new Bundle();
        this.d = bundle;
        dVar.X.b(bundle);
    }
}
