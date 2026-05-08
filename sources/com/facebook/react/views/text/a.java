package com.facebook.react.views.text;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.b;
import com.indeed.android.jobsearch.R;
import defpackage.ak2;
import defpackage.epg;
import defpackage.pyd;
import defpackage.t6;
import defpackage.u6;
import defpackage.vjc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.b {
    public static final /* synthetic */ int y = 0;
    public final C0143a x;

    /* JADX INFO: renamed from: com.facebook.react.views.text.a$a, reason: collision with other inner class name */
    public static final class C0143a {
        public final ArrayList a;

        /* JADX INFO: renamed from: com.facebook.react.views.text.a$a$a, reason: collision with other inner class name */
        public static final class C0144a {
            public String a;
            public int b;
            public int c;
            public int d;
        }

        /* JADX INFO: renamed from: com.facebook.react.views.text.a$a$b */
        public static final class b<T> implements Comparator {
            public final /* synthetic */ Spanned a;

            public b(Spanned spanned) {
                this.a = spanned;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Spanned spanned = this.a;
                return ak2.i(Integer.valueOf(spanned.getSpanStart((ClickableSpan) t)), Integer.valueOf(spanned.getSpanStart((ClickableSpan) t2)));
            }
        }

        public C0143a(Spanned spanned) {
            spanned.getClass();
            ArrayList arrayList = new ArrayList();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
            clickableSpanArr.getClass();
            if (clickableSpanArr.length > 1) {
                pyd.Q(clickableSpanArr, new b(spanned));
            }
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spanned.length() && spanEnd <= spanned.length()) {
                    C0144a c0144a = new C0144a();
                    c0144a.a = spanned.subSequence(spanStart, spanEnd).toString();
                    c0144a.b = spanStart;
                    c0144a.c = spanEnd;
                    c0144a.d = i;
                    arrayList.add(c0144a);
                }
            }
            this.a = arrayList;
        }

        public final C0144a a(int i) {
            for (C0144a c0144a : this.a) {
                if (c0144a.d == i) {
                    return c0144a;
                }
            }
            return null;
        }
    }

    public static final class b {
        public static void a(View view, int i, boolean z) {
            view.getClass();
            if (epg.e(view) != null) {
                return;
            }
            if (view.getTag(R.id.accessibility_role) == null && view.getTag(R.id.accessibility_state) == null && view.getTag(R.id.accessibility_actions) == null && view.getTag(R.id.react_test_id) == null && view.getTag(R.id.accessibility_collection_item) == null && view.getTag(R.id.accessibility_links) == null && view.getTag(R.id.role) == null) {
                return;
            }
            epg.o(view, new a(view, i, z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, int i, boolean z) {
        super(view, i, z);
        view.getClass();
        this.x = (C0143a) this.q.getTag(R.id.accessibility_links);
    }

    public final Object D(int i, int i2) {
        Spanned spannedF = F();
        if (spannedF == null) {
            return null;
        }
        Object[] spans = spannedF.getSpans(i, i2, ClickableSpan.class);
        spans.getClass();
        if (spans.length == 0) {
            return null;
        }
        return spans[0];
    }

    public final Layout E() {
        View view = this.q;
        if (!(view instanceof PreparedLayoutTextView)) {
            if (view instanceof TextView) {
                return ((TextView) view).getLayout();
            }
            return null;
        }
        PreparedLayout preparedLayout = ((PreparedLayoutTextView) view).getPreparedLayout();
        if (preparedLayout != null) {
            return preparedLayout.a;
        }
        return null;
    }

    public final Spanned F() {
        View view = this.q;
        if (view instanceof PreparedLayoutTextView) {
            PreparedLayout preparedLayout = ((PreparedLayoutTextView) view).getPreparedLayout();
            CharSequence text = preparedLayout != null ? preparedLayout.a.getText() : null;
            if (text instanceof Spanned) {
                return (Spanned) text;
            }
        } else if (view instanceof TextView) {
            CharSequence text2 = ((TextView) view).getText();
            if (text2 instanceof Spanned) {
                return (Spanned) text2;
            }
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35, defpackage.y5
    public final u6 b(View view) {
        view.getClass();
        if (this.x != null) {
            return C(view);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35, defpackage.y5
    public final void d(t6 t6Var, View view) {
        view.getClass();
        super.d(t6Var, view);
        if (view instanceof PreparedLayoutTextView) {
            t6Var.x(((PreparedLayoutTextView) view).getText());
        }
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35
    public final int n(float f, float f2) {
        Spanned spannedF;
        C0143a.C0144a c0144a;
        C0143a c0143a = this.x;
        if (c0143a == null) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList = c0143a.a;
        if (arrayList.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.q;
        if (!(view instanceof TextView) && !(view instanceof PreparedLayoutTextView)) {
            return Integer.MIN_VALUE;
        }
        float paddingLeft = (f - view.getPaddingLeft()) + view.getScrollX();
        float paddingTop = (f2 - view.getPaddingTop()) + view.getScrollY();
        Layout layoutE = E();
        if (layoutE == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layoutE.getOffsetForHorizontal(layoutE.getLineForVertical((int) paddingTop), paddingLeft);
        ClickableSpan clickableSpan = (ClickableSpan) D(offsetForHorizontal, offsetForHorizontal);
        if (clickableSpan == null || (spannedF = F()) == null) {
            return Integer.MIN_VALUE;
        }
        int spanStart = spannedF.getSpanStart(clickableSpan);
        int spanEnd = spannedF.getSpanEnd(clickableSpan);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0144a = null;
                break;
            }
            c0144a = (C0143a.C0144a) it.next();
            if (c0144a.b == spanStart && c0144a.c == spanEnd) {
                break;
            }
        }
        if (c0144a != null) {
            return c0144a.d;
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35
    public final void o(ArrayList arrayList) {
        C0143a c0143a = this.x;
        if (c0143a == null) {
            return;
        }
        int size = c0143a.a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35
    public final boolean s(int i, int i2) {
        C0143a.C0144a c0144aA;
        ClickableSpan clickableSpan;
        C0143a c0143a = this.x;
        if (c0143a == null || (c0144aA = c0143a.a(i)) == null || (clickableSpan = (ClickableSpan) D(c0144aA.b, c0144aA.c)) == null || i2 != 16) {
            return false;
        }
        clickableSpan.onClick(this.q);
        return true;
    }

    @Override // com.facebook.react.uimanager.b, defpackage.w35
    public final void u(int i, t6 t6Var) {
        Layout layoutE;
        Rect rect;
        C0143a c0143a = this.x;
        if (c0143a == null) {
            t6Var.r("");
            t6Var.l(new Rect(0, 0, 1, 1));
            return;
        }
        C0143a.C0144a c0144aA = c0143a.a(i);
        if (c0144aA == null) {
            t6Var.r("");
            t6Var.l(new Rect(0, 0, 1, 1));
            return;
        }
        View view = this.q;
        if (((view instanceof TextView) || (view instanceof PreparedLayoutTextView)) && (layoutE = E()) != null) {
            int i2 = c0144aA.b;
            int i3 = c0144aA.c;
            int lineForOffset = layoutE.getLineForOffset(i2);
            int lineEnd = layoutE.getLineEnd(lineForOffset);
            int lineForOffset2 = layoutE.getLineForOffset(i3);
            int lineEnd2 = layoutE.getLineEnd(lineForOffset2);
            if (i2 > lineEnd || i3 > lineEnd2) {
                rect = null;
            } else {
                Rect rect2 = new Rect();
                double primaryHorizontal = layoutE.getPrimaryHorizontal(i2);
                boolean z = lineForOffset != lineForOffset2;
                layoutE.getLineBounds(lineForOffset, rect2);
                int paddingTop = view.getPaddingTop() + view.getScrollY();
                rect2.top += paddingTop;
                rect2.bottom += paddingTop;
                rect2.left = (int) (((primaryHorizontal + ((double) view.getPaddingLeft())) - ((double) view.getScrollX())) + ((double) rect2.left));
                rect = z ? new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom) : new Rect(rect2.left, rect2.top, (int) layoutE.getPrimaryHorizontal(i3), rect2.bottom);
            }
        } else {
            rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        }
        if (rect == null) {
            t6Var.r("");
            t6Var.l(new Rect(0, 0, 1, 1));
            return;
        }
        t6Var.r(c0144aA.a);
        t6Var.a(16);
        t6Var.l(rect);
        t6Var.u(view.getResources().getString(R.string.link_description));
        t6Var.n(b.c.e(b.c.b));
    }

    @Override // defpackage.w35
    public final void v(int i, boolean z) {
        C0143a.C0144a c0144aA;
        ClickableSpan clickableSpan;
        C0143a c0143a = this.x;
        if (c0143a == null || (c0144aA = c0143a.a(i)) == null || (clickableSpan = (ClickableSpan) D(c0144aA.b, c0144aA.c)) == null) {
            return;
        }
        boolean z2 = clickableSpan instanceof vjc;
        View view = this.q;
        if (z2 && (view instanceof TextView)) {
            vjc vjcVar = (vjc) clickableSpan;
            vjcVar.b = z;
            vjcVar.c = ((TextView) view).getHighlightColor();
            view.invalidate();
            return;
        }
        if (view instanceof PreparedLayoutTextView) {
            if (z) {
                ((PreparedLayoutTextView) view).c(c0144aA.b, c0144aA.c);
            } else {
                ((PreparedLayoutTextView) view).a();
            }
        }
    }
}
