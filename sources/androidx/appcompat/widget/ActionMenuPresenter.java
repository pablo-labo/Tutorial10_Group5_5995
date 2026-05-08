package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.indeed.android.jobsearch.R;
import defpackage.ko9;
import defpackage.m7;
import defpackage.qnf;
import defpackage.r6;
import defpackage.vee;
import defpackage.yp5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.a {
    public d Y;
    public Drawable Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public final SparseBooleanArray h0;
    public e i0;
    public a j0;
    public c k0;
    public b l0;
    public final f m0;
    public int n0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
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
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((mVar.A.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.Y;
                this.e = view2 == null ? (View) ActionMenuPresenter.this.W : view2;
            }
            f fVar = ActionMenuPresenter.this.m0;
            this.h = fVar;
            ko9 ko9Var = this.i;
            if (ko9Var != null) {
                ko9Var.d(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.j0 = null;
            actionMenuPresenter.n0 = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {
        public final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.q(fVar);
            }
            View view = (View) actionMenuPresenter.W;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.a;
                if (eVar.b()) {
                    actionMenuPresenter.i0 = eVar;
                } else if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                    actionMenuPresenter.i0 = eVar;
                }
            }
            actionMenuPresenter.k0 = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends yp5 {
            public a(d dVar) {
                super(dVar);
            }

            @Override // defpackage.yp5
            public final vee b() {
                e eVar = ActionMenuPresenter.this.i0;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // defpackage.yp5
            public final boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            @Override // defpackage.yp5
            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.k0 != null) {
                    return false;
                }
                actionMenuPresenter.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            qnf.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(context, fVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f = 8388613;
            f fVar2 = ActionMenuPresenter.this.m0;
            this.h = fVar2;
            ko9 ko9Var = this.i;
            if (ko9Var != null) {
                ko9Var.d(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
            if (fVar != null) {
                fVar.c(true);
            }
            actionMenuPresenter.i0 = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                ((m) fVar).z.k().c(false);
            }
            j.a aVar = ActionMenuPresenter.this.e;
            if (aVar != null) {
                aVar.c(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.c) {
                return false;
            }
            actionMenuPresenter.n0 = ((m) fVar).A.a;
            j.a aVar = actionMenuPresenter.e;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = R.layout.abc_action_menu_layout;
        this.V = R.layout.abc_action_menu_item_layout;
        this.h0 = new SparseBooleanArray();
        this.m0 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            k.a aVar = view instanceof k.a ? (k.a) view : (k.a) this.d.inflate(this.V, viewGroup, false);
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.W);
            if (this.l0 == null) {
                this.l0 = new b();
            }
            actionMenuItemView.setPopupCallback(this.l0);
            actionView = (View) aVar;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        c cVar = this.k0;
        if (cVar != null && (obj = this.W) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.k0 = null;
            return true;
        }
        e eVar = this.i0;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        b();
        a aVar = this.j0;
        if (aVar != null && aVar.b()) {
            aVar.i.dismiss();
        }
        j.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).a) > 0 && (menuItemFindItem = this.c.findItem(i)) != null) {
            g((m) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.z;
                if (fVar == this.c) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            h hVar = mVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.W;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == hVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.n0 = mVar.A.a;
                int size = mVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                a aVar = new a(this.b, mVar, view);
                this.j0 = aVar;
                aVar.g = z;
                ko9 ko9Var = aVar.i;
                if (ko9Var != null) {
                    ko9Var.q(z);
                }
                a aVar2 = this.j0;
                if (!aVar2.b()) {
                    if (aVar2.e == null) {
                        r6.g("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    aVar2.d(0, 0, false, false);
                }
                j.a aVar3 = this.e;
                if (aVar3 != null) {
                    aVar3.d(mVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.n0;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.W;
        ArrayList<h> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = arrayListL.get(i2);
                    if ((hVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.W).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.Y) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.W).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                m7 m7Var = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.b0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        d dVar = this.Y;
        if (z2) {
            if (dVar == null) {
                this.Y = new d(this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.Y.getParent();
            if (viewGroup3 != this.W) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.Y);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.W;
                d dVar2 = this.Y;
                actionMenuView.getClass();
                ActionMenuView.c cVarJ = ActionMenuView.j();
                cVarJ.a = true;
                actionMenuView.addView(dVar2, cVarJ);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.W;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.Y);
            }
        }
        ((ActionMenuView) this.W).setOverflowReserved(this.b0);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        int size;
        ArrayList<h> arrayListL;
        int i;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.c;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = actionMenuPresenter.f0;
        int i3 = actionMenuPresenter.e0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.W;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            h hVar = arrayListL.get(i4);
            int i7 = hVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.g0 && hVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (actionMenuPresenter.b0 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.h0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            h hVar2 = arrayListL.get(i9);
            int i11 = hVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = hVar2.b;
            if (z3) {
                View viewA = actionMenuPresenter.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                hVar2.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = actionMenuPresenter.a(hVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        h hVar3 = arrayListL.get(i13);
                        if (hVar3.b == i12) {
                            if ((hVar3.x & 32) == 32) {
                                i8++;
                            }
                            hVar3.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                hVar2.g(z5);
            } else {
                hVar2.g(false);
                i9++;
                i = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i9++;
            i = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(Context context, androidx.appcompat.view.menu.f fVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = fVar;
        Resources resources = context.getResources();
        if (!this.c0) {
            this.b0 = true;
        }
        int i = 2;
        this.d0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f0 = i;
        int measuredWidth = this.d0;
        if (this.b0) {
            if (this.Y == null) {
                d dVar = new d(this.a);
                this.Y = dVar;
                if (this.a0) {
                    dVar.setImageDrawable(this.Z);
                    this.Z = null;
                    this.a0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.Y.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.Y.getMeasuredWidth();
        } else {
            this.Y = null;
        }
        this.e0 = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    public final boolean m() {
        e eVar = this.i0;
        return eVar != null && eVar.b();
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.b0 || m() || (fVar = this.c) == null || this.W == null || this.k0 != null) {
            return false;
        }
        fVar.i();
        if (fVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.c, this.Y));
        this.k0 = cVar;
        ((View) this.W).post(cVar);
        return true;
    }
}
