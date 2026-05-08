package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import defpackage.l5;
import defpackage.osf;
import defpackage.rca;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationBarPresenter implements j {
    public rca a;
    public boolean b;
    public int c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public ParcelableSparseArray b;

        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            rca rcaVar = this.a;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.a;
            int size = rcaVar.t0.f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = rcaVar.t0.getItem(i2);
                if (i == item.getItemId()) {
                    rcaVar.V = i;
                    rcaVar.W = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.b;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable.SavedState savedState2 = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i3);
                if (savedState2 == null) {
                    l5.q("BadgeDrawable's savedState cannot be null");
                    return;
                }
                BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                badgeDrawable.j(savedState2.e);
                int i4 = savedState2.d;
                if (i4 != -1) {
                    badgeDrawable.k(i4);
                }
                badgeDrawable.g(savedState2.a);
                badgeDrawable.i(savedState2.b);
                badgeDrawable.h(savedState2.X);
                int i5 = savedState2.Z;
                BadgeDrawable.SavedState savedState3 = badgeDrawable.W;
                savedState3.Z = i5;
                badgeDrawable.m();
                savedState3.a0 = savedState2.a0;
                badgeDrawable.m();
                savedState3.b0 = savedState2.b0;
                badgeDrawable.m();
                savedState3.c0 = savedState2.c0;
                badgeDrawable.m();
                savedState3.d0 = savedState2.d0;
                badgeDrawable.m();
                savedState3.e0 = savedState2.e0;
                badgeDrawable.m();
                boolean z = savedState2.Y;
                badgeDrawable.setVisible(z, false);
                savedState3.Y = z;
                sparseArray.put(iKeyAt, badgeDrawable);
            }
            this.a.setBadgeDrawables(sparseArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.a.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            if (badgeDrawableValueAt == null) {
                l5.q("badgeDrawable cannot be null");
                return null;
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.W);
        }
        savedState.b = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        if (this.b) {
            return;
        }
        rca rcaVar = this.a;
        if (z) {
            rcaVar.b();
            return;
        }
        f fVar = rcaVar.t0;
        if (fVar == null || rcaVar.f == null) {
            return;
        }
        int size = fVar.f.size();
        if (size != rcaVar.f.length) {
            rcaVar.b();
            return;
        }
        int i = rcaVar.V;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = rcaVar.t0.getItem(i2);
            if (item.isChecked()) {
                rcaVar.V = item.getItemId();
                rcaVar.W = i2;
            }
        }
        if (i != rcaVar.V) {
            osf.a(rcaVar, rcaVar.a);
        }
        int i3 = rcaVar.e;
        boolean z2 = i3 != -1 ? i3 == 0 : rcaVar.t0.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            rcaVar.s0.b = true;
            rcaVar.f[i4].setLabelVisibilityMode(rcaVar.e);
            rcaVar.f[i4].setShifting(z2);
            rcaVar.f[i4].c((h) rcaVar.t0.getItem(i4));
            rcaVar.s0.b = false;
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, f fVar) {
        this.a.t0 = fVar;
    }
}
