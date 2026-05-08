package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.af9;
import defpackage.me9;
import defpackage.ng3;
import defpackage.ojg;
import defpackage.ojh;
import defpackage.rge;
import defpackage.xr5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new a();
    public Long a;

    public static class a implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList A1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Long E1() {
        return this.a;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String K0(Context context) {
        Resources resources = context.getResources();
        Long l = this.a;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, ng3.c(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void L1(long j) {
        this.a = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList N0() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int d0(Context context) {
        return me9.b(context, g.class.getCanonicalName(), R.attr.materialCalendarTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean v1() {
        return this.a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View w1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, af9.a aVar) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ojh.r()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatC = ojg.c();
        String strD = ojg.d(viewInflate.getResources(), simpleDateFormatC);
        textInputLayout.setPlaceholderText(strD);
        Long l = this.a;
        if (l != null) {
            editText.setText(simpleDateFormatC.format(l));
        }
        editText.addTextChangedListener(new rge(this, strD, simpleDateFormatC, textInputLayout, calendarConstraints, aVar));
        editText.requestFocus();
        editText.post(new xr5(editText, 1));
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }
}
