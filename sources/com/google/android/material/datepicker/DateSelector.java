package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.af9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    ArrayList A1();

    S E1();

    String K0(Context context);

    void L1(long j);

    ArrayList N0();

    int d0(Context context);

    boolean v1();

    View w1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, af9.a aVar);
}
