package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import com.indeed.android.jobsearch.R;
import defpackage.dpg;
import defpackage.epg;
import defpackage.l5;
import defpackage.ojg;
import defpackage.prg;
import defpackage.r6;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends RecyclerView.e<a> {
    public final ContextThemeWrapper d;
    public final CalendarConstraints e;
    public final DateSelector<?> f;
    public final b.c g;
    public final int h;

    public static class a extends RecyclerView.b0 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            new dpg(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public j(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, b.c cVar) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.compareTo(month3) > 0) {
            l5.q("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.compareTo(month2) > 0) {
            l5.q("currentPage cannot be after lastPage");
            throw null;
        }
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * h.f;
        int dimensionPixelSize2 = g.O(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.d = contextThemeWrapper;
        this.h = dimensionPixelSize + dimensionPixelSize2;
        this.e = calendarConstraints;
        this.f = dateSelector;
        this.g = cVar;
        if (this.a.a()) {
            r6.g("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.e.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long d(int i) {
        Calendar calendarB = ojg.b(this.e.a.a);
        calendarB.add(2, i);
        return new Month(calendarB).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        CalendarConstraints calendarConstraints = this.e;
        Calendar calendarB = ojg.b(calendarConstraints.a.a);
        calendarB.add(2, i);
        Month month = new Month(calendarB);
        aVar.u.setText(month.m(aVar.a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().a)) {
            h hVar = new h(month, this.f, calendarConstraints);
            materialCalendarGridView.setNumColumns(month.d);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        } else {
            materialCalendarGridView.invalidate();
            h hVarA = materialCalendarGridView.a();
            DateSelector<?> dateSelector = hVarA.b;
            Iterator<Long> it = hVarA.c.iterator();
            while (it.hasNext()) {
                hVarA.e(materialCalendarGridView, it.next().longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.A1().iterator();
                while (it2.hasNext()) {
                    hVarA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                hVarA.c = dateSelector.A1();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new i(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!g.O(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.h));
        return new a(linearLayout, true);
    }
}
