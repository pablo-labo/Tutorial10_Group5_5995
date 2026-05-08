package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.cqf;
import defpackage.e47;
import defpackage.nfa;
import defpackage.wpf;
import defpackage.wqf;
import defpackage.ypf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final HashMap V;
    public boolean W;
    public final int a;
    public boolean a0;
    public final LayoutInflater b;
    public ypf b0;
    public final CheckedTextView c;
    public CheckedTextView[][] c0;
    public final CheckedTextView d;
    public boolean d0;
    public final a e;
    public final ArrayList f;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            HashMap map = trackSelectionView.V;
            boolean z = true;
            if (view == trackSelectionView.c) {
                trackSelectionView.d0 = true;
                map.clear();
            } else if (view == trackSelectionView.d) {
                trackSelectionView.d0 = false;
                map.clear();
            } else {
                trackSelectionView.d0 = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                wqf.a aVar = bVar.a;
                wpf wpfVar = aVar.b;
                int i = bVar.b;
                cqf cqfVar = (cqf) map.get(wpfVar);
                if (cqfVar == null) {
                    if (!trackSelectionView.a0 && !map.isEmpty()) {
                        map.clear();
                    }
                    map.put(wpfVar, new cqf(wpfVar, e47.n(Integer.valueOf(i))));
                } else {
                    ArrayList arrayList = new ArrayList(cqfVar.b);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z2 = trackSelectionView.W && aVar.c;
                    if (!z2 && (!trackSelectionView.a0 || trackSelectionView.f.size() <= 1)) {
                        z = false;
                    }
                    if (zIsChecked && z) {
                        arrayList.remove(Integer.valueOf(i));
                        if (arrayList.isEmpty()) {
                            map.remove(wpfVar);
                        } else {
                            map.put(wpfVar, new cqf(wpfVar, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z2) {
                            arrayList.add(Integer.valueOf(i));
                            map.put(wpfVar, new cqf(wpfVar, arrayList));
                        } else {
                            map.put(wpfVar, new cqf(wpfVar, e47.n(Integer.valueOf(i))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class b {
        public final wqf.a a;
        public final int b;

        public b(wqf.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        a aVar = new a();
        this.e = aVar;
        this.b0 = new nfa(getResources());
        this.f = new ArrayList();
        this.V = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.indeed.android.jobsearch.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.indeed.android.jobsearch.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.indeed.android.jobsearch.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.d0);
        boolean z = this.d0;
        HashMap map = this.V;
        this.d.setChecked(!z && map.isEmpty());
        for (int i = 0; i < this.c0.length; i++) {
            cqf cqfVar = (cqf) map.get(((wqf.a) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.c0[i];
                if (i2 < checkedTextViewArr.length) {
                    if (cqfVar != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.c0[i][i2].setChecked(cqfVar.b.contains(Integer.valueOf(((b) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.c0 = new CheckedTextView[arrayList.size()][];
        boolean z = this.a0 && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            wqf.a aVar = (wqf.a) arrayList.get(i);
            boolean z2 = this.W && aVar.c;
            CheckedTextView[][] checkedTextViewArr = this.c0;
            int i2 = aVar.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            b[] bVarArr = new b[i2];
            for (int i3 = 0; i3 < aVar.a; i3++) {
                bVarArr[i3] = new b(aVar, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.b;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.indeed.android.jobsearch.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.a);
                ypf ypfVar = this.b0;
                b bVar = bVarArr[i4];
                checkedTextView3.setText(ypfVar.a(bVar.a.a(bVar.b)));
                checkedTextView3.setTag(bVarArr[i4]);
                if (aVar.b(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.c0[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.d0;
    }

    public Map<wpf, cqf> getOverrides() {
        return this.V;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.W != z) {
            this.W = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            if (!z) {
                HashMap map = this.V;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.f;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        cqf cqfVar = (cqf) map.get(((wqf.a) arrayList.get(i)).b);
                        if (cqfVar != null && map2.isEmpty()) {
                            map2.put(cqfVar.a, cqfVar);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(ypf ypfVar) {
        ypfVar.getClass();
        this.b0 = ypfVar;
        b();
    }
}
