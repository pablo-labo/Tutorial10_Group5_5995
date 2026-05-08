package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import defpackage.l6;

/* JADX INFO: loaded from: classes.dex */
class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new a();
    public String a;

    public class a implements Parcelable.Creator<FragmentTabHost$SavedState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentTabHost$SavedState createFromParcel(Parcel parcel) {
            FragmentTabHost$SavedState fragmentTabHost$SavedState = new FragmentTabHost$SavedState(parcel);
            fragmentTabHost$SavedState.a = parcel.readString();
            return fragmentTabHost$SavedState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentTabHost$SavedState[] newArray(int i) {
            return new FragmentTabHost$SavedState[i];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" curTab=");
        return l6.i(sb, this.a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
