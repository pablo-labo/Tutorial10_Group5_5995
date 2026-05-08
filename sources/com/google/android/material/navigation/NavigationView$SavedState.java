package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<NavigationView$SavedState> CREATOR = new a();
    public final Bundle c;

    public NavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readBundle(classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.c);
    }

    public static class a implements Parcelable.ClassLoaderCreator<NavigationView$SavedState> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new NavigationView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavigationView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final NavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new NavigationView$SavedState(parcel, classLoader);
        }
    }
}
