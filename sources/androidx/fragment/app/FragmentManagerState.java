package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentManager.LaunchedFragmentInfo> W;
    public ArrayList<String> a;
    public ArrayList<String> b;
    public BackStackRecordState[] c;
    public int d;
    public String e = null;
    public ArrayList<String> f = new ArrayList<>();
    public ArrayList<BackStackState> V = new ArrayList<>();

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.e = null;
            fragmentManagerState.f = new ArrayList<>();
            fragmentManagerState.V = new ArrayList<>();
            fragmentManagerState.a = parcel.createStringArrayList();
            fragmentManagerState.b = parcel.createStringArrayList();
            fragmentManagerState.c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.d = parcel.readInt();
            fragmentManagerState.e = parcel.readString();
            fragmentManagerState.f = parcel.createStringArrayList();
            fragmentManagerState.V = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.W = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.V);
        parcel.writeTypedList(this.W);
    }
}
