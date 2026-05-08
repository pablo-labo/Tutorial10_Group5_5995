package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.indeed.android.jobsearch.R;
import defpackage.ojg;
import defpackage.yu1;
import defpackage.zu1;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends BaseAdapter {
    public static final int f = ojg.f(null).getMaximum(4);
    public final Month a;
    public final DateSelector<?> b;
    public Collection<Long> c;
    public zu1 d;
    public final CalendarConstraints e;

    public h(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.a = month;
        this.b = dateSelector;
        this.e = calendarConstraints;
        this.c = dateSelector.A1();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        Month month = this.a;
        if (i < month.f() || i > c()) {
            return null;
        }
        return Long.valueOf(month.h((i - month.f()) + 1));
    }

    public final int c() {
        Month month = this.a;
        return (month.f() + month.e) - 1;
    }

    public final void d(TextView textView, long j) {
        yu1 yu1Var;
        if (textView == null) {
            return;
        }
        if (this.e.c.h0(j)) {
            textView.setEnabled(true);
            Iterator it = this.b.A1().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (ojg.a(j) == ojg.a(((Long) it.next()).longValue())) {
                        yu1Var = this.d.b;
                        break;
                    }
                } else {
                    long timeInMillis = ojg.e().getTimeInMillis();
                    zu1 zu1Var = this.d;
                    yu1Var = timeInMillis == j ? zu1Var.c : zu1Var.a;
                }
            }
        } else {
            textView.setEnabled(false);
            yu1Var = this.d.g;
        }
        yu1Var.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthE = Month.e(j);
        Month month = this.a;
        if (monthE.equals(month)) {
            Calendar calendarB = ojg.b(month.a);
            calendarB.setTimeInMillis(j);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a.f() + (calendarB.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Month month = this.a;
        return month.e + month.f();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.d == null) {
            this.d = new zu1(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        Month month = this.a;
        int iF = i - month.f();
        if (iF < 0 || iF >= month.e) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = iF + 1;
            textView.setTag(month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
            long jH = month.h(i2);
            if (month.c == new Month(ojg.e()).c) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton.format(new Date(jH)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(jH)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        d(textView, item.longValue());
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
