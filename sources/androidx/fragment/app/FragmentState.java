package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final String a;
    public final String a0;
    public final String b;
    public final int b0;
    public final boolean c;
    public final boolean c0;
    public final int d;
    public final int e;
    public final String f;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.V = parcel.readInt() != 0;
        this.W = parcel.readInt() != 0;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt() != 0;
        this.Z = parcel.readInt();
        this.a0 = parcel.readString();
        this.b0 = parcel.readInt();
        this.c0 = parcel.readInt() != 0;
    }

    public final Fragment a(i iVar, ClassLoader classLoader) {
        Fragment fragmentA = iVar.a(this.a);
        fragmentA.mWho = this.b;
        fragmentA.mFromLayout = this.c;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.d;
        fragmentA.mContainerId = this.e;
        fragmentA.mTag = this.f;
        fragmentA.mRetainInstance = this.V;
        fragmentA.mRemoving = this.W;
        fragmentA.mDetached = this.X;
        fragmentA.mHidden = this.Y;
        fragmentA.mMaxState = kv8.b.values()[this.Z];
        fragmentA.mTargetWho = this.a0;
        fragmentA.mTargetRequestCode = this.b0;
        fragmentA.mUserVisibleHint = this.c0;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.V) {
            sb.append(" retainInstance");
        }
        if (this.W) {
            sb.append(" removing");
        }
        if (this.X) {
            sb.append(" detached");
        }
        if (this.Y) {
            sb.append(" hidden");
        }
        String str2 = this.a0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.b0);
        }
        if (this.c0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z);
        parcel.writeString(this.a0);
        parcel.writeInt(this.b0);
        parcel.writeInt(this.c0 ? 1 : 0);
    }

    public FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.e = fragment.mContainerId;
        this.f = fragment.mTag;
        this.V = fragment.mRetainInstance;
        this.W = fragment.mRemoving;
        this.X = fragment.mDetached;
        this.Y = fragment.mHidden;
        this.Z = fragment.mMaxState.ordinal();
        this.a0 = fragment.mTargetWho;
        this.b0 = fragment.mTargetRequestCode;
        this.c0 = fragment.mUserVisibleHint;
    }
}
