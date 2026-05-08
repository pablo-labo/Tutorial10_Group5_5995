package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.hh1;
import defpackage.hk1;
import defpackage.ik1;
import defpackage.jk1;
import defpackage.nj0;
import defpackage.prg;
import defpackage.rzg;
import defpackage.ze9;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends nj0 {
    public static final /* synthetic */ int f0 = 0;
    public FrameLayout V;
    public CoordinatorLayout W;
    public FrameLayout X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public C0150b c0;
    public final boolean d0;
    public final a e0;
    public BottomSheetBehavior<FrameLayout> f;

    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            if (i == 5) {
                b.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public static class C0150b extends BottomSheetBehavior.c {
        public final boolean a;
        public final boolean b;
        public final rzg c;

        public C0150b(View view, rzg rzgVar) {
            ColorStateList colorStateListC;
            this.c = rzgVar;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.b = z;
            ze9 ze9Var = BottomSheetBehavior.y(view).i;
            if (ze9Var != null) {
                colorStateListC = ze9Var.a.c;
            } else {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                colorStateListC = epg.d.c(view);
            }
            if (colorStateListC != null) {
                this.a = hh1.E(colorStateListC.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.a = hh1.E(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.a = z;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
            c(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            c(view);
        }

        public final void c(View view) {
            int top = view.getTop();
            rzg rzgVar = this.c;
            if (top < rzgVar.d()) {
                int i = b.f0;
                int systemUiVisibility = view.getSystemUiVisibility();
                view.setSystemUiVisibility(this.a ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                view.setPadding(view.getPaddingLeft(), rzgVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                int i2 = b.f0;
                int systemUiVisibility2 = view.getSystemUiVisibility();
                view.setSystemUiVisibility(this.b ? systemUiVisibility2 | 8192 : systemUiVisibility2 & (-8193));
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    public b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.Z = true;
        this.a0 = true;
        this.e0 = new a();
        d().n(1);
        this.d0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = h();
        if (!this.Y || bottomSheetBehaviorH.G == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorH.H(5);
        }
    }

    public final void g() {
        if (this.V == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.V = frameLayout;
            this.W = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.V.findViewById(R.id.design_bottom_sheet);
            this.X = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorY = BottomSheetBehavior.y(frameLayout2);
            this.f = bottomSheetBehaviorY;
            bottomSheetBehaviorY.s(this.e0);
            this.f.F(this.Z);
        }
    }

    public final BottomSheetBehavior<FrameLayout> h() {
        if (this.f == null) {
            g();
        }
        return this.f;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.V.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.d0) {
            FrameLayout frameLayout = this.X;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.m(frameLayout, aVar);
        }
        this.X.removeAllViews();
        FrameLayout frameLayout2 = this.X;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new hk1(this));
        epg.o(this.X, new ik1(this));
        this.X.setOnTouchListener(new jk1());
        return this.V;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.d0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.V;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.W;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // defpackage.nj0, defpackage.hg2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // defpackage.hg2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.G != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.Z != z) {
            this.Z = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.Z) {
            this.Z = true;
        }
        this.a0 = z;
        this.b0 = true;
    }

    @Override // defpackage.nj0, defpackage.hg2, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.nj0, defpackage.hg2, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.nj0, defpackage.hg2, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
