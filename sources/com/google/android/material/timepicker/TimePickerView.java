package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.l5;
import defpackage.prg;
import defpackage.wlf;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int l0 = 0;
    public final MaterialButtonToggleGroup k0;

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.l0;
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.k0 = materialButtonToggleGroup;
        materialButtonToggleGroup.d.add(new c());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        chip.setAccessibilityLiveRegion(2);
        chip2.setAccessibilityLiveRegion(2);
        wlf wlfVar = new wlf(new GestureDetector(getContext(), new d()));
        chip.setOnTouchListener(wlfVar);
        chip2.setOnTouchListener(wlfVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public final void h() {
        c.a aVar;
        if (this.k0.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.b(this);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            char c = getLayoutDirection() == 0 ? (char) 2 : (char) 1;
            Integer numValueOf = Integer.valueOf(R.id.material_clock_display);
            HashMap<Integer, c.a> map = cVar.c;
            if (map.containsKey(numValueOf) && (aVar = map.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                c.b bVar = aVar.d;
                switch (c) {
                    case 1:
                        bVar.h = -1;
                        bVar.g = -1;
                        bVar.E = -1;
                        bVar.L = Integer.MIN_VALUE;
                        break;
                    case 2:
                        bVar.j = -1;
                        bVar.i = -1;
                        bVar.F = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 3:
                        bVar.l = -1;
                        bVar.k = -1;
                        bVar.G = 0;
                        bVar.M = Integer.MIN_VALUE;
                        break;
                    case 4:
                        bVar.m = -1;
                        bVar.n = -1;
                        bVar.H = 0;
                        bVar.O = Integer.MIN_VALUE;
                        break;
                    case 5:
                        bVar.o = -1;
                        bVar.p = -1;
                        bVar.q = -1;
                        bVar.K = 0;
                        bVar.R = Integer.MIN_VALUE;
                        break;
                    case 6:
                        bVar.r = -1;
                        bVar.s = -1;
                        bVar.J = 0;
                        bVar.Q = Integer.MIN_VALUE;
                        break;
                    case 7:
                        bVar.t = -1;
                        bVar.u = -1;
                        bVar.I = 0;
                        bVar.P = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        bVar.A = -1.0f;
                        bVar.z = -1;
                        bVar.y = -1;
                        break;
                    default:
                        l5.q("unknown constraint");
                        return;
                }
            }
            cVar.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            h();
        }
    }
}
