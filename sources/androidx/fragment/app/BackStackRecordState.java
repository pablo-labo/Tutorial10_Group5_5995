package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.o;
import defpackage.kv8;
import defpackage.r6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final int V;
    public final int W;
    public final CharSequence X;
    public final int Y;
    public final CharSequence Z;
    public final int[] a;
    public final ArrayList<String> a0;
    public final ArrayList<String> b;
    public final ArrayList<String> b0;
    public final int[] c;
    public final boolean c0;
    public final int[] d;
    public final int e;
    public final String f;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.a = new int[size * 6];
        if (!aVar.g) {
            r6.g("Not on back stack");
            throw null;
        }
        this.b = new ArrayList<>(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o.a aVar2 = aVar.a.get(i2);
            int i3 = i + 1;
            this.a[i] = aVar2.a;
            ArrayList<String> arrayList = this.b;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.c[i2] = aVar2.h.ordinal();
            this.d[i2] = aVar2.i.ordinal();
        }
        this.e = aVar.f;
        this.f = aVar.i;
        this.V = aVar.t;
        this.W = aVar.j;
        this.X = aVar.k;
        this.Y = aVar.l;
        this.Z = aVar.m;
        this.a0 = aVar.n;
        this.b0 = aVar.o;
        this.c0 = aVar.p;
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                aVar.f = this.e;
                aVar.i = this.f;
                aVar.g = true;
                aVar.j = this.W;
                aVar.k = this.X;
                aVar.l = this.Y;
                aVar.m = this.Z;
                aVar.n = this.a0;
                aVar.o = this.b0;
                aVar.p = this.c0;
                return;
            }
            o.a aVar2 = new o.a();
            int i3 = i + 1;
            aVar2.a = iArr[i];
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            aVar2.h = kv8.b.values()[this.c[i2]];
            aVar2.i = kv8.b.values()[this.d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i5 = iArr[i4];
            aVar2.d = i5;
            int i6 = iArr[i + 3];
            aVar2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar2.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar2.g = i9;
            aVar.b = i5;
            aVar.c = i6;
            aVar.d = i8;
            aVar.e = i9;
            aVar.b(aVar2);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        TextUtils.writeToParcel(this.X, parcel, 0);
        parcel.writeInt(this.Y);
        TextUtils.writeToParcel(this.Z, parcel, 0);
        parcel.writeStringList(this.a0);
        parcel.writeStringList(this.b0);
        parcel.writeInt(this.c0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.X = (CharSequence) creator.createFromParcel(parcel);
        this.Y = parcel.readInt();
        this.Z = (CharSequence) creator.createFromParcel(parcel);
        this.a0 = parcel.createStringArrayList();
        this.b0 = parcel.createStringArrayList();
        this.c0 = parcel.readInt() != 0;
    }
}
