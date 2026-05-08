package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.gx1;
import defpackage.jye;
import defpackage.n83;
import defpackage.o6;
import defpackage.pj8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public boolean V;
    public int W;
    public List<n83> a;
    public a a0;
    public gx1 b;
    public View b0;
    public int c;
    public float d;
    public float e;
    public boolean f;

    public interface a {
        void a(List<n83> list, gx1 gx1Var, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = gx1.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.V = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, 0);
        this.a0 = aVar;
        this.b0 = aVar;
        addView(aVar);
        this.W = 1;
    }

    private List<n83> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.V) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            n83.a aVarA = this.a.get(i).a();
            if (!this.f) {
                aVarA.n = false;
                CharSequence charSequence = aVarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.b(SpannableString.valueOf(charSequence));
                    }
                    CharSequence charSequence2 = aVarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof pj8)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                jye.a(aVarA);
            } else if (!this.V) {
                jye.a(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private gx1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        gx1 gx1Var = gx1.g;
        return (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) ? gx1Var : gx1.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.b0);
        View view = this.b0;
        if (view instanceof f) {
            ((f) view).b.destroy();
        }
        this.b0 = t;
        this.a0 = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.a0.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.V = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        c();
    }

    public void setCues(List<n83> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.d = f;
        c();
    }

    public void setStyle(gx1 gx1Var) {
        this.b = gx1Var;
        c();
    }

    public void setViewType(int i) {
        if (this.W == i) {
            return;
        }
        if (i == 1) {
            setView(new androidx.media3.ui.a(getContext(), 0));
        } else {
            if (i != 2) {
                o6.h();
                return;
            }
            setView(new f(getContext()));
        }
        this.W = i;
    }
}
