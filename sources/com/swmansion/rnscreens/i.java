package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import com.swmansion.rnscreens.g;
import com.swmansion.rnscreens.i;
import defpackage.ai3;
import defpackage.ctd;
import defpackage.dmc;
import defpackage.dtd;
import defpackage.gtd;
import defpackage.hpc;
import defpackage.j6g;
import defpackage.k1;
import defpackage.l;
import defpackage.mkf;
import defpackage.ox4;
import defpackage.qb3;
import defpackage.qrc;
import defpackage.tpc;
import defpackage.x65;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class i extends tpc {
    public String V;
    public boolean W;
    public b a;
    public boolean a0;
    public a b;
    public boolean b0;
    public Integer c;
    public qrc c0;
    public Integer d;
    public boolean d0;
    public Integer e;
    public final int e0;
    public Integer f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("WORDS", 1);
            b = aVar2;
            a aVar3 = new a("SENTENCES", 2);
            c = aVar3;
            a aVar4 = new a("CHARACTERS", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final d a;
        public static final c b;
        public static final C0196b c;
        public static final a d;
        public static final /* synthetic */ b[] e;

        public static final class a extends b {
            public a() {
                super("EMAIL", 3);
            }

            @Override // com.swmansion.rnscreens.i.b
            public final int a(a aVar) {
                aVar.getClass();
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.i$b$b, reason: collision with other inner class name */
        public static final class C0196b extends b {
            public C0196b() {
                super("NUMBER", 2);
            }

            @Override // com.swmansion.rnscreens.i.b
            public final int a(a aVar) {
                aVar.getClass();
                return 2;
            }
        }

        public static final class c extends b {
            public c() {
                super("PHONE", 1);
            }

            @Override // com.swmansion.rnscreens.i.b
            public final int a(a aVar) {
                aVar.getClass();
                return 3;
            }
        }

        public static final class d extends b {
            public d() {
                super("TEXT", 0);
            }

            @Override // com.swmansion.rnscreens.i.b
            public final int a(a aVar) {
                aVar.getClass();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    return 1;
                }
                if (iOrdinal == 1) {
                    return 8192;
                }
                if (iOrdinal == 2) {
                    return 16384;
                }
                if (iOrdinal == 3) {
                    return 4096;
                }
                l.g();
                return 0;
            }
        }

        static {
            d dVar = new d();
            a = dVar;
            c cVar = new c();
            b = cVar;
            C0196b c0196b = new C0196b();
            c = c0196b;
            a aVar = new a();
            d = aVar;
            e = new b[]{dVar, cVar, c0196b, aVar};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }

        public abstract int a(a aVar);
    }

    public static final class c implements SearchView.k {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final void a(String str) {
            i iVar = i.this;
            iVar.n(new ctd(iVar.e0, iVar.getId(), str));
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final void b(String str) {
            i iVar = i.this;
            iVar.n(new hpc(str, iVar.e0, iVar.getId(), 1));
        }
    }

    public i(mkf mkfVar) {
        super(mkfVar);
        this.a = b.a;
        this.b = a.a;
        this.V = "";
        this.W = true;
        this.b0 = true;
        this.e0 = dmc.h(this);
    }

    public static j6g g(i iVar, qb3 qb3Var) {
        e screenStackFragment;
        qb3 qb3Var2;
        qb3Var.getClass();
        if (iVar.c0 == null) {
            qrc qrcVar = new qrc();
            qrcVar.a = qb3Var;
            iVar.c0 = qrcVar;
        }
        iVar.o();
        if (iVar.a0 && (screenStackFragment = iVar.getScreenStackFragment()) != null && (qb3Var2 = screenStackFragment.b0) != null) {
            qb3Var2.setIconified(false);
            qb3Var2.requestFocusFromTouch();
        }
        return j6g.a;
    }

    private final f getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof g) {
            return ((g) parent).getConfig();
        }
        return null;
    }

    private final e getScreenStackFragment() {
        f headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    public static void h(i iVar) {
        iVar.n(new dtd(iVar.e0, iVar.getId()));
        iVar.setToolbarElementsVisibility(0);
    }

    public static void i(i iVar) {
        iVar.n(new gtd(iVar.e0, iVar.getId(), 0));
        iVar.setToolbarElementsVisibility(8);
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: htd
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                i iVar = this.a;
                int i = iVar.e0;
                iVar.n(z ? new v3d(i, iVar.getId(), 1) : new btd(i, iVar.getId()));
            }
        });
        searchView.setOnCloseListener(new x65(this));
        searchView.setOnSearchClickListener(new ai3(this, 2));
    }

    private final void setToolbarElementsVisibility(int i) {
        g gVar;
        int i2 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            f headerConfig = getHeaderConfig();
            if (headerConfig != null) {
                g gVar2 = headerConfig.V.get(i2);
                gVar2.getClass();
                gVar = gVar2;
            } else {
                gVar = null;
            }
            if ((gVar != null ? gVar.getType() : null) != g.a.e && gVar != null) {
                gVar.setVisibility(i);
            }
            if (i2 == configSubviewsCount) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final a getAutoCapitalize() {
        return this.b;
    }

    public final boolean getAutoFocus() {
        return this.a0;
    }

    public final Integer getHeaderIconColor() {
        return this.e;
    }

    public final Integer getHintTextColor() {
        return this.f;
    }

    public final b getInputType() {
        return this.a;
    }

    public final String getPlaceholder() {
        return this.V;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.W;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.b0;
    }

    public final Integer getTextColor() {
        return this.c;
    }

    public final Integer getTintColor() {
        return this.d;
    }

    public final void j() {
        qb3 qb3Var;
        e screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (qb3Var = screenStackFragment.b0) == null) {
            return;
        }
        qb3Var.clearFocus();
    }

    public final void k() {
        qb3 qb3Var;
        e screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (qb3Var = screenStackFragment.b0) == null) {
            return;
        }
        qb3Var.r("");
    }

    public final void l() {
        qb3 qb3Var;
        e screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (qb3Var = screenStackFragment.b0) == null) {
            return;
        }
        qb3Var.setIconified(false);
        qb3Var.requestFocusFromTouch();
    }

    public final void m(String str) {
        e screenStackFragment;
        qb3 qb3Var;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (qb3Var = screenStackFragment.b0) == null) {
            return;
        }
        qb3Var.setText(str);
    }

    public final void n(ox4<?> ox4Var) {
        Context context = getContext();
        context.getClass();
        EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(ox4Var);
        }
    }

    public final void o() {
        Integer num;
        EditText editTextC;
        ColorStateList textColors;
        e screenStackFragment = getScreenStackFragment();
        Integer numValueOf = null;
        qb3 qb3Var = screenStackFragment != null ? screenStackFragment.b0 : null;
        if (qb3Var != null) {
            if (!this.d0) {
                setSearchViewListeners(qb3Var);
                this.d0 = true;
            }
            qb3Var.setInputType(this.a.a(this.b));
            qrc qrcVar = this.c0;
            if (qrcVar != null) {
                Integer num2 = this.c;
                Integer num3 = (Integer) qrcVar.b;
                if (num2 != null) {
                    if (num3 == null) {
                        EditText editTextC2 = qrcVar.c();
                        if (editTextC2 != null && (textColors = editTextC2.getTextColors()) != null) {
                            numValueOf = Integer.valueOf(textColors.getDefaultColor());
                        }
                        qrcVar.b = numValueOf;
                    }
                    EditText editTextC3 = qrcVar.c();
                    if (editTextC3 != null) {
                        editTextC3.setTextColor(num2.intValue());
                    }
                } else if (num3 != null && (editTextC = qrcVar.c()) != null) {
                    editTextC.setTextColor(num3.intValue());
                }
            }
            qrc qrcVar2 = this.c0;
            if (qrcVar2 != null) {
                qb3 qb3Var2 = (qb3) qrcVar2.a;
                Integer num4 = this.d;
                Drawable drawable = (Drawable) qrcVar2.c;
                if (num4 != null) {
                    if (drawable == null) {
                        qrcVar2.c = qb3Var2.findViewById(R.id.search_plate).getBackground();
                    }
                    qb3Var2.findViewById(R.id.search_plate).setBackgroundColor(num4.intValue());
                } else if (drawable != null) {
                    qb3Var2.findViewById(R.id.search_plate).setBackground(drawable);
                }
            }
            qrc qrcVar3 = this.c0;
            if (qrcVar3 != null) {
                Integer num5 = this.e;
                qb3 qb3Var3 = (qb3) qrcVar3.a;
                if (num5 != null) {
                    int iIntValue = num5.intValue();
                    ((ImageView) qb3Var3.findViewById(R.id.search_button)).setColorFilter(iIntValue);
                    ((ImageView) qb3Var3.findViewById(R.id.search_close_btn)).setColorFilter(iIntValue);
                }
            }
            qrc qrcVar4 = this.c0;
            if (qrcVar4 != null && (num = this.f) != null) {
                int iIntValue2 = num.intValue();
                EditText editTextC4 = qrcVar4.c();
                if (editTextC4 != null) {
                    editTextC4.setHintTextColor(iIntValue2);
                }
            }
            qrc qrcVar5 = this.c0;
            if (qrcVar5 != null) {
                String str = this.V;
                boolean z = this.b0;
                str.getClass();
                if (z) {
                    ((qb3) qrcVar5.a).setQueryHint(str);
                } else {
                    EditText editTextC5 = qrcVar5.c();
                    if (editTextC5 != null) {
                        editTextC5.setHint(str);
                    }
                }
            }
            qb3Var.setOverrideBackAction(this.W);
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.c0 = new k1(this, 16);
        }
    }

    public final void setAutoCapitalize(a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    public final void setAutoFocus(boolean z) {
        this.a0 = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f = num;
    }

    public final void setInputType(b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    public final void setPlaceholder(String str) {
        str.getClass();
        this.V = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.W = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.b0 = z;
    }

    public final void setTextColor(Integer num) {
        this.c = num;
    }

    public final void setTintColor(Integer num) {
        this.d = num;
    }
}
