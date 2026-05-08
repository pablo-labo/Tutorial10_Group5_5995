package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.indeed.android.jobsearch.R;
import defpackage.af9;
import defpackage.dab;
import defpackage.epg;
import defpackage.ira;
import defpackage.jf7;
import defpackage.l5;
import defpackage.me9;
import defpackage.ojg;
import defpackage.pnb;
import defpackage.prg;
import defpackage.ve9;
import defpackage.we9;
import defpackage.ze9;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g<S> extends androidx.fragment.app.f {
    public final LinkedHashSet<we9<? super S>> f0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> g0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> h0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> i0 = new LinkedHashSet<>();
    public int j0;
    public DateSelector<S> k0;
    public dab<S> l0;
    public CalendarConstraints m0;
    public com.google.android.material.datepicker.b<S> n0;
    public int o0;
    public CharSequence p0;
    public boolean q0;
    public int r0;
    public TextView s0;
    public CheckableImageButton t0;
    public ze9 u0;
    public Button v0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = g.this;
            for (we9<? super S> we9Var : gVar.f0) {
                gVar.M().getClass();
                we9Var.a();
            }
            gVar.F(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = g.this;
            Iterator<View.OnClickListener> it = gVar.g0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            gVar.F(false, false);
        }
    }

    public class c extends ira<S> {
        public c() {
        }

        @Override // defpackage.ira
        public final void a() {
            g.this.v0.setEnabled(false);
        }

        @Override // defpackage.ira
        public final void b(S s) {
            g gVar = g.this;
            gVar.Q();
            gVar.v0.setEnabled(gVar.M().v1());
        }
    }

    public static int N(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(ojg.e());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.d;
        return l5.c(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    public static boolean O(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(me9.b(context, com.google.android.material.datepicker.b.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iD0 = this.j0;
        if (iD0 == 0) {
            iD0 = M().d0(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iD0);
        Context context = dialog.getContext();
        this.q0 = O(context, android.R.attr.windowFullscreen);
        int iB = me9.b(context, g.class.getCanonicalName(), R.attr.colorSurface);
        ze9 ze9Var = new ze9(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.u0 = ze9Var;
        ze9Var.i(context);
        this.u0.k(ColorStateList.valueOf(iB));
        ze9 ze9Var2 = this.u0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        ze9Var2.j(epg.d.e(decorView));
        return dialog;
    }

    public final DateSelector<S> M() {
        if (this.k0 == null) {
            this.k0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.k0;
    }

    public final void P() {
        Context contextRequireContext = requireContext();
        int iD0 = this.j0;
        if (iD0 == 0) {
            iD0 = M().d0(contextRequireContext);
        }
        DateSelector<S> dateSelectorM = M();
        CalendarConstraints calendarConstraints = this.m0;
        af9 bVar = new com.google.android.material.datepicker.b<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iD0);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorM);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.d);
        bVar.setArguments(bundle);
        this.n0 = bVar;
        if (this.t0.d) {
            DateSelector<S> dateSelectorM2 = M();
            CalendarConstraints calendarConstraints2 = this.m0;
            af9 af9Var = new af9();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iD0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorM2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            af9Var.setArguments(bundle2);
            bVar = af9Var;
        }
        this.l0 = bVar;
        Q();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.e(R.id.mtrl_calendar_frame, this.l0, null);
        aVar.i();
        this.l0.D(new c());
    }

    public final void Q() {
        String strK0 = M().K0(getContext());
        this.s0.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), strK0));
        this.s0.setText(strK0);
    }

    public final void R(CheckableImageButton checkableImageButton) {
        this.t0.setContentDescription(this.t0.d ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.h0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.j0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.k0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.m0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.o0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.p0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.r0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.q0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.q0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(N(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(N(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.s0 = textView;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        textView.setAccessibilityLiveRegion(1);
        this.t0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.p0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.o0);
        }
        this.t0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.t0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, pnb.A(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], pnb.A(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.t0.setChecked(this.r0 != 0);
        epg.o(this.t0, null);
        R(this.t0);
        this.t0.setOnClickListener(new ve9(this));
        this.v0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean zV1 = M().v1();
        Button button = this.v0;
        if (zV1) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.v0.setTag("CONFIRM_BUTTON_TAG");
        this.v0.setOnClickListener(new a());
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        button2.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.i0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.j0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.k0);
        CalendarConstraints calendarConstraints = this.m0;
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.b = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.a.f;
        long j2 = calendarConstraints.b.f;
        bVar.a = Long.valueOf(calendarConstraints.d.f);
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.c;
        bVar.b = dateValidator;
        Month month = this.n0.e;
        if (month != null) {
            bVar.a = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthE = Month.e(j);
        Month monthE2 = Month.e(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthE, monthE2, dateValidator2, l == null ? null : Month.e(l.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p0);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = I().getWindow();
        if (this.q0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.u0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.u0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new jf7(I(), rect));
        }
        P();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStop() {
        this.l0.a.clear();
        super.onStop();
    }
}
