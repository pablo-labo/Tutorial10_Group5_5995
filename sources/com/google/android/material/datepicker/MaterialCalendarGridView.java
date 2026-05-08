package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.a3b;
import defpackage.epg;
import defpackage.gsg;
import defpackage.ojg;
import defpackage.t40;
import defpackage.te9;
import defpackage.zu1;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = ojg.f(null);
        if (g.O(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.indeed.android.jobsearch.R.id.cancel_button);
            setNextFocusRightId(com.indeed.android.jobsearch.R.id.confirm_button);
        }
        this.b = g.O(getContext(), com.indeed.android.jobsearch.R.attr.nestedScrollable);
        epg.o(this, new te9());
    }

    public final h a() {
        return (h) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((h) super.getAdapter()).notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iF;
        int width;
        int iF2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        h hVar = (h) super.getAdapter();
        DateSelector<?> dateSelector = hVar.b;
        zu1 zu1Var = hVar.d;
        Month month = hVar.a;
        int iF3 = month.f();
        int i2 = month.d;
        int iMax = Math.max(iF3, materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(hVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = hVar.getItem(iMax);
        Long item2 = hVar.getItem(iMin);
        Iterator it = dateSelector.N0().iterator();
        while (it.hasNext()) {
            a3b a3bVar = (a3b) it.next();
            F f = a3bVar.a;
            S s = a3bVar.b;
            if (f == 0) {
                materialCalendarGridView = this;
            } else if (s != 0) {
                Long l = (Long) f;
                long jLongValue = l.longValue();
                Long l2 = (Long) s;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    month = month;
                    it = it;
                    iMax = iMax;
                    hVar = hVar;
                } else {
                    boolean zC = gsg.c(materialCalendarGridView);
                    long jLongValue3 = item.longValue();
                    Iterator it2 = it;
                    Calendar calendar = materialCalendarGridView.a;
                    if (jLongValue < jLongValue3) {
                        width = iMax % i2 == 0 ? 0 : !zC ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        iF = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iF = month.f() + (calendar.get(5) - 1);
                        View viewB = materialCalendarGridView.b(iF);
                        width = (viewB.getWidth() / 2) + viewB.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % i2 == 0 ? materialCalendarGridView.getWidth() : !zC ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        iF2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iF2 = month.f() + (calendar.get(5) - 1);
                        View viewB2 = materialCalendarGridView.b(iF2);
                        width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                    }
                    int itemId = (int) hVar.getItemId(iF);
                    Month month2 = month;
                    int i3 = iMax;
                    int itemId2 = (int) hVar.getItemId(iF2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        h hVar2 = hVar;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewB3 = materialCalendarGridView.b(numColumns);
                        int top = viewB3.getTop() + zu1Var.a.a.top;
                        int i4 = width2;
                        int bottom = viewB3.getBottom() - zu1Var.a.a.bottom;
                        if (zC) {
                            int i5 = iF2 > numColumns2 ? 0 : i4;
                            int width4 = numColumns > iF ? getWidth() : width;
                            i = i5;
                            width3 = width4;
                        } else {
                            i = numColumns > iF ? 0 : width;
                            width3 = iF2 > numColumns2 ? getWidth() : i4;
                        }
                        canvas.drawRect(i, top, width3, bottom, zu1Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        hVar = hVar2;
                        width2 = i4;
                    }
                    materialCalendarGridView = this;
                    month = month2;
                    it = it2;
                    iMax = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((h) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((h) super.getAdapter()).a.f());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((h) super.getAdapter()).a.f()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((h) super.getAdapter()).a.f());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof h) {
            super.setAdapter(listAdapter);
        } else {
            t40.q("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((h) super.getAdapter()).a.f()) {
            super.setSelection(((h) super.getAdapter()).a.f());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (h) super.getAdapter();
    }
}
