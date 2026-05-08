package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class va7 {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public AnimatorSet f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public AppCompatTextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i = this.a;
            va7 va7Var = va7.this;
            va7Var.h = i;
            va7Var.f = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && (appCompatTextView = va7Var.l) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public va7(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
        this.g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
        if (this.c == null && this.e == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.e.setVisibility(0);
            this.e.addView(appCompatTextView);
        } else {
            this.c.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        if (this.c != null) {
            TextInputLayout textInputLayout = this.b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.a;
                boolean zD = ye9.d(context);
                LinearLayout linearLayout = this.c;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(be0.a);
            arrayList.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(be0.d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public final TextView f(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.r;
    }

    public final void g() {
        this.j = null;
        c();
        if (this.h == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.i = 0;
            } else {
                this.i = 2;
            }
        }
        j(this.h, this.i, i(this.l, null));
    }

    public final void h(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.e) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        LinearLayout linearLayout2 = this.c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.i == this.h && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void j(int i, int i2, boolean z) {
        TextView textViewF;
        TextView textViewF2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i, i2);
            d(arrayList, this.k, this.l, 1, i, i2);
            wab.s(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, f(i), i, f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewF2 = f(i2)) != null) {
                textViewF2.setVisibility(0);
                textViewF2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewF = f(i)) != null) {
                textViewF.setVisibility(4);
                if (i == 1) {
                    textViewF.setText((CharSequence) null);
                }
            }
            this.h = i2;
        }
        TextInputLayout textInputLayout = this.b;
        textInputLayout.q();
        textInputLayout.s(z, false);
        textInputLayout.z();
    }
}
