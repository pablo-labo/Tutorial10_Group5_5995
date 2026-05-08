package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.indeed.android.jobsearch.R;
import defpackage.ece;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class whc extends ConstraintLayout {
    public final a k0;
    public int l0;
    public final ze9 m0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            whc.this.h();
        }
    }

    public whc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ze9 ze9Var = new ze9();
        this.m0 = ze9Var;
        tyc tycVar = new tyc(0.5f);
        ece.a aVarE = ze9Var.a.a.e();
        aVarE.e = tycVar;
        aVarE.f = tycVar;
        aVarE.g = tycVar;
        aVarE.h = tycVar;
        ze9Var.setShapeAppearanceModel(aVarE.a());
        this.m0.k(ColorStateList.valueOf(-1));
        ze9 ze9Var2 = this.m0;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setBackground(ze9Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.B, i, 0);
        this.l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.k0 = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.k0;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final void h() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        c cVar = new c();
        cVar.b(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.l0;
                Integer numValueOf = Integer.valueOf(id);
                HashMap<Integer, c.a> map = cVar.c;
                if (!map.containsKey(numValueOf)) {
                    map.put(Integer.valueOf(id), new c.a());
                }
                c.b bVar = map.get(Integer.valueOf(id)).d;
                bVar.y = R.id.circle_center;
                bVar.z = i4;
                bVar.A = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        cVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.k0;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.m0.k(ColorStateList.valueOf(i));
    }

    public whc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
