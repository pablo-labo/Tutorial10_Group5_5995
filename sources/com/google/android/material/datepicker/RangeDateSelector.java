package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.a3b;
import defpackage.af9;
import defpackage.kic;
import defpackage.lic;
import defpackage.me9;
import defpackage.ng3;
import defpackage.ojg;
import defpackage.ojh;
import defpackage.xr5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class RangeDateSelector implements DateSelector<a3b<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new a();
    public String a;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;

    public static class a implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, af9.a aVar) {
        Long l = rangeDateSelector.d;
        if (l == null || rangeDateSelector.e == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            aVar.a();
            return;
        }
        if (l.longValue() > rangeDateSelector.e.longValue()) {
            textInputLayout.setError(rangeDateSelector.a);
            textInputLayout2.setError(" ");
            aVar.a();
        } else {
            Long l2 = rangeDateSelector.d;
            rangeDateSelector.b = l2;
            Long l3 = rangeDateSelector.e;
            rangeDateSelector.c = l3;
            aVar.b(new a3b(l2, l3));
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList A1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.b;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.c;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final a3b<Long, Long> E1() {
        return new a3b<>(this.b, this.c);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String K0(Context context) {
        Resources resources = context.getResources();
        Long l = this.b;
        if (l == null && this.c == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.c;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, ng3.a(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, ng3.a(l2.longValue()));
        }
        Calendar calendarE = ojg.e();
        Calendar calendarF = ojg.f(null);
        calendarF.setTimeInMillis(l.longValue());
        Calendar calendarF2 = ojg.f(null);
        calendarF2.setTimeInMillis(l2.longValue());
        a3b a3bVar = calendarF.get(1) == calendarF2.get(1) ? calendarF.get(1) == calendarE.get(1) ? new a3b(ng3.b(l.longValue(), Locale.getDefault()), ng3.b(l2.longValue(), Locale.getDefault())) : new a3b(ng3.b(l.longValue(), Locale.getDefault()), ng3.c(l2.longValue(), Locale.getDefault())) : new a3b(ng3.c(l.longValue(), Locale.getDefault()), ng3.c(l2.longValue(), Locale.getDefault()));
        return resources.getString(R.string.mtrl_picker_range_header_selected, a3bVar.a, a3bVar.b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void L1(long j) {
        Long l = this.b;
        if (l == null) {
            this.b = Long.valueOf(j);
        } else if (this.c == null && l.longValue() <= j) {
            this.c = Long.valueOf(j);
        } else {
            this.c = null;
            this.b = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList N0() {
        if (this.b == null || this.c == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a3b(this.b, this.c));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int d0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return me9.b(context, g.class.getCanonicalName(), Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean v1() {
        Long l = this.b;
        return (l == null || this.c == null || l.longValue() > this.c.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View w1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, af9.a aVar) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ojh.r()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.a = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatC = ojg.c();
        Long l = this.b;
        if (l != null) {
            editText.setText(simpleDateFormatC.format(l));
            this.d = this.b;
        }
        Long l2 = this.c;
        if (l2 != null) {
            editText2.setText(simpleDateFormatC.format(l2));
            this.e = this.c;
        }
        String strD = ojg.d(viewInflate.getResources(), simpleDateFormatC);
        textInputLayout.setPlaceholderText(strD);
        textInputLayout2.setPlaceholderText(strD);
        editText.addTextChangedListener(new kic(this, strD, simpleDateFormatC, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, aVar));
        editText2.addTextChangedListener(new lic(this, strD, simpleDateFormatC, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, aVar));
        editText.requestFocus();
        editText.post(new xr5(editText, 1));
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
    }
}
