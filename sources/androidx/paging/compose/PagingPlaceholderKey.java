package androidx.paging.compose;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final /* data */ class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new a();
    public final int a;

    public static final class a implements Parcelable.Creator<PagingPlaceholderKey> {
        @Override // android.os.Parcelable.Creator
        public final PagingPlaceholderKey createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PagingPlaceholderKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PagingPlaceholderKey[] newArray(int i) {
            return new PagingPlaceholderKey[i];
        }
    }

    public PagingPlaceholderKey(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.a == ((PagingPlaceholderKey) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return k6.h(new StringBuilder("PagingPlaceholderKey(index="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
