package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new a();
    public final boolean c;
    public final int d;

    public SlidingPaneLayout$SavedState(Parcel parcel) {
        super(parcel, null);
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }

    public class a implements Parcelable.ClassLoaderCreator<SlidingPaneLayout$SavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SlidingPaneLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SlidingPaneLayout$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlidingPaneLayout$SavedState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SlidingPaneLayout$SavedState(parcel);
        }
    }
}
