package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes2.dex */
class RangeSlider$RangeSliderState extends AbsSavedState {
    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new a();
    public final float a;
    public final int b;

    public static class a implements Parcelable.Creator<RangeSlider$RangeSliderState> {
        @Override // android.os.Parcelable.Creator
        public final RangeSlider$RangeSliderState createFromParcel(Parcel parcel) {
            return new RangeSlider$RangeSliderState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RangeSlider$RangeSliderState[] newArray(int i) {
            return new RangeSlider$RangeSliderState[i];
        }
    }

    public RangeSlider$RangeSliderState(Parcel parcel) {
        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }
}
