package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.g;
import defpackage.dab;
import defpackage.epg;
import defpackage.oke;
import defpackage.qe9;
import defpackage.re9;
import defpackage.se9;
import defpackage.t6;
import defpackage.y5;
import defpackage.yg3;
import defpackage.zu1;

/* JADX INFO: loaded from: classes2.dex */
public final class b<S> extends dab<S> {
    public zu1 V;
    public RecyclerView W;
    public RecyclerView X;
    public View Y;
    public View Z;
    public int b;
    public DateSelector<S> c;
    public CalendarConstraints d;
    public Month e;
    public d f;

    public class a extends y5 {
        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
            t6Var.p(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.b$b, reason: collision with other inner class name */
    public class C0152b extends oke {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0152b(int i, int i2) {
            super(i);
            this.E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void z0(RecyclerView.x xVar, int[] iArr) {
            b bVar = b.this;
            RecyclerView recyclerView = bVar.X;
            if (this.E == 0) {
                iArr[0] = recyclerView.getWidth();
                iArr[1] = bVar.X.getWidth();
            } else {
                iArr[0] = recyclerView.getHeight();
                iArr[1] = bVar.X.getHeight();
            }
        }
    }

    public class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final /* synthetic */ d[] c;

        static {
            d dVar = new d("DAY", 0);
            a = dVar;
            d dVar2 = new d("YEAR", 1);
            b = dVar2;
            c = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    @Override // defpackage.dab
    public final void D(g.c cVar) {
        this.a.add(cVar);
    }

    public final void E(Month month) {
        j jVar = (j) this.X.getAdapter();
        int iN = jVar.e.a.n(month);
        int iN2 = iN - jVar.e.a.n(this.e);
        boolean z = Math.abs(iN2) > 3;
        boolean z2 = iN2 > 0;
        this.e = month;
        if (z && z2) {
            this.X.g0(iN - 3);
            this.X.post(new qe9(this, iN));
            return;
        }
        RecyclerView recyclerView = this.X;
        if (!z) {
            recyclerView.post(new qe9(this, iN));
        } else {
            recyclerView.g0(iN + 3);
            this.X.post(new qe9(this, iN));
        }
    }

    public final void F(d dVar) {
        this.f = dVar;
        if (dVar == d.b) {
            this.W.getLayoutManager().m0(this.e.c - ((l) this.W.getAdapter()).d.d.a.c);
            this.Y.setVisibility(0);
            this.Z.setVisibility(8);
            return;
        }
        if (dVar == d.a) {
            this.Y.setVisibility(8);
            this.Z.setVisibility(0);
            E(this.e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.V = new zu1(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.d.a;
        if (g.O(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.indeed.android.jobsearch.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.indeed.android.jobsearch.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = h.f;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.indeed.android.jobsearch.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.mtrl_calendar_days_of_week);
        epg.o(gridView, new a());
        gridView.setAdapter((ListAdapter) new yg3());
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.X = (RecyclerView) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.mtrl_calendar_months);
        getContext();
        this.X.setLayoutManager(new C0152b(i2, i2));
        this.X.setTag("MONTHS_VIEW_GROUP_TAG");
        j jVar = new j(contextThemeWrapper, this.c, this.d, new c());
        this.X.setAdapter(jVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.indeed.android.jobsearch.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.mtrl_calendar_year_selector_frame);
        this.W = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.W.setLayoutManager(new GridLayoutManager(integer));
            this.W.setAdapter(new l(this));
            this.W.i(new com.google.android.material.datepicker.c(this));
        }
        if (viewInflate.findViewById(com.indeed.android.jobsearch.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            epg.o(materialButton, new re9(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.Y = viewInflate.findViewById(com.indeed.android.jobsearch.R.id.mtrl_calendar_year_selector_frame);
            this.Z = viewInflate.findViewById(com.indeed.android.jobsearch.R.id.mtrl_calendar_day_selector_frame);
            F(d.a);
            materialButton.setText(this.e.m(viewInflate.getContext()));
            this.X.j(new com.google.android.material.datepicker.d(this, jVar, materialButton));
            materialButton.setOnClickListener(new se9(this));
            materialButton3.setOnClickListener(new e(this, jVar));
            materialButton2.setOnClickListener(new f(this, jVar));
        }
        if (!g.O(contextThemeWrapper, R.attr.windowFullscreen)) {
            new u().a(this.X);
        }
        this.X.g0(jVar.e.a.n(this.e));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e);
    }
}
