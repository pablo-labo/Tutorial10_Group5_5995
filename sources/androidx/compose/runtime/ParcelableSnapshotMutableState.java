package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import defpackage.gme;
import defpackage.hme;
import defpackage.r6;
import defpackage.wab;
import defpackage.wg2;
import defpackage.wl7;
import defpackage.zkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lgme;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableState<T> extends gme<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    public ParcelableSnapshotMutableState() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        zkd zkdVar = zkd.f;
        hme<T> hmeVar = this.b;
        if (wl7.b(hmeVar, zkdVar)) {
            i2 = 0;
        } else if (wl7.b(hmeVar, wab.a0)) {
            i2 = 1;
        } else {
            if (!wl7.b(hmeVar, wg2.Z)) {
                r6.g("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
            hme hmeVar;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                hmeVar = zkd.f;
            } else if (i == 1) {
                hmeVar = wab.a0;
            } else {
                if (i != 2) {
                    r6.g(bg.d(i, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
                hmeVar = wg2.Z;
            }
            return new ParcelableSnapshotMutableState(value, hmeVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
