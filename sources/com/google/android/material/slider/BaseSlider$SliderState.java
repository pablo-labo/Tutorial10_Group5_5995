package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new a();
    public float a;
    public float b;
    public ArrayList<Float> c;
    public float d;
    public boolean e;

    public static class a implements Parcelable.Creator<BaseSlider$SliderState> {
        @Override // android.os.Parcelable.Creator
        public final BaseSlider$SliderState createFromParcel(Parcel parcel) {
            BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(parcel);
            baseSlider$SliderState.a = parcel.readFloat();
            baseSlider$SliderState.b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            baseSlider$SliderState.c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            baseSlider$SliderState.d = parcel.readFloat();
            baseSlider$SliderState.e = parcel.createBooleanArray()[0];
            return baseSlider$SliderState;
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSlider$SliderState[] newArray(int i) {
            return new BaseSlider$SliderState[i];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeList(this.c);
        parcel.writeFloat(this.d);
        parcel.writeBooleanArray(new boolean[]{this.e});
    }
}
