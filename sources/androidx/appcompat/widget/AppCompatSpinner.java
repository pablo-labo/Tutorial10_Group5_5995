package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import defpackage.dz8;
import defpackage.fd4;
import defpackage.isg;
import defpackage.nkf;
import defpackage.pnb;
import defpackage.uj0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatSpinner extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] a0 = {R.attr.spinnerMode};
    public int V;
    public final Rect W;
    public final AppCompatBackgroundHelper a;
    public final Context b;
    public final androidx.appcompat.widget.a c;
    public SpinnerAdapter d;
    public final boolean e;
    public final f f;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.a = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().a()) {
                appCompatSpinner.f.k(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class c implements f, DialogInterface.OnClickListener {
        public androidx.appcompat.app.c a;
        public d b;
        public CharSequence c;

        public c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final boolean a() {
            androidx.appcompat.app.c cVar = this.a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void dismiss() {
            androidx.appcompat.app.c cVar = this.a;
            if (cVar != null) {
                cVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final CharSequence f() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void h(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void i(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void k(int i, int i2) {
            if (this.b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            c.a aVar = new c.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            d dVar = this.b;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.b bVar = aVar.a;
            bVar.q = dVar;
            bVar.r = this;
            bVar.u = selectedItemPosition;
            bVar.t = true;
            androidx.appcompat.app.c cVarCreate = aVar.create();
            this.a = cVarCreate;
            AlertController.RecycleListView recycleListView = cVarCreate.f.f;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i2);
            this.a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void m(ListAdapter listAdapter) {
            this.b = (d) listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i, this.b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter a;
        public ListAdapter b;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class e extends dz8 implements f {
        public CharSequence q0;
        public d r0;
        public final Rect s0;
        public int t0;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                appCompatSpinner.setSelection(i);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i, eVar.r0.getItemId(i));
                }
                eVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(eVar.s0)) {
                    eVar.dismiss();
                } else {
                    eVar.s();
                    eVar.b();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ b a;

            public c(b bVar) {
                this.a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.s0 = new Rect();
            this.d0 = AppCompatSpinner.this;
            this.m0 = true;
            this.n0.setFocusable(true);
            this.e0 = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final CharSequence f() {
            return this.q0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void h(CharSequence charSequence) {
            this.q0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void j(int i) {
            this.t0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void k(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            uj0 uj0Var = this.n0;
            boolean zIsShowing = uj0Var.isShowing();
            s();
            uj0Var.setInputMethodMode(2);
            b();
            fd4 fd4Var = this.c;
            fd4Var.setChoiceMode(1);
            fd4Var.setTextDirection(i);
            fd4Var.setTextAlignment(i2);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            fd4 fd4Var2 = this.c;
            if (uj0Var.isShowing() && fd4Var2 != null) {
                fd4Var2.setListSelectionHidden(false);
                fd4Var2.setSelection(selectedItemPosition);
                if (fd4Var2.getChoiceMode() != 0) {
                    fd4Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            uj0Var.setOnDismissListener(new c(bVar));
        }

        @Override // defpackage.dz8, androidx.appcompat.widget.AppCompatSpinner.f
        public final void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.r0 = (d) listAdapter;
        }

        public final void s() {
            int i;
            uj0 uj0Var = this.n0;
            Drawable background = uj0Var.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            Rect rect = appCompatSpinner.W;
            if (background != null) {
                background.getPadding(rect);
                boolean z = isg.a;
                i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
            } else {
                i = 0;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i2 = appCompatSpinner.V;
            if (i2 == -2) {
                int iA = appCompatSpinner.a(this.r0, uj0Var.getBackground());
                int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
                if (iA > i3) {
                    iA = i3;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i2);
            }
            boolean z2 = isg.a;
            this.f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.t0) + i : paddingLeft + this.t0 + i;
        }
    }

    public interface f {
        boolean a();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i);

        void j(int i);

        void k(int i, int i2);

        int l();

        void m(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r12, android.util.AttributeSet r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.W;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f;
        return fVar != null ? fVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f;
        return fVar != null ? fVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.V : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f;
        return fVar != null ? fVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f;
        if (fVar == null || !fVar.a()) {
            return;
        }
        fVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f;
        savedState.a = fVar != null && fVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.appcompat.widget.a aVar = this.c;
        if (aVar == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        f fVar = this.f;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.a()) {
            return true;
        }
        fVar.k(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        f fVar = this.f;
        if (fVar != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof nkf) {
                    nkf nkfVar = (nkf) spinnerAdapter;
                    if (nkfVar.getDropDownViewTheme() == null) {
                        nkfVar.a();
                    }
                }
            }
            fVar.m(dVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.f;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            fVar.j(i);
            fVar.e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f != null) {
            this.V = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(pnb.A(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }
}
