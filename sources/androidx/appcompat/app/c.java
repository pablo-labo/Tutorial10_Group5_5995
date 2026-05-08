package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.nj0;
import defpackage.prg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends nj0 implements DialogInterface {
    public final AlertController f;

    public c(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.nj0, defpackage.hg2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f;
        alertController.b.setContentView(alertController.z);
        Context context = alertController.a;
        Window window = alertController.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = alertController.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !AlertController.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        alertController.v = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.r.removeView(alertController.v);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        alertController.i = button;
        AlertController.a aVar = alertController.F;
        button.setOnClickListener(aVar);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.j);
        Button button2 = alertController.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(alertController.j);
            alertController.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        alertController.l = button3;
        button3.setOnClickListener(aVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(alertController.m);
        Button button4 = alertController.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(alertController.m);
            alertController.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        alertController.o = button5;
        button5.setOnClickListener(aVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(alertController.p);
        Button button6 = alertController.o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(alertController.p);
            alertController.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = alertController.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = alertController.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = alertController.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.w != null) {
            viewGroupB.addView(alertController.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(alertController.d) || !alertController.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.u = textView2;
                textView2.setText(alertController.d);
                Drawable drawable = alertController.s;
                if (drawable != null) {
                    alertController.t.setImageDrawable(drawable);
                } else {
                    alertController.u.setPadding(alertController.t.getPaddingLeft(), alertController.t.getPaddingTop(), alertController.t.getPaddingRight(), alertController.t.getPaddingBottom());
                    alertController.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = alertController.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.e == null && alertController.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f;
        if (recycleListView != null && (!z3 || i2 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i2 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.b);
        }
        if (!z2) {
            View view2 = alertController.f;
            if (view2 == null) {
                view2 = alertController.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, prg> weakHashMap = epg.a;
                epg.e.b(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f;
        if (recycleListView2 == null || (listAdapter = alertController.x) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i4 = alertController.y;
        if (i4 > -1) {
            recycleListView2.setItemChecked(i4, true);
            recycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.nj0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f;
        alertController.d = charSequence;
        TextView textView = alertController.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, c.g(context, i)));
            this.b = i;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = charSequence;
            bVar.h = onClickListener;
            return this;
        }

        public final c b() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public c create() {
            AlertController.b bVar = this.a;
            c cVar = new c(bVar.a, this.b);
            View view = bVar.e;
            AlertController alertController = cVar.f;
            if (view != null) {
                alertController.w = view;
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.d = charSequence;
                    TextView textView = alertController.u;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.s = drawable;
                    ImageView imageView = alertController.t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.t.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.e = charSequence2;
                TextView textView2 = alertController.v;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, bVar.h);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, bVar.j);
            }
            CharSequence charSequence5 = bVar.k;
            if (charSequence5 != null) {
                alertController.c(-3, charSequence5, bVar.l);
            }
            if (bVar.p != null || bVar.q != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.A, (ViewGroup) null);
                int i = bVar.t ? alertController.B : alertController.C;
                ListAdapter dVar = bVar.q;
                if (dVar == null) {
                    dVar = new AlertController.d(bVar.a, i, android.R.id.text1, bVar.p);
                }
                alertController.x = dVar;
                alertController.y = bVar.u;
                if (bVar.r != null) {
                    recycleListView.setOnItemClickListener(new b(bVar, alertController));
                }
                if (bVar.t) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f = recycleListView;
            }
            View view2 = bVar.s;
            if (view2 != null) {
                alertController.g = view2;
                alertController.h = false;
            }
            cVar.setCancelable(bVar.m);
            if (bVar.m) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(null);
            cVar.setOnDismissListener(bVar.n);
            DialogInterface.OnKeyListener onKeyListener = bVar.o;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            bVar.j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = bVar.a.getText(i);
            bVar.h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.a.s = view;
            return this;
        }

        public a(Context context) {
            this(context, c.g(context, 0));
        }
    }
}
