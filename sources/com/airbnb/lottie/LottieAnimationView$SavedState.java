package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class LottieAnimationView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<LottieAnimationView$SavedState> CREATOR = new a();
    public String a;
    public float b;
    public boolean c;
    public String d;
    public int e;
    public int f;

    public class a implements Parcelable.Creator<LottieAnimationView$SavedState> {
        @Override // android.os.Parcelable.Creator
        public final LottieAnimationView$SavedState createFromParcel(Parcel parcel) {
            LottieAnimationView$SavedState lottieAnimationView$SavedState = new LottieAnimationView$SavedState(parcel);
            lottieAnimationView$SavedState.a = parcel.readString();
            lottieAnimationView$SavedState.b = parcel.readFloat();
            lottieAnimationView$SavedState.c = parcel.readInt() == 1;
            lottieAnimationView$SavedState.d = parcel.readString();
            lottieAnimationView$SavedState.e = parcel.readInt();
            lottieAnimationView$SavedState.f = parcel.readInt();
            return lottieAnimationView$SavedState;
        }

        @Override // android.os.Parcelable.Creator
        public final LottieAnimationView$SavedState[] newArray(int i) {
            return new LottieAnimationView$SavedState[i];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
